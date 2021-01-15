val scala3Version = "3.0.0-M3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-slack-socket-mode-app",
    version := "0.1.0",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "com.slack.api" % "bolt-socket-mode" % "1.5.1",
      "org.glassfish.tyrus.bundles" % "tyrus-standalone-client" % "1.17",
      "org.slf4j" % "slf4j-simple" % "1.7.30"
    )
  )
