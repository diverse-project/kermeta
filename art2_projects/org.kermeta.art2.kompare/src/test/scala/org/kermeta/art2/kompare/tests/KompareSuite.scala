/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.kompare.tests

import org.kermeta.art2.Art2Factory
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.NamedElement
import org.kermeta.art2.framework.Art2XmiHelper
import org.kermeta.art2adaptation.AdaptationModel
import org.kermeta.art2adaptation._
import org.scalatest.junit.JUnitSuite
import scala.collection.JavaConversions._

trait KompareSuite extends JUnitSuite {

  /* UTILITY METHOD */
  def model(url:String):ContainerRoot={
    if(this.getClass.getClassLoader.getResource(url) == null){
      println("Warning File not found for test !!!")
    }
    Art2XmiHelper.load(this.getClass.getClassLoader.getResource(url).getPath)
  }

  implicit def utilityKompareModel(self : org.kermeta.art2adaptation.AdaptationModel) = RichAdaptationModel(self)

  def emptyModel = Art2Factory.eINSTANCE.createContainerRoot
  
}

case class RichAdaptationModel(self : AdaptationModel) {

  def verifySize(size : Int) = {
    assert(self.getAdaptations.size == size)
  }

  def shouldContain[A](c:Class[A],refName:String)={
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

  def shouldContainSize[A](c:Class[A],nb:Int)={
    assert(
      self.getAdaptations.filter(adaptation=> adaptation.getClass.getSimpleName.contains(c.getSimpleName)).size == nb
    )
  }


  def shouldNotContain(c : Class[_])={
    assert(
      self.getAdaptations.forall(adaptation=> !adaptation.getClass.getSimpleName.contains(c.getSimpleName) )
    )
  }

  def print ={
    self.getAdaptations.toArray.foreach{adapt=>
      println(adapt.getClass.getName)
      adapt match {
        case i : TypeAdaptation => println(i.getRef.getName)
        case i : InstanceAdaptation => println(i.getRef.getName)
        case i : BindingAdaptation => {
            println(i.getRef.getHub.getName+"->"+i.getRef.getPort.getPortTypeRef.getName+"-"+i.getRef.getPort.eContainer.asInstanceOf[NamedElement].getName)
        }
        case _ =>
      }

    }
  }

}