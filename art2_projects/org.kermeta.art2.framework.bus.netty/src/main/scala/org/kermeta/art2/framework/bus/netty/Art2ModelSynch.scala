/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.kermeta.art2.framework.Art2Actor
import org.kermeta.art2._
import org.kermeta.art2.framework.Art2XmiHelper
import org.kermeta.art2.framework.bus.netty.remote._
import org.kermeta.art2.framework.message.Art2ModelSynchMessage
import org.slf4j.LoggerFactory
import scala.actors.Actor
import org.kermeta.art2.framework.JacksonSerializer._

class Art2ModelSynch(port : Int,modelHandler : Art2ModelHandlerService,nodeName : String) extends Art2Actor {

  var me : Art2Actor = this
  var logger = LoggerFactory.getLogger(this.getClass)

  var client = new UdpClientRemoteActor(this,port)
  var server = new UdpServerRemoteActor(port,this)

  def synch(model : ContainerRoot)={

    var outStream = new ByteArrayOutputStream
    Art2XmiHelper.saveStream(outStream, model)
    outStream.flush
    // var msg = outStream.toString

    var msg = new Art2ModelSynchMessage
    msg.setNodeSenderName(nodeName)
    msg.setNewModelAsString(outStream.toString)

    outStream.close
    logger.info("Send model to other fragment="+msg)
    client ! msg.toJSON
  }

  override def start() : Actor = {
    client.start
    server.start
    super.start
  }

  override def stop(){
    client.stop
    server.stop
    me ! STOP
  }

  def act()={
    loop{
      react {
        case STOP => exit
        case  msg : String=> {
            logger.info("Model rec from other fragment"+msg)
            var msgsynch = msg.fromJSON(classOf[Art2ModelSynchMessage])

            if(msgsynch.getNodeSenderName == nodeName){
              logger.info("No process msg send by me !")
            } else {
              var stream = new ByteArrayInputStream(msgsynch.getNewModelAsString.toString.getBytes)
              var newModel = Art2XmiHelper.loadStream(stream)
              if(modelHandler != null){
                modelHandler.updateModel(newModel)
              } else {
                logger.error("No service handler found loast message "+msg)
              }
            }



          }
      }
    }
  }


}
