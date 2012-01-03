sbtPlugin := true

name := "sbt-emberjs"

organization := "com.github.stefri"

version := "0.1-SNAPSHOT"

scalacOptions := Seq("-deprecation", "-unchecked")

publishTo <<= (version) { v: String =>
  val repoSuffix = if (v.contains("-SNAPSHOT")) "snapshots" else "releases"
  val resolver = Resolver.file("gh-pages",
    new File("/Users/steffen/def/stefri.github.com/repo", repoSuffix))
  Some(resolver)
}

