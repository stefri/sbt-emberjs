sbtPlugin := true

name := "sbt-emberjs"

organization := "com.github.stefri"

version := "0.4.2"

scalacOptions := Seq("-deprecation", "-unchecked")

publishTo <<= (version) { v: String =>
  val repoSuffix = if (v.contains("-SNAPSHOT")) "snapshots" else "releases"
  val resolver = Resolver.file("gh-pages",
    new File("/Users/steffen/projekte/stefri.github.com/repo", repoSuffix))
  Some(resolver)
}

crossBuildingSettings

CrossBuilding.crossSbtVersions := Seq("0.12", "0.13")
