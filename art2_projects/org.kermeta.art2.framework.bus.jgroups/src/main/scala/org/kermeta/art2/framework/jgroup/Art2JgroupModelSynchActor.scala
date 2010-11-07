/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.jgroup

import org.jgroups.JChannel
import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.kermeta.art2.framework._
import org.slf4j.LoggerFactory
import org.kermeta.art2.framework.JacksonSerializer._
import scala.collection.JavaConversions._

class Art2JgroupModelSynchActor(modelHandler : Art2ModelHandlerService,protocolFile : String) extends Art2Actor {

  //System.setProperty("java.net.preferIPv4Stack", "true");
  
  var logger = LoggerFactory.getLogger(this.getClass);
  var jchannel  : JChannel = null

  override def start = {
    var act = super.start
    try{
      jchannel = new JChannel
      jchannel.setName(modelHandler.getNodeName)
      jchannel.connect("Art2DefaultNameSpace")
      jchannel.setReceiver(Art2JgroupModelSynchReceiver(modelHandler))
      //INIT TO ASK FOR OTHER MODEL

      logger.info("Jgroups Model Synch Started ")

      var resultStat =jchannel.getState(null, 5000)

      logger.info("Jgroups Model Synch Started , previous state is => "+resultStat)
    } catch {
      case _ @ e => e.printStackTrace
    }

    act
  }

  //NO USED
  def internal_process(msg : Any)={}
  
  override def act()={
    loop{
      react {
        case STOP_ACTOR => jchannel.close;exit
      }
    }
  }


}
