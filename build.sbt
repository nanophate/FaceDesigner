name := """FaceDesigner"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "com.googlecode.javacv" % "0.2",
  "com.googlecode.javacpp" % "javacpp" % "0.2"
  )