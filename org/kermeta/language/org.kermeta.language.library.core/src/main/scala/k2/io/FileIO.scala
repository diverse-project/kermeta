/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package k2.io
 
import java.io._
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl

class FileIOClass  extends k2.standard.EObjectImplForPrimitive{

  def writeTextFile(fileURI : URI, text : String) : Unit = {
    val filename = org.kermeta.utils.helpers.emf.EMFUriHelper.normalize(fileURI).toFileString()
    val rs = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
    //println("[FileIOClass.writeTextFile] " + org.kermeta.utils.helpers.emf.EMFUriHelper.normalize(fileURI) )
    //println("[FileIOClass.writeTextFile] " + new ExtensibleURIConverterImpl().normalize(fileURI).toString())
    var repname = new File(filename.substring(0, filename.lastIndexOf(File.separator)))
    if(!repname.exists()){ repname.mkdirs }
    val fw = new FileWriter(new File(filename),false)
    try{ fw.write(text) }
    finally{ fw.close }
  }

  def writeTextFileWithEncoding(fileURI : URI, text : String, encoding : String ) : Unit = {
    val filename = org.kermeta.utils.helpers.emf.EMFUriHelper.normalize(fileURI).toFileString()
    var repname = new File(filename.substring(0, filename.lastIndexOf(File.separator)))
    if(!repname.exists()){ repname.mkdirs }
    val fw = new PrintWriter(new File(filename),encoding)
    try{ fw.print(text) }
    finally{ fw.close }
  }

  def readTextFile(fileURI : URI) : String = {
    var res = new StringBuilder
    val filename = org.kermeta.utils.helpers.emf.EMFUriHelper.normalize(fileURI).toFileString()
    
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
