package fr.irisa.triskell.embedded

import java.io.File;

object EmbettedScalaCompiler {
	
	def compile(srcPATH : String, outputPATH : String, cleanOutput : Boolean, jars : List[String]) : Int = {
		/* Cleaning step */
		if(cleanOutput){
			InternalCompilerHelper.deleteDirRecursive(new File(outputPATH))
			new File(outputPATH).mkdir
		}
		/* Src files collect step */
		var listSrcFiles = InternalCompilerHelper.listFile(new File(srcPATH))
		/* Build class path */
		
		var classpath : StringBuilder = new StringBuilder("."+File.pathSeparator)
		for(path <- jars) { classpath.append(path+File.pathSeparator) }
		
		var compilParams = List("-d",outputPATH,"-classpath",classpath.toString) ++ listSrcFiles
		
		/* Compilation step */
		scala.tools.nsc.Main.process(compilParams.toArray)
		return if (scala.tools.nsc.Main.reporter.hasErrors) 1 else 0
	}
	

}
