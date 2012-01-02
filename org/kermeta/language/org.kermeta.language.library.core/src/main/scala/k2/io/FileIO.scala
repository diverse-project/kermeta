/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package k2.io
 
import java.io._
import org.eclipse.emf.common.util.URI

class FileIOClass  extends k2.standard.EObjectImplForPrimitive{

  def writeTextFile(file : String, text : String) : Unit = {
    var filename = ""
    if(file.startsWith("file:")){
      filename = file.replaceFirst("file:", "")
    } else {
      filename = file
      println("toto")
    }
    //println("WriteTxt="+filename)

 
    
    var repname = new File(filename.substring(0, filename.lastIndexOf("/")))
    if(!repname.exists()){ repname.mkdirs }
    val fw = new FileWriter(new File(filename),false)
    try{ fw.write(text) }
    finally{ fw.close }
  }

  def writeTextFileWithEncoding(file : String, text : String, encoding : String ) : Unit = {
    var filename = ""
    if(file.startsWith("file:")){
      filename = file.replaceFirst("file:", "")
    } else {
      filename = file
    }
    //println("WriteTxt="+filename)

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

  def getCurrentDir() : org.eclipse.emf.common.util.URI = {
    val currentdir = System.getProperty("user.dir")
    val dir = new File(currentdir);
    return URI.createFileURI(dir.toString())
  }
}
object FileIO extends FileIOClass{ 
}
