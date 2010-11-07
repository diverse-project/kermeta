/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.jgroup

import org.jgroups.JChannel
import org.jgroups.Message
import org.jgroups.ReceiverAdapter

object Tester {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    var channel = new JChannel()
    channel.setReceiver(new ReceiverAdapter() {
        override def receive(msg:Message) {
          System.out.println("received msg from " + msg.getSrc() + ": " + msg.getObject());
        }
      });
    channel.connect("Art2DefaultNameSpace");
     
    //channel.close();


    new Thread(){
      override def run()={
        for(i <- 0 until 20){
          channel.send(new Message(null, null, "hello world"));
          Thread.sleep(1000)
        }
        
        channel.close
      }
    }.start

  }

}
