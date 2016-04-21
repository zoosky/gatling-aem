package default

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://localhost:4502")
		.inferHtmlResources()
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate, sdch")
		.acceptLanguageHeader("de-DE,de;q=0.8,en-US;q=0.6,en;q=0.4")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.87 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map("Accept" -> "text/css,*/*;q=0.1")

	val headers_6 = Map("Accept" -> "image/webp,image/*,*/*;q=0.8")

	val headers_8 = Map("Origin" -> "http://localhost:4502")

	val headers_10 = Map(
		"Accept" -> "text/plain, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"Origin" -> "http://localhost:4502",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_49 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest")



	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri1 + "/etc/clientlibs/granite/coralui2.css")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_2")
			.get(uri1 + "/etc/clientlibs/granite/typekit.js")
			.check(status.is(304)),
            http("request_3")
			.get(uri1 + "/libs/granite/core/content/login/clientlib.js")
			.check(status.is(304)),
            http("request_4")
			.get(uri1 + "/etc/clientlibs/granite/jquery.js")
			.check(status.is(304)),
            http("request_5")
			.get(uri1 + "/etc/clientlibs/granite/typekit/jwv7ouu/c/jwv7ouu-d.css")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_6")
			.get(uri1 + "/libs/granite/core/content/login/clientlib/resources/bg/default/2048x1536.jpg")
			.headers(headers_6)
			.check(status.is(304)),
            http("request_7")
			.get(uri1 + "/libs/granite/core/content/login/clientlib/resources/adobe-logo.png")
			.headers(headers_6)
			.check(status.is(304)),
            http("request_8")
			.get(uri1 + "/etc/clientlibs/granite/coralui2/resources/components/icon/AdobeIcons-80c0af4ec35ec9a927081adfe7763b55.woff")
			.headers(headers_8)
			.check(status.is(304)),
            http("request_9")
			.get(uri1 + "/libs/granite/core/content/login/favicon.ico")
			.check(status.is(304))))
		.pause(16)
		.exec(http("request_10")
			.post("/libs/granite/core/content/login.html/j_security_check")
			.headers(headers_10)
			.formParam("_charset_", "utf-8")
			.formParam("j_username", "admin")
			.formParam("j_password", "admin")
			.formParam("j_validate", "true")
			.resources(http("request_11")
			.get(uri1 + "/")
			.headers(headers_0),
            http("request_12")
			.get(uri1 + "/etc/clientlibs/granite/ui/quickactions.css")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_13")
			.get(uri1 + "/libs/cq/gui/components/projects/admin/clientlibs/projects.css")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_14")
			.get(uri1 + "/libs/granite/ui/components/foundation/clientlibs/foundation.css")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_15")
			.get(uri1 + "/libs/granite/ui/components/endor/clientlibs.css")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_16")
			.get(uri1 + "/libs/cq/gui/components/projects/admin/projects/details/clientlibs.css")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_17")
			.get(uri1 + "/etc/clientlibs/granite/uritemplate.js")
			.check(status.is(304)),
            http("request_18")
			.get(uri1 + "/libs/granite/ui/clientlibs/notifications.css")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_19")
			.get(uri1 + "/etc/clientlibs/granite/moment.js")
			.check(status.is(304)),
            http("request_20")
			.get(uri1 + "/etc/clientlibs/granite/utils.js")
			.check(status.is(304)),
            http("request_21")
			.get(uri1 + "/libs/cq/gui/components/common/admin/configurationwizard/clientlibs.css")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_22")
			.get(uri1 + "/etc/clientlibs/granite/jquery/granite.js")
			.check(status.is(304)),
            http("request_23")
			.get(uri1 + "/etc/clientlibs/granite/jquery/animation.js")
			.check(status.is(304)),
            http("request_24")
			.get(uri1 + "/libs/cq/gui/components/common/admin/timeline/clientlibs/timeline.css")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_25")
			.get(uri1 + "/etc/clientlibs/granite/coralui2.js")
			.check(status.is(304)),
            http("request_26")
			.get(uri1 + "/etc/clientlibs/granite/coralui2keys.js")
			.check(status.is(304)),
            http("request_27")
			.get(uri1 + "/etc/clientlibs/granite/ui/quickactions.js")
			.check(status.is(304)),
            http("request_28")
			.get(uri1 + "/etc/clientlibs/granite/history.js")
			.check(status.is(304)),
            http("request_29")
			.get(uri1 + "/libs/cq/gui/components/projects/admin/actions/delete/project/clientlibs.css")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_30")
			.get(uri1 + "/libs/cq/gui/components/projects/admin/properties/clientlibs.js")
			.check(status.is(304)),
            http("request_31")
			.get(uri1 + "/libs/granite/ui/components/foundation/admin/clientlibs/admin.js")
			.check(status.is(304)),
            http("request_32")
			.get(uri1 + "/libs/granite/ui/components/foundation/clientlibs/foundation.js")
			.check(status.is(304)),
            http("request_33")
			.get(uri1 + "/libs/granite/ui/components/endor/clientlibs.js")
			.check(status.is(304)),
            http("request_34")
			.get(uri1 + "/libs/cq/experiencelog/components/loader/clientlibs.js")
			.check(status.is(304)),
            http("request_35")
			.get(uri1 + "/libs/cq/gui/components/projects/admin/clientlibs/projects.js")
			.check(status.is(304)),
            http("request_36")
			.get(uri1 + "/libs/cq/gui/components/common/wcm/clientlibs/wcm.js")
			.check(status.is(304)),
            http("request_37")
			.get(uri1 + "/libs/cq/gui/components/projects/admin/historytimeline/clientlibs.js")
			.check(status.is(304)),
            http("request_38")
			.get(uri1 + "/libs/cq/gui/components/common/admin/timeline/clientlibs/timeline.js")
			.check(status.is(304)),
            http("request_39")
			.get(uri1 + "/libs/cq/gui/components/common/admin/configurationwizard/clientlibs.js")
			.check(status.is(304)),
            http("request_40")
			.get(uri1 + "/libs/cq/gui/components/siteadmin/admin/pages/clientlibs/pages.js")
			.check(status.is(304)),
            http("request_41")
			.get(uri1 + "/libs/cq/gui/components/common/admin/timeline/alerts/workflow/clientlibs/workflow.js")
			.check(status.is(304)),
            http("request_42")
			.get(uri1 + "/libs/granite/ui/clientlibs/notifications.js")
			.check(status.is(304)),
            http("request_43")
			.get(uri1 + "/content/projects/20160412/outdoors.projectcard.319.319.png")
			.headers(headers_6)
			.check(status.is(304)),
            http("request_44")
			.get(uri1 + "/libs/cq/gui/components/projects/admin/actions/delete/project/clientlibs.js")
			.check(status.is(304)),
            http("request_45")
			.get(uri1 + "/content/projects/20160412/shapes.projectcard.319.319.png")
			.headers(headers_6)
			.check(status.is(304)),
            http("request_46")
			.get(uri1 + "/content/projects/20160412/media.projectcard.319.319.png")
			.headers(headers_6)
			.check(status.is(304)),
            http("request_47")
			.get(uri1 + "/content/projects/20160412/gov.projectcard.319.319.png")
			.headers(headers_6)
			.check(status.is(304)),
            http("request_48")
			.get(uri1 + "/libs/granite/csrf/token.json"),
            http("request_49")
			.get(uri1 + "/libs/cq/i18n/dict.en.json")
			.headers(headers_49)
			.check(status.is(304)),
            http("request_50")
			.get(uri1 + "/libs/cq/gui/content/common/configurationwizard.check.json")
			.headers(headers_49)))
		.pause(35)
		.exec(http("request_51")
			.get("/libs/granite/operations/content/healthreports.html")
			.headers(headers_0)
			.resources(http("request_52")
			.get(uri1 + "/libs/granite/csrf/token.json"),
            http("request_53")
			.get(uri1 + "/libs/cq/i18n/dict.en.json")
			.headers(headers_49)
			.check(status.is(304))))
		.pause(4)
		.exec(http("request_54")
			.get("/libs/granite/operations/content/hr.subview.html/system/sling/monitoring/mbeans/org/apache/sling/healthcheck/HealthCheck/systemchecks")
			.headers(headers_0)
			.resources(http("request_55")
			.get(uri1 + "/libs/granite/csrf/token.json"),
            http("request_56")
			.get(uri1 + "/libs/cq/i18n/dict.en.json")
			.headers(headers_49)
			.check(status.is(304))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}