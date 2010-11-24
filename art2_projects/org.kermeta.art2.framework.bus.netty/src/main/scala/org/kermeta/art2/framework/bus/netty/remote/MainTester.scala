/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty.remote

object MainTester {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    var srv = new Art2DiscoveryServer(6789)
    srv.start

    new Thread(){
      override def run = { Thread.sleep(5000);

                          srv.stop

                          //      client.stop
                          //      dispatch.stop

      }
      //clientactor2.stop;

      //  clientactor.stop;println("Client stopped")
      //   actorS.stop;println("Server stopped")
      //   actorSD.stop;println("Server delegate stopped")
      //  actorS2.stop;
      //      actorPoc.stop
    }.start




  }

}
