/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.aspects


import org.kermeta.art2._
import scala.collection.JavaConversions._
import Art2Aspects._

case class PortAspect(p : Port) {

  def isModelEquals(pp : Port) : Boolean={
    (p.getPortTypeRef.getName == pp.getPortTypeRef.getName) && 
    (p.eContainer.asInstanceOf[ComponentInstance].isModelEquals(pp.eContainer.asInstanceOf[ComponentInstance]))
  }

  def isBind() : Boolean ={
    var container = p.eContainer.eContainer.eContainer.asInstanceOf[ContainerRoot]
    var mb = p.getPortTypeRef.getRef
    container.getMBindings.exists({mb => mb.getPort == p})
    /*
    p.getPortTypeRef.getRef match {
      case mpt : MessagePortType => container.getMBindings.exists({mb => mb.getPort == p})
      case spt : ServicePortType => container.getBindings.exists({b => b.isUsingPort(p)})
    }*/
  }

  def getProxyURI() : String = {
    var container : ContainerRoot = p.eContainer.eContainer.eContainer.asInstanceOf[ContainerRoot]
    if(p.isBind){
      p.getPortTypeRef.getRef match {
        case spt : ServicePortType => p.eContainer.asInstanceOf[ComponentInstance].getName.toString+"."+p.getPortTypeRef.getName
        case mpt : MessagePortType => container.getMBindings.find({mb=> mb.getPort == p}).get.getHub.getName
        case _ => println("Art2 Deploy Error, , getProxyURI");""
      }
    } else {
      ""
    }
  }

  /*
  def getProxyHubType() : String = {
    var container : ContainerRoot = p.eContainer.eContainer.eContainer.asInstanceOf[ContainerRoot]
    if(p.isBind){
      p.getPortTypeRef.getRef match {
        case spt : ServicePortType => "queue"
        case mpt : MessagePortType => container.getMBindings.find({mb=> mb.getPort == p}).get.getHub match {
            case t : Topic => "topic"
            case q : Queue => "queue"
            case mh : MessageHub => "topic"
            case _ => ""
          }
        case _ => println("Art2 Deploy Error, , getProxyURI");""
      }

    } else {
      ""
    }
  }*/

}

