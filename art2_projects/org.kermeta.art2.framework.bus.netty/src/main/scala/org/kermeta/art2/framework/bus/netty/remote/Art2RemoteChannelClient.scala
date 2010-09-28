/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty.remote
import java.net.InetSocketAddress
import org.jboss.netty.channel.ChannelHandlerContext
import org.jboss.netty.channel.MessageEvent
import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.kermeta.art2.framework.Art2Actor
import org.kermeta.art2.framework.Art2ChannelFragment
import org.kermeta.art2.framework.Art2PlatformHelper
import org.kermeta.art2.framework.Constants
import org.kermeta.art2.framework.MethodCallMessage
import org.kermeta.art2.framework.message.Art2PortBindMessage
import org.kermeta.art2.framework.message.Art2ResponseMessage
import org.slf4j.LoggerFactory
import org.kermeta.art2.framework.JacksonSerializer._
import scala.actors.TIMEOUT
import scala.collection.JavaConversions._

class Art2RemoteChannelClient(remoteNodeName : String,remoteChannelName : String,modelHandler : Art2ModelHandlerService,timeout : Int) extends Art2ChannelFragment {

  def getNodeName = remoteNodeName
  def getName = remoteChannelName

  var logger = LoggerFactory.getLogger(this.getClass)
  case class RESPONSE_RECEIVE(ctx :ChannelHandlerContext,e : MessageEvent)

  var nettyClient = new TcpClientRemoteActor(this,timeout){

    override def messageReceived(ctx :ChannelHandlerContext,e : MessageEvent) {
      this ! RESPONSE_RECEIVE(ctx,e)
    }

    def getRemoteAddr : InetSocketAddress = {
      var model = modelHandler.getLastModel
      var remoteIP = Art2PlatformHelper.getProperty(model,remoteNodeName,Constants.ART2_PLATFORM_REMOTE_NODE_IP)
      var remotePORT = Art2PlatformHelper.getProperty(model,remoteNodeName,Constants.ART2_PLATFORM_REMOTE_NODE_DISPATCHER_PORT)
      if("" != remoteIP && "" != remotePORT ){
        try {
          new InetSocketAddress(remoteIP,java.lang.Integer.parseInt(remotePORT))
        } catch {
          case _ @ e => logger.error("Error parsing remote port as Integer",e) ; new InetSocketAddress(0)
        }
      } else {
        new InetSocketAddress(0)
      }
    }
  }


  private def sendInternal(msg : Any) = {
    var msgArt2remote = new org.kermeta.art2.framework.message.Art2Message()
    msgArt2remote.setDestNodeName(remoteNodeName)
    msgArt2remote.setDestChannelName(remoteChannelName)
    msgArt2remote.setContent(msg)
    msgArt2remote.setInOut(msg.isInstanceOf[MethodCallMessage])

    var tag = msgArt2remote.hashCode //NAIF TAG //TODO
    msgArt2remote.setResponseTag(tag.toString)

    var msgJSON = msgArt2remote.toJSON
    nettyClient ! msgJSON
    if(msg.isInstanceOf[MethodCallMessage]){
      //WAIT FOR REPLY
      var result : Any = null
      reactWithin(timeout){
        case RESPONSE_RECEIVE(_@ctx,_@e) => {
            var artResponse = e.getMessage.toString.fromJSON(classOf[Art2ResponseMessage])
            if(artResponse.getResponseTag == tag){
              result = artResponse.getContent
            } else {
              logger.error("Tag isn't equals")
            }
          }
        case TIMEOUT => logger.error("Synchronous client TIMEOUT")
      }
      reply(result)
    }
  }


  def act(){
    loop {
      react {
        case STOP()=> {

            exit()
          }
        case _ @ msg => sendInternal(msg)
      }
    }
  }


}
