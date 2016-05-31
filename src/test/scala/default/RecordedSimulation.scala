package default

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://www.novell.com")
		.inferHtmlResources()
		.acceptHeader("*/*")
		.userAgentHeader("curl/7.37.0")



    val uri1 = "www.novell.com"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/")
			.check(status.is(301)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}