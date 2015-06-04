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
val appDependencies = Seq(
      "javacv" % "javacv" % "2.3.1",
      "javacv" % "javacpp" % "2.3.1",
      "javacv" % "javacv-macosx-x86_64" % "2.3.1"
    )
