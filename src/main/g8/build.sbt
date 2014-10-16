name          := "$name$"

organization  := "$orgId$"

version       := "0.1.0"

scalaVersion  := "2.11.3"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val scalazV = "7.1.0"
  Seq(
    "org.scalaz"  %%  "scalaz-core"                 % scalazV,
    "org.scalaz"  %%  "scalaz-scalacheck-binding"   % scalazV  % "test"
  )
}
