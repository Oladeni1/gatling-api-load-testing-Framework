package simulation.perftests

import io.gatling.core.Predef.*
import io.gatling.http.Predef.*
import io.gatling.jdbc.Predef.*

import scala.concurrent.duration.*

class ParaBankLoadSimulation extends Simulation {

	val httpProtocol = http
		.proxy(Proxy("localhost", 8866)) //Fiddler live traffic monitoring (Install Fiddler and map the port)
		.baseUrl("https://parabank.parasoft.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.9")
		.doNotTrackHeader("1")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36")

	val headers_0 = Map(
		"pragma" -> "no-cache",
		"priority" -> "u=0, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "cross-site",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1")

	val headers_1 = Map(
		"origin" -> "https://parabank.parasoft.com",
		"pragma" -> "no-cache",
		"priority" -> "u=0, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1")

	val headers_2 = Map(
		"accept" -> "*/*",
		"pragma" -> "no-cache",
		"priority" -> "u=1, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_3 = Map(
		"pragma" -> "no-cache",
		"priority" -> "u=0, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1")

	val headers_4 = Map(
		"accept" -> "application/json, text/javascript, */*; q=0.01",
		"pragma" -> "no-cache",
		"priority" -> "u=1, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_5 = Map(
		"accept" -> "*/*",
		"content-type" -> "application/json",
		"origin" -> "https://parabank.parasoft.com",
		"pragma" -> "no-cache",
		"priority" -> "u=1, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_8 = Map(
		"accept" -> "*/*",
		"origin" -> "https://parabank.parasoft.com",
		"pragma" -> "no-cache",
		"priority" -> "u=1, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-requested-with" -> "XMLHttpRequest")



	val scn = scenario("ParaBank Load Simulation")
		.exec(http("Para Bank home page")
			.get("/parabank/index.htm")
			.headers(headers_0))
		.pause(29)
		.exec(http("Login page")
			.post("/parabank/login.htm")
			.headers(headers_1)
			.formParam("username", "naveenauto")
			.formParam("password", "selenium123")
			.resources(http("request_2")
			.get("/parabank/services_proxy/bank/customers/12767/accounts")
			.headers(headers_2)))
		.pause(23)
		.exec(http("Open account page")
			.get("/parabank/openaccount.htm")
			.headers(headers_3)
			.resources(http("Create account page")
			.get("/parabank/services_proxy/bank/customers/12767/accounts")
			.headers(headers_4)))
		.pause(8)
		.exec(http("Created account page")
			.post("/parabank/services_proxy/bank/createAccount?customerId=12767&newAccountType=0&fromAccountId=13899")
			.headers(headers_5))
		.pause(15)
		.exec(http("Customer info - update profile page")
			.get("/parabank/updateprofile.htm")
			.headers(headers_3)
			.resources(http("Customer page")
			.get("/parabank/services_proxy/bank/customers/12767")
			.headers(headers_4)))
		.pause(42)
		.exec(http("Update customer bank details page")
			.post("/parabank/services_proxy/bank/customers/update/12767?firstName=Test&lastName=TestOla&street=100%20Street&city=Las%20Vegas&state=Nevada&zipCode=89102&phoneNumber=7342933890223&ssn=7352628198&username=&password=")
			.headers(headers_8))
		.pause(8)
		.exec(http("Log Out")
			.get("/parabank/logout.htm")
			.headers(headers_3))

	setUp(
		scn.inject(
			nothingFor(5),
			atOnceUsers(100), //100 user at start for 2.5min
			rampUsers(200) during(300)), //ramp up user to 200 for 5min
	).protocols(httpProtocol)
}