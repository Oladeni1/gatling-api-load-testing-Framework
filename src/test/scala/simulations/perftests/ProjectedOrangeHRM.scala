package simulations.perftests

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class ProjectedOrangeHRM extends Simulation {

	val httpProtocol = http
		.baseUrl("https://opensource-demo.orangehrmlive.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "none",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Not.A/Brand";v="8", "Chromium";v="114", "Google Chrome";v="114""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_1 = Map(
		"sec-ch-ua" -> """Not.A/Brand";v="8", "Chromium";v="114", "Google Chrome";v="114""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_4 = Map(
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "max-age=0",
		"If-None-Match" -> "x9HGOWLJ9iCPDjepLIQUkrSqG3F/k3SDk2ySrkUfKpg=",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"contentType" -> "application/json",
		"sec-ch-ua" -> """Not.A/Brand";v="8", "Chromium";v="114", "Google Chrome";v="114""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_7 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Origin" -> "https://opensource-demo.orangehrmlive.com",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Not.A/Brand";v="8", "Chromium";v="114", "Google Chrome";v="114""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_9 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Not.A/Brand";v="8", "Chromium";v="114", "Google Chrome";v="114""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_11 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Not.A/Brand";v="8", "Chromium";v="114", "Google Chrome";v="114""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_12 = Map(
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "no-store, no-cache, must-revalidate, post-check=0, pre-check=0",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Not.A/Brand";v="8", "Chromium";v="114", "Google Chrome";v="114""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_14 = Map(
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Origin" -> "https://opensource-demo.orangehrmlive.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Not.A/Brand";v="8", "Chromium";v="114", "Google Chrome";v="114""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")



	val scn = scenario("ProjectedOrangeHRM")
		.exec(http("request_0")
			.get("/web/index.php/auth/login")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/web/dist/js/chunk-vendors.js?v=1689053487449")
			.headers(headers_1), http("request_2")
			.get("/web/dist/js/app.js?v=1689053487449")
			.headers(headers_1), http("request_3")
			.get("/web/dist/favicon.ico?v=1689053487449")
			.headers(headers_1), http("request_4")
			.get("/web/index.php/core/i18n/messages")
			.headers(headers_4), http("request_5")
			.get("/web/images/ohrm_branding.png?v=1689053487449")
			.headers(headers_1), http("request_6")
			.get("/web/dist/img/blob.svg")
			.headers(headers_1)))
		.pause(33)
		.exec(http("request_7")
			.post("/web/index.php/auth/validate")
			.headers(headers_7)
			.formParam("_token", "476a7c2f72.6a81RCryAAo_polAipbDsY5OLBNJcqEodV-odgB-Axo.sJ9dJ3KwMFxu_70v6_Cq9d8BT0wdPtdjBQncA2EbaSyH1kMnSbhxOVD3vQ")
			.formParam("username", "Admin")
			.formParam("password", "admin123")
			.resources(http("request_8")
			.get("/web/index.php/core/i18n/messages")
			.headers(headers_4), http("request_9")
			.get("/web/images/orange.png?v=1689053487449")
			.headers(headers_9), http("request_10")
			.get("/web/images/orangehrm-logo.png?v=1689053487449")
			.headers(headers_9), http("request_11")
			.get("/web/index.php/api/v2/buzz/feed?limit=5&offset=0&sortOrder=DESC&sortField=share.createdAtUtc")
			.headers(headers_11), http("request_12")
			.get("/web/index.php/api/v2/dashboard/employees/time-at-work?timezoneOffset=1&currentDate=2023-07-21&currentTime=01:47")
			.headers(headers_12), http("request_13")
			.get("/web/index.php/api/v2/dashboard/employees/action-summary")
			.headers(headers_12), http("request_14")
			.post("/web/index.php/events/push")
			.headers(headers_14), http("request_15")
			.get("/web/index.php/api/v2/dashboard/shortcuts")
			.headers(headers_12), http("request_16")
			.get("/web/index.php/api/v2/dashboard/employees/locations")
			.headers(headers_12), http("request_17")
			.get("/web/index.php/pim/viewPhoto/empNumber/7")
			.headers(headers_9), http("request_18")
			.get("/web/index.php/api/v2/dashboard/employees/subunit")
			.headers(headers_12), http("request_19")
			.get("/web/index.php/buzz/photo/12")
			.headers(headers_9), http("request_20")
			.get("/web/index.php/api/v2/dashboard/employees/leaves?date=2023-07-21")
			.headers(headers_12), http("request_21")
			.get("/web/index.php/pim/viewPhoto/empNumber/15")
			.headers(headers_9), http("request_22")
			.get("/web/index.php/pim/viewPhoto/empNumber/2")
			.headers(headers_9), http("request_23")
			.get("/web/index.php/buzz/photo/11")
			.headers(headers_9)))

	//setup:
	/*setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)*/

	setUp(scn.inject(rampUsers(2500).during(2100.milliseconds)).protocols(httpProtocol))


}