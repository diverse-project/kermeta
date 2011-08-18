/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.compilo.scala

import java.io._

object CopyEcoreFile {

      def main(args : Array[String]) : Unit = {
          CopyEcoreFile.copy("org/eclipse/emf/ecore/EcoreFactory.java", "/home/barais/NetBeansProjects/org.kermeta.scala.compilo.output/src")
        CopyEcoreFile.copy("org/eclipse/emf/ecore/EcoreFactoryWrapper.java", "/home/barais/NetBeansProjects/org.kermeta.scala.compilo.output/src")
        
      }
    
      def copyEcorefiles(destFolder : String) : Unit = {
          println("copy ecore to " + destFolder)
        //CopyEcoreFile.copy("org/eclipse/emf/ecore/EcoreFactory.java", destFolder)
        //CopyEcoreFile.copy("org/eclipse/emf/ecore/EcoreFactoryWrapper.java", destFolder)
        CopyEcoreFile.copy("org/eclipse/emf/ecore/impl/EcorePackageImpl.java", destFolder)
        
      }
    
    
    def copy(file:String,destFolder : String ) = {
        var from  : InputStream = classOf[Compiler].getClassLoader.getResourceAsStream(file)
        
            // 
            // 
            // Industrial Challenges
            // If we've gotten this far, then everything is okay.
    // So we copy the file, a buffer of bytes at a time.
    var to : java.io.FileOutputStream  = null; // Stream to write to destination
    try {
      var file1 :File =  new File(destFolder + File.separator +"org" + File.separator+ "eclipse"+ File.separator + "emf" + File.separator+ "ecore" + File.separator+ "impl" )
      file1.mkdirs
      to = new FileOutputStream(destFolder + File.separator +file); // Create output stream
      var buffer = new Array[Byte](4096); // To hold file contents
      var bytes_read : Int=0 // How many bytes in buffer

      // Read a chunk of bytes into the buffer, then write them out,
      // looping until we reach the end of the file (when read() returns
      // -1). Note the combination of assignment and comparison in this
      // while loop. This is a common I/O programming idiom.
      bytes_read = from.read(buffer)
            while (bytes_read  != -1){
        // Read until EOF
            to.write(buffer, 0, bytes_read); // write
            bytes_read = from.read(buffer)
            }
    }
    // Always close the streams, even if exceptions were thrown
      if (from != null)
          from.close();
      if (to != null)
          to.close();
    }
    
}
