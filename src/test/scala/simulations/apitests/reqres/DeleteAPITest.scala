package simulations.apitests.reqres

import io.gatling.core.Predef.*
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef.*

class DeleteAPITest extends Simulation {

	//protocol
	val httpProtocol = http
		.baseUrl("https://reqres.in")
	
	//scenarios:
	val deleteUser = scenario("Delete User (Delete) Api Request Demo")
		.exec(
			http("Delete User")
				.delete("/api/users/2")
				.header(name = "content-type", value = "application/json").asJson
				.check(status.is("204"))
		)
		.pause("5")

	//setup:
	setUp(
		deleteUser.inject(rampUsers(20).during(5))
			.protocols(httpProtocol)
	)


}
