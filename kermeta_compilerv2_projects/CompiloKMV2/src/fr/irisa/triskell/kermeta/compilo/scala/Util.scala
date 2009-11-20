package fr.irisa.triskell.kermeta.compilo.scala

import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._
import scala.collection.JavaConversions._
 
object Util  {

   var outputFolder : String = "../outputScala/src"
	    
   def hasEcoreTag(obj : Object) : Boolean = {
	   obj.getOwnedTags.exists(e=> "ecore".equals(e.asInstanceOf[Tag].getName()))
    } 
   
   def generateFile(repName : String,fileName : String,content : String){
	    
		//println(Util.outputFolder + java.io.File.separator + repName)
	   	var f : java.io.File = new java.io.File(Util.outputFolder + java.io.File.separator + repName.replace(".", java.io.File.separator) )
		if(!f.exists()) f.mkdirs
		var f1 : java.io.File = new java.io.File(Util.outputFolder + java.io.File.separator + repName.replace(".", java.io.File.separator) + java.io.File.separator + fileName + ".scala")
		var output : java.io.FileOutputStream = new java.io.FileOutputStream(f1)
  		var writer : java.io.PrintWriter = new java.io.PrintWriter(output)
	   	writer.println(content) 
    	writer.flush
    	writer.close
    	output.close 
   }
}
