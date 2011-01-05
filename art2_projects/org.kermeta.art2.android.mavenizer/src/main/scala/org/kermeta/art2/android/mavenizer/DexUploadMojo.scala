/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.android.mavenizer

import java.io.File

case class DexUploadMojo(adbPath : String,dxPath:String,aaptPath:String,remotePath:String,dirPath:String) {

  def exec : Unit = {
    var dir = new File(dirPath);
    if (!dir.exists()) {
      println("Error : " + dirPath + " doesn't exist");
      return;
    }
    if (!dir.isDirectory()) {
      println("Error : " + dirPath + " isn't a directory, if you which to send a jar, simply use the mvn command");
      return;
    }

    //Set execution path
    SystemCommand.executionPath_=(dirPath)
    println("System command path "+SystemCommand.executionPath)

    dir.list.filter({file=> file.endsWith(".jar") }).foreach{file=>
      var jarPath = dirPath+"/"+file

      println("process : "+jarPath)

      JarDexer.dex(dxPath, aaptPath,jarPath)
      JarUploader.upload(adbPath, jarPath, remotePath+"/"+file)

    }


  }

}
