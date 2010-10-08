/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty.remote

import org.jboss.netty.channel.SimpleChannelUpstreamHandler
import java.net.InetSocketAddress
import java.util.concurrent.Executors
import org.jboss.netty.bootstrap.ConnectionlessBootstrap
import org.jboss.netty.channel.ChannelFuture
import org.jboss.netty.channel.ChannelHandlerContext
import org.jboss.netty.channel.ChannelStateEvent
import org.jboss.netty.channel.ChannelPipeline
import org.jboss.netty.channel.ChannelPipelineFactory
import org.jboss.netty.channel.Channels
import org.jboss.netty.channel.ExceptionEvent
import org.jboss.netty.channel.FixedReceiveBufferSizePredictorFactory
import org.jboss.netty.channel.MessageEvent
import org.jboss.netty.channel.SimpleChannelUpstreamHandler
import org.jboss.netty.channel.group.DefaultChannelGroup
import org.jboss.netty.channel.socket.DatagramChannel
import org.jboss.netty.channel.socket.nio.NioDatagramChannelFactory
import org.jboss.netty.handler.codec.compression.ZlibDecoder
import org.jboss.netty.handler.codec.compression.ZlibEncoder
import org.jboss.netty.handler.codec.serialization.ObjectDecoder
import org.jboss.netty.handler.codec.serialization.ObjectEncoder
import org.jboss.netty.handler.codec.compression.ZlibDecoder
import org.jboss.netty.handler.codec.compression.ZlibEncoder
import org.jboss.netty.handler.codec.compression.ZlibWrapper
import org.jboss.netty.handler.codec.string.StringDecoder
import org.jboss.netty.handler.codec.string.StringEncoder
import org.kermeta.art2.framework.Art2Actor
import org.slf4j.LoggerFactory
import scala.actors.Actor

class UdpClientRemoteActor(delegate : Actor,port : Int) extends SimpleChannelUpstreamHandler with Art2Actor {

  def internal_process(msg : Any) = {
    
  }

  var logger = LoggerFactory.getLogger(this.getClass);
  var bootstrap : Option[ConnectionlessBootstrap] = None
  // var bossPool : Option[java.util.concurrent.ExecutorService] = None
  var ioPool  : Option[java.util.concurrent.ExecutorService] = None
  var me  = this
  var channel : Option[DatagramChannel] = None
  var channelfutur : Option[ChannelFuture] = None
  var allChannels = new DefaultChannelGroup()

  case class CHANNEL_CONNECTED(e : ChannelStateEvent)


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

    newbootstrap.setOption("broadcast", "true");
    //newbootstrap.setOption("connectTimeoutMillis", timeout);
    newbootstrap.setOption("receiveBufferSizePredictorFactory",new FixedReceiveBufferSizePredictorFactory(1024));
    channel = Some(newbootstrap.bind(new InetSocketAddress(0)).asInstanceOf[DatagramChannel])
    allChannels.add(channel.get)
    bootstrap = Some(newbootstrap)
    super.start()
    this
  }

  def getPipeline() : ChannelPipeline = {
    var pipeline = Channels.pipeline()
   // pipeline.addLast("gzipdeflater", new ZlibEncoder(ZlibWrapper.GZIP))
   // pipeline.addLast("gzipinflater", new ZlibDecoder(ZlibWrapper.GZIP))
   // pipeline.addLast("objectEnc", new ObjectEncoder())
   // pipeline.addLast("objectDec", new ObjectDecoder())
    pipeline.addLast("stringEnc", new StringEncoder())
    pipeline.addLast("stringDec", new StringDecoder())
    pipeline.addLast("handler", me);
    pipeline
  }

  override def messageReceived(ctx :ChannelHandlerContext,e : MessageEvent) {
    var message = e.getMessage
    if(delegate == null){
      logger.warn("No delegate found - message lost from "+e.getRemoteAddress+" : "+message.toString)
    } else {
      logger.info("Message rec from "+e.getRemoteAddress+" : "+message.toString)
      delegate ! message
    }
  }
  override def exceptionCaught(ctx :ChannelHandlerContext, e:ExceptionEvent) {
    logger.error("Unexpected exception from downstream.",e.getCause());
  }

  override def stop(){
    me ! STOP_ACTOR()
    bootstrap match {
      case None =>
      case Some(b) =>
        allChannels.close().awaitUninterruptibly(); 
        b.releaseExternalResources();
        ioPool match {
          case None =>
          case Some(p) => p.shutdown
        }
    }
  }

  def sendMessage(c : DatagramChannel,o : Any) : Boolean = {
    try{
      c.write(o,new InetSocketAddress("255.255.255.255", port));true
    } catch {
      case _ @ e => logger.error("Unexpected exception, while sending msg.",e);false
    }
  }

override  def act() = {
    loop {
      react {
        case STOP_ACTOR(f) =>
          loopWhile(this.mailboxSize > 0){
            react {
              case _ @ msg =>
                channel match {
                  case Some(b) => sendMessage(b,msg)
                  case None => logger.error("Msg lost "+msg)
                }
            }
          }
          exit()
        case _ @ msg =>
          channel match {
            case Some(b) => sendMessage(b,msg)
            case None => logger.error("Msg lost "+msg)
          }
      }
    }
  }
}
