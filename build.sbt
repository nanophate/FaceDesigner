name := """FaceDesigner"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

classpathTypes += "maven-plugin"
libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs
  )
  val javacv = 
  "com.googlecode.javacv" % 
  "javacv" % 
  "0.7" classifier "linux-x86_64" classifier "macosx-x86_64" classifier ""
 
libraryDependencies += javacv