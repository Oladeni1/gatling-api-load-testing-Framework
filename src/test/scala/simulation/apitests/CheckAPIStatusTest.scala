package simulation.apitests

import io.gatling.core.Predef.*
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef.*

import scala.concurrent.duration.*

class CheckAPIStatusTest extends Simulation {

	//protocol
	val httpProtocol = http
		.baseUrl("https://reqres.in")


	//scenarios:
	val statuses = scenario("Get Api Request Statuses Demo")
		.exec(
			http("Get Single User")
				.get("/api/users/2")
				.check(status.is("200"))
				.check(status.not("201"))
				.check(jsonPath("$.data.first_name").is("Janet"))
				.check(jsonPath("$.data.first_name").not("OlaJanet"))
				.check(jsonPath("$.data.last_name").is("Weaver"))
		)
		.pause(2)

	//val createUser = scenario("Create (POST) Api Request Demo")
		.exec(
			http("Create User")
				.post("/api/users")
				.header(name = "content-type", value = "application/json")
				.asJson
				.body(RawFileBody("data/createUser.json")).asJson
				.check(status.is("201"))
				.check(status.not("200"))
				.check(jsonPath("$.name").is("morpheus"))
				.check(jsonPath("$.job").is("leader"))
				.check(jsonPath("$.job").not("leaders"))
		)
		.pause(5)

	//val updateUser = scenario("Update (PUT) Api Request Demo")
		.exec(
			http("Update User")
				.put("/api/users/2")
				.header(name = "content-type", value = "application/json").asJson
				.body(RawFileBody("data/updateUser.json")).asJson
				.check(status.is("200"))
				.check(jsonPath("$.name").is("morpheus"))
				.check(jsonPath("$.job").is("zion resident"))
		)
		.pause(5)

	//val deleteUser = scenario("Delete User (Delete) Api Request Demo")
		.exec(
			http("Delete User")
				.delete("/api/users/2")
				.header(name = "content-type", value = "application/json").asJson
				.check(status.in(204 to 205))
		)
		.pause(5)

	//setup:
	setUp(statuses.inject(rampUsers(200).during(5000.milliseconds)).protocols(httpProtocol))


}
