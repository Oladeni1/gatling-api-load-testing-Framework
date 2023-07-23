package com.gatling.apitests.reqres

import io.gatling.core.Predef.*
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef.*

class PutAPITest extends Simulation {

	//protocol
	val httpProtocol = http
		.baseUrl("https://reqres.in")


	//scenarios:
	val updateUser = scenario("Update (PUT) Api Request Demo")
		.exec(
			http("Update User")
				.put("/api/users/2")
				.header(name = "content-type", value = "application/json")
				.asJson
				.body(RawFileBody("data/updateUser.json")).asJson
				.check(status.is("200"))
				.check(jsonPath("$.name").is("morpheus"))
				.check(jsonPath("$.job").is("zion resident2"))
		)
		.pause("5")

	//setup:
	setUp(

		updateUser.inject(rampUsers(10).during(5))
			.protocols(httpProtocol)
	)


}
