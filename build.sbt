name := """FaceDesigner"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "com.googlecode.javacv" % "javacv" % "0.11",
  "com.googlecode.javacpp" % "javacpp" % "0.11"
  )