name := "hvpi"

version := "1.0"

scalaVersion := "2.10.4"

val spark = "org.apache.spark" %% "spark-core" % "1.4.0"


//resolvers ++= Seq(
//  "Xuggle Repo" at "http://xuggle.googlecode.com/svn/trunk/repo/share/java/"
//)

//val xuggle = "xuggle" % "xuggle-xuggler" % "5.4"
//libraryDependencies += xuggle

libraryDependencies += spark
