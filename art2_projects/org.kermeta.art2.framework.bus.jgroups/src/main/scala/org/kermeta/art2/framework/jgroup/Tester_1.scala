/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.jgroup

import org.jgroups.JChannel
import org.jgroups.Message
import org.jgroups.ReceiverAdapter
import org.kermeta.art2.framework.Art2XmiHelper
import org.kermeta.art2.framework.message.Art2ModelSynchMessage

import org.kermeta.art2.framework.JacksonSerializer._
import scala.io.Source

object Tester_1 {

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
      //channel.send(new Message(null, null, "hello world"));
      //channel.close();


    var msg = new Art2ModelSynchMessage

    var modelasS = Source.fromFile("/Users/ffouquet/Desktop/u.art2").getLines.mkString("\n")


    msg.setNewModelAsString(modelasS)
    

    new Thread(){
      override def run()={
        for(i <- 0 until 20){

          channel.send(new Message(null, null, msg.toJSON));
          Thread.sleep(1000)
        }

        channel.close
      }
    }.start


  }

}
