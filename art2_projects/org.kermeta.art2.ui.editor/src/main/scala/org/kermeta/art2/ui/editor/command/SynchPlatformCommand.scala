/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor.command

import java.io.ByteArrayOutputStream
import org.kermeta.art2.framework.Art2XmiHelper
import org.kermeta.art2.framework.bus.netty.Art2ModelSynch
import org.kermeta.art2.framework.bus.netty.remote.UdpClientRemoteActor
import org.kermeta.art2.framework.message.Art2ModelSynchMessage
import org.kermeta.art2.ui.editor.Art2UIKernel
import org.kermeta.art2.framework.JacksonSerializer._

class SynchPlatformCommand extends Command {

  var kernel : Art2UIKernel = null

  def execute(p :Object) {

    //println("Hello")

    var client = new UdpClientRemoteActor(null,8082)


    client.start

    var outStream = new ByteArrayOutputStream
    Art2XmiHelper.saveStream(outStream, kernel.getModelHandler.getActualModel)
    outStream.flush
    // var msg = outStream.toString

    var msg = new Art2ModelSynchMessage
    msg.setNodeSenderName("art2.editor")
    msg.setNewModelAsString(outStream.toString)

    outStream.close
    
    client ! msg.toJSON

    client.stop
  }

}
