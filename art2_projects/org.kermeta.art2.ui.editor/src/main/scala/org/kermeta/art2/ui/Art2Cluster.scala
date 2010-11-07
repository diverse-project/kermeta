/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui

import org.jgroups.JChannel
import org.jgroups.Message

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
          println("Cluster SetState")
          super.setState(state)
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
