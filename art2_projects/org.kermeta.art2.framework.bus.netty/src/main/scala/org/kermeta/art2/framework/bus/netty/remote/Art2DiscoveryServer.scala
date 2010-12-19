/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty.remote

import java.net.InetAddress
import java.net.InetSocketAddress
import java.util.concurrent.Executors
import org.jboss.netty.bootstrap.ConnectionlessBootstrap
import org.jboss.netty.channel.Channel
import org.jboss.netty.channel.ChannelHandlerContext
import org.jboss.netty.channel.ChannelPipeline
import org.jboss.netty.channel.ChannelPipelineFactory
import org.jboss.netty.channel.Channels
import org.jboss.netty.channel.socket.oio.OioDatagramChannelFactory
import org.jboss.netty.handler.codec.compression.ZlibDecoder
import org.jboss.netty.handler.codec.compression.ZlibEncoder
import org.jboss.netty.handler.codec.compression.ZlibWrapper
import org.jboss.netty.channel.ExceptionEvent
import org.jboss.netty.channel.MessageEvent
import org.jboss.netty.channel.SimpleChannelUpstreamHandler
import org.jboss.netty.channel.group.DefaultChannelGroup
import org.jboss.netty.channel.socket.DatagramChannel
import org.jboss.netty.channel.socket.nio.NioDatagramChannelFactory
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory
import org.jboss.netty.handler.codec.serialization.ObjectDecoder
import org.jboss.netty.handler.codec.serialization.ObjectEncoder
import org.jboss.netty.handler.codec.string.StringDecoder
import org.jboss.netty.handler.codec.string.StringEncoder
import org.jboss.netty.util.CharsetUtil


class Art2DiscoveryServer(groupPort : Int) extends SimpleChannelUpstreamHandler {

  var newbootstrap : ConnectionlessBootstrap = _
  var channel : DatagramChannel = _
  var channels : DefaultChannelGroup  = new DefaultChannelGroup

  def start()={
    var myself = this
    var group = InetAddress.getByName("228.5.6.7");
    newbootstrap = new ConnectionlessBootstrap(new OioDatagramChannelFactory(Executors.newCachedThreadPool()))
    newbootstrap.setPipelineFactory(new ChannelPipelineFactory() {
        def getPipeline() : ChannelPipeline = {
          var pipeline = Channels.pipeline()
          pipeline.addLast("deflater", new ZlibEncoder(ZlibWrapper.ZLIB))
          pipeline.addLast("inflater", new ZlibDecoder(ZlibWrapper.ZLIB))
          pipeline.addLast("decoder", new StringDecoder(CharsetUtil.UTF_8))
          pipeline.addLast("encoder", new StringEncoder(CharsetUtil.UTF_8))
          pipeline.addLast("handler", myself);
          pipeline
        }
      });
    newbootstrap.setOption("broadcast", "false");

    channel = newbootstrap.bind(new InetSocketAddress(groupPort)).asInstanceOf[DatagramChannel]
    channel.joinGroup(group)
    channels.add(channel)
  }

  def stop()={
    try{ channels.close } catch {case _ @ e =>}
    newbootstrap.releaseExternalResources
  }



  override def messageReceived(ctx : ChannelHandlerContext, e: MessageEvent) = {
    println(e.getMessage+"-sender="+e.getRemoteAddress)
  }


  override def exceptionCaught(ctx : ChannelHandlerContext, e: ExceptionEvent) = {
    e.getChannel().close();
  }


}
