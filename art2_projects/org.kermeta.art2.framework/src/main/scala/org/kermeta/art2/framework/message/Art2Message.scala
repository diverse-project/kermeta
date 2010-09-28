/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.message

import scala.reflect.BeanProperty
import java.{util => ju}

class Art2Message{

  @BeanProperty 
  var destNodeName = "default"

  @BeanProperty
  var destChannelName = "default"

  @BeanProperty
  var content : Any = null

  @BeanProperty
  var inOut : java.lang.Boolean = false

  @BeanProperty
  var responseTag = ""

  @BeanProperty
  var timeout : Long = 3000

  @BeanProperty
  var passedNodes : ju.List[String] = new ju.ArrayList[String]()

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