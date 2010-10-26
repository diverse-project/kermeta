/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

import org.kermeta.art2._
import org.slf4j.LoggerFactory
import scala.collection.JavaConversions._

object Art2PlatformHelper {

  def updateNodeLinkProp(actualModel : ContainerRoot,currentNodeName : String,targetNodeName:String,key:String,value:String,networkType : String,weight:Int) = {
    var logger = LoggerFactory.getLogger(this.getClass);

    /* SEARCH THE NODE NETWORK */
    var nodenetwork = actualModel.getNodeNetworks.find({nn =>
        nn.getInitBy.getName == currentNodeName && nn.getTarget.getName == targetNodeName }) getOrElse {
      var newNodeNetwork = Art2Factory.eINSTANCE.createNodeNetwork
      var thisNode = actualModel.getNodes.find({loopNode => loopNode.getName == currentNodeName })
      var targetNode = actualModel.getNodes.find({loopNode => loopNode.getName == targetNodeName })
      var thisNodeFound = thisNode.getOrElse{
        var newnode = Art2Factory.eINSTANCE.createContainerNode
        newnode.setName(currentNodeName)
        actualModel.getNodes.add(newnode)
        newnode
      }

      newNodeNetwork.setTarget(targetNode.getOrElse{
          logger.warn("Unknow node "+targetNodeName+" add to model")
          var newnode =Art2Factory.eINSTANCE.createContainerNode
          newnode.setName(targetNodeName)
          actualModel.getNodes.add(newnode)
          newnode
        })
      newNodeNetwork.setInitBy(thisNodeFound)
      actualModel.getNodeNetworks.add(newNodeNetwork)
      newNodeNetwork
    }

    /* Found node link */
    var nodelink = nodenetwork.getLink.find(loopLink => loopLink.getNetworkType == networkType).getOrElse{
      var newlink = Art2Factory.eINSTANCE.createNodeLink
      newlink.setNetworkType(networkType)
      nodenetwork.getLink.add(newlink)
      newlink
    }
    try { nodelink.setEstimatedRate(weight) } catch {
      case _ @ e => logger.error("Unexpected estimate rate",e)
    }

    /* Found Property and SET remote IP */
    var prop = nodelink.getNetworkProperties.find({networkProp => networkProp.getName == key }).getOrElse{
      var newprop = Art2Factory.eINSTANCE.createNetworkProperty
      newprop.setName(key)
      nodelink.getNetworkProperties.add(newprop)
      newprop
    }
    prop.setValue(value)
    prop.setLastCheck(new java.util.Date().getTime.toString)

    logger.info("New node link prop registred = "+targetNodeName+","+key+","+value)

  }



  def getProperty(model:ContainerRoot,targetNodeName : String,key:String) : String = {
    var filteredNodeNetwork = model.getNodeNetworks.filter(lNN=> lNN.getTarget.getName == targetNodeName)
    var bestResultProp = ""
    filteredNodeNetwork.foreach{fnn=>
      fnn.getLink.foreach{fnl=>
        fnl.getNetworkProperties.find(p=> p.getName == key) match {
          case None =>
          case Some(prop)=> bestResultProp = prop.getValue
        }
      }
    }
    bestResultProp
  }





}
