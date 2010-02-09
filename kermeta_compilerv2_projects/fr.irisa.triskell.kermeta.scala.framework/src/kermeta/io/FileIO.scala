package kermeta.io

import java.io._

class FileIO {
	
	def writeTextFile(filename : String, text : String) : Unit = {
		var repname = new File(filename.substring(0, filename.lastIndexOf("/")))
		if(!repname.exists()){ repname.mkdirs }
		val fw = new FileWriter(new File(filename),false)
		try{ fw.write(text) }
		finally{ fw.close }
	}
	
	def writeTextFileWithEncoding(filename : String, text : String, encoding : String ) : Unit = {
		var repname = new File(filename.substring(0, filename.lastIndexOf("/")))
		if(!repname.exists()){ repname.mkdirs }
		val fw = new PrintWriter(new File(filename),encoding)
		try{ fw.print(text) }
		finally{ fw.close }
	}
	
	def readTextFile(filename : String) : String = {
		var res = new StringBuilder
		val br = new BufferedReader(new FileReader(new File(filename)))
		try{ while(br.ready) res.append(br.readLine) }
		finally{ br.close }
		return res.toString
	}

}

//object fileio extends FileIO
