/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty

import java.io.IOException
import java.net.DatagramSocket
import java.net.NetworkInterface
import java.net.ServerSocket
import scala.collection.JavaConversions._

object NetworkUtility {

  /**
   * Build A Message for Autodiscovery
   * Need to be improve with Cache & Interface Listener
   */
  def buildDiscoveryMessage(nodeName : String, modelDispatcherPort : Int, msgDispatcherPort : Int ) : Art2DiscoveryMessage = {
    var msg = new Art2DiscoveryMessage
    NetworkInterface.getNetworkInterfaces.foreach{it =>
      var loopBackAddr = it.getInetAddresses.exists(itaddr=> itaddr.isLoopbackAddress)
      /* DO NOT EXPOSE LOCAL HOST INTERFACE */
      if( (!loopBackAddr)){
        it.getInetAddresses.foreach{addr =>
          msg.getIps.add(addr.getHostAddress)
        }
      }
    }
    msg.setNodeName(nodeName)
    msg.setModel_dispatcher_port(modelDispatcherPort)
    msg.setMsg_dispatcher_port(msgDispatcherPort)
    msg
  }


  /**
   * Checks to see if a specific port is available.
   *
   * @param port the port to check for availability
   */
  def available(port:Int) : Boolean = {
    /*
     if (port < MIN_PORT_NUMBER || port > MAX_PORT_NUMBER) {
     throw new IllegalArgumentException("Invalid start port: " + port);
     }*/

    var ss : ServerSocket = null;
    var ds : DatagramSocket = null;
    try {
      ss = new ServerSocket(port);
      ss.setReuseAddress(true);
      ds = new DatagramSocket(port);
      ds.setReuseAddress(true);
      return true;
    } catch {
      case e : IOException =>
    } finally {
      if (ds != null) {
        ds.close();
      }

      if (ss != null) {
        try {
          ss.close();
        } catch {
          case e : IOException =>
            /* should not be thrown */
        }
      }
    }
    return false;
  }

}
