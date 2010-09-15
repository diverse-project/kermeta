/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.message

import scala.reflect.BeanProperty

class Art2DiscoveryMessage {
  @BeanProperty
  var originNodeName = "default"

  @BeanProperty
  var networkType = "default"

  @BeanProperty
  var networkRate = "default"

  @BeanProperty
  var art2DispatcherPort = 0

  @BeanProperty
  var art2DiscoveryPort = 0

  @BeanProperty
  var remoteAddr = ""

}