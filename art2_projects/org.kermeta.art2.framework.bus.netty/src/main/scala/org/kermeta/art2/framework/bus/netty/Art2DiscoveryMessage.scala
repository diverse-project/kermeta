/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty

import scala.reflect.BeanProperty

class Art2DiscoveryMessage {

  @BeanProperty
  var nodeName : String = ""

  @BeanProperty
  var ips : java.util.List[String] = new java.util.ArrayList[String]()

  @BeanProperty
  var model_dispatcher_port : java.lang.Integer = 0

  @BeanProperty
  var msg_dispatcher_port : java.lang.Integer = 0

}
