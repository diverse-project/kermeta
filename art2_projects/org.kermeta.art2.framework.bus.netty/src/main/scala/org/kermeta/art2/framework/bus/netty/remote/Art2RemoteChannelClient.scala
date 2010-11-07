/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty.remote
import java.net.InetSocketAddress
import java.util.Date
import org.jboss.netty.channel.ChannelHandlerContext
import org.jboss.netty.channel.MessageEvent
import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.kermeta.art2.framework.Art2ChannelFragment
import org.kermeta.art2.framework.Art2PlatformHelper
import org.kermeta.art2.framework.Constants
import org.kermeta.art2.framework.MethodCallMessage
import org.kermeta.art2.framework.message.Art2Message
import org.kermeta.art2.framework.message.Art2ResponseMessage
import org.slf4j.LoggerFactory
import org.kermeta.art2.framework.JacksonSerializer._
import scala.actors.Actor
import scala.actors.TIMEOUT
import scala.collection.JavaConversions._

class Art2RemoteChannelClient(remoteNodeName : String,remoteChannelName : String,modelHandler : Art2ModelHandlerService,timeout : Int) extends Art2ChannelFragment {

  def getNodeName = remoteNodeName
  def getName = remoteChannelName

  override def start() : Actor = {
    nettyClient.start
    super.start
  }

  override def stop() = {
    nettyClient.stop
    super.stop
  }


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
          logger.info("Try remote addr "+remoteIP+"-"+java.lang.Integer.parseInt(remotePORT))
          new InetSocketAddress(remoteIP,java.lang.Integer.parseInt(remotePORT))
        } catch {
          case _ @ e => logger.error("Error parsing remote port as Integer",e) ; new InetSocketAddress(0)
        }
      } else {
        new InetSocketAddress(0)
      }
    }
  }


  private def sendInternal(msg : Art2Message) = {
    msg.setDestNodeName(remoteNodeName)
    msg.setDestChannelName(remoteChannelName)
    msg.getPassedNodes.add(modelHandler.getNodeName)

    var tag = msg.hashCode+new Date().getTime //NAIF TAG //TODO
    msg.setResponseTag(tag.toString)

    //CONTENT SERIALIZE
    msg.getContent match {
      case ar :AnyRef => msg.setContentClass(ar.getClass.getName)
      case _ => msg.setContentClass(null)
    }
    var contentJSON = msg.getContent.toJSON
    msg.setContent(contentJSON)


    var msgJSON = msg.toJSON
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


  def internal_process(msg : Any) = msg match {
    case msg : Art2Message => println("SEND INTERNAL");sendInternal(msg)
    case _ => println("WTF !!")
  }

  def getDictionary : java.util.HashMap[String,java.lang.Object] = new java.util.HashMap[String,java.lang.Object]

  def startChannelFragment = {}
  
  def stopChannelFragment = {}





}
