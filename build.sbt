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
resolvers := "javacv maven repo" at "http://maven2.javacv.googlecode.com/git/"librarydepedencies = "com.googlecode.javacv" % "javacv" % "0.2"
