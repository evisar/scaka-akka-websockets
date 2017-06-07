name := "scala-akka-websockets"
version := "1.0"

scalaVersion := "2.12.2"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor" % "2.5.2",
    "com.typesafe.akka" %% "akka-stream" % "2.5.2",
    "com.typesafe.akka" %% "akka-http" % "10.0.7"
)