name := "ShootingGame"

version := "1.0"

scalaVersion := "2.12.0"

//for fxml
addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "org.scalafx" % "scalafx_2.12" % "8.0.102-R11",
  "org.scalafx" % "scalafxml-core-sfx8_2.12" % "0.3",
  "com.github.nscala-time" % "nscala-time_2.11" % "2.16.0"
)

fork := true
