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
    var cli = new Art2DiscoveryClient(1000,6789,"duke",8000,8001)
    srv.start
    cli.start

    new Thread(){
      override def run = {
        Thread.sleep(10000);

        println("FIRSTY STOP")

        cli.stop

        println("STOP")
        
        srv.stop

        println("STOP2")

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
