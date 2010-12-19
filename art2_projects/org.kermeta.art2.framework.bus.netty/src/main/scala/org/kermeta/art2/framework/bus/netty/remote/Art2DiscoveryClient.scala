/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty.remote

import java.net.InetAddress
import java.net.InetSocketAddress
import java.util.concurrent.Executors
import org.jboss.netty.bootstrap.ConnectionlessBootstrap
import org.jboss.netty.channel.ChannelHandlerContext
import org.jboss.netty.channel.ChannelPipeline
import org.jboss.netty.channel.ChannelPipelineFactory
import org.jboss.netty.channel.Channels
import org.jboss.netty.channel.ExceptionEvent
import org.jboss.netty.channel.FixedReceiveBufferSizePredictorFactory
import org.jboss.netty.channel.SimpleChannelUpstreamHandler
import org.jboss.netty.channel.socket.DatagramChannel
import org.jboss.netty.channel.socket.nio.NioDatagramChannelFactory
import org.jboss.netty.channel.socket.oio.OioDatagramChannelFactory
import org.jboss.netty.handler.codec.compression._
import org.jboss.netty.handler.codec.string.StringDecoder
import org.jboss.netty.handler.codec.string.StringEncoder
import org.jboss.netty.util.CharsetUtil
import org.kermeta.art2.framework.bus.netty.NetworkUtility
import scala.actors.Actor
import scala.actors.DaemonActor
import scala.actors.TIMEOUT
import org.kermeta.art2.framework.JacksonSerializer._

class Art2DiscoveryClient(loopTime : Int,groupPort : Int,nodeName:String,modelDispatcherPort:Int,msgDispatcherPort:Int) extends SimpleChannelUpstreamHandler with DaemonActor {

  var bootstrap : ConnectionlessBootstrap = null
  var channel  : DatagramChannel = null
  var group = InetAddress.getByName("228.5.6.7");

  override def start : Actor={
    var self = this
    var factory = new OioDatagramChannelFactory(Executors.newCachedThreadPool())
    bootstrap = new ConnectionlessBootstrap(factory);
    bootstrap.setPipelineFactory(new ChannelPipelineFactory() {
        def getPipeline() : ChannelPipeline = {
          var pipeline = Channels.pipeline()
          pipeline.addLast("deflater", new ZlibEncoder(ZlibWrapper.ZLIB))
          pipeline.addLast("inflater", new ZlibDecoder(ZlibWrapper.ZLIB))
          pipeline.addLast("decoder", new StringDecoder(CharsetUtil.UTF_8))
          pipeline.addLast("encoder", new StringEncoder(CharsetUtil.UTF_8))
          pipeline.addLast("handler", self);
          pipeline
        }
      });
    bootstrap.setOption("receiveBufferSizePredictorFactory", new FixedReceiveBufferSizePredictorFactory(1024))
    bootstrap.setOption("broadcast", "true");
    channel = bootstrap.bind(new InetSocketAddress(0)).asInstanceOf[DatagramChannel]
    super.start
  }

  override def exceptionCaught(ctx : ChannelHandlerContext, e: ExceptionEvent) = {
    e.getChannel().close();
  }

  case class STOP()
  def stop()={
    this ! STOP()
    try { channel.close().awaitUninterruptibly(); } catch { case _ => }
    bootstrap.releaseExternalResources
  }

  def act()={
    loop{
      reactWithin(loopTime){
        case TIMEOUT => {
            var msgStream = NetworkUtility.buildDiscoveryMessage(nodeName, modelDispatcherPort, msgDispatcherPort).toJSON
            channel.write(msgStream, new InetSocketAddress("255.255.255.255", groupPort));
            channel.write(msgStream,new InetSocketAddress(group,groupPort))
          }
        case STOP() => exit
      }
    }
  }

}
