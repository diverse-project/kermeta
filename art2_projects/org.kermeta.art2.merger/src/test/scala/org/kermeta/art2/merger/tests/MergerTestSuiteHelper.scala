/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.merger.tests

import java.io.File
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
    Art2XmiHelper.load(this.getClass.getClassLoader.getResource(url).getPath)
  }

  def emptyModel = Art2Factory.eINSTANCE.createContainerRoot

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
