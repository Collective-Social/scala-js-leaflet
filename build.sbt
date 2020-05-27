enablePlugins(ScalaJSPlugin)

name := "Scala.js Leaflet"

normalizedName := "scala-js-leaflet"

organization := "nl.thijsbroersen"

scalaVersion := "2.12.10"

scalacOptions ++= Seq("-deprecation", "-feature") ++ (
  if (scalaJSVersion.startsWith("0.6.")) Seq("-P:scalajs:sjsDefinedByDefault")
  else Nil
)

version := "0.3.2-SNAPSHOT"

crossScalaVersions := Seq("2.12.10", "2.13.1")

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.0.0"

inThisBuild(List(
  homepage := Some(url("https://github.com/ThijsBroersen/scala-js-leaflet")),
  licenses := List("MIT" -> url("https://opensource.org/licenses/MIT")),
  developers := List(
    Developer(
      "thijsbroersen",
      "Thijs Broersen",
      "thijsbroersen@gmail.com",
      url("https://github.com/ThijsBroersen")
    )
  )
))
