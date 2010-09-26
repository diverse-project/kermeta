/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.message

import scala.reflect.BeanProperty

class Art2FragmentUnbindMessage {

  @BeanProperty
  var channelName : String = ""

  @BeanProperty
  var fragmentNodeName : String = ""
  
}
