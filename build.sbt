name := "Scala Project"

version := "0.1"

scalaVersion := "2.12.8"


libraryDependencies ++= Seq(
 "org.scalafx" %% "scalafx" % "12.0.2-R18",
 "org.scalafx" %% "scalafxml-core-sfx8" % "0.5")
//test
//)
//Compile / scalacOptions += "-Ymacro-annotations"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)