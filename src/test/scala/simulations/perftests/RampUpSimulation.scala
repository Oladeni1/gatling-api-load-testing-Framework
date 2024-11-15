package simulations.perftests

import io.gatling.core.Predef.*
import io.gatling.http.Predef.*
import io.gatling.jdbc.Predef.*

import scala.concurrent.duration.*

class RampUpSimulation extends Simulation {

	//Setting protocol:

	val httpProtocol = http
		.proxy(Proxy("localhost", 8866)) //Fiddler live traffic monitoring (Install Fiddler and map the port)
		.baseUrl("http://computer-database.gatling.io")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.9")
		.upgradeInsecureRequestsHeader("1")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36")

	val headers_0 = Map("Cache-Control" -> "max-age=0")

	val headers_3 = Map(
		"Cache-Control" -> "max-age=0",
		"Origin" -> "http://computer-database.gatling.io")

	//Storing values of scenarios in to isolation modules:
	val browse = exec(http("homePage_Computer")
		.get("/computers")
		.headers(headers_0))
		.pause(14)

	val search = exec(http("search_Computer")
		.get("/computers?f=ace"))
		.pause(2)

	val select = exec(http("select_Computer")
		.get("/computers/381"))
		.pause(15)

	val edit = exec(http("edit_Computer")
		.post("/computers/381")
		.headers(headers_3)
		.formParam("name", "ACE")
		.formParam("introduced", "2023-01-01")
		.formParam("discontinued", "2023-12-31")
		.formParam("company", "2"))
		.pause(2)

	//Calling setting Scenarios:

	val scn = scenario("Ramp up Simulation for ComputerDB")
		.exec(browse, search, select, edit)

	//Define users with multiple rules and permissions:
	val users = scenario("Users")
		.exec(browse, search)

	val admins = scenario("Admins")
		.exec(browse, search, select, edit)

	//Adding ramp up time for user groups: Ramp up user/ time configuration for 3 scenarios

	setUp(
		users.inject(
			nothingFor(5),
			constantUsersPerSec(50) during(10.seconds),
			rampUsersPerSec(20) to (50)during(20),
		),
		admins.inject(
			nothingFor(5),
			constantUsersPerSec(25) during(10),
			rampUsersPerSec(10) to (15) during(10)),

	).protocols(httpProtocol)

}