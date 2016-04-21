enablePlugins(GatlingPlugin)

javaOptions in Gatling := overrideDefaultJavaOptions("-Xms1024m", "-Xmx2048m")

libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.2.0" % "test"
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % "2.2.0" % "test"