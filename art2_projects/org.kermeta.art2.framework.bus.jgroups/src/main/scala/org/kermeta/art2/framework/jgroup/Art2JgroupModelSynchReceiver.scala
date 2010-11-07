/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.jgroup

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import org.jgroups.Message
import org.jgroups.ReceiverAdapter
import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.kermeta.art2.framework.Art2XmiHelper
import org.kermeta.art2.framework.JacksonSerializer._
import org.kermeta.art2.framework.message.Art2ModelSynchMessage
import org.slf4j.LoggerFactory
import scala.collection.JavaConversions._

case class Art2JgroupModelSynchReceiver(modelHandler : Art2ModelHandlerService) extends ReceiverAdapter {

  var logger = LoggerFactory.getLogger(this.getClass);

  override def receive(msg : Message )={

    println("JGroup MSG"+msg)

    var msgsynch = msg.getObject.toString.fromJSON(classOf[Art2ModelSynchMessage])

    logger.info("unserialize"+msgsynch)

    if(msgsynch.getNodeSenderName == modelHandler.getNodeName || msgsynch.passedNodes.contains(modelHandler.getNodeName) ){
      logger.info("No process msg send by me or passed by me !")
    } else {

      logger.info("Process message")

      var stream = new ByteArrayInputStream(msgsynch.getNewModelAsString.toString.getBytes)
      var newModel = Art2XmiHelper.loadStream(stream)

      logger.info("unserilize to")

      if(modelHandler != null){
        logger.info("Try to update Model")
        var result = modelHandler.updateModel(newModel)
        if(result.booleanValue){
          logger.info("local model update ok, send version to all fragment")
        } else {
          logger.warn("Distributed rollback not implemented")
        }
      } else {
        logger.error("No service handler found loast message "+msg)
      }
    }
  }

  override def getState : Array[Byte] = synchronized {
    var root = modelHandler.getLastModel
    var out = new ByteArrayOutputStream
    Art2XmiHelper.saveStream(out, root)
    out.toByteArray
  }

  override def setState(state : Array[Byte])= synchronized {
    var input = new ByteArrayInputStream(state)
    var root = Art2XmiHelper.loadStream(input)
  }
}
