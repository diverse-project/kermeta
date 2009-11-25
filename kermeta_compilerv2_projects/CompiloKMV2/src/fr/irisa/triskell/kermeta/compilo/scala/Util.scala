/* Util.scala
 * Creation date: November 25, 2009
 * License: EPL
 * Copyright: IRISA / INRIA / Universite Rennes 1
 * Authors: Olivier BARAIS <barais@irisa.fr>
 *			Francois FOUQUET <ffouquet@irisa.fr>
 */

package fr.irisa.triskell.kermeta.compilo.scala

import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._
import scala.collection.JavaConversions._
import java.util.concurrent.Executors
import java.util.concurrent.ExecutorService
 
object Util  {

	
	/**
	 * Check if a model element has an Ecore Tag
	 * @param obj model element to test
	 * @return true if ecore tag is found
	 */
	def hasEcoreTag(obj : Object) : Boolean = {
	   obj.getOwnedTags.exists(e=> "ecore".equals(e.asInstanceOf[Tag].getName()))
    } 
   
   /**
    * Utility method, generate src file
    * @param repName Target directory name, sub directory separated by .
    * @param fileName Target file name
    * @param content Target file content
    */
	def generateFile(repName : String,fileName : String,content : String){
	   	var f : java.io.File = new java.io.File(GlobalConfiguration.outputFolder + java.io.File.separator + repName.replace(".", java.io.File.separator) )
	   	if(!f.exists()) f.mkdirs
		var f1 : java.io.File = new java.io.File(GlobalConfiguration.outputFolder + java.io.File.separator + repName.replace(".", java.io.File.separator) + java.io.File.separator + fileName + ".scala")
		var output : java.io.FileOutputStream = new java.io.FileOutputStream(f1)
  		var writer : java.io.PrintWriter = new java.io.PrintWriter(output)
	   	writer.println(content) 
    	writer.flush
    	writer.close
    	output.close
   }
   
	def cleanFolder(repName : String){
		var f : java.io.File = new java.io.File(repName)
		cleanFolder(f)
	}
	def cleanFolder(f : java.io.File){
		if(f.exists()){
			var children  = f.list
			for (i <- 0 until children.length){
				var subF = new java.io.File(f+java.io.File.separator+children(i))
				if(subF.isDirectory){
					cleanFolder(subF)
				} else {
					subF.delete
				}
			}
			f.delete()
		} else {
			println("Cleaning : folder not exist")
		}
	}
   
   /**
    * Global Compiler Thread Executor 
    */
   var threadExecutor : ExecutorService = Executors.newCachedThreadPool()
   
}
