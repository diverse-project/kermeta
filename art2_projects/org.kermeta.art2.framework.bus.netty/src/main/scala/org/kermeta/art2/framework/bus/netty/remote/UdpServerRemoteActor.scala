/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty.remote

import java.net.InetSocketAddress
import java.util.concurrent.Executors
import org.jboss.netty.bootstrap.ConnectionlessBootstrap
import org.jboss.netty.channel.Channel
import org.jboss.netty.channel.ChannelEvent
import org.jboss.netty.channel.ChannelHandlerContext
import org.jboss.netty.channel.ChannelStateEvent
import org.jboss.netty.channel.Channels
import org.jboss.netty.channel.ExceptionEvent
import org.jboss.netty.channel.FixedReceiveBufferSizePredictorFactory
import org.jboss.netty.channel.MessageEvent
import org.jboss.netty.channel.ChannelPipeline
import org.jboss.netty.channel.ChannelPipelineFactory
import org.jboss.netty.channel.ChannelState
import org.jboss.netty.channel.SimpleChannelUpstreamHandler
import org.jboss.netty.channel.group.ChannelGroup
import org.jboss.netty.channel.group.DefaultChannelGroup
import org.jboss.netty.channel.socket.nio.NioDatagramChannelFactory
import org.jboss.netty.handler.codec.serialization.ObjectDecoder
import org.jboss.netty.handler.codec.serialization.ObjectEncoder
import org.jboss.netty.handler.codec.compression.ZlibDecoder
import org.jboss.netty.handler.codec.compression.ZlibEncoder
import org.jboss.netty.handler.codec.compression.ZlibWrapper
import org.kermeta.art2.framework.Art2Actor
import org.slf4j.LoggerFactory
import scala.actors.Actor

class UdpServerRemoteActor(port : Int,delegate : Actor) extends SimpleChannelUpstreamHandler with Art2Actor {

  var logger = LoggerFactory.getLogger(this.getClass);
  // var bossPool : Option[java.util.concurrent.ExecutorService] = None
  var ioPool  : Option[java.util.concurrent.ExecutorService] = None
  var bootstrap : Option[ConnectionlessBootstrap] = None
  var channel : Option[Channel] = None
  var me = this
  var cgroup : ChannelGroup = new DefaultChannelGroup

  override def start(): Actor = synchronized {
    /* DO NETTY INIT CODE */
    // bossPool  = Some(Executors.newCachedThreadPool())
    ioPool = Some(Executors.newCachedThreadPool())


    var newbootstrap = new ConnectionlessBootstrap(new NioDatagramChannelFactory(ioPool.get))
    newbootstrap.setPipelineFactory(new ChannelPipelineFactory() {
        def getPipeline() : ChannelPipeline = {
          me.getPipeline
        }
      });
    newbootstrap.setOption("broadcast", "false");
    newbootstrap.setOption("receiveBufferSizePredictorFactory",new FixedReceiveBufferSizePredictorFactory(1024));

    channel = Some(newbootstrap.bind(new InetSocketAddress("0.0.0.0",port)))
    cgroup.add(channel.get)
    bootstrap = Some(newbootstrap)

    super.start()
    this
  }

  def getPipeline() : ChannelPipeline = {
    var pipeline = Channels.pipeline()
    pipeline.addLast("gzipdeflater", new ZlibEncoder(ZlibWrapper.GZIP))
    pipeline.addLast("gzipinflater", new ZlibDecoder(ZlibWrapper.GZIP))
    pipeline.addLast("objectEnc", new ObjectEncoder())
    pipeline.addLast("objectDec", new ObjectDecoder())
    pipeline.addLast("handler", me);
    pipeline
  }

  override def stop(){
    bootstrap match {
      case None =>
      case Some(b) =>
        try{
          cgroup.close.awaitUninterruptibly
          b.releaseExternalResources
          ioPool match {
            case None =>
            case Some(p) => p.shutdown
          }
        } catch {case _ @ e => logger.error(this.getClass.getName, e)}

    }
    me ! STOP
    logger.info("Server Actor is stopped")
  }

  def act() = {
    loop {
      react {
        case STOP => logger.info("Server Actor will die");exit()
          /*
        case _ @ msg => channel match {
            case None => println("TODO WAITING PERIOD")
            case Some(b) => {
                try{
                  if(b.isConnected){
                    b.write(msg)
                  }
                } catch {
                  case _ @ e => logger.error("Unexpected exception, while sending msg.",e);
                }
              }
          }*/
        
      }
    }
  }

  override def messageReceived(ctx :ChannelHandlerContext,e : MessageEvent) {
    var message = e.getMessage
    if(delegate == null){
      logger.warn("No delegate found - message lost : "+message.toString)
    } else {
      logger.info("Message rec : "+message.toString)
      delegate ! message
    }
  }
  override def exceptionCaught(ctx :ChannelHandlerContext, e:ExceptionEvent) {
    logger.error("Unexpected exception from downstream.",e.getCause());
  }
  override def handleUpstream(ctx :ChannelHandlerContext, e: ChannelEvent) {
    e match {
      case e : ChannelStateEvent if(e.getState() != ChannelState.INTEREST_OPS) =>logger.info(e.toString())
      case _ @ e => println(e)
    }
    super.handleUpstream(ctx, e);
  }

}
