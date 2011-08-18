package org.embedded

import org.kermeta.compilo.scala.LogAspect

object EmbettedScalaRunner extends LogAspect {
	
	def run(classpath : String, mainRunner : String , _params : List[String]){
		
		var startTime = System.currentTimeMillis
		log.info("Scala Running step begin")
		
		var params = Array("-savecompiled","-classpath",classpath,mainRunner) ++ _params
		//println(params.mkString, " ")
		scala.tools.nsc.MainGenericRunner.main(params)
		
		var endTime= System.currentTimeMillis() - startTime
		log.info("Scala Running step complete in "+(endTime)+" millisecondes ")
		
	}

}
 