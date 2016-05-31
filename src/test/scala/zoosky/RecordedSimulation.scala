package zoosky

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://gatling.io")
		.inferHtmlResources()
		.acceptHeader("image/webp,image/*,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate, sdch")
		.acceptLanguageHeader("en-US,en;q=0.8,de-DE;q=0.6,de;q=0.4,fr;q=0.2,it;q=0.2")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.86 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "de-de",
		"Connection" -> "keep-alive",
		"User-Agent" -> "ocspd/1.0.3")

	val headers_1 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"DNT" -> "1",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_2 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"DNT" -> "1")

	val headers_4 = Map(
		"Accept" -> "*/*",
		"DNT" -> "1")

	val headers_7 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"DNT" -> "1",
		"Resource-Freshness" -> "max-age=86400,stale-while-revalidate=604800,age=72360",
		"X-Client-Data" -> "CIW2yQEIo7bJAQjBtskBCP2VygE=")

	val headers_9 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"DNT" -> "1")

	val headers_14 = Map(
		"Accept" -> "*/*",
		"DNT" -> "1",
		"Origin" -> "http://gatling.io")

	val headers_15 = Map("DNT" -> "1")

	val headers_16 = Map(
		"Accept" -> "*/*",
		"DNT" -> "1",
		"Origin" -> "http://gatling.io",
		"X-Client-Data" -> "CIW2yQEIo7bJAQjBtskBCP2VygE=")

	val headers_17 = Map(
		"Accept" -> "text/html",
		"DNT" -> "1")

	val headers_44 = Map(
		"Accept" -> "*/*",
		"DNT" -> "1",
		"Origin" -> "http://blog.gatling.io")

	val headers_48 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"DNT" -> "1",
		"Resource-Freshness" -> "max-age=86400,stale-while-revalidate=604800,age=106564",
		"X-Client-Data" -> "CIW2yQEIo7bJAQjBtskBCP2VygE=")

    val uri01 = "upload.wikimedia.org"
    val uri02 = "ocsp.digicert.com"
	val uri03 = "http://gatling.io"
    val uri04 = "http://fonts.gstatic.com/s/mavenpro/v7"
    val uri05 = "platform.twitter.com"
    val uri06 = "img2.wikia.nocookie.net"
    val uri07 = "d0.awsstatic.com"
    val uri08 = "http://blog.gatling.io"
    val uri09 = "http://fonts.googleapis.com/css"
    val uri10 = "cdnjs.cloudflare.com"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("http://" + uri02 + "/MFYwVKADAgEAME0wSzBJMAkGBSsOAwIaBQAEFN%2BqEuMosQlBk%2BKfQoLOR0BClVijBBSxPsNpA%2Fi%2FRwHUmCYaCALvY2QrwwIQDHmpRLCMEZUgkmFf4msdgw%3D%3D")
			.headers(headers_0))
		.pause(3)
		.exec(http("request_1")
			.get("/")
			.headers(headers_1)
			.resources(http("request_2")
			.get("http://" + uri10 + "/ajax/libs/leaflet/0.7.3/leaflet.css")
			.headers(headers_2)
			.check(status.is(304)),
            http("request_3")
			.get(uri03 + "/styles/gatling-map.css")
			.headers(headers_2)
			.check(status.is(304)),
            http("request_4")
			.get(uri03 + "/scripts/scripts.js")
			.headers(headers_4)
			.check(status.is(304)),
            http("request_5")
			.get(uri03 + "/scripts/vendor.js")
			.headers(headers_4)
			.check(status.is(304)),
            http("request_6")
			.get(uri03 + "/styles/main.css")
			.headers(headers_2)
			.check(status.is(304)),
            http("request_7")
			.get(uri09 + "?family=Maven+Pro:400,500,700,900")
			.headers(headers_7),
            http("request_8")
			.get(uri09 + "?family=Inconsolata:400,700")
			.headers(headers_7),
            http("request_9")
			.get(uri03 + "/conf/conf.json")
			.headers(headers_9)
			.check(status.is(304)),
            http("request_10")
			.get(uri03 + "/locales/en.json")
			.headers(headers_9)
			.check(status.is(304)),
            http("request_11")
			.get(uri03 + "/views/footer.html")
			.headers(headers_9)
			.check(status.is(304)),
            http("request_12")
			.get(uri03 + "/views/header.html")
			.headers(headers_9)
			.check(status.is(304)),
            http("request_13")
			.get("http://" + uri05 + "/widgets.js")
			.headers(headers_4)
			.check(status.is(304)),
            http("request_14")
			.get(uri03 + "/fonts/fontawesome-webfont.woff?v=4.2.0")
			.headers(headers_14)
			.check(status.is(304)),
            http("request_15")
			.get(uri03 + "/images/icon-crunchbase.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_16")
			.get(uri04 + "/uDssvmXgp7Nj3i336k_dShampu5_7CjHW5spxoeN3Vs.woff2")
			.headers(headers_16)
			.check(status.is(304)),
            http("request_17")
			.get(uri03 + "/views/main.html")
			.headers(headers_17)
			.check(status.is(304)),
            http("request_18")
			.get(uri04 + "/SQVfzoJBbj9t3aVcmbspRhampu5_7CjHW5spxoeN3Vs.woff2")
			.headers(headers_16)
			.check(status.is(304)),
            http("request_19")
			.get(uri03 + "/views/steps.html")
			.headers(headers_9)
			.check(status.is(304)),
            http("request_20")
			.get(uri03 + "/fonts/bootstrap/glyphicons-halflings-regular.woff")
			.headers(headers_14)
			.check(status.is(304)),
            http("request_21")
			.get(uri03 + "/images/body-bg.jpg")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_22")
			.get(uri03 + "/images/gatling-nb.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_23")
			.get(uri03 + "/images/subtle_grunge.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_24")
			.get(uri03 + "/images/gatling-logo.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_25")
			.get(uri03 + "/images/logo-placeholder-media.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_26")
			.get(uri03 + "/images/logo-placeholder-travel.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_27")
			.get(uri03 + "/images/logo-ticketfly.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_28")
			.get(uri03 + "/images/logo-placeholder-e-collaboration.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_29")
			.get(uri03 + "/images/logo-gilt.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_30")
			.get(uri03 + "/images/logo-abiquo.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_31")
			.get(uri03 + "/images/logo-shutterfly.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_32")
			.get(uri03 + "/images/logo-secutix.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_33")
			.get(uri03 + "/images/logo-ezakus.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_34")
			.get(uri03 + "/images/logo-bouygues.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_35")
			.get(uri03 + "/images/logo-open-xchange.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_36")
			.get(uri04 + "/MG9KbUZFchDs94Tbv9U-pZBw1xU1rKptJj_0jans920.woff2")
			.headers(headers_16)
			.check(status.is(304)),
            http("request_37")
			.get(uri03 + "/images/recorder.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_38")
			.get(uri03 + "/images/jenkins.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_39")
			.get(uri03 + "/images/analyze.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_40")
			.get(uri03 + "/images/favicon.ico")
			.headers(headers_4)
			.check(status.is(304)))
			.check(status.is(304)))
		.pause(5)
		.exec(http("request_41")
			.get("/views/download.html")
			.headers(headers_17)
			.check(status.is(304)))
		.pause(10)
		.exec(http("request_42")
			.get(uri08 + "/")
			.headers(headers_1)
			.resources(http("request_43")
			.get(uri08 + "/wp-content/uploads/2016/03/Capture-d%C3%A9cran-2016-03-04-11.04.36.png")
			.headers(headers_15),
            http("request_44")
			.get(uri08 + "/wp-content/themes/inception/fonts/fontawesome/fontawesome-webfont.woff?v=4.2.0")
			.headers(headers_44),
            http("request_45")
			.get(uri08 + "/")
			.headers(headers_4)))
		.pause(13)
		// doku
		.exec(http("request_46")
			.get("/views/docs.html")
			.headers(headers_17)
			.check(status.is(304)))
		.pause(2)
		.exec(http("request_47")
			.get("/docs/2.2.0")
			.headers(headers_1)
			.resources(http("request_48")
			.get(uri09 + "?family=Maven+Pro:400,500,700")
			.headers(headers_48),
            http("request_49")
			.get(uri03 + "/docs/2.2.0/_static/pygments.css")
			.headers(headers_2)
			.check(status.is(304)),
            http("request_50")
			.get(uri03 + "/docs/2.2.0/_static/jquery.js")
			.headers(headers_4)
			.check(status.is(304)),
            http("request_51")
			.get(uri03 + "/docs/2.2.0/_static/underscore.js")
			.headers(headers_4)
			.check(status.is(304)),
            http("request_52")
			.get(uri03 + "/docs/2.2.0/_static/basic.css")
			.headers(headers_2)
			.check(status.is(304)),
            http("request_53")
			.get(uri03 + "/docs/2.2.0/_static/doctools.js")
			.headers(headers_4)
			.check(status.is(304)),
            http("request_54")
			.get(uri03 + "/vendor/javascripts/bootstrap.min.js")
			.headers(headers_4)
			.check(status.is(304)),
            http("request_55")
			.get(uri03 + "/vendor/javascripts/modernizr.min.js")
			.headers(headers_4)
			.check(status.is(304)),
            http("request_56")
			.get(uri03 + "/images/icon-googlegroup-on.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_57")
			.get(uri03 + "/images/icon-github-on.png")
			.headers(headers_15)
			.check(status.is(304)),
            http("request_58")
			.get(uri03 + "/images/icon-twitter-on.png")
			.headers(headers_15)
			.check(status.is(304)))
			.check(status.is(304)))
		.pause(9)
		.exec(http("request_59")
			.get("/docs/2.2.0/general/index.html")
			.headers(headers_1)
			.check(status.is(304)))
		.pause(15)
		.exec(http("request_60")
			.get("/docs/2.2.0/general/functional_specs.html")
			.headers(headers_1)
			.check(status.is(304)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}