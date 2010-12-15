/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

import org.kermeta.art2.framework.message._
import org.slf4j.LoggerFactory
import scala.actors.Actor
import scala.collection.JavaConversions._
import org.kermeta.art2.framework.aspects.Art2Aspects._

abstract class Art2Component(c : AbstractComponentType) extends Art2Actor {

  def getArt2ComponentType : ComponentType = c

  var logger = LoggerFactory.getLogger(this.getClass);

  override def internal_process(msg : Any) = msg match {

    case Art2UpdateDictionaryMessage(d) => {
        d.keySet.foreach{v=>
          getArt2ComponentType.getDictionary.put(v, d.get(v))
        }
        reply(true)
    }
    
    case Art2StartMessage => {
        new Actor{ def act = startComponent }.start()
        //Wake Up Hosted Port
        getArt2ComponentType.getHostedPorts.foreach{hp=>
          var port = hp._2.asInstanceOf[Art2Port]
          if(port.isInPause){
            port.resume
          }
        }
        reply(true)
      }
    case Art2StopMessage => {
        //Pause Hosted Port
        getArt2ComponentType.getHostedPorts.foreach{hp=>
          var port = hp._2.asInstanceOf[Art2Port]
          if(!port.isInPause){
            port.pause
          }
        }
        new Actor{ def act= stopComponent }.start()
        reply(true)
      }
      case _ @ msg => logger.error("unknow message "+msg)
  }


  def startComponent
  def stopComponent

}
