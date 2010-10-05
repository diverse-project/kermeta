/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty.remote

import java.net.InetSocketAddress
import java.util.concurrent.Executors
import org.jboss.netty.bootstrap.ServerBootstrap
import org.jboss.netty.channel.ChannelEvent
import org.jboss.netty.channel.ChannelHandlerContext
import org.jboss.netty.channel.ChannelStateEvent
import org.jboss.netty.channel.Channels
import org.jboss.netty.channel.ExceptionEvent
import org.jboss.netty.channel.MessageEvent
import org.jboss.netty.channel.ChannelPipeline
import org.jboss.netty.channel.ChannelPipelineFactory
import org.jboss.netty.channel.ChannelState
import org.jboss.netty.channel.SimpleChannelUpstreamHandler
import org.jboss.netty.channel.group.ChannelGroup
import org.jboss.netty.channel.group.DefaultChannelGroup
import org.jboss.netty.handler.codec.compression.ZlibDecoder
import org.jboss.netty.handler.codec.compression.ZlibEncoder
import org.jboss.netty.handler.codec.compression.ZlibWrapper
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory
import org.jboss.netty.handler.codec.serialization.ObjectDecoder
import org.jboss.netty.handler.codec.serialization.ObjectEncoder
import org.kermeta.art2.framework.Art2Actor
import org.slf4j.LoggerFactory
import scala.collection.JavaConversions._
import org.kermeta.art2.framework.JacksonSerializer._

trait NettyServer extends SimpleChannelUpstreamHandler with Art2Actor {

  var logger = LoggerFactory.getLogger(this.getClass);
  //NETTY VARIABLE
  var bossPool : Option[java.util.concurrent.ExecutorService] = None
  var ioPool  : Option[java.util.concurrent.ExecutorService] = None
  var bootstrap : Option[ServerBootstrap] = None
  var cgroup : ChannelGroup = new DefaultChannelGroup

  def getPort : Int
  def getIP : String = "0.0.0.0"

  def startServer = {
    /* DO NETTY INIT CODE */
    bossPool  = Some(Executors.newCachedThreadPool())
    ioPool = Some(Executors.newCachedThreadPool())
    var newbootstrap = new ServerBootstrap(new NioServerSocketChannelFactory(Executors.newCachedThreadPool(),Executors.newCachedThreadPool()))
    newbootstrap.setPipelineFactory(new ChannelPipelineFactory() {
        def getPipeline() : ChannelPipeline = {getPipeline}
      });
    //LISTENER FOR ALL INTERFACE
    cgroup.add(newbootstrap.bind(new InetSocketAddress(getIP,getPort)))
    bootstrap = Some(newbootstrap)
    logger.info("Netty Server Started")
  }

  /* Default Pipeline */
  def getPipeline() : ChannelPipeline = {
    var pipeline = Channels.pipeline()
    pipeline.addLast("deflater", new ZlibEncoder(ZlibWrapper.ZLIB))
    pipeline.addLast("inflater", new ZlibDecoder(ZlibWrapper.ZLIB))

    pipeline.addLast("decoder", new ObjectDecoder())
    pipeline.addLast("encoder", new ObjectEncoder())
    
    pipeline.addLast("handler", this);
    pipeline
  }

  def stopServer(){
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
          bossPool match {
            case None =>
            case Some(p) => p.shutdown
          }
        } catch {case _ @ e => logger.error(this.getClass.getName, e)}

    }
    logger.info("Netty Server Stopped !")
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

  case class ART_MESSAGE(ctx :ChannelHandlerContext,e : MessageEvent)
  override def messageReceived(ctx :ChannelHandlerContext,e : MessageEvent) {
    logger.info("Hello")
    this ! ART_MESSAGE(ctx,e)
  }

  /*
  override def channelOpen(ctx:ChannelHandlerContext,e : ChannelStateEvent) = {
    cgroup.add(e.getChannel)
  }*/


}
