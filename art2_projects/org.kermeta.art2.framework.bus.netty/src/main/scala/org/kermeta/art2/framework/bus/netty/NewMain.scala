/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty

import java.net.NetworkInterface
import java.util.concurrent.Executors
import org.jboss.netty.channel.ChannelHandler
import org.jboss.netty.channel.ChannelHandlerContext
import org.jboss.netty.channel.Channels
import org.jboss.netty.channel.MessageEvent
import org.jboss.netty.channel.socket.nio.NioDatagramChannelFactory
import org.jboss.netty.handler.codec.compression.ZlibDecoder
import org.jboss.netty.handler.codec.compression.ZlibEncoder
import org.jboss.netty.handler.codec.serialization.ObjectDecoder
import org.jboss.netty.handler.codec.serialization.ObjectEncoder
import org.jboss.netty.handler.codec.compression.ZlibDecoder
import org.jboss.netty.handler.codec.compression.ZlibEncoder
import org.jboss.netty.handler.codec.compression.ZlibWrapper
import scala.collection.JavaConversions._


object NewMain {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    var pool = Executors.newCachedThreadPool()
    var channelFactory = new NioDatagramChannelFactory(pool)

    var handler = new ChannelHandler(){
     // override def messageReceived(ctx :ChannelHandlerContext,e : MessageEvent) {

        println("REC")
      //}
    }

    var pipeline = Channels.pipeline()
    pipeline.addLast("deflater", new ZlibEncoder(ZlibWrapper.ZLIB))
    pipeline.addLast("inflater", new ZlibDecoder(ZlibWrapper.ZLIB))
    pipeline.addLast("decoder", new ObjectDecoder())
    pipeline.addLast("encoder", new ObjectEncoder())
    pipeline.addLast("handler", handler);
    var channel = channelFactory.newChannel(pipeline)

    NetworkInterface.getNetworkInterfaces.foreach{it =>

      it.getInetAddresses.foreach{inet=>inet.isMulticastAddress

      }

      //channel.joinGroup(it.get, it)

    }

    



  }

}
