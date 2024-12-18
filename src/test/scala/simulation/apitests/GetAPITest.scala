package simulation.apitests

import io.gatling.core.Predef.*
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef.*

class GetAPITest extends Simulation{

	//protocol:
	val httpProtocol = http
		.baseUrl("https://reqres.in")

	//scenario:
	val getUser = scenario("Get Api Request Demo")
		.exec(
			http("Get Single User")
				.get("/api/users/2")
				.check(status.is("200"))
				.check(jsonPath("$.data.last_name").is("Weaver"))
				.check(jsonPath("$.data.first_name").is("Janet"))
		)
		.pause(2)

	//setup:
	setUp(getUser.inject(rampUsers(1000).during(5)).protocols(httpProtocol)
		
	)
}
