name := "gatling-aem"
organization := "zoosky"
version := "0.0.1-SNAPSHOT"

enablePlugins(GatlingPlugin)

scalaVersion := "2.11.8"

scalacOptions := Seq(
  "-encoding", "UTF-8", "-target:jvm-1.8", "-deprecation",
  "-feature", "-unchecked", "-language:implicitConversions", "-language:postfixOps")

javaOptions in Gatling := overrideDefaultJavaOptions(
    "-Xms1G", "-Xmx2G", 
    "-Djsse.enableSNIExtension=false", 
    "-Djava.net.preferIPv4Stack=true", 
    "-Djava.net.preferIPv6Addresses=false", 
    "-Dsun.net.inetaddr.ttl=0"
    )

libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.2.0" //% "test"
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % "2.2.0" //% "test"


mainClass in Compile := Some("io.gatling.app.Gatling")
// Gatling contains scala-library
assemblyOption in assembly := (assemblyOption in assembly).value
  .copy(includeScala = false)
mainClass in assembly := Some("io.gatling.app.Gatling")