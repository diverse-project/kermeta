package org.kermeta.language.scalacompiler.sub

object EmbettedScalaRunner {
	
	def run(classpath : String, mainRunner : String , _params : List[String]){	
		var startTime = System.currentTimeMillis
		println("Scala Running step begin")
		
		var params = Array("-savecompiled","-classpath",classpath,mainRunner) ++ _params
		scala.tools.nsc.MainGenericRunner.main(params)
		
		var endTime= System.currentTimeMillis() - startTime
		println("Scala Running step complete in "+(endTime)+" millisecondes ")
	}

}
 