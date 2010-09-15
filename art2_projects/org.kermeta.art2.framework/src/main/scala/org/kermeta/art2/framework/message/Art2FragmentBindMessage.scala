/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.message

import org.kermeta.art2.framework.Art2ChannelFragment
import scala.reflect.BeanProperty

class Art2FragmentBindMessage {
  @BeanProperty
  var proxy : Art2ChannelFragment = null

  @BeanProperty
  var channelName : String = ""
}
