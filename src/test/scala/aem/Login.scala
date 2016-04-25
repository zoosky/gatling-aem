package aem

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._


class Login extends Simulation {


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

   val headers_1 = Map(
      "Accept-Encoding" -> "gzip, deflate",
      "Accept-Language" -> "de-de",
      "Connection" -> "keep-alive",
      "User-Agent" -> "ocspd/1.0.3")

   val headers_4 = Map(
      "Accept" -> "text/plain, */*; q=0.01",
      "Accept-Encoding" -> "gzip, deflate",
      "Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
      "Origin" -> "http://localhost:4502",
      "X-Requested-With" -> "XMLHttpRequest")

   val headers_7 = Map(
      "Accept" -> "application/json, text/javascript, */*; q=0.01",
      "X-Requested-With" -> "XMLHttpRequest")

    
   val uri2 = "http://localhost:4502"

   val scn = scenario("LoginSimulation")
      .exec(http("logout")
         .get("/system/sling/logout.html")
         .headers(headers_0))
      .pause(4)
      .exec(http("login")
         .post("/libs/granite/core/content/login.html/j_security_check")
         .headers(headers_4)
         .formParam("_charset_", "utf-8")
         .formParam("j_username", "admin")
         .formParam("j_password", "admin")
         .formParam("j_validate", "true")
         .check(
            status.is(200),
            status.in(200 to 210).saveAs("postok"),
            form("coral-Form").saveAs("loginForm")
         )
            //.saveAs("login-token"))
         
         .resources(http("request_5")
         .get(uri2 + "/")
         .headers(headers_0),
         
         
            http("request_6")
         .get(uri2 + "/libs/granite/csrf/token.json"),
            http("request_7")
         .get(uri2 + "/libs/cq/i18n/dict.en.json")
         .headers(headers_7)
         .check(status.is(200)),
            http("request_8")
         .get(uri2 + "/libs/cq/gui/content/common/configurationwizard.check.json")
         .headers(headers_7)))
      .exec { session =>
         // displays the content of the session in the console (debugging only)
         println(session)

         // return the original session
         session
         }
   setUp(
      scn.inject(atOnceUsers(5))
      //.assertions( global.failedRequests.count.is(0))
      .protocols(httpProtocol)
      
    )
}