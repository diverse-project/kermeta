/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor.command

import java.io.ByteArrayOutputStream
import java.net.InetSocketAddress
import org.kermeta.art2.framework.Art2XmiHelper
import org.kermeta.art2.framework.bus.netty.Art2ModelSynch
import org.kermeta.art2.framework.bus.netty.remote.TcpClientRemoteActor
import org.kermeta.art2.framework.bus.netty.remote.UdpClientRemoteActor
import org.kermeta.art2.framework.message.Art2ModelSynchMessage
import org.kermeta.art2.ui.editor.Art2UIKernel
import org.kermeta.art2.framework.JacksonSerializer._

class SynchPlatformCommand extends Command {

  var kernel : Art2UIKernel = null
  var client = new TcpClientRemoteActor(null,1000) {
      def getRemoteAddr : InetSocketAddress = {
        new InetSocketAddress("localhost",8081)
      }
    }
 //   client.start

  def execute(p :Object) {


    client.start

    var outStream = new ByteArrayOutputStream
    Art2XmiHelper.saveStream(outStream, kernel.getModelHandler.getActualModel)
    outStream.flush
    // var msg = outStream.toString

    var msg = new Art2ModelSynchMessage
    msg.setNodeSenderName("art2.editor")
    msg.setNewModelAsString(outStream.toString)

    outStream.close




    println("send "+msg.toJSON)

    client ! msg.toJSON



    client.stop
  }

}
