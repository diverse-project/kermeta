package org.kermeta.language.scalacompiler.sub

import java.io.File

object InternalCompilerHelper {
	var ext = "scala"
  /* INPUT : SRC DIRECTORY
   * OUTPUT : LIST of FILE path
   *
   * search and build a list of all Scala files from a directory
   *
   */
	def listFile(f : File) : List[String] = {
		var result = List[String]()
		if (f.isDirectory()) {
			for(subf <- f.listFiles){ 
				result = result ++ listFile(subf)
			}
		} else {
			if (f.getName().toLowerCase().endsWith("." + ext)){
				result = result ++ List(f.getAbsolutePath)
			}
		}
		return result
	}

	def deleteDirRecursive(f : File) : Unit = {
		if (f.isDirectory()) {
			for(subf <- f.listFiles){
				deleteDirRecursive(subf)
			}
		} else {
			f.delete
		}
	}
	
	
  
	
	
	
}
