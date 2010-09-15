/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.core.impl

import org.kermeta.art2.framework.Art2Actor
import org.kermeta.art2.framework.bus.netty.remote._
import org.kermeta.art2.framework.message.Art2DiscoveryMessage
import org.slf4j.LoggerFactory
import org.kermeta.art2.framework.JacksonSerializer._
import org.jboss.netty.channel.ChannelHandlerContext
import org.jboss.netty.channel.MessageEvent
import org.kermeta.art2.Art2Factory
import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import scala.actors.TIMEOUT
import scala.collection.JavaConversions._

class Art2PlatformDiscoveryActor(art2discoveryPort : Int,art2dispatcherPort : Int,modelHandler : Art2ModelHandlerService) extends Art2Actor {

  var me : Art2Actor = this

  var server = new UdpServerRemoteActor(art2discoveryPort,this){
    override def messageReceived(ctx :ChannelHandlerContext,e : MessageEvent) {
      var art2discoveryMessage = e.getMessage.toString.fromJSON(classOf[Art2DiscoveryMessage])
      art2discoveryMessage.setRemoteAddr(e.getRemoteAddress.toString.split(':').toList.get(0))
      me ! art2discoveryMessage
    }
  };


  var client = new UdpClientRemoteActor(this,art2discoveryPort)
  var logger = LoggerFactory.getLogger(this.getClass)
  case class STOP_SCHEDULER
  var timer : Art2Actor = new Art2Actor {
    override def stop : Unit = this ! STOP_SCHEDULER
    def act = {
      loop {
        reactWithin(60000) {
          case STOP_SCHEDULER => exit
          case TIMEOUT => { /* TODO SEND RICHER MESSAGE */
              var discoveryMessage = new Art2DiscoveryMessage
              discoveryMessage.setOriginNodeName(modelHandler.getNodeName)
              discoveryMessage.setNetworkType("lan")
              discoveryMessage.setNetworkRate("100")
              discoveryMessage.setArt2DispatcherPort(art2dispatcherPort)
              discoveryMessage.setArt2DiscoveryPort(art2discoveryPort)
              client ! discoveryMessage.toJSON
          }
        }
      }
    }
  }

  override def start = {
    server.start;client.start
    /*Schedule some automatic send */
    timer.start
    super.start
    this
  }
  override def stop : Unit = {
    timer.stop;server.stop;client.stop;exit
  }

  def act = {
    loop {
      react {
        case jsoncontent : String => {
            logger.info("Discovery message rec="+jsoncontent)
            try{
              var art2discoveryMessage = jsoncontent.fromJSON(classOf[Art2DiscoveryMessage])
              var actualModel = modelHandler.getLastModel
              var platformModel : org.kermeta.art2.PlatformModel = actualModel.getPlatformModel
              /* SEARCH THE NODE NETWORK */
              var nodenetwork = platformModel.getNodeNetworks.find({nn => nn.getInitBy.getName == modelHandler.getNodeName && nn.getTarget == art2discoveryMessage.getOriginNodeName }) getOrElse {
                var newNodeNetwork = Art2Factory.eINSTANCE.createNodeNetwork
                var thisNode = actualModel.getNodes.find({loopNode => loopNode.getName == modelHandler.getNodeName })
                var targetNode = actualModel.getNodes.find({loopNode => loopNode.getName == art2discoveryMessage.getOriginNodeName })
                thisNode match {
                  case Some(thisNode)=>{
                      newNodeNetwork.setTarget(targetNode.getOrElse{
                          logger.warn("Unknow node add to model")
                          var newnode =Art2Factory.eINSTANCE.createContainerNode
                          newnode.setName(art2discoveryMessage.getOriginNodeName)
                          actualModel.getNodes.add(newnode)
                          newnode
                        })
                      newNodeNetwork.setInitBy(thisNode)
                      platformModel.getNodeNetworks.add(newNodeNetwork)
                    }
                  case None => throw new Exception("Self node name not found")
                }
                newNodeNetwork
              }
              /* Found node link */
              var nodelink = nodenetwork.getLink.find(loopLink => loopLink.getNetworkType == art2discoveryMessage.getNetworkType).getOrElse{
                var newlink = Art2Factory.eINSTANCE.createNodeLink
                newlink.setNetworkType(art2discoveryMessage.getNetworkType)
                nodenetwork.getLink.add(newlink)
                newlink
              }
              try { nodelink.setEstimatedRate(Integer.parseInt(art2discoveryMessage.getNetworkRate)) } catch {
                case _ @ e => logger.error("Unexpected estimate rate",e)
              }
              
              /* Found Network remote IP */
              nodelink.getNetworkProperties.find({networkProp => networkProp.getName == "art2.remote.node.ip" }).getOrElse{
                var newprop = Art2Factory.eINSTANCE.createNetworkProperty
                newprop.setName("art2.remote.node.ip")
                nodelink.getNetworkProperties.add(newprop)
                newprop
              }.setValue(art2discoveryMessage.getRemoteAddr)
              /* Found Network remote IP */
              nodelink.getNetworkProperties.find({networkProp => networkProp.getName == "art2.remote.node.port" }).getOrElse{
                var newprop = Art2Factory.eINSTANCE.createNetworkProperty
                newprop.setName("art2.remote.node.ip")
                nodelink.getNetworkProperties.add(newprop)
                newprop
              }.setValue(art2dispatcherPort.toString) /* TODO BETTER IMPLEMENTATION */
              /* Found Network remote discovery port */
              nodelink.getNetworkProperties.find({networkProp => networkProp.getName == "art2.remote.node.discovery.port" }).getOrElse{
                var newprop = Art2Factory.eINSTANCE.createNetworkProperty
                newprop.setName("art2.remote.node.discovery.port")
                nodelink.getNetworkProperties.add(newprop)
                newprop
              }.setValue(art2discoveryMessage.getArt2DiscoveryPort.toString)
              
              /* Found Network remote dispatcher port */
              nodelink.getNetworkProperties.find({networkProp => networkProp.getName == "art2.remote.node.dispatcher.port" }).getOrElse{
                var newprop = Art2Factory.eINSTANCE.createNetworkProperty
                newprop.setName("art2.remote.node.dispatcher.port")
                nodelink.getNetworkProperties.add(newprop)
                newprop
              }.setValue(art2discoveryMessage.getArt2DispatcherPort.toString)


              /* Synch model handler - switch to online mode */
              
            } catch {case _ @ e => logger.error("Unexpected exception, while sending msg.",e) }
          }
        case _ @ m => logger.warn("unprocess message : "+m.toString)
      }
    }
  }

}
