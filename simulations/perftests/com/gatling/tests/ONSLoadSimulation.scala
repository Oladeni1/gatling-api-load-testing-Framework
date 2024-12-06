package com.gatling.tests

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class ONSLoadSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("https://region1.analytics.google.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.9")
		.doNotTrackHeader("1")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36")

	val headers_0 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
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

	val headers_1 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"pragma" -> "no-cache",
		"priority" -> "u=2, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-site")

	val headers_3 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"pragma" -> "no-cache",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-site")

	val headers_5 = Map(
		"pragma" -> "no-cache",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_18 = Map(
		"origin" -> "https://www.ons.gov.uk",
		"pragma" -> "no-cache",
		"priority" -> "u=1, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_21 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"pragma" -> "no-cache",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_22 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"pragma" -> "no-cache",
		"priority" -> "u=0, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "iframe",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "cross-site",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1",
		"x-browser-channel" -> "stable",
		"x-browser-copyright" -> "Copyright 2024 Google LLC. All rights reserved.",
		"x-browser-validation" -> "QFEz3B6Z4AT6PlLzuts1mBxQGCM=",
		"x-browser-year" -> "2024")

	val headers_29 = Map(
		"pragma" -> "no-cache",
		"priority" -> "u=2",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_38 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"pragma" -> "no-cache",
		"priority" -> "u=2, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_41 = Map(
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

	val headers_68 = Map(
		"content-type" -> "text/plain;charset=UTF-8",
		"origin" -> "https://www.ons.gov.uk",
		"pragma" -> "no-cache",
		"priority" -> "u=1, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_85 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"pragma" -> "no-cache",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_127 = Map(
		"origin" -> "https://www.ons.gov.uk",
		"pragma" -> "no-cache",
		"priority" -> "u=1, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

    val uri01 = "https://surveystats.hotjar.io/hit"
    val uri02 = "https://td.doubleclick.net/td/ga/rul"
    val uri03 = "https://www.googletagmanager.com"
    val uri04 = "https://cdn.ons.gov.uk/assets/images"
    val uri06 = "https://static.hotjar.com/c/hotjar-963358.js"
    val uri07 = "https://survey-images.hotjar.com/surveys/logo/0754b127bb554cf1b57b23b384ce6141"
    val uri08 = "https://www.ons.gov.uk"
    val uri09 = "https://www.google.co.uk/ads/ga-audiences"
    val uri10 = "https://region1.google-analytics.com/g/collect"

	val scn = scenario("ONSLoadSimulation")
		.exec(http("request_0")
			.get(uri08 + "/businessindustryandtrade/business")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri04 + "/logo-ogl-footer.svg")
			.headers(headers_1),
            http("request_2")
			.get(uri04 + "/ons-logo/v2/ons-logo.svg")
			.headers(headers_1),
            http("request_3")
			.get(uri04 + "/icon-sprite/v2/icon-sprite.svg")
			.headers(headers_3),
            http("request_4")
			.get(uri04 + "/census-logo/logo-census-2021-white-landscape.svg")
			.headers(headers_3),
            http("request_5")
			.get(uri03 + "/gtm.js?id=GTM-MBCBVQS")
			.headers(headers_5),
            http("request_6")
			.get(uri03 + "/gtag/js?id=G-W804VY6YKS&l=dataLayer&cx=c&gtm=45He4bc0v76431828za200")
			.headers(headers_5),
            http("request_7")
			.get(uri03 + "/gtag/js?id=G-J0S8VP6JGZ&l=dataLayer&cx=c&gtm=45He4bc0v76431828za200")
			.headers(headers_5),
            http("request_8")
			.get(uri06 + "?sv=7")
			.headers(headers_5)))
		.pause(4)
		.exec(http("request_9")
			.get(uri08 + "/businessindustryandtrade/changestobusiness")
			.headers(headers_0)
			.resources(http("request_10")
			.get(uri04 + "/logo-ogl-footer.svg")
			.headers(headers_1),
            http("request_11")
			.get(uri04 + "/ons-logo/v2/ons-logo.svg")
			.headers(headers_1),
            http("request_12")
			.get(uri04 + "/census-logo/logo-census-2021-white-landscape.svg")
			.headers(headers_3),
            http("request_13")
			.get(uri03 + "/gtm.js?id=GTM-MBCBVQS")
			.headers(headers_5),
            http("request_14")
			.get(uri04 + "/icon-sprite/v2/icon-sprite.svg")
			.headers(headers_3),
            http("request_15")
			.get(uri03 + "/gtag/js?id=G-W804VY6YKS&l=dataLayer&cx=c&gtm=45He4bc0v76431828za200")
			.headers(headers_5),
            http("request_16")
			.get(uri03 + "/gtag/js?id=G-J0S8VP6JGZ&l=dataLayer&cx=c&gtm=45He4bc0v76431828za200")
			.headers(headers_5),
            http("request_17")
			.get(uri06 + "?sv=7")
			.headers(headers_5)))
		.pause(4)
		.exec(http("request_18")
			.post("/g/collect?v=2&tid=G-W804VY6YKS&gtm=45je4bc0v875775742z876431828za200zb76431828&_p=1731705614969&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067554~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&pae=1&frm=0&pscdl=noapi&_s=1&dt=Changes%20to%20business&dl=https%3A%2F%2Fwww.ons.gov.uk%2Fbusinessindustryandtrade%2Fchangestobusiness&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Fbusinessindustryandtrade%2Fbusiness&en=page_view&ep.content_type=taxonomy-navigation&ep.content_group=taxonomy-navigation&tfd=5552")
			.headers(headers_18)
			.resources(http("request_19")
			.post(uri10 + "?v=2&tid=G-J0S8VP6JGZ&gtm=45je4bc0v9196161109z876431828za200zb76431828&_p=1731705614969&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067554~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&frm=0&pscdl=noapi&_s=1&dt=Changes%20to%20business&dl=https%3A%2F%2Fwww.ons.gov.uk%2Fbusinessindustryandtrade%2Fchangestobusiness&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Fbusinessindustryandtrade%2Fbusiness&en=page_view&ep.content_type=taxonomy-navigation&ep.content_group=taxonomy-navigation&tfd=5599")
			.headers(headers_18)))
		.pause(4)
		.exec(http("request_20")
			.post("/g/collect?v=2&tid=G-W804VY6YKS&gtm=45je4bc0v875775742z876431828za200zb76431828&_p=1731705614969&_gaz=1&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067554~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&pae=1&frm=0&pscdl=noapi&_s=2&dt=Changes%20to%20business&dl=https%3A%2F%2Fwww.ons.gov.uk%2Fbusinessindustryandtrade%2Fchangestobusiness&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Fbusinessindustryandtrade%2Fbusiness&en=navigation_click&ep.content_type=taxonomy-navigation&ep.content_group=taxonomy-navigation&ep.navigation_type=top-navigation&ep.click_text=International%20trade&ep.click_path=%2Fbusinessindustryandtrade%2Finternationaltrade&ep.click_content_group=internationaltrade&ep.click_content_type=product-pages&_et=9432&tfd=9973")
			.headers(headers_18)
			.resources(http("request_21")
			.get(uri09 + "?v=1&t=sr&slf_rd=1&_r=4&tid=G-W804VY6YKS&cid=1587549190.1731705500&gtm=45je4bc0v875775742z876431828za200zb76431828&aip=1&dma=0&gcd=13l3l3l3l1l1&npa=0&frm=0&tag_exp=101925629~102067554~102067808~102077855&z=947575966")
			.headers(headers_21),
            http("request_22")
			.get(uri02 + "?tid=G-W804VY6YKS&gacid=1587549190.1731705500&gtm=45je4bc0v875775742z876431828za200zb76431828&dma=0&gcd=13l3l3l3l1l1&npa=0&pscdl=noapi&aip=1&fledge=1&frm=0&tag_exp=101925629~102067554~102067808~102077855&z=1704751994")
			.headers(headers_22),
            http("request_23")
			.get(uri08 + "/businessindustryandtrade/internationaltrade")
			.headers(headers_0),
            http("request_24")
			.get(uri04 + "/ons-logo/v2/ons-logo.svg")
			.headers(headers_1),
            http("request_25")
			.get(uri04 + "/logo-ogl-footer.svg")
			.headers(headers_1),
            http("request_26")
			.get(uri04 + "/census-logo/logo-census-2021-white-landscape.svg")
			.headers(headers_3),
            http("request_27")
			.get(uri04 + "/icon-sprite/v2/icon-sprite.svg")
			.headers(headers_3),
            http("request_28")
			.get(uri03 + "/gtm.js?id=GTM-MBCBVQS")
			.headers(headers_5),
            http("request_29")
			.get(uri08 + "/economy/nationalaccounts/balanceofpayments/timeseries/ikbj/mret/sparklineconfig")
			.headers(headers_29),
            http("request_30")
			.get(uri08 + "/economy/nationalaccounts/balanceofpayments/timeseries/ikbj/pn2/sparklineconfig")
			.headers(headers_29),
            http("request_31")
			.get(uri08 + "/economy/nationalaccounts/balanceofpayments/timeseries/n3c4/mret/sparklineconfig")
			.headers(headers_29),
            http("request_32")
			.get(uri08 + "/economy/nationalaccounts/balanceofpayments/timeseries/l87k/pn2/sparklineconfig")
			.headers(headers_29),
            http("request_33")
			.get(uri03 + "/gtag/js?id=G-W804VY6YKS&l=dataLayer&cx=c&gtm=45He4bc0v76431828za200")
			.headers(headers_5),
            http("request_34")
			.get(uri03 + "/gtag/js?id=G-J0S8VP6JGZ&l=dataLayer&cx=c&gtm=45He4bc0v76431828za200")
			.headers(headers_5),
            http("request_35")
			.get(uri08 + "/economy/nationalaccounts/balanceofpayments/timeseries/l87q/mret/sparklineconfig")
			.headers(headers_29),
            http("request_36")
			.get(uri08 + "/economy/nationalaccounts/balanceofpayments/timeseries/ikbi/mret/sparklineconfig")
			.headers(headers_29),
            http("request_37")
			.get(uri08 + "/economy/nationalaccounts/balanceofpayments/timeseries/ikbh/pn2/sparklineconfig")
			.headers(headers_29),
            http("request_38")
			.get(uri08 + "/resource?uri=/businessindustryandtrade/internationaltrade/articles/whodoestheuktradewith/2017-02-21/de31d34a.png&width=208")
			.headers(headers_38),
            http("request_39")
			.get(uri06 + "?sv=7")
			.headers(headers_5),
            http("request_40")
			.get(uri03 + "/a?v=3&t=l&pid=1504250743&rv=4bc0&tag_exp=101925629~102067554~102067808~102077855&u=AAMAAAAIAAAAACA&h=Ag&gtm=45je4bc0v9196161109za200zb76431828&ccid=196161109&cid=G-J0S8VP6JGZ&l=L264.S46.B39.E167.I704.EC5.TC10.HTC0~gtm.init.S1.V0.E93.TS5ogt1pdatav2.TI4.TE3.TS5ccdgalast.TI6.TE0.TS5ccdautoredact.TI7.TE0.TS5ccdconversionmarking.TI8.TE0.TS5ccdempageview.TI9.TE1.TS5ccdemoutboundclick.TI10.TE2.TS5ccdgaregscope.TI11.TE2.TS5setproductsettings.TI12.TE0.TS5ccdgafirst.TI13.TE0~gtm.js.S1.V0.E78.TS5gct.TI1.TE0~gtm.dom.S0.V0.E47~gtm.load.S0.V0.E12~gtm.init_consent.S2.V1.E74~GA380")
			.headers(headers_21),
            http("request_41")
			.get(uri08 + "/economy/nationalaccounts/balanceofpayments/timeseries/ikbh/pn2/data?series")
			.headers(headers_41),
            http("request_42")
			.get(uri08 + "/economy/nationalaccounts/balanceofpayments/timeseries/l87k/pn2/data?series")
			.headers(headers_41),
            http("request_43")
			.get(uri08 + "/economy/nationalaccounts/balanceofpayments/timeseries/l87q/mret/data?series")
			.headers(headers_41),
            http("request_44")
			.get(uri08 + "/economy/nationalaccounts/balanceofpayments/timeseries/n3c4/mret/data?series")
			.headers(headers_41),
            http("request_45")
			.get(uri08 + "/economy/nationalaccounts/balanceofpayments/timeseries/ikbj/mret/data?series")
			.headers(headers_41),
            http("request_46")
			.get(uri08 + "/economy/nationalaccounts/balanceofpayments/timeseries/ikbj/pn2/data?series")
			.headers(headers_41),
            http("request_47")
			.get(uri08 + "/economy/nationalaccounts/balanceofpayments/timeseries/ikbi/mret/data?series")
			.headers(headers_41)))
		.pause(4)
		.exec(http("request_48")
			.post("/g/collect?v=2&tid=G-W804VY6YKS&gtm=45je4bc0v875775742z876431828za200zb76431828&_p=1731705625019&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067554~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&pae=1&frm=0&pscdl=noapi&_s=1&dt=International%20trade&dl=https%3A%2F%2Fwww.ons.gov.uk%2Fbusinessindustryandtrade%2Finternationaltrade&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Fbusinessindustryandtrade%2Fchangestobusiness&en=page_view&ep.content_type=product-pages&ep.content_group=internationaltrade&tfd=5596")
			.headers(headers_18)
			.resources(http("request_49")
			.post(uri10 + "?v=2&tid=G-J0S8VP6JGZ&gtm=45je4bc0v9196161109z876431828za200zb76431828&_p=1731705625019&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067554~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&frm=0&pscdl=noapi&_s=1&dt=International%20trade&dl=https%3A%2F%2Fwww.ons.gov.uk%2Fbusinessindustryandtrade%2Finternationaltrade&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Fbusinessindustryandtrade%2Fchangestobusiness&en=page_view&ep.content_type=product-pages&ep.content_group=internationaltrade&tfd=5658")
			.headers(headers_18),
            http("request_50")
			.get(uri08 + "/businessindustryandtrade/manufacturingandproductionindustry")
			.headers(headers_0),
            http("request_51")
			.get(uri04 + "/ons-logo/v2/ons-logo.svg")
			.headers(headers_1),
            http("request_52")
			.get(uri08 + "/economy/economicoutputandproductivity/output/timeseries/k27q/diop/sparklineconfig")
			.headers(headers_29),
            http("request_53")
			.get(uri08 + "/economy/economicoutputandproductivity/output/timeseries/k222/diop/sparklineconfig")
			.headers(headers_29),
            http("request_54")
			.get(uri04 + "/logo-ogl-footer.svg")
			.headers(headers_1),
            http("request_55")
			.get(uri04 + "/icon-sprite/v2/icon-sprite.svg")
			.headers(headers_3),
            http("request_56")
			.get(uri04 + "/census-logo/logo-census-2021-white-landscape.svg")
			.headers(headers_3),
            http("request_57")
			.get(uri08 + "/economy/economicoutputandproductivity/output/timeseries/k22a/diop/sparklineconfig")
			.headers(headers_29),
            http("request_58")
			.get(uri03 + "/gtm.js?id=GTM-MBCBVQS")
			.headers(headers_5),
            http("request_59")
			.get(uri08 + "/economy/economicoutputandproductivity/output/timeseries/k27y/diop/sparklineconfig")
			.headers(headers_29),
            http("request_60")
			.get(uri03 + "/gtag/js?id=G-W804VY6YKS&l=dataLayer&cx=c&gtm=45He4bc0v76431828za200")
			.headers(headers_5),
            http("request_61")
			.get(uri03 + "/gtag/js?id=G-J0S8VP6JGZ&l=dataLayer&cx=c&gtm=45He4bc0v76431828za200")
			.headers(headers_5),
            http("request_62")
			.get(uri08 + "/economy/economicoutputandproductivity/output/timeseries/k222/diop/data?series")
			.headers(headers_41),
            http("request_63")
			.get(uri08 + "/economy/economicoutputandproductivity/output/timeseries/k27q/diop/data?series")
			.headers(headers_41),
            http("request_64")
			.get(uri08 + "/economy/economicoutputandproductivity/output/timeseries/k27q/diop/data?series")
			.headers(headers_41),
            http("request_65")
			.get(uri08 + "/economy/economicoutputandproductivity/output/timeseries/k27y/diop/data?series")
			.headers(headers_41),
            http("request_66")
			.get(uri08 + "/economy/economicoutputandproductivity/output/timeseries/k22a/diop/data?series")
			.headers(headers_41),
            http("request_67")
			.get(uri06 + "?sv=7")
			.headers(headers_5)))
		.pause(4)
		.exec(http("request_68")
			.post("/g/collect?v=2&tid=G-W804VY6YKS&gtm=45je4bc0v875775742z876431828za200zb76431828&_p=1731705631086&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067555~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&pae=1&frm=0&pscdl=noapi&dt=Manufacturing%20and%20production%20industry&dl=https%3A%2F%2Fwww.ons.gov.uk%2Fbusinessindustryandtrade%2Fmanufacturingandproductionindustry&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Fbusinessindustryandtrade%2Finternationaltrade&_s=1&tfd=5650")
			.headers(headers_68)
			.body(RawFileBody("com/gatling/tests/onsloadsimulation/0068_request.txt"))
			.resources(http("request_69")
			.post(uri10 + "?v=2&tid=G-J0S8VP6JGZ&gtm=45je4bc0v9196161109z876431828za200zb76431828&_p=1731705631086&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067555~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&frm=0&pscdl=noapi&_s=1&dt=Manufacturing%20and%20production%20industry&dl=https%3A%2F%2Fwww.ons.gov.uk%2Fbusinessindustryandtrade%2Fmanufacturingandproductionindustry&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Fbusinessindustryandtrade%2Finternationaltrade&en=page_view&ep.content_type=product-pages&ep.content_group=manufacturingandproductionindustry&tfd=5821")
			.headers(headers_18),
            http("request_70")
			.get(uri08 + "/economy/governmentpublicsectorandtaxes")
			.headers(headers_0),
            http("request_71")
			.get(uri04 + "/ons-logo/v2/ons-logo.svg")
			.headers(headers_1),
            http("request_72")
			.get(uri04 + "/logo-ogl-footer.svg")
			.headers(headers_1),
            http("request_73")
			.get(uri04 + "/census-logo/logo-census-2021-white-landscape.svg")
			.headers(headers_3),
            http("request_74")
			.get(uri04 + "/icon-sprite/v2/icon-sprite.svg")
			.headers(headers_3),
            http("request_75")
			.get(uri03 + "/gtm.js?id=GTM-MBCBVQS")
			.headers(headers_5),
            http("request_76")
			.get(uri03 + "/gtag/js?id=G-W804VY6YKS&l=dataLayer&cx=c&gtm=45He4bc0v76431828za200")
			.headers(headers_5),
            http("request_77")
			.get(uri03 + "/gtag/js?id=G-J0S8VP6JGZ&l=dataLayer&cx=c&gtm=45He4bc0v76431828za200")
			.headers(headers_5),
            http("request_78")
			.get(uri06 + "?sv=7")
			.headers(headers_5)))
		.pause(4)
		.exec(http("request_79")
			.post("/g/collect?v=2&tid=G-W804VY6YKS&gtm=45je4bc0v875775742z876431828za200zb76431828&_p=1731705637779&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067555~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&pae=1&frm=0&pscdl=noapi&_s=1&dt=Government%2C%20public%20sector%20and%20taxes&dl=https%3A%2F%2Fwww.ons.gov.uk%2Feconomy%2Fgovernmentpublicsectorandtaxes&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Fbusinessindustryandtrade%2Fmanufacturingandproductionindustry&en=page_view&ep.content_type=taxonomy-navigation&ep.content_group=taxonomy-navigation&tfd=5813")
			.headers(headers_18)
			.resources(http("request_80")
			.post(uri10 + "?v=2&tid=G-J0S8VP6JGZ&gtm=45je4bc0v9196161109z876431828za200zb76431828&_p=1731705637779&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067555~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&frm=0&pscdl=noapi&_s=1&dt=Government%2C%20public%20sector%20and%20taxes&dl=https%3A%2F%2Fwww.ons.gov.uk%2Feconomy%2Fgovernmentpublicsectorandtaxes&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Fbusinessindustryandtrade%2Fmanufacturingandproductionindustry&en=page_view&ep.content_type=taxonomy-navigation&ep.content_group=taxonomy-navigation&tfd=5860")
			.headers(headers_18)))
		.pause(2)
		.exec(http("request_81")
			.get(uri08 + "/economy/inflationandpriceindices")
			.headers(headers_0)
			.resources(http("request_82")
			.get(uri08 + "/economy/inflationandpriceindices/timeseries/l55o/mm23/sparklineconfig")
			.headers(headers_29),
            http("request_83")
			.get(uri04 + "/ons-logo/v2/ons-logo.svg")
			.headers(headers_1),
            http("request_84")
			.get(uri08 + "/resource?uri=/economy/inflationandpriceindices/articles/howisinflationaffectingyourhouseholdcosts/2022-03-23/e9024f9b.png&width=208")
			.headers(headers_38),
            http("request_85")
			.get(uri08 + "/resource?uri=/economy/inflationandpriceindices/articles/trainticketsandhybridcarsunderstandingspendinghabits/2024-08-06/a4e1c4f2.png&width=208")
			.headers(headers_85),
            http("request_86")
			.get(uri08 + "/economy/inflationandpriceindices/timeseries/d7bt/mm23/sparklineconfig")
			.headers(headers_29),
            http("request_87")
			.get(uri08 + "/economy/inflationandpriceindices/timeseries/chaw/mm23/sparklineconfig")
			.headers(headers_29),
            http("request_88")
			.get(uri08 + "/resource?uri=/economy/inflationandpriceindices/articles/whatsinthebasketofgoods70yearsofshoppinghistory/2016-07-21/3efd2ff9.png&width=208")
			.headers(headers_38),
            http("request_89")
			.get(uri08 + "/resource?uri=/economy/inflationandpriceindices/articles/areyourwageskeepingupwithinflation/2017-06-20/9bdbc701.png&width=208")
			.headers(headers_38),
            http("request_90")
			.get(uri04 + "/icon-sprite/v2/icon-sprite.svg")
			.headers(headers_3),
            http("request_91")
			.get(uri08 + "/economy/inflationandpriceindices/timeseries/czbh/mm23/sparklineconfig")
			.headers(headers_29),
            http("request_92")
			.get(uri08 + "/economy/inflationandpriceindices/timeseries/l522/mm23/sparklineconfig")
			.headers(headers_29),
            http("request_93")
			.get(uri04 + "/logo-ogl-footer.svg")
			.headers(headers_3),
            http("request_94")
			.get(uri04 + "/census-logo/logo-census-2021-white-landscape.svg")
			.headers(headers_3),
            http("request_95")
			.get(uri08 + "/economy/inflationandpriceindices/timeseries/d7g7/mm23/sparklineconfig")
			.headers(headers_29),
            http("request_96")
			.get(uri03 + "/gtm.js?id=GTM-MBCBVQS")
			.headers(headers_5),
            http("request_97")
			.get(uri03 + "/gtag/js?id=G-W804VY6YKS&l=dataLayer&cx=c&gtm=45He4bc0v76431828za200")
			.headers(headers_5),
            http("request_98")
			.get(uri03 + "/gtag/js?id=G-J0S8VP6JGZ&l=dataLayer&cx=c&gtm=45He4bc0v76431828za200")
			.headers(headers_5),
            http("request_99")
			.get(uri08 + "/economy/inflationandpriceindices/timeseries/l55o/mm23/data?series")
			.headers(headers_41),
            http("request_100")
			.get(uri08 + "/economy/inflationandpriceindices/timeseries/l522/mm23/data?series")
			.headers(headers_41),
            http("request_101")
			.get(uri08 + "/economy/inflationandpriceindices/timeseries/l55o/mm23/data?series")
			.headers(headers_41),
            http("request_102")
			.get(uri08 + "/economy/inflationandpriceindices/timeseries/d7bt/mm23/data?series")
			.headers(headers_41),
            http("request_103")
			.get(uri08 + "/economy/inflationandpriceindices/timeseries/chaw/mm23/data?series")
			.headers(headers_41),
            http("request_104")
			.get(uri08 + "/economy/inflationandpriceindices/timeseries/czbh/mm23/data?series")
			.headers(headers_41),
            http("request_105")
			.get(uri08 + "/economy/inflationandpriceindices/timeseries/d7g7/mm23/data?series")
			.headers(headers_41),
            http("request_106")
			.get(uri06 + "?sv=7")
			.headers(headers_5)))
		.pause(3)
		.exec(http("request_107")
			.get(uri08 + "/employmentandlabourmarket/peopleinwork")
			.headers(headers_0)
			.resources(http("request_108")
			.get(uri04 + "/logo-ogl-footer.svg")
			.headers(headers_1),
            http("request_109")
			.get(uri04 + "/ons-logo/v2/ons-logo.svg")
			.headers(headers_1),
            http("request_110")
			.get(uri04 + "/census-logo/logo-census-2021-white-landscape.svg")
			.headers(headers_3),
            http("request_111")
			.get(uri03 + "/gtm.js?id=GTM-MBCBVQS")
			.headers(headers_5),
            http("request_112")
			.get(uri04 + "/icon-sprite/v2/icon-sprite.svg")
			.headers(headers_3),
            http("request_113")
			.get(uri03 + "/gtag/js?id=G-W804VY6YKS&l=dataLayer&cx=c&gtm=45He4bc0v76431828za200")
			.headers(headers_5),
            http("request_114")
			.get(uri03 + "/gtag/js?id=G-J0S8VP6JGZ&l=dataLayer&cx=c&gtm=45He4bc0v76431828za200")
			.headers(headers_5),
            http("request_115")
			.get(uri06 + "?sv=7")
			.headers(headers_5)))
		.pause(2)
		.exec(http("request_116")
			.get(uri08 + "/employmentandlabourmarket/peoplenotinwork")
			.headers(headers_0)
			.resources(http("request_117")
			.get(uri04 + "/ons-logo/v2/ons-logo.svg")
			.headers(headers_1),
            http("request_118")
			.get(uri04 + "/logo-ogl-footer.svg")
			.headers(headers_1),
            http("request_119")
			.get(uri04 + "/census-logo/logo-census-2021-white-landscape.svg")
			.headers(headers_3),
            http("request_120")
			.get(uri04 + "/icon-sprite/v2/icon-sprite.svg")
			.headers(headers_3),
            http("request_121")
			.get(uri03 + "/gtm.js?id=GTM-MBCBVQS")
			.headers(headers_5),
            http("request_122")
			.get(uri03 + "/gtag/js?id=G-W804VY6YKS&l=dataLayer&cx=c&gtm=45He4bc0h1v76431828za200")
			.headers(headers_5),
            http("request_123")
			.get(uri03 + "/gtag/js?id=G-J0S8VP6JGZ&l=dataLayer&cx=c&gtm=45He4bc0h1v76431828za200")
			.headers(headers_5),
            http("request_124")
			.get(uri06 + "?sv=7")
			.headers(headers_5)))
		.pause(4)
		.exec(http("request_125")
			.post("/g/collect?v=2&tid=G-W804VY6YKS&gtm=45je4bc0v875775742z876431828za200zb76431828&_p=1731705654353&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067555~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&pae=1&frm=0&pscdl=noapi&_s=1&dt=People%20not%20in%20work&dl=https%3A%2F%2Fwww.ons.gov.uk%2Femploymentandlabourmarket%2Fpeoplenotinwork&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Femploymentandlabourmarket%2Fpeopleinwork&en=page_view&ep.content_type=taxonomy-navigation&ep.content_group=taxonomy-navigation&tfd=5539")
			.headers(headers_18)
			.resources(http("request_126")
			.post(uri10 + "?v=2&tid=G-J0S8VP6JGZ&gtm=45je4bc0h1v9196161109z876431828za200zb76431828&_p=1731705654353&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067555~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&frm=0&pscdl=noapi&_s=1&dt=People%20not%20in%20work&dl=https%3A%2F%2Fwww.ons.gov.uk%2Femploymentandlabourmarket%2Fpeoplenotinwork&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Femploymentandlabourmarket%2Fpeopleinwork&en=page_view&ep.content_type=taxonomy-navigation&ep.content_group=taxonomy-navigation&tfd=5587")
			.headers(headers_18)))
		.pause(5)
		.exec(http("request_127")
			.get(uri01 + "?id=975511&device=desktop")
			.headers(headers_127)
			.resources(http("request_128")
			.get(uri07)
			.headers(headers_21)))
		.pause(1)
		.exec(http("request_129")
			.get(uri08 + "/peoplepopulationandcommunity/culturalidentity")
			.headers(headers_0)
			.resources(http("request_130")
			.get(uri04 + "/logo-ogl-footer.svg")
			.headers(headers_1),
            http("request_131")
			.get(uri04 + "/ons-logo/v2/ons-logo.svg")
			.headers(headers_1),
            http("request_132")
			.get(uri04 + "/census-logo/logo-census-2021-white-landscape.svg")
			.headers(headers_3),
            http("request_133")
			.get(uri03 + "/gtm.js?id=GTM-MBCBVQS")
			.headers(headers_5),
            http("request_134")
			.get(uri04 + "/icon-sprite/v2/icon-sprite.svg")
			.headers(headers_3),
            http("request_135")
			.get(uri03 + "/gtag/js?id=G-W804VY6YKS&l=dataLayer&cx=c&gtm=45He4be0h2v76431828za200")
			.headers(headers_5),
            http("request_136")
			.get(uri03 + "/gtag/js?id=G-J0S8VP6JGZ&l=dataLayer&cx=c&gtm=45He4be0h2v76431828za200")
			.headers(headers_5),
            http("request_137")
			.get(uri06 + "?sv=7")
			.headers(headers_5)))
		.pause(5)
		.exec(http("request_138")
			.post("/g/collect?v=2&tid=G-W804VY6YKS&gtm=45je4bc0v875775742z876431828za200zb76431828&_p=1731705667249&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067554~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&pae=1&frm=0&pscdl=noapi&_s=1&dt=Cultural%20identity&dl=https%3A%2F%2Fwww.ons.gov.uk%2Fpeoplepopulationandcommunity%2Fculturalidentity&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Femploymentandlabourmarket%2Fpeoplenotinwork&en=page_view&ep.content_type=taxonomy-navigation&ep.content_group=taxonomy-navigation&tfd=5784")
			.headers(headers_18)
			.resources(http("request_139")
			.post(uri10 + "?v=2&tid=G-J0S8VP6JGZ&gtm=45je4bc0v9196161109z876431828za200zb76431828&_p=1731705667249&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067554~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&frm=0&pscdl=noapi&_s=1&dt=Cultural%20identity&dl=https%3A%2F%2Fwww.ons.gov.uk%2Fpeoplepopulationandcommunity%2Fculturalidentity&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Femploymentandlabourmarket%2Fpeoplenotinwork&en=page_view&ep.content_type=taxonomy-navigation&ep.content_group=taxonomy-navigation&tfd=5818")
			.headers(headers_18),
            http("request_140")
			.get(uri08 + "/peoplepopulationandcommunity/elections")
			.headers(headers_0),
            http("request_141")
			.get(uri04 + "/logo-ogl-footer.svg")
			.headers(headers_1),
            http("request_142")
			.get(uri04 + "/ons-logo/v2/ons-logo.svg")
			.headers(headers_1),
            http("request_143")
			.get(uri04 + "/census-logo/logo-census-2021-white-landscape.svg")
			.headers(headers_3),
            http("request_144")
			.get(uri04 + "/icon-sprite/v2/icon-sprite.svg")
			.headers(headers_3),
            http("request_145")
			.get(uri03 + "/gtm.js?id=GTM-MBCBVQS")
			.headers(headers_5),
            http("request_146")
			.get(uri03 + "/gtag/js?id=G-W804VY6YKS&l=dataLayer&cx=c&gtm=45He4bc0v76431828za200")
			.headers(headers_5),
            http("request_147")
			.get(uri03 + "/gtag/js?id=G-J0S8VP6JGZ&l=dataLayer&cx=c&gtm=45He4bc0v76431828za200")
			.headers(headers_5),
            http("request_148")
			.get(uri06 + "?sv=7")
			.headers(headers_5)))
		.pause(5)
		.exec(http("request_149")
			.post("/g/collect?v=2&tid=G-W804VY6YKS&gtm=45je4bc0v875775742z876431828za200zb76431828&_p=1731705673542&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067554~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&pae=1&frm=0&pscdl=noapi&_s=1&dt=Elections&dl=https%3A%2F%2Fwww.ons.gov.uk%2Fpeoplepopulationandcommunity%2Felections&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Fpeoplepopulationandcommunity%2Fculturalidentity&en=page_view&ep.content_type=taxonomy-navigation&ep.content_group=taxonomy-navigation&tfd=5707")
			.headers(headers_18)
			.resources(http("request_150")
			.post(uri10 + "?v=2&tid=G-J0S8VP6JGZ&gtm=45je4be0h2v9196161109z876431828za200zb76431828&_p=1731705673542&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067554~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&frm=0&pscdl=noapi&_s=1&dt=Elections&dl=https%3A%2F%2Fwww.ons.gov.uk%2Fpeoplepopulationandcommunity%2Felections&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Fpeoplepopulationandcommunity%2Fculturalidentity&en=page_view&ep.content_type=taxonomy-navigation&ep.content_group=taxonomy-navigation&tfd=5755")
			.headers(headers_18)))
		.pause(3)
		.exec(http("request_151")
			.get(uri08 + "/releasecalendar")
			.headers(headers_0)
			.resources(http("request_152")
			.get(uri04 + "/ons-logo/v2/ons-logo.svg")
			.headers(headers_1),
            http("request_153")
			.get(uri04 + "/icon-library/rss/rss-feed_small.svg")
			.headers(headers_1),
            http("request_154")
			.get(uri04 + "/icon-library/calendar/date-calendar_small.svg")
			.headers(headers_1),
            http("request_155")
			.get(uri04 + "/icon-library/email/email-envelope_small.svg")
			.headers(headers_1),
            http("request_156")
			.get(uri03 + "/gtm.js?id=GTM-MBCBVQS")
			.headers(headers_5),
            http("request_157")
			.get(uri03 + "/gtag/js?id=G-W804VY6YKS&l=dataLayer&cx=c&gtm=45He4bc0v76431828za200")
			.headers(headers_5),
            http("request_158")
			.get(uri03 + "/gtag/js?id=G-J0S8VP6JGZ&l=dataLayer&cx=c&gtm=45He4bc0v76431828za200")
			.headers(headers_5),
            http("request_159")
			.get(uri06 + "?sv=7")
			.headers(headers_5)))
		.pause(4)
		.exec(http("request_160")
			.post(uri10 + "?v=2&tid=G-J0S8VP6JGZ&gtm=45je4bc0h1v9196161109z876431828za200zb76431828&_p=1731705682890&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067555~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&frm=0&pscdl=noapi&_s=1&dt=Release%20calendar&dl=https%3A%2F%2Fwww.ons.gov.uk%2Freleasecalendar&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Fpeoplepopulationandcommunity%2Felections&en=page_view&ep.content_type=release-calendar&ep.content_group=release-calendar&tfd=5863")
			.headers(headers_18)
			.resources(http("request_161")
			.post("/g/collect?v=2&tid=G-W804VY6YKS&gtm=45je4bc0v875775742z876431828za200zb76431828&_p=1731705682890&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067554~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&pae=1&frm=0&pscdl=noapi&_s=1&dt=Release%20calendar&dl=https%3A%2F%2Fwww.ons.gov.uk%2Freleasecalendar&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Fpeoplepopulationandcommunity%2Felections&en=page_view&ep.content_type=release-calendar&ep.content_group=release-calendar&tfd=5895")
			.headers(headers_18)))
		.pause(5)
		.exec(http("request_162")
			.get(uri01 + "?id=975511&device=desktop")
			.headers(headers_127)
			.resources(http("request_163")
			.get(uri07)
			.headers(headers_21),
            http("request_164")
			.post("/g/collect?v=2&tid=G-W804VY6YKS&gtm=45je4bc0v875775742z876431828za200zb76431828&_p=1731705682890&_gaz=1&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067554~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&pae=1&frm=0&pscdl=noapi&_s=2&dt=Release%20calendar&dl=https%3A%2F%2Fwww.ons.gov.uk%2Freleasecalendar&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Fpeoplepopulationandcommunity%2Felections&en=navigation_click&ep.content_type=release-calendar&ep.content_group=release-calendar&ep.click_path=%2Freleases%2Fbusinessinvestmentintheukjulytoseptember2024provisionalresults&ep.click_text=Business%20investment%20in%20the%20UK%3A%20July%20to%20September%202024%20provisional%20results&ep.click_content_type=releases&ep.click_position=3&ep.navigation_type=release-calendar&ep.page_number=1&ep.release_date=20241115&ep.release_status=published&_et=10521&tfd=11419")
			.headers(headers_18),
            http("request_165")
			.get(uri09 + "?v=1&t=sr&slf_rd=1&_r=4&tid=G-W804VY6YKS&cid=1587549190.1731705500&gtm=45je4bc0v875775742z876431828za200zb76431828&aip=1&dma=0&gcd=13l3l3l3l1l1&npa=0&frm=0&tag_exp=101925629~102067554~102067808~102077855&z=170547606")
			.headers(headers_21),
            http("request_166")
			.get(uri08 + "/releases/businessinvestmentintheukjulytoseptember2024provisionalresults")
			.headers(headers_0),
            http("request_167")
			.get(uri04 + "/ons-logo/v2/ons-logo.svg")
			.headers(headers_1),
            http("request_168")
			.get(uri04 + "/ons-logo/kitemark/v2/uksa-kitemark-en.svg")
			.headers(headers_1),
            http("request_169")
			.get(uri03 + "/gtm.js?id=GTM-MBCBVQS")
			.headers(headers_5),
            http("request_170")
			.get(uri03 + "/gtag/js?id=G-W804VY6YKS&l=dataLayer&cx=c&gtm=45He4bc0h1v76431828za200")
			.headers(headers_5),
            http("request_171")
			.get(uri03 + "/gtag/js?id=G-J0S8VP6JGZ&l=dataLayer&cx=c&gtm=45He4bc0h1v76431828za200")
			.headers(headers_5),
            http("request_172")
			.get(uri06 + "?sv=7")
			.headers(headers_5)))
		.pause(4)
		.exec(http("request_173")
			.post("/g/collect?v=2&tid=G-W804VY6YKS&gtm=45je4bc0v875775742z876431828za200zb76431828&_p=1731705694095&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067554~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&pae=1&frm=0&pscdl=noapi&_s=1&dt=Business%20investment%20in%20the%20UK%3A%20July%20to%20September%202024%20provisional%20results&dl=https%3A%2F%2Fwww.ons.gov.uk%2Freleases%2Fbusinessinvestmentintheukjulytoseptember2024provisionalresults&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Freleasecalendar&en=page_view&ep.release_date=20241115&ep.output_series=businessinvestmentintheukjulytoseptember2024provisionalresults&ep.content_type=releases&ep.content_group=releases&ep.next_release_date=23%20December%202024&ep.release_status=published&ep.release_time=09%3A30&tfd=5601")
			.headers(headers_18)
			.resources(http("request_174")
			.post(uri10 + "?v=2&tid=G-J0S8VP6JGZ&gtm=45je4bc0v9196161109z876431828za200zb76431828&_p=1731705694095&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=101925629~102067555~102067808~102077855&cid=1587549190.1731705500&ul=en-us&sr=1536x864&uaa=x86&uab=64&uafvl=Google%2520Chrome%3B131.0.6778.69%7CChromium%3B131.0.6778.69%7CNot_A%2520Brand%3B24.0.0.0&uamb=0&uam=&uap=Windows&uapv=10.0.0&uaw=0&are=1&frm=0&pscdl=noapi&_s=1&dt=Business%20investment%20in%20the%20UK%3A%20July%20to%20September%202024%20provisional%20results&dl=https%3A%2F%2Fwww.ons.gov.uk%2Freleases%2Fbusinessinvestmentintheukjulytoseptember2024provisionalresults&sid=1731705499&sct=1&seg=1&dr=https%3A%2F%2Fwww.ons.gov.uk%2Freleasecalendar&en=page_view&ep.release_date=20241115&ep.output_series=businessinvestmentintheukjulytoseptember2024provisionalresults&ep.content_type=releases&ep.content_group=releases&ep.next_release_date=23%20December%202024&ep.release_status=published&ep.release_time=09%3A30&tfd=5656")
			.headers(headers_18)))
		.pause(5)
		.exec(http("request_175")
			.get(uri01 + "?id=975511&device=desktop")
			.headers(headers_127)
			.resources(http("request_176")
			.get(uri07)
			.headers(headers_21)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}