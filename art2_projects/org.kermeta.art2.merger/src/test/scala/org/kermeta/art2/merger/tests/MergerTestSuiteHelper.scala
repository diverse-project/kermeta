/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.merger.tests

import java.io.File
import java.io.FileReader
import java.io.BufferedReader
import org.kermeta.art2.Art2Factory
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.framework.Art2XmiHelper
import org.kermeta.art2adaptation._
import org.scalatest.junit.JUnitSuite
import scala.collection.JavaConversions._
import org.junit.Assert._

trait MergerTestSuiteHelper extends JUnitSuite {

  /* UTILITY METHOD */
  def model(url:String):ContainerRoot={
    var modelPath = this.getClass.getClassLoader.getResource(url).getPath
    Art2XmiHelper.load(modelPath)
  }

  def emptyModel = Art2Factory.eINSTANCE.createContainerRoot

  def hasNoRelativeReference(path:String, file:String) = {
    var modelPath = this.getClass.getClassLoader.getResource(path).getPath+"/"+file
    var bufferedReader = new BufferedReader(new FileReader(new File(modelPath)))

    var stringBuffer = new StringBuffer
    var line : String = bufferedReader.readLine
    while( line != null) {
      stringBuffer.append(line)
      line = bufferedReader.readLine
    }

    !stringBuffer.toString.contains("#")
  }

  implicit def utilityMerger(self : ContainerRoot) = RichContainerRoot(self)

}


case class RichContainerRoot(self : ContainerRoot) {
  def testSave = {
    try{
      Art2XmiHelper.save(File.createTempFile("art2temp", ".art2").getAbsolutePath, self)
    } catch {
      case _ @ e => e.printStackTrace; fail()
    }
  }

  def testSave(path : String,file:String) = {
    try{
      Art2XmiHelper.save(this.getClass.getClassLoader.getResource(path).getPath+"/"+file, self)
    } catch {
      case _ @ e => e.printStackTrace; fail()
    }
  }

  

}
