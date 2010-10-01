/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.message

import scala.reflect.BeanProperty

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
  var passedNodes : java.util.List[String] = new java.util.ArrayList[String]()

}

