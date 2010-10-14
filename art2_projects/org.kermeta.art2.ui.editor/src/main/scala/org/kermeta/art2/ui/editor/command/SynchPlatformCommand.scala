/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor.command

import java.io.ByteArrayOutputStream
import java.net.InetSocketAddress
import java.net.NetworkInterface
import javax.jmdns.JmDNS
import org.kermeta.art2.framework.Art2XmiHelper
import org.kermeta.art2.framework.bus.netty.remote.TcpClientRemoteActor
import org.kermeta.art2.framework.message.Art2ModelSynchMessage
import org.kermeta.art2.ui.editor.Art2UIKernel
import org.kermeta.art2.framework.Constants
import org.kermeta.art2.framework.JacksonSerializer._
import scala.reflect.BeanProperty
import scala.collection.JavaConversions._

class SynchPlatformCommand extends Command {

  @BeanProperty
  var kernel : Art2UIKernel = null

  @BeanProperty
  var destNodeName : String = null
  //   client.start

  def execute(p :Object) {

    //USE Bonjour search to discover ART2 Node IP & Port
    var netLink = IPCache.getNode(destNodeName)
    netLink match {
      case Some(l) if(l.size > 0)=> {
          var i = 0
          var listIP = l.toList
          var client = new TcpClientRemoteActor(null,1000) {
            def getRemoteAddr : InetSocketAddress = {



              var addr = new InetSocketAddress(listIP.get(i)._1,listIP.get(i)._2)
              i = i +1
              if(i == l.size){ i = 0 }
              addr
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
        case _ => println("No IP found to push model to => "+destNodeName)
    }



   
    




     

  }

}
