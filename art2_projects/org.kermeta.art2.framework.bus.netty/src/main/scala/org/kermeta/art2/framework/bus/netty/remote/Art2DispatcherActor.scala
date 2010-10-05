/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty.remote

import org.jboss.netty.channel.ChannelHandlerContext
import org.jboss.netty.channel.MessageEvent
import org.jboss.netty.channel.SimpleChannelUpstreamHandler
import org.kermeta.art2.framework.Art2Actor
import org.kermeta.art2.framework.Art2ChannelFragment
import org.kermeta.art2.framework.Art2Port
import org.kermeta.art2.framework.message.Art2ResponseMessage
import org.osgi.framework.BundleContext
import org.osgi.util.tracker.ServiceTracker
import org.slf4j.LoggerFactory
import scala.actors.Actor
import scala.collection.JavaConversions._
import org.kermeta.art2.framework.Constants
import org.kermeta.art2.framework.JacksonSerializer._
import org.kermeta.art2.framework.message.Art2Message


class Art2DispatcherActor(port : Int,bc : BundleContext) extends SimpleChannelUpstreamHandler with Art2Actor {

  var serviceTracker : ServiceTracker = null// = new ServiceTracker(bc,classOf[Art2Port].getName(), null)
  var nettyServer = new TcpServerRemoteActor(port,this){
    override def messageReceived(ctx :ChannelHandlerContext,e : MessageEvent) {
      logger.info("Hello")
      this ! ART_NETTY_MESSAGE(ctx,e)
    }
  }
  var logger = LoggerFactory.getLogger(this.getClass)

  def getPort = port
  
  def act()={
    loop {
      react {
        case STOP => /* TODO process unfinish message */ exit()
        case ART_NETTY_MESSAGE(_@ctx,_@e) => {
            try {
              /* unserialize */
              var art2message = e.getMessage.toString.fromJSON(classOf[Art2Message])
              /* retrive service */
              var servicefound = serviceTracker.getServiceReferences.find(sr => {sr.getProperty(Constants.ART2_NODE_NAME) == art2message.destNodeName && sr.getProperty(Constants.ART2_INSTANCE_NAME) == art2message.getDestChannelName} )
              if(art2message.inOut.booleanValue){
                servicefound match {
                  case None => logger.error("Not implemented yet !!! ")
                  case Some(sr)=> {
                      var resultCall = serviceTracker.getService(sr).asInstanceOf[Art2ChannelFragment] !? art2message

                      var callResult = new Art2ResponseMessage
                      callResult.setContent(resultCall)
                      callResult.setResponseTag(art2message.getResponseTag)

                      e.getChannel.write(callResult.toJSON)

                    }
                }
              } else {
                servicefound match {
                  case None => logger.error("Not implemented yet !!! ")
                  case Some(sr)=> serviceTracker.getService(sr).asInstanceOf[Art2Actor] ! art2message
                }
              }
            } catch {case _ @ e => logger.error("Unexpected exception, while sending msg to port.",e) }
          }
        case _ @ msg => logger.error("Art2Dispatcher Error, message not process "+msg)
      }
    }
  }

  override def start() : Actor={
    //serviceTracker.open
    var actor = super.start
    nettyServer.start
    actor
  }

  override def stop()={
    nettyServer.stop
    this ! STOP
    //serviceTracker.close
  }

}
