/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.message

import org.kermeta.art2.framework.Art2Port
import scala.reflect.BeanProperty

class Art2PortBindMessage {
  @BeanProperty
  var proxy : Art2Port = null

  @BeanProperty
  var nodeName : String = ""

  @BeanProperty
  var componentName : String = ""

  @BeanProperty
  var portName : String = ""

}
