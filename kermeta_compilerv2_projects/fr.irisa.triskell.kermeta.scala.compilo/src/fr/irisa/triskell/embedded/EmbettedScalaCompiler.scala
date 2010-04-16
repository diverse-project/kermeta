package fr.irisa.triskell.embedded

import fr.irisa.triskell.kermeta.compilo.scala.LogAspect
import java.io.File


object EmbettedScalaCompiler extends LogAspect {
	
    def getActualClasspath = List(System.getProperty("java.classpath"))
	
	
  def compile(srcPATH : String, outputPATH : String, cleanOutput : Boolean, jars : List[String], fsc : Boolean) : Int = {
		
    var startTime = System.currentTimeMillis
    var compilationResult = 0
		
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
		
		var compilParams = List("-nowarn","-encoding","UTF8","-g:none","-optimise","-d",outputPATH,"-classpath",classpath.toString) ++ listSrcFiles
		
    /* Compilation step */
    if(fsc){
      try scala.tools.nsc.CompileClient.main0(compilParams.toArray) catch { case e : Exception => compilationResult = 1 }
    } else {
      scala.tools.nsc.Main.process(compilParams.toArray)
      compilationResult = if (scala.tools.nsc.Main.reporter.hasErrors) 1 else 0
    }
		
    var endTime= System.currentTimeMillis() - startTime
    log.info("Scala compilation step complete in "+(endTime)+" millisecondes ")
		
    return compilationResult
  }
	

}
