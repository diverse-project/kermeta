/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor

import java.io.ByteArrayInputStream
import org.jgroups.JChannel
import org.jgroups.Message
import org.kermeta.art2.framework.Art2XmiHelper

object Art2Cluster {
  var jchannel  : JChannel = null
  def start = {
    //System.setProperty("java.net.preferIPv4Stack", "true");
    jchannel = new JChannel//(this.getClass.getClassLoader.getResource("udp.xml"))
    jchannel.connect("Art2DefaultNameSpace")
    jchannel.setReceiver(new org.jgroups.ReceiverAdapter(){
        override def receive(msg : Message )={
          println("ART2 Cluster Mesage =>"+msg)
        }
        override def getState : Array[Byte] = synchronized {
          println("Cluster GetState")
          super.getState
        }
        override def setState(state : Array[Byte])= synchronized {

          println("Set STATE")

          var input = new ByteArrayInputStream(state);
          var root = Art2XmiHelper.loadStream(input)

          println("Cluster SetState")
          println(root)
          
        }
        
      })
    jchannel.getState(null, 5000)

    Runtime.getRuntime().addShutdownHook(new Thread() {
        override def run() {
          println("Close Channel Cluster")
          jchannel.close
        }
      })

  }

  def push(content : String)= {
    println("Push model ")
    var msg=new Message(null, null, content);
    jchannel.send(msg);
  }


}
