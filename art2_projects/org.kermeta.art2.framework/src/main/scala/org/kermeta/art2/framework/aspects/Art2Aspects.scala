/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.aspects

import org.kermeta.art2._
import scala.collection.JavaConversions._
import Art2Aspects._

object Art2Aspects{
  implicit def mbindingAspect(c : org.kermeta.art2.MBinding) = MBindingAspect(c)
  implicit def instanceAspect(c : org.kermeta.art2.Instance) = InstanceAspect(c)
  implicit def componentInstanceAspect(c : ComponentInstance) = ComponentInstanceAspect(c)
  implicit def typeAspect(ct : TypeDefinition) = TypeDefinitionAspect(ct)
  implicit def containerNodeAspect(cn : ContainerNode) = ContainerNodeAspect(cn)
  implicit def portAspect(p : Port ) = PortAspect(p)
 // implicit def bindingAspect(b : Binding ) = BindingAspect(b)
  implicit def typedElementAspect(b : TypedElement ) = TypedElementAspect(b)
  implicit def channelAspect(c:Channel) = ChannelAspect(c)
  implicit def dictionaryAspect(d:Dictionary) = DictionaryAspect(d)

}






