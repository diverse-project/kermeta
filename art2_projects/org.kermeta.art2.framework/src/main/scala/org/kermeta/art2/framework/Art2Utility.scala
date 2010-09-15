/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

import org.kermeta.art2.ComponentInstance
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.MBinding
import org.kermeta.art2.PortType
import org.kermeta.art2.TypedElement
import scala.collection.JavaConversions._

object Art2Utility {

  var root : ContainerRoot = _

  def getOraddDataType(datatype : TypedElement) : TypedElement = {
    root.getDataTypes.find({t=>t.getName.equals(datatype.getName)}).getOrElse{
      root.getDataTypes.add(datatype)
      datatype
    }
  }

  def getOraddPortType(portType : PortType) : PortType = {
    root.getTypeDefinitions.filter{st=> st.isInstanceOf[PortType]}.find({pt=>pt.getName == portType.getName}).getOrElse{
      root.getTypeDefinitions.add(portType)
      portType
    }.asInstanceOf[PortType]
  }

  def getRelatedBinding(component : ComponentInstance,root: ContainerRoot) : java.util.List[MBinding] = {
    var res = new java.util.ArrayList[MBinding]();
    root.getMBindings.foreach{b=>
      component.getProvided.find({p=> b.getPort == p}) match {
        case Some(e)=> res.add(b)
        case None =>
      }
      component.getRequired.find({p=> b.getPort == p}) match {
        case Some(e)=> res.add(b)
        case None =>
      }
    }
    res
  }

}
