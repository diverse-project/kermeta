/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.kompare.tests.dictionary

import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.framework.Art2XmiHelper
import org.kermeta.art2adaptation.AdaptationModel
import org.kermeta.art2adaptation._
import org.scalatest.junit.JUnitSuite
import scala.collection.JavaConversions._

trait KompareSuite extends JUnitSuite {

  /* UTILITY METHOD */
  def model(url:String):ContainerRoot={
    Art2XmiHelper.load(this.getClass.getClassLoader.getResource(url).getPath)
  }

  implicit def utilityKompareModel(self : org.kermeta.art2adaptation.AdaptationModel) = RichAdaptationModel(self)


}

case class RichAdaptationModel(self : AdaptationModel) {

  def shouldContains[A](c:Class[A],refName:String)={
    assert(
      self.getAdaptations.exists(adaptation=> {
          adaptation match {
            case e : InstanceAdaptation if(adaptation.getClass.getSimpleName.contains(c.getSimpleName)) => e.getRef.getName == refName
            case e : TypeAdaptation if(adaptation.getClass.getSimpleName.contains(c.getSimpleName)) => e.getRef.getName == refName
            case _ => false
          }
        } )
    )

  }

  def shouldNotContains(c : Class[_])={
    assert(
      self.getAdaptations.forall(adaptation=> !adaptation.getClass.getSimpleName.contains(c.getSimpleName) )
    )
  }


}