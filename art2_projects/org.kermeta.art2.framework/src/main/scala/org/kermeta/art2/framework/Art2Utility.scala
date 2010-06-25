/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

import art2.ContainerRoot
import scala.collection.JavaConversions._

object Art2Utility {

  var root : ContainerRoot = _

  def getOraddDataType(datatype : art2.TypedElement) : art2.TypedElement = {
    root.getDataTypes.find({t=>t.getName.equals(datatype.getName)}).getOrElse{
      root.getDataTypes.add(datatype)
      datatype
    }
  }

  def getOraddPortType(portType : art2.PortType) : art2.PortType = {
    root.getPortTypes.find({pt=>pt.getName.equals(portType.getName)}).getOrElse{
      root.getPortTypes.add(portType)
      portType
    }
  }

  def getRelatedBinding(component : art2.ComponentInstance,root: art2.ContainerRoot) : java.util.List[art2.Binding] = {
    var res = new java.util.ArrayList[art2.Binding]();
    root.getBindings.foreach{b=>
      component.getProvided.find({p=> b.getPorts.contains(p)}) match {
        case Some(e)=> res.add(b)
        case None =>
      }
      component.getRequired.find({p=> b.getPorts.contains(p)}) match {
        case Some(e)=> res.add(b)
        case None =>
      }
    }
    res
  }

}
