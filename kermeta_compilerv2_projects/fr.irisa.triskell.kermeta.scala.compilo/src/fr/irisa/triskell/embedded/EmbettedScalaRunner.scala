package fr.irisa.triskell.embedded

object EmbettedScalaRunner {
	
	def run(classpath : String, mainRunner : String ){
		var params = Array("-savecompiled","-classpath",classpath,mainRunner)
		scala.tools.nsc.MainGenericRunner.main(params)
	}

}
 