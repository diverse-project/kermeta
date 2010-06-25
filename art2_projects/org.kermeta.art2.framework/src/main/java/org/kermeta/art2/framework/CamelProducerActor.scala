/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

import org.apache.camel.impl.DefaultCamelContext
import scala.actors.Actor

class CamelProducerActor extends Actor {

  var camelContext = new DefaultCamelContext
  var producer = camelContext.createProducerTemplate()

  var uri : String = ""
  def getUri() : String = uri
  def setUri(u : String) = {uri = u }

  override def start(): scala.actors.Actor = {
    camelContext.start();
    super.start
  }

  override def exit() = {
    camelContext.stop();
    super.exit
  }
  
  def act() {
    loop {
      receive {
        case e => producer.sendBody(uri,e)
      }
    }
  }

}
