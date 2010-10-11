/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty

import java.io.ByteArrayInputStream
import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.kermeta.art2.api.service.remote.Art2ModelDispatcher
import org.kermeta.art2.framework.Art2Actor
import java.net.InetSocketAddress
import org.kermeta.art2._
import org.kermeta.art2.framework.Art2PlatformHelper
import org.kermeta.art2.framework.Art2XmiHelper
import org.kermeta.art2.framework.bus.netty.remote._
import org.kermeta.art2.framework.message.Art2ModelSynchMessage
import org.slf4j.LoggerFactory
import scala.actors.Actor
import org.kermeta.art2.framework.Constants
import org.kermeta.art2.framework.JacksonSerializer._
import scala.collection.JavaConversions._

class Art2ModelSynch(port : Int,modelHandler : Art2ModelHandlerService) extends Art2Actor with Art2ModelDispatcher {

  var me : Art2Actor = this
  var logger = LoggerFactory.getLogger(this.getClass)

  var server = new TcpServerRemoteActor(port,this)

  //def synch(model : ContainerRoot)={

  //var outStream = new ByteArrayOutputStream
  //Art2XmiHelper.saveStream(outStream, model)
  //outStream.flush
  // var msg = outStream.toString

  //  var msg = new Art2ModelSynchMessage
  //  msg.setNodeSenderName(nodeName)
  //msg.setNewModelAsString(outStream.toString)

  //   outStream.close
  //  logger.info("Send model to other fragment="+msg)
  //  client ! modelHandler.getLastModel.toJSON
  // }

  override def start() : Actor = {
    //client.start
    server.start
    super[Art2Actor].start
  }

  override def stop(){
    //client.stop
    server.stop
    super[Art2Actor].stop
  }

  def internal_process(msg : Any) = msg match {
    case nmsg : ART_NETTY_MESSAGE => {
        var msg = nmsg.e.getMessage.toString
        logger.info("Model rec from other fragment"+msg)
            
        var msgsynch = msg.fromJSON(classOf[Art2ModelSynchMessage])

        if(msgsynch.getNodeSenderName == modelHandler.getNodeName || msgsynch.passedNodes.contains(modelHandler.getNodeName) ){
          logger.info("No process msg send by me or passed by me !")
        } else {
          var stream = new ByteArrayInputStream(msgsynch.getNewModelAsString.toString.getBytes)
          var newModel = Art2XmiHelper.loadStream(stream)
          if(modelHandler != null){
            var result = modelHandler.updateModel(newModel)
            if(result.booleanValue){
              logger.info("local model update ok, send version to all fragment")
              var root = modelHandler.getLastModel

              msgsynch.passedNodes.add(modelHandler.getNodeName)
              msgsynch.setNodeSenderName(modelHandler.getNodeName)
              root.getNodes.filter(node => !msgsynch.passedNodes.contains(node.getName) ).foreach{remoteNode =>

                //SEND
                var ip = Art2PlatformHelper.getProperty(root,remoteNode.getName, Constants.ART2_PLATFORM_REMOTE_NODE_IP)
                var modelSynchPort = Art2PlatformHelper.getProperty(root,remoteNode.getName, Constants.ART2_PLATFORM_REMOTE_NODE_MODELSYNCH_PORT)

                var client = new TcpClientRemoteActor(null,1000) {
                  def getRemoteAddr : InetSocketAddress = {
                    logger.info(ip)
                    new InetSocketAddress(ip,java.lang.Integer.parseInt(modelSynchPort))
                  }
                }
                client.start

                client ! msgsynch.toJSON

                client.stop
              }


            } else {
              logger.warn("Distributed rollback not implemented")
            }

          } else {
            logger.error("No service handler found loast message "+msg)
          }
        }
      }
  }


}
