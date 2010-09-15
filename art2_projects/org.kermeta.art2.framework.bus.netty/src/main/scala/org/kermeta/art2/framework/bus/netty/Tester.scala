/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty

import java.net.InetSocketAddress
import org.kermeta.art2.framework.JacksonSerializer._
import org.kermeta.art2.framework.bus.netty.remote.TcpClientRemoteActor
import org.kermeta.art2.framework.bus.netty.remote.TcpServerRemoteActor
import org.kermeta.art2.framework.message.Art2Message
import org.kermeta.art2.framework._
import scala.actors.Actor


object Tester {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {


    var msg = new Art2Message()
    
    var json : String = msg.toJSON
    
    println(json)
    
    var conjson = json.fromJSON(classOf[Art2Message])

    println(conjson)



    class MyActor extends Actor {
      def act = {
        loop {
          react {
            case _ @ msg => println(msg)
          }
        }
      }
      def stop = {
        exit
      }
    }
    var actorSD = new MyActor
    actorSD.start
    actorSD.stop
    actorSD.start

    var actorS = new TcpServerRemoteActor(8090,actorSD)
    actorS.start


 //   var actorS2 = new UdpServerRemoteActor(8091,null)
  //  actorS2.start

    var clientactor = new TcpClientRemoteActor(null,2000){
      def getRemoteAddr : InetSocketAddress = {
        new InetSocketAddress("localhost",8090)
      }
    }
    clientactor.start
    clientactor ! "Hello"


 //   var clientactor2 = new UdpClientRemoteActor(null,2000,8091)
  //  clientactor2.start
  //  clientactor2 ! "Multicast hello world !"


    new Thread(){
      override def run = { Thread.sleep(3000);
                          //clientactor2.stop;
                          clientactor.stop;
                          actorS.stop;
                          actorSD.stop
                        //  actorS2.stop;
                          println("Test end")  }
    }.start








  }

}
