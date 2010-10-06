/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.jmdns

import java.net.NetworkInterface
import javax.jmdns.JmDNS
import javax.jmdns.ServiceInfo
import org.slf4j.Logger
import scala.collection.JavaConversions._

object Main {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {

    NetworkInterface.getNetworkInterfaces.foreach{it =>
      println("it="+it.getDisplayName)
      println("it="+it.getName)

      println("MTUU"+it.getMTU)

      it.getInetAddresses.find(addr=>addr.getHostAddress.toString == "127.0.0.1" || addr.getHostAddress == "0:0:0:0:0:0:0:1") match {
        case None => {
            println("ok")
            it.getInetAddresses.foreach{addr =>
              println(addr)
              println(addr.getCanonicalHostName)
              println(addr.getHostName)
              println(addr.getHostAddress)
            }
          }
        case Some(e)=>
      }


    }


    try
    {
      System.out.println("Opening JmDNS");
      var jmdns = JmDNS.create("duke.irisa.fr");
      System.out.println("Opened JmDNS");


      var info = ServiceInfo.create("_test._tcp.local.", "dede", 1268, 0, 0, "path=index.html");
      jmdns.registerService(info);

      System.out.println("\nRegistered Service as " + info);
      try {
        Thread.sleep(5000);
      } catch  {
        case _ @ ex => ex.printStackTrace
      }

      jmdns.list("_test._tcp.local.").foreach{info=>
        println(info.getName)
        println(info.getHostAddress)
        println(info.getWeight)
        println(info.getPort)
        println(info.getDomain)
        println(info.getApplication)
        println(info.getProtocol)
        println(info.getServer)

      }

      System.out.println("Closing JmDNS");
      jmdns.close();
      System.out.println("Done");
      System.exit(0);
    }
    catch
    {
      case _ @e =>  e.printStackTrace();
    }
  }

}
