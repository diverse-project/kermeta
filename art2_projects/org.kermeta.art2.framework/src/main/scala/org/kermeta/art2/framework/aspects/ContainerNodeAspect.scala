/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.aspects

import org.kermeta.art2._
import scala.collection.JavaConversions._
import Art2Aspects._

case class ContainerNodeAspect(node : ContainerNode) {

  def isModelEquals(ct : ContainerNode) : Boolean = {
    ct.getName == node.getName
    /* TODO deep compare */
  }

  def getComponentTypes : List[ComponentType] = {
    var alreadyDeployComponentType : List[ComponentType] = List()
    node.getComponents.foreach{c=>
      if(!alreadyDeployComponentType.exists({e=> e.getName == c.getComponentType.getName})){
        alreadyDeployComponentType = alreadyDeployComponentType ++ List(c.getComponentType)
      }
    }
    alreadyDeployComponentType
  }

}
