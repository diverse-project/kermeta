/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty.remote

import org.jboss.netty.channel.SimpleChannelUpstreamHandler
import java.net.InetSocketAddress
import java.util.concurrent.Executors
import org.jboss.netty.bootstrap.ClientBootstrap
import org.jboss.netty.channel.Channel
import org.jboss.netty.channel.ChannelEvent
import org.jboss.netty.channel.ChannelFuture
import org.jboss.netty.channel.ChannelHandlerContext
import org.jboss.netty.channel.ChannelStateEvent
import org.jboss.netty.channel.ChannelPipeline
import org.jboss.netty.channel.ChannelPipelineFactory
import org.jboss.netty.channel.ChannelState
import org.jboss.netty.channel.Channels
import org.jboss.netty.channel.ExceptionEvent
import org.jboss.netty.channel.MessageEvent
import org.jboss.netty.channel.SimpleChannelUpstreamHandler
import org.jboss.netty.channel.group.DefaultChannelGroup
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory
import org.jboss.netty.handler.codec.compression.ZlibDecoder
import org.jboss.netty.handler.codec.compression.ZlibEncoder
import org.jboss.netty.handler.codec.compression.ZlibWrapper
import org.jboss.netty.handler.codec.serialization.ObjectDecoder
import org.jboss.netty.handler.codec.serialization.ObjectEncoder
import org.kermeta.art2.framework.Art2Actor
import org.slf4j.LoggerFactory
import scala.actors.Actor
import scala.actors.TIMEOUT

abstract class TcpClientRemoteActor(delegate : Actor,timeout : Int) extends SimpleChannelUpstreamHandler with Art2Actor {

  var logger = LoggerFactory.getLogger(this.getClass);
  var bootstrap : Option[ClientBootstrap] = None
  var bossPool : Option[java.util.concurrent.ExecutorService] = None
  var ioPool  : Option[java.util.concurrent.ExecutorService] = None
  var me  = this
  var channel : Option[Channel] = None
  var channelfutur : Option[ChannelFuture] = None
  var allChannels = new DefaultChannelGroup()

 // case class STOP_RACTOR
  case class CHANNEL_CONNECTED(e : ChannelStateEvent)
  //case class RESPONSE_RECEIVE(msg : Any)


  override def start(): Actor = synchronized {
    /* DO NETTY INIT CODE */
    bossPool  = Some(Executors.newCachedThreadPool())
    ioPool = Some(Executors.newCachedThreadPool())

    var newbootstrap = new ClientBootstrap(new NioClientSocketChannelFactory(Executors.newCachedThreadPool(),Executors.newCachedThreadPool()));
    newbootstrap.setPipelineFactory(new ChannelPipelineFactory() {
        def getPipeline() : ChannelPipeline = {
          me.getPipeline
        }
      });
    newbootstrap.setOption("connectTimeoutMillis", timeout);
    bootstrap = Some(newbootstrap)
    super.start()
    this
  }

  def getPipeline() : ChannelPipeline = {
    var pipeline = Channels.pipeline()
    pipeline.addLast("deflater", new ZlibEncoder(ZlibWrapper.ZLIB))
    pipeline.addLast("inflater", new ZlibDecoder(ZlibWrapper.ZLIB))

    pipeline.addLast("decoder", new ObjectDecoder())
    pipeline.addLast("encoder", new ObjectEncoder())

    pipeline.addLast("handler", this);
    pipeline
    pipeline
  }

  override def channelConnected(ctx :ChannelHandlerContext,e : ChannelStateEvent) = {
    allChannels.add(e.getChannel)
    me ! CHANNEL_CONNECTED(e)
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


  def getRemoteAddr : InetSocketAddress 

  private def reconnect() = {
    try {
      channelfutur match {
        case None =>
        case Some(cf) => cf.cancel ; channelfutur = None
      }
      bootstrap match {
        case None => /* TRY TO BUILD A NEW ONE */// U  ????
        case Some(b) => channelfutur = Some(b.connect(me.getRemoteAddr))
      }
    } catch {
      case _ @ e  => logger.error("Reconnection error", e)
    }
  }

  override def stop(){
    
    bootstrap match {
      case None =>
      case Some(b) =>
        allChannels.close().awaitUninterruptibly();
        b.releaseExternalResources();
        ioPool match {
          case None =>
          case Some(p) => p.shutdown
        }
        bossPool match {
          case None =>
          case Some(p) => p.shutdown
        }
    }
    me ! STOP()
  }

  def sendMessage(c : Channel,o : Any) : Boolean = {
    try{
      c.write(o);true
    } catch {
      case _ @ e => logger.error("Unexpected exception, while sending msg.",e);false
    }
  }

  def act() = {
    loop {
      react {
        case s : STOP => exit()
        case _ @ msg => channelfutur match {
            case Some(b) if(b.isSuccess) => sendMessage(b.getChannel,msg)
            case _ => {
                /* TRY TO RECONNECT */
                logger.info("Try to reconnect netty")
                reconnect
                var sended = false
                loopWhile(!sended){
                  reactWithin(timeout) {
                    case s : STOP => exit()
                    case c : CHANNEL_CONNECTED => sended = sendMessage(c.e.getChannel,msg);
                    case TIMEOUT => reconnect
                  }
                }
              }
          }
      }
    }
  }
}
