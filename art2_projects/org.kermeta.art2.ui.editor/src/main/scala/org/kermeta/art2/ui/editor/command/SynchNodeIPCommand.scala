/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor.command

import java.io.ByteArrayOutputStream
import java.net.InetSocketAddress
import javax.swing.JTextField
import org.kermeta.art2.framework.Art2XmiHelper
import org.kermeta.art2.framework.bus.netty.remote.TcpClientRemoteActor
import org.kermeta.art2.framework.message.Art2ModelSynchMessage
import org.kermeta.art2.ui.editor.Art2UIKernel
import org.kermeta.art2.framework.JacksonSerializer._
import scala.reflect.BeanProperty
import scala.collection.JavaConversions._

class SynchNodeIPCommand extends Command {

  @BeanProperty
  var field : JTextField = null

  @BeanProperty
  var kernel : Art2UIKernel = null

  @BeanProperty
  var destNodeName : String = null
  //   client.start

  def execute(p :Object) {


    var client = new TcpClientRemoteActor(null,4000) {
      def getRemoteAddr : InetSocketAddress = {
        try{
          var IP = field.getText.split(":").toList.get(0)
          var PORT = field.getText.split(":").toList.get(1)
          println("IP="+IP+",PORT="+PORT)
          new InetSocketAddress(IP,Integer.parseInt(PORT))
        } catch {
          case _ @ e => e.printStackTrace;null
        }
      }
    }
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
