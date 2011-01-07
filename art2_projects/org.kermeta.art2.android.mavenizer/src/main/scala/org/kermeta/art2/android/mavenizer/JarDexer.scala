/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.android.mavenizer

object JarDexer {

  def dex(dxPath:String,aaptPath:String,jarPath:String) = {

    var dxCommand = List(dxPath,"--dex","--core-library","--output="+SystemCommand.executionPath+java.io.File.separator+"classes.dex",jarPath)

    SystemCommand.exec(dxCommand)

    var aaptCommand = List(aaptPath,"add",jarPath,SystemCommand.executionPath+java.io.File.separator+"classes.dex")

    SystemCommand.exec(aaptCommand)

  }



}
