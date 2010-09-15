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
      if(!alreadyDeployComponentType.exists({e=> e.getName == c.getTypeDefinition.getName})){
        alreadyDeployComponentType = alreadyDeployComponentType ++ List(c.getTypeDefinition.asInstanceOf[ComponentType])
      }
    }
    alreadyDeployComponentType
  }
  
  def getUsedTypeDefinition : List[TypeDefinition] = {
    var usedType : List[TypeDefinition] = List()
    
    /* ADD COMPONENT TYPE USED */
    node.getComponents.foreach{c=>
      if(!usedType.exists({e=> e.getName == c.getTypeDefinition.getName})){
        usedType = usedType ++ List(c.getTypeDefinition)
      }
    } 
    
    /* ADD CHANNEL TYPE USED */
    /* add channel fragment on node */
    node.eContainer.asInstanceOf[ContainerRoot].getMBindings.foreach{mb =>
      if(mb.getPort.eContainer.eContainer == node){
        if(!usedType.exists({e=> e.getName == mb.getHub.getTypeDefinition.getName})){
          usedType = usedType ++ List(mb.getHub.getTypeDefinition)
        }
      }
    }
    
    usedType
  }
  
  def getChannelFragment : List[Channel] = {
    var usedChannel : List[Channel] = List()
    /* add channel fragment on node */
    node.eContainer.asInstanceOf[ContainerRoot].getMBindings.foreach{mb =>
      if(mb.getPort.eContainer.eContainer == node){
        if(!usedChannel.exists({e=> e.getName == mb.getHub.getName})){
          usedChannel = usedChannel ++ List(mb.getHub)
        }
      }
    }
    usedChannel
  }

  def getInstances : List[Instance] = getChannelFragment ++ node.getComponents




}
