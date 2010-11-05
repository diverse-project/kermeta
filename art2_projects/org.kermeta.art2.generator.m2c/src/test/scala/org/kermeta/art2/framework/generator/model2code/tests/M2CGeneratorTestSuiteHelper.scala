/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.generator.model2code.tests

import org.kermeta.art2.Art2Factory
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.framework.Art2XmiHelper
import org.kermeta.art2adaptation._
import org.scalatest.junit.JUnitSuite
import scala.collection.JavaConversions._
import org.junit.Assert._

trait M2CGeneratorTestSuiteHelper extends JUnitSuite {

  /* UTILITY METHOD */
  def model(url:String):ContainerRoot={
    var modelPath = this.getClass.getClassLoader.getResource(url).getPath
    Art2XmiHelper.load(modelPath)
  }

  def emptyModel = Art2Factory.eINSTANCE.createContainerRoot

  implicit def utilityM2CGenerator(self : ContainerRoot) = RichContainerRoot(self)

}


case class RichContainerRoot(self : ContainerRoot) {
  
}
