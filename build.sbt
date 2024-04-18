inThisBuild(List(
  crossScalaVersions := Seq("3.3.3", "2.13.14"),
  scalaVersion := crossScalaVersions.value.last,
  organization := "io.github.nafg.slick-migration-api"
))

name := "slick-migration-api-flyway"

scalacOptions ++= Seq("-feature", "-deprecation", "-Xsource:3")

libraryDependencies += "io.github.nafg.slick-migration-api" %% "slick-migration-api" % "0.10.0"

libraryDependencies += "org.flywaydb" % "flyway-core" % "10.11.1"

libraryDependencies += "com.h2database" % "h2" % "2.2.224" % "test"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.18" % "test"
