lazy val root = project
  .in(file("."))
  .settings(
    name := "TG-MUSIC-BOT",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.13.14",

    libraryDependencies ++= Seq(
      "com.bot4s" %% "telegram-core" % "5.8.3",
      "com.bot4s" %% "telegram-akka" % "5.8.3",
      "com.typesafe.akka" %% "akka-actor" % "2.6.20",  
      "com.typesafe.akka" %% "akka-stream" % "2.6.20",
      "com.typesafe.slick" %% "slick" % "3.3.3",
      "com.h2database" % "h2" % "1.4.200"
    ),

    resolvers ++= Seq(
      "Sonatype OSS" at "https://oss.sonatype.org/content/repositories/releases/"
    )
  )
