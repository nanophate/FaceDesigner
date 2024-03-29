name := """FaceDesigner"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs
  )
  classpathTypes += "maven-plugin"
  libraryDependencies += "org.bytedeco" % "javacv" % "0.11"
