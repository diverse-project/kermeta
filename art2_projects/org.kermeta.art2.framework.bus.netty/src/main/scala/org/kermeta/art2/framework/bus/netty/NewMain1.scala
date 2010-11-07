/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty

import java.net.NetworkInterface
import scala.collection.JavaConversions._

object NewMain1 {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    NetworkInterface.getNetworkInterfaces.foreach{it =>
      it.getInetAddresses.foreach{inet=>inet.isMulticastAddress
        println(inet)
      }
    }

  }

}
