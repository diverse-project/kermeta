/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.aspects

import org.kermeta.art2._
import scala.collection.JavaConversions._
import Art2Aspects._

case class ChannelAspect(cself : Channel) {

  def getOtherFragment(nodeName : String) : List[String] = {
    var result : List[String] = List()
    cself.eContainer.asInstanceOf[ContainerRoot].getMBindings.filter(mb=> mb.getHub == cself && mb.getPort.eContainer.eContainer.asInstanceOf[ContainerNode].getName != nodeName  ).foreach{
      mb=> result = result ++ List(mb.getPort.eContainer.eContainer.asInstanceOf[ContainerNode].getName)
    }
    result
  }

}
