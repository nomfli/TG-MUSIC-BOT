val scalaVersionSetting = "2.13.14"  // Use a compatible Scala 2 version

lazy val root = project
  .in(file("."))
  .settings(
    name := "TG-MUSIC-BOT",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scalaVersionSetting,
    
    libraryDependencies ++= Seq(
      "com.bot4s" %% "telegram-core" % "5.8.3",
      "com.bot4s" %% "telegram-akka" % "5.8.3",
      "com.typesafe.slick" %% "slick" % "3.3.3",
      "com.h2database" % "h2" % "1.4.200"),
    resolvers ++= Resolver.sonatypeOssRepos("public").toSeq 
  )
