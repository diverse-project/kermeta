/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.merger.sub

import org.kermeta.art2.ComponentInstance
import org.kermeta.art2.ContainerNode
import org.kermeta.art2.ContainerRoot
import scala.collection.JavaConversions._
import org.kermeta.art2.framework.aspects.Art2Aspects._


trait Art2NodeMerger extends Art2InstanceMerger {

  def mergeAllNode(actualModel : ContainerRoot,modelToMerge : ContainerRoot)={

    var toMergeNodes = modelToMerge.getNodes.toList ++ List()

    toMergeNodes.foreach{toMergeNode=> mergeNode(actualModel,toMergeNode)  }

  }

  private def mergeNode(actualModel : ContainerRoot,nodeToMerge : ContainerNode)= {
    actualModel.getNodes.find(loopNode=> loopNode.getName == nodeToMerge.getName ) match {
      case None => {
          actualModel.getNodes.add(nodeToMerge);
          mergeAllInstances(actualModel,nodeToMerge,nodeToMerge)
      }
      case Some(eNode) => mergeAllInstances(actualModel,eNode,nodeToMerge)
    }
  }
  
  private def mergeAllInstances(actualModel : ContainerRoot,targetInstance:ContainerNode,instanceToMerge : ContainerNode)={
    instanceToMerge.getComponents.foreach{c=>
      targetInstance.getComponents.find(eC=> eC.isModelEquals(c) ) match {

        case None => {
            targetInstance.getComponents.add(c)
            mergeComponentInstance(actualModel,c)
        }

        case Some(e)=> 
          mergeComponentInstance(actualModel,c)
          //TODO CHECK BINDING

      }
    }
  }


}
