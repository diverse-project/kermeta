/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.message

import scala.reflect.BeanProperty

class Art2PortUnbindMessage {
  @BeanProperty
  var nodeName : String = ""

  @BeanProperty
  var componentName : String = ""

  @BeanProperty
  var portName : String = ""
}
