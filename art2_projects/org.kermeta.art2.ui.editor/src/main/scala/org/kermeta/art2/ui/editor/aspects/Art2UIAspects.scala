/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor.aspects

import org.kermeta.art2._
import scala.collection.JavaConversions._
import Art2UIAspects._

object Art2UIAspects{
  implicit def mbindingAspect(c : org.kermeta.art2.MBinding) = MBindingAspect(c)
  implicit def channelAspect(c : org.kermeta.art2.Channel) = ChannelAspect(c)
  implicit def nodeAspect(c : org.kermeta.art2.ContainerNode) = NodeAspect(c)
  implicit def componentAspect(c : org.kermeta.art2.ComponentInstance) = ComponentAspect(c)
}






