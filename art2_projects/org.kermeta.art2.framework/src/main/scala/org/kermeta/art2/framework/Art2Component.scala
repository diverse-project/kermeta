/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

import org.kermeta.art2.framework.message._
import org.slf4j.LoggerFactory
import scala.collection.JavaConversions._
import org.kermeta.art2.framework.aspects.Art2Aspects._

abstract class Art2Component(c : AbstractComponentType) extends Art2Actor {

  def getArt2ComponentType : ComponentType = c

  var logger = LoggerFactory.getLogger(this.getClass);

  def act() = {
    loop {
      react {
        case Art2StartMessage => {
            getArt2ComponentType.getHostedPorts.foreach{hp=>hp._2.asInstanceOf[Art2Port].start}
            //getArt2ComponentType.getNeededPorts.foreach{np=>np.asInstanceOf[Art2Port].start} //DEPRECATED NP STARTED AT ACTIVATOR TIME
            startComponent
            reply(true)
        }
        case Art2StopMessage => { 
            getArt2ComponentType.getHostedPorts.foreach{hp=>hp._2.asInstanceOf[Art2Port].stop}
            getArt2ComponentType.getNeededPorts.foreach{np=>np._2.asInstanceOf[Art2Port].stop}
            stopComponent
            reply(true)
        }
  /*
        case msg : Art2BindMessage => {
            /* TODO CHECK NODE NAME & COMPONENT NAME */
            c.getNeededPorts.find({np => np.asInstanceOf[Port].getName == msg.getDestPortName}) match {
              case None => logger.error("none found port message "+msg)
              case Some(d)=> d.asInstanceOf[Art2Actor] ! msg
            }
        }*/
        case _ @ msg => logger.error("unknow message "+msg)
      }
    }
  }

  def startComponent
  def stopComponent

}
