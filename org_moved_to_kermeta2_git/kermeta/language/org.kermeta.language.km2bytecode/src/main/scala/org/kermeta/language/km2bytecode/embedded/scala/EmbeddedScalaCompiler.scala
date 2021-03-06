package org.kermeta.language.km2bytecode.embedded.scala


import org.kermeta.compilo.scala.LogAspect
import java.io.File
import scala.collection.JavaConversions._
import tools.nsc.reporters.ConsoleReporter
import tools.nsc.io.AbstractFile
import tools.nsc.Properties._
import java.io.File._
import tools.nsc._
import scala.tools.nsc.interactive.{ RefinedBuildManager, SimpleBuildManager }

object EmbeddedScalaCompiler extends LogAspect {
	
  def getActualClasspath = {
    var classpath = List[String]()
    if(System.getProperty("java.classpath") != null ) {
      classpath = classpath ++ List(System.getProperty("java.classpath"))
    }
    if(System.getProperty("java.class.path") != null ) {
      classpath = classpath ++ List(System.getProperty("java.class.path"))
    }   
    classpath
  }
	
  def compile(srcPATH : String, outputPATH : String, cleanOutput : Boolean, jars : java.util.List[String], fsc : Boolean) : Int = {

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
		
    log.info("Scala2bytecode compilation step begin on "+listSrcFiles.size+" files")
		
    var classpath : StringBuilder = new StringBuilder("."+File.pathSeparator)
    for(path <- jars) {
      classpath.append(path+File.pathSeparator)
    }
		
    var compilParams = List("-nowarn","-encoding","UTF8","-g:none","-optimise","-d",outputPATH,"-classpath",classpath.toString) ++ listSrcFiles

    //println(compilParams)
    /* Compilation step */
    if(fsc){
      try scala.tools.nsc.CompileClient.main(compilParams.toArray) catch { case e : Exception => compilationResult = 1 }
    } else {
      try {
        _root_.scala.tools.nsc.Main.process(compilParams.toArray)
        compilationResult = if (scala.tools.nsc.Main.reporter.hasErrors) 1 else 0
      }
      catch {
        case e : Exception =>
          compilationResult = 1
      }      
    }
		
    var endTime= System.currentTimeMillis() - startTime
    log.info("Scala2bytecode compilation step complete in "+(endTime)+" millisecondes ")
		
    return compilationResult
  }




}
