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

}
