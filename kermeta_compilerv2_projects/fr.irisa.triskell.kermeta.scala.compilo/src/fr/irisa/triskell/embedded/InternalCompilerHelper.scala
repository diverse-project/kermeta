package fr.irisa.triskell.embedded

import java.io.File;

object InternalCompilerHelper {
	
	var ext = "scala"
		
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
