/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.message


import org.kermeta.art2.framework.Art2Actor
import org.osgi.framework.BundleContext
import scala.reflect.BeanProperty

class Art2Message{
  @BeanProperty 
  var destNodeName = "default"

  @BeanProperty
  var destComponentName = "default"

  @BeanProperty
  var destPortName = "default"

  @BeanProperty
  var content : Any = null

  @BeanProperty
  var inOut : java.lang.Boolean = false

}
/*
class Art2BindMessage extends Art2Message{
  @BeanProperty
  var targetNodeName = "default"

  @BeanProperty
  var targetComponentName = "default"

  @BeanProperty
  var targetPortName = "default"

  @BeanProperty
  var proxy : Art2Actor = null

  @BeanProperty
  var bundleContext : BundleContext = null
}
*/
case class Art2StartMessage() extends Art2Message
case class Art2StopMessage() extends Art2Message