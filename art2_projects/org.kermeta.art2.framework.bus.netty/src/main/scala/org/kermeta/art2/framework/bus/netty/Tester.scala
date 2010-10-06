/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty

import java.net.InetSocketAddress
import org.kermeta.art2.framework.JacksonSerializer._
import org.kermeta.art2.framework.bus.netty.remote.Art2DispatcherActor
import org.kermeta.art2.framework.bus.netty.remote.TcpClientRemoteActor
import org.kermeta.art2.framework.bus.netty.remote.TcpServerRemoteActor
import org.kermeta.art2.framework.bus.netty.remote.UdpClientRemoteActor
import org.kermeta.art2.framework.message.Art2Message
import org.kermeta.art2.framework._
import org.osgi.framework.BundleContext
import scala.actors.Actor


object Tester {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {

    /*
     var msg = new Art2Message()
     var json : String = msg.toJSON
     var conjson = json.fromJSON(classOf[Art2Message])

    
     class MyActor extends Actor {
     case class STOPMSG
     def act = {
     loop {
     react {
     case STOPMSG => exit
     case _ @ msg => println(msg)
     }
     }
     }
     def stop = {
     this ! STOPMSG
     }
     }
     var actorSD = new MyActor
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
     */

    //var synch = new Art2ModelSynch(8082,null,"duke.irisa.fr")
    //synch.start

//    synch.synch(org.kermeta.art2.Art2Factory.eINSTANCE.createContainerRoot)

    //  var actorPoc = new Art2DispatcherActor(8080,null)
    //  actorPoc.start


  //  var dispatch = new Art2DispatcherActor(8082,null)

  //  dispatch.start

    var client = new TcpClientRemoteActor(null,10000){
      def getRemoteAddr : InetSocketAddress = {
        new InetSocketAddress("131.254.15.214",8082)
      }



    }
    client.start

    client ! "yepee"

    new Thread(){
      override def run = { Thread.sleep(3000);


                          client.stop
                         // dispatch.stop

      }
                          //clientactor2.stop;

                          //  clientactor.stop;println("Client stopped")
                          //   actorS.stop;println("Server stopped")
                          //   actorSD.stop;println("Server delegate stopped")
                          //  actorS2.stop;
                          //      actorPoc.stop
    }.start



    // var client = new UdpClientRemoteActor(null,8082)
    //client.start

    //Thread.sleep(2000)

    //client.stop







  }

}
