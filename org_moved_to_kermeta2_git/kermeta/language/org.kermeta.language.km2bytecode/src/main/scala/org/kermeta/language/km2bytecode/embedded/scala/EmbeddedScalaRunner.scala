package org.kermeta.language.km2bytecode.embedded.scala

import org.kermeta.compilo.scala.LogAspect
import scala.collection.JavaConversions._

object EmbeddedScalaRunner extends LogAspect {
	
	def run(classpath : String, mainRunner : String , _params : java.util.List[String]){
		
		var startTime = System.currentTimeMillis
		log.info("Scala Running step begin")
		
		var params = Array("-savecompiled","-classpath",classpath,mainRunner) ++ _params
		new scala.tools.nsc.MainGenericRunner().process(params)
		
		var endTime= System.currentTimeMillis() - startTime
		log.info("Scala Running step complete in "+(endTime)+" millisecondes ")
		
	}

}
 