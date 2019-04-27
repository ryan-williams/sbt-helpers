
cancelable in Global := true

// updateOptions := updateOptions.value.withLatestSnapshots(false)

/*
// FIXME: remove setting of overwrite flag when the following issue will be fixed: https://github.com/sbt/sbt/issues/3725

publishConfiguration := publishConfiguration.value.withOverwrite(isSnapshot.value)
com.typesafe.sbt.pgp.PgpKeys.publishSignedConfiguration := com.typesafe.sbt.pgp.PgpKeys.publishSignedConfiguration.value.withOverwrite(isSnapshot.value)
publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(isSnapshot.value)
com.typesafe.sbt.pgp.PgpKeys.publishLocalSignedConfiguration := com.typesafe.sbt.pgp.PgpKeys.publishLocalSignedConfiguration.value.withOverwrite(isSnapshot.value)
*/

// only publish test-* artifacts
//packagedArtifacts := packagedArtifacts.value.filterKeys(_.classifier.exists(_.contains("test")))

addCommandAlias("r", "reload")
addCommandAlias("v", "version")
addCommandAlias("cl", "clean")

addCommandAlias("prep", "set snapshot in ThisBuild := false")
addCommandAlias("pr"  , "set snapshot in ThisBuild := false")
addCommandAlias("sc" ,  "sonatypeClose")
addCommandAlias("scr", ";sonatypeClose;sonatypeRelease")
addCommandAlias("sd", "sonatypeDrop")
addCommandAlias("sr", "sonatypeRelease")

addCommandAlias( "psc" ,  ";publishSigned;sonatypeClose")
addCommandAlias("ppsc" , ";+publishSigned;sonatypeClose")
addCommandAlias( "pscr",  ";publishSigned;sonatypeClose;sonatypeRelease")
addCommandAlias("ppscr", ";+publishSigned;sonatypeClose;sonatypeRelease")

addCommandAlias( "c",          "compile")
addCommandAlias("pc",         "+compile")
addCommandAlias( "cc",  ";clean;compile")
addCommandAlias("cpc", ";clean;+compile")

addCommandAlias( "tc",          "test:compile")
addCommandAlias("ptc",         "+test:compile")
addCommandAlias( "ctc",  ";clean;test:compile")
addCommandAlias("cptc", ";clean;+test:compile")

addCommandAlias("t", "test")
addCommandAlias("pt", "+test")

addCommandAlias( "pl" ,  ";publishLocal")
addCommandAlias("ppl" ,  "+publishLocal")
addCommandAlias("plt" ,  ";publishLocal; test")
addCommandAlias("ppt" , ";+publishLocal;+test")
addCommandAlias("pplt", ";+publishLocal;+test")

addCommandAlias( "tp" ,  ";test;;publishLocal")
addCommandAlias( "tpl",  ";test;;publishLocal")
addCommandAlias("ptp" , ";+test;+publishLocal")
addCommandAlias("ptpl", ";+test;+publishLocal")

addCommandAlias( "ps",  "publishSigned")
addCommandAlias("pps", "+publishSigned")

addCommandAlias( "to",  "testOnly")
addCommandAlias("pto", "+testOnly")

addCommandAlias("fo" , "fastOptJS")
addCommandAlias("fow", "fastOptJS::webpack")

addCommandAlias("dt",           "dependencyBrowseTree")
addCommandAlias("tdt",     "test:dependencyBrowseTree")
addCommandAlias("pdt", "provided:dependencyBrowseTree")

addCommandAlias( "ct" , ";clean;test")
addCommandAlias("pct" , ";clean;+test")
addCommandAlias("ctp", ";clean;+test;+publishLocal")
addCommandAlias("cpt", ";clean;+publishLocal;+test")

addCommandAlias("ld", "show libraryDependencies")
addCommandAlias("tld", "show test:libraryDependencies")
addCommandAlias("dc", "show dependencyClasspath")
addCommandAlias("tdc", "show test:dependencyClasspath")
addCommandAlias("fc", "show fullClasspath")
addCommandAlias("tfc", "show test:fullClasspath")

addCommandAlias("sv", "scalaVersion")
addCommandAlias("csv", "crossScalaVersions")
