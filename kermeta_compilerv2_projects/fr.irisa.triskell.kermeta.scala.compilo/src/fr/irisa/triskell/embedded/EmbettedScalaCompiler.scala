package fr.irisa.triskell.embedded

import fr.irisa.triskell.kermeta.compilo.scala.LogAspect
import java.io.File;

object EmbettedScalaCompiler extends LogAspect {
	
	def compile(srcPATH : String, outputPATH : String, cleanOutput : Boolean, jars : List[String]) : Int = {
		
		var startTime = System.currentTimeMillis
		
		/* Cleaning step */
		if(cleanOutput){
			InternalCompilerHelper.deleteDirRecursive(new File(outputPATH))
			new File(outputPATH).mkdir
		}
		/* Src files collect step */
		var listSrcFiles = InternalCompilerHelper.listFile(new File(srcPATH))
		/* Build class path */
		
		log.info("Scala compilation step begin on "+listSrcFiles.size+" files")
		
		var classpath : StringBuilder = new StringBuilder("."+File.pathSeparator)
		for(path <- jars) { classpath.append(path+File.pathSeparator) }
		
		var compilParams = List("-optimise","-d",outputPATH,"-classpath",classpath.toString) ++ listSrcFiles
		
		/* Compilation step */
		scala.tools.nsc.Main.process(compilParams.toArray)
		
		var endTime= System.currentTimeMillis() - startTime
		log.info("Scala compilation step complete in "+(endTime)+" millisecondes ")
		
		return if (scala.tools.nsc.Main.reporter.hasErrors) 1 else 0
	}
	

}
