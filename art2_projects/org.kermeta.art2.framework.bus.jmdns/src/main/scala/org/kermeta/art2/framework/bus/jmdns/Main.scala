/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.jmdns

import javax.jmdns.JmDNS
import javax.jmdns.ServiceInfo
import org.slf4j.Logger

object Main {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
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
