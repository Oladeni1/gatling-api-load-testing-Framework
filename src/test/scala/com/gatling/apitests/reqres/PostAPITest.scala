package com.gatling.apitests.reqres

import io.gatling.core.Predef.*
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef.*

class PostAPITest extends Simulation {

	//protocol
	val httpProtocol = http
		.baseUrl("https://reqres.in")


	//scenarios:
	val createUser = scenario("Create (POST) Api Request Demo")
		.exec(
			http("Create User")
				.post("/api/users")
				.header(name = "content-type", value = "application/json")
				.asJson
				.body(RawFileBody("data/createUser.json")).asJson
				.check(status.is("201"))
				.check(jsonPath("$.name").is("morpheus"))
				.check(jsonPath("$.job").is("leader"))
		)
		.pause("5")

	//setup:
	setUp(
		createUser.inject(rampUsers(15).during(3))
			.protocols(httpProtocol)
	)


}
