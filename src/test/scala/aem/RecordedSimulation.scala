package aem

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://localhost:4502")
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
		"User-Agent" -> "Mac OS X/10.11.4 (15E65)")

	val headers_1 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "de-de",
		"Connection" -> "keep-alive",
		"User-Agent" -> "ocspd/1.0.3")

	val headers_3 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"DNT" -> "1",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_4 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"DNT" -> "1")

	val headers_5 = Map(
		"Accept" -> "*/*",
		"DNT" -> "1")

	val headers_9 = Map("DNT" -> "1")

	val headers_10 = Map(
		"Accept" -> "*/*",
		"DNT" -> "1",
		"Origin" -> "http://localhost:4502")

	val headers_13 = Map(
		"Accept" -> "text/plain, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"DNT" -> "1",
		"Origin" -> "http://localhost:4502",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_16 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"DNT" -> "1",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_67 = Map(
		"Accept" -> "*/*",
		"DNT" -> "1",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_157 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate",
		"CSRF-Token" -> "eyJleHAiOjE0NjE3NDM0NjQsImlhdCI6MTQ2MTc0Mjg2NH0.wj2aZdqfYB3J4CLGyOx7zCtVXVLrRzBs9acRxCepQ38",
		"Content-Type" -> "multipart/form-data; boundary=----WebKitFormBoundaryKeBFGFzT9zt9esLI",
		"DNT" -> "1",
		"Origin" -> "http://localhost:4502")

	 val uri1 = "http://localhost:4502"
   
	val scn = scenario("RecordedSimulation")
		
		.exec(http("request_3")
			.get("/system/sling/logout.html")
			.headers(headers_3)
			.resources(http("request_4")
			.get(uri1 + "/etc/clientlibs/granite/coralui2.css")
			.headers(headers_4)
			.check(status.is(304)),  // should be catched by apache httpd
            http("request_5")
			.get(uri1 + "/etc/clientlibs/granite/typekit.js")
			.headers(headers_5)
			.check(status.is(304)),
            http("request_6")
			.get(uri1 + "/libs/granite/core/content/login/clientlib.js")
			.headers(headers_5)
			.check(status.is(304)),
            http("request_7")
			.get(uri1 + "/etc/clientlibs/granite/jquery.js")
			.headers(headers_5)
			.check(status.is(304)),
            http("request_8")
			.get(uri1 + "/etc/clientlibs/granite/typekit/jwv7ouu/c/jwv7ouu-d.css")
			.headers(headers_4)
			.check(status.is(304)),
            http("request_9")
			.get(uri1 + "/libs/granite/core/content/login/clientlib/resources/bg/default/1024x710.jpg")
			.headers(headers_9),
            http("request_10")
			.get(uri1 + "/etc/clientlibs/granite/coralui2/resources/components/icon/AdobeIcons-80c0af4ec35ec9a927081adfe7763b55.woff")
			.headers(headers_10)
			.check(status.is(304)),
            http("request_11")
			.get(uri1 + "/libs/granite/core/content/login/clientlib/resources/adobe-logo.png")
			.headers(headers_9)
			.check(status.is(304)),
            http("request_12")
			.get(uri1 + "/libs/granite/core/content/login/favicon.ico")
			.headers(headers_5)))
		.pause(7)
		.exec(http("request_13")
			.post("/libs/granite/core/content/login.html/j_security_check")
			.headers(headers_13)
			.formParam("_charset_", "utf-8")
			.formParam("j_username", "admin")
			.formParam("j_password", "admin")
			.formParam("j_validate", "true")
			.resources(http("request_14")
			.get(uri1 + "/")
			.headers(headers_3),
            http("request_15")
			.get(uri1 + "/libs/granite/csrf/token.json")
			.headers(headers_5),
            http("request_16")
			.get(uri1 + "/libs/cq/i18n/dict.en.json")
			.headers(headers_16)
			.check(status.is(304)),
            http("request_17")
			.get(uri1 + "/libs/cq/gui/content/common/configurationwizard.check.json")
			.headers(headers_16)))
		.pause(17)
		.exec(http("request_18")
			.get("/welcome")
			.headers(headers_3)
			.resources(http("request_19")
			.get(uri1 + "/libs/granite/csrf/token.json")
			.headers(headers_5),
            http("request_20")
			.get(uri1 + "/libs/cq/core/content/welcome/images/sprite.png")
			.headers(headers_9),
            http("request_21")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/tree/elbow-plus-nl.gif")
			.headers(headers_9),
            http("request_22")
			.get(uri1 + "/libs/cq/core/content/welcome/images/box-bg-shadow.png")
			.headers(headers_9),
            http("request_23")
			.get(uri1 + "/libs/cq/core/content/welcome/images/box-bg.png")
			.headers(headers_9)))
		.pause(2)
		.exec(http("request_24")
			.get("/damadmin")
			.headers(headers_3)
			.resources(http("request_25")
			.get(uri1 + "/libs/cq/searchpromote/widgets.js")
			.headers(headers_5),
            http("request_26")
			.get(uri1 + "/libs/cq/ui/widgets.js")
			.headers(headers_5)
			.check(status.is(304)),
            http("request_27")
			.get(uri1 + "/libs/cq/tagging/widgets.js")
			.headers(headers_5),
            http("request_28")
			.get(uri1 + "/libs/mcm/emailservice-clientlib.css")
			.headers(headers_4),
            http("request_29")
			.get(uri1 + "/libs/cq/searchpromote/widgets/themes/default.css")
			.headers(headers_4),
            http("request_30")
			.get(uri1 + "/libs/cq/security/widgets.js")
			.headers(headers_5),
            http("request_31")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default.css")
			.headers(headers_4),
            http("request_32")
			.get(uri1 + "/etc/clientlibs/foundation/searchpromote/themes/default.css")
			.headers(headers_4),
            http("request_33")
			.get(uri1 + "/libs/cq/analytics/widgets/themes/default.css")
			.headers(headers_4),
            http("request_34")
			.get(uri1 + "/libs/cq/security/widgets/themes/default.css")
			.headers(headers_4),
            http("request_35")
			.get(uri1 + "/libs/cq/ui/rte.js")
			.headers(headers_5),
            http("request_36")
			.get(uri1 + "/libs/dam/components/scene7/widgets/themes/default.css")
			.headers(headers_4),
            http("request_37")
			.get(uri1 + "/libs/cq/tagging/widgets/themes/default.css")
			.headers(headers_4),
            http("request_38")
			.get(uri1 + "/libs/mcm/widgets/themes/default.css")
			.headers(headers_4),
            http("request_39")
			.get(uri1 + "/libs/cq/cloudserviceconfigs/widgets/themes/default.css")
			.headers(headers_4),
            http("request_40")
			.get(uri1 + "/libs/cq/search/widgets/themes/default.css")
			.headers(headers_4),
            http("request_41")
			.get(uri1 + "/libs/cq/reporting/widgets/themes/default.css")
			.headers(headers_4),
            http("request_42")
			.get(uri1 + "/libs/mcm/emailservice-clientlib.js")
			.headers(headers_5),
            http("request_43")
			.get(uri1 + "/libs/commerce/widgets/themes/default.css")
			.headers(headers_4),
            http("request_44")
			.get(uri1 + "/libs/cq/personalization/audiencemanager/clientlibs/core.js")
			.headers(headers_5),
            http("request_45")
			.get(uri1 + "/libs/dam/widgets/themes/default.css")
			.headers(headers_4),
            http("request_46")
			.get(uri1 + "/libs/cq/personalization/audiencemanager/widgets.js")
			.headers(headers_5),
            http("request_47")
			.get(uri1 + "/libs/cq/cloudserviceconfigs/widgets.js")
			.headers(headers_5),
            http("request_48")
			.get(uri1 + "/libs/dam/components/scene7/dynamicmedia/clientlibs/widgets.js")
			.headers(headers_5),
            http("request_49")
			.get(uri1 + "/libs/dam/components/scene7/dynamicvideo/widgets.js")
			.headers(headers_5),
            http("request_50")
			.get(uri1 + "/libs/dam/components/scene7/widgets.js")
			.headers(headers_5),
            http("request_51")
			.get(uri1 + "/libs/cq/search/widgets.js")
			.headers(headers_5),
            http("request_52")
			.get(uri1 + "/libs/mcm/collab-calendar/widgets.js")
			.headers(headers_5),
            http("request_53")
			.get(uri1 + "/libs/cq/analytics/widgets.js")
			.headers(headers_5),
            http("request_54")
			.get(uri1 + "/libs/mcm/campaign/clientlibs/utils.js")
			.headers(headers_5),
            http("request_55")
			.get(uri1 + "/libs/cq/reporting/widgets.js")
			.headers(headers_5),
            http("request_56")
			.get(uri1 + "/libs/mcm/widgets.js")
			.headers(headers_5),
            http("request_57")
			.get(uri1 + "/libs/commerce/widgets.js")
			.headers(headers_5),
            http("request_58")
			.get(uri1 + "/libs/mcm/campaign/clientlibs/widgets.js")
			.headers(headers_5),
            http("request_59")
			.get(uri1 + "/libs/cq/search/widgets/themes/default.js")
			.headers(headers_5),
            http("request_60")
			.get(uri1 + "/libs/cq/security/widgets/themes/default.js")
			.headers(headers_5),
            http("request_61")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default.js")
			.headers(headers_5),
            http("request_62")
			.get(uri1 + "/libs/dam/widgets.js")
			.headers(headers_5),
            http("request_63")
			.get(uri1 + "/libs/cq/tagging/widgets/themes/default.js")
			.headers(headers_5),
            http("request_64")
			.get(uri1 + "/libs/mcm/widgets/themes/default.js")
			.headers(headers_5),
            http("request_65")
			.get(uri1 + "/libs/dam/widgets/themes/default.js")
			.headers(headers_5),
            http("request_66")
			.get(uri1 + "/libs/granite/csrf/token.json")
			.headers(headers_5),
            http("request_67")
			.get(uri1 + "/libs/cq/security/userinfo.json?cq_ck=1461742864759")
			.headers(headers_67),
            http("request_68")
			.get(uri1 + "/libs/cq/i18n/dict.en.json")
			.headers(headers_16)
			.check(status.is(304)),
            http("request_69")
			.get(uri1 + "/libs/wcm/core/content/damadmin.infinity.json")
			.headers(headers_67),
            http("request_70")
			.get(uri1 + "/home/users/G/Gyh8TFuhRvK0I9BZqzXr.permissions.json?path=%2F&_charset_=utf-8&cq_ck=1461742866143")
			.headers(headers_5),
            http("request_71")
			.get(uri1 + "/libs/dam/content/search/searchpanel/facets.overlay.infinity.json")
			.headers(headers_67),
            http("request_72")
			.get(uri1 + "/libs/dam/options/predicates/mimetypes.infinity.json")
			.headers(headers_67),
            http("request_73")
			.get(uri1 + "/etc/tags/stockphotography/business.infinity.json")
			.headers(headers_67),
            http("request_74")
			.get(uri1 + "/etc/tags/stockphotography/industry.infinity.json")
			.headers(headers_67),
            http("request_75")
			.get(uri1 + "/etc/tags/stockphotography/lifestyle.infinity.json")
			.headers(headers_67),
            http("request_76")
			.get(uri1 + "/etc/tags/stockphotography/nature.infinity.json")
			.headers(headers_67),
            http("request_77")
			.get(uri1 + "/etc/tags/stockphotography/illustrations_vectors.infinity.json")
			.headers(headers_67),
            http("request_78")
			.get(uri1 + "/libs/dam/options/predicates/scene7status.infinity.json")
			.headers(headers_67),
            http("request_79")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/tabs/tabs-sprite.gif")
			.headers(headers_9),
            http("request_80")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/resources/damadmin_titlebar_bg.png")
			.headers(headers_9),
            http("request_81")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/tabs/tab-strip-bg.gif")
			.headers(headers_9),
            http("request_82")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/icons/16x16/search.png")
			.headers(headers_9),
            http("request_83")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/toolbar/bg.gif")
			.headers(headers_9),
            http("request_84")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/button/btn.gif")
			.headers(headers_9),
            http("request_85")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/icons/16x16/refresh.png")
			.headers(headers_9),
            http("request_86")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/dd/drop-no.gif")
			.headers(headers_9),
            http("request_87")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/tree/elbow.gif")
			.headers(headers_9),
            http("request_88")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/layout/mini-left.gif")
			.headers(headers_9),
            http("request_89")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/tree/loading.gif")
			.headers(headers_9),
            http("request_90")
			.get(uri1 + "/bin/wcm/siteadmin/tree.json?_dc=1461742866663&ncc=30&_charset_=utf-8&path=%2Fcontent%2Fdam&node=xnode-32")
			.headers(headers_67),
            http("request_91")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/grid/grid3-hrow2.gif")
			.headers(headers_9),
            http("request_92")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/grid/col-move-bottom.gif")
			.headers(headers_9),
            http("request_93")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/grid/col-move-top.gif")
			.headers(headers_9),
            http("request_94")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/button/s-arrow-noline.gif")
			.headers(headers_9),
            http("request_95")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/grid/grid-split.gif")
			.headers(headers_9),
            http("request_96")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/icons/16x16/file.png")
			.headers(headers_9),
            http("request_97")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/button/arrow.gif")
			.headers(headers_9),
            http("request_98")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/icons/16x16/tools.png")
			.headers(headers_9),
            http("request_99")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/widgets/Switcher/btn.gif")
			.headers(headers_9),
            http("request_100")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/icons/16x16/user.png")
			.headers(headers_9),
            http("request_101")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/widgets/Switcher/inact_siteadmin.png")
			.headers(headers_9),
            http("request_102")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/widgets/Switcher/inact_mcm.png")
			.headers(headers_9),
            http("request_103")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/widgets/Switcher/inact_useradmin.png")
			.headers(headers_9),
            http("request_104")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/widgets/Switcher/act_damadmin.png")
			.headers(headers_9),
            http("request_105")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/widgets/Switcher/inact_inbox.png")
			.headers(headers_9),
            http("request_106")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/widgets/Switcher/inact_misc.png")
			.headers(headers_9),
            http("request_107")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/widgets/Switcher/inact_tagadmin.png")
			.headers(headers_9),
            http("request_108")
			.get(uri1 + "/libs/cq/ui/resources/0.html")
			.headers(headers_3),
            http("request_109")
			.get(uri1 + "/libs/cq/ui/resources/0.gif")
			.headers(headers_9),
            http("request_110")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/tree/elbow-plus.gif")
			.headers(headers_9),
            http("request_111")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/tree/folder-open.gif")
			.headers(headers_9),
            http("request_112")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/tree/folder.gif")
			.headers(headers_9),
            http("request_113")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/tree/elbow-end-plus.gif")
			.headers(headers_9),
            http("request_114")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/tree/elbow-end-minus.gif")
			.headers(headers_9)))
		.pause(6)
		.exec(http("request_115")
			.get("/bin/wcm/siteadmin/tree.json?_dc=1461742873597&ncc=30&_charset_=utf-8&path=%2Fcontent%2Fdam%2Fgeometrixx&node=xnode-233")
			.headers(headers_67)
			.resources(http("request_116")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/grid/loading.gif")
			.headers(headers_9),
            http("request_117")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/panel/white-top-bottom.gif")
			.headers(headers_9),
            http("request_118")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/grid/grid3-hd-btn.gif")
			.headers(headers_9),
            http("request_119")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/tree/elbow-minus.gif")
			.headers(headers_9),
            http("request_120")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/tree/elbow-line.gif")
			.headers(headers_9),
            http("request_121")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/tree/elbow-end.gif")
			.headers(headers_9),
            http("request_122")
			.get(uri1 + "/home/users/G/Gyh8TFuhRvK0I9BZqzXr.permissions.json?path=%2Fcontent%2Fdam&_charset_=utf-8&cq_ck=1461742873764")
			.headers(headers_5),
            http("request_123")
			.get(uri1 + "/content/dam/geometrixx.assets.json?_dc=1461742873653&start=0&limit=15&predicate=siteadmin")
			.headers(headers_67),
            http("request_124")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/grid/grid3-special-col-bg.gif")
			.headers(headers_9),
            http("request_125")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/widgets/wcm/SiteAdmin/status-none.gif")
			.headers(headers_9),
            http("request_126")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/icons/16x16/bulb-grey.gif")
			.headers(headers_9),
            http("request_127")
			.get(uri1 + "/content/dam/geometrixx/portraits.thumb.48.48.png")
			.headers(headers_9),
            http("request_128")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/icons/48x48/folder.png.thumb.48.48.png")
			.headers(headers_9),
            http("request_129")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/icons/48x48/folder.png.thumb.48.48.png")
			.headers(headers_9),
            http("request_130")
			.get(uri1 + "/content/dam/geometrixx/packshots.thumb.48.48.png")
			.headers(headers_9),
            http("request_131")
			.get(uri1 + "/content/dam/geometrixx/offices.thumb.48.48.png")
			.headers(headers_9),
            http("request_132")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/icons/48x48/folder.png.thumb.48.48.png")
			.headers(headers_9),
            http("request_133")
			.get(uri1 + "/content/dam/geometrixx/travel.thumb.48.48.png")
			.headers(headers_9)
			.check(status.is(304)),
            http("request_134")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/icons/48x48/folder.png.thumb.48.48.png")
			.headers(headers_9)
			.check(status.is(304)),
            http("request_135")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/icons/48x48/folder.png.thumb.48.48.png")
			.headers(headers_9)
			.check(status.is(304)),
            http("request_136")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/icons/48x48/folder.png.thumb.48.48.png")
			.headers(headers_9)
			.check(status.is(304))))
		.pause(4)
		.exec(http("request_137")
			.get("/libs/cq/ui/widgets/themes/default/ext/button/s-arrow-o.gif")
			.headers(headers_9)
			.resources(http("request_138")
			.get(uri1 + "/libs/wcm/core/content/tools/uploaddialog.overlay.infinity.json")
			.headers(headers_67),
            http("request_139")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/window/top-bottom.png")
			.headers(headers_9),
            http("request_140")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/window/left-right.png")
			.headers(headers_9),
            http("request_141")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/window/left-corners.png")
			.headers(headers_9),
            http("request_142")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/window/right-corners.png")
			.headers(headers_9),
            http("request_143")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/panel/tool-sprites.gif")
			.headers(headers_9),
            http("request_144")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/form/text-bg.gif")
			.headers(headers_9),
            http("request_145")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/sizer/e-handle.gif")
			.headers(headers_9),
            http("request_146")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/sizer/ne-handle.gif")
			.headers(headers_9),
            http("request_147")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/sizer/sw-handle.gif")
			.headers(headers_9),
            http("request_148")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/sizer/s-handle.gif")
			.headers(headers_9),
            http("request_149")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/sizer/se-handle.gif")
			.headers(headers_9),
            http("request_150")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/sizer/nw-handle.gif")
			.headers(headers_9),
            http("request_151")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/shadow.png")
			.headers(headers_9),
            http("request_152")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/shadow-c.png")
			.headers(headers_9),
            http("request_153")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/shadow-lr.png")
			.headers(headers_9)))
		.pause(33)
		.exec(http("request_154")
			.get("/content/dam/geometrixx.1.json?cq_ck=1461742954018")
			.headers(headers_67)
			.resources(http("request_155")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/progress/progress-bg.gif")
			.headers(headers_9),
            http("request_156")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/qtip/bg.gif")
			.headers(headers_9),
            http("request_157")
			.post(uri1 + "/content/dam/geometrixx.createasset.html")
			.headers(headers_157)
			.body(RawFileBody("RecordedSimulation_0157_request.txt"))))
		.pause(1)
		.exec(http("request_158")
			.get("/content/dam/geometrixx.assets.json?_dc=1461742955700&start=0&limit=15&predicate=siteadmin")
			.headers(headers_67)
			.resources(http("request_159")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/widgets/wcm/SiteAdmin/status-workflow.gif")
			.headers(headers_9),
            http("request_160")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/icons/48x48/document_loading.gif")
			.headers(headers_9)))
		.pause(5)
		.exec(http("request_161")
			.get("/libs/cq/ui/widgets/themes/default/ext/qtip/tip-anchor-sprite.gif")
			.headers(headers_9)
			.resources(http("request_162")
			.get(uri1 + "/libs/cq/ui/widgets/themes/default/ext/qtip/tip-sprite.gif")
			.headers(headers_9)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}