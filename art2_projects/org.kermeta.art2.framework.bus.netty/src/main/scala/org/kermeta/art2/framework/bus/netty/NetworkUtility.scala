/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty

import java.io.IOException
import java.net.DatagramSocket
import java.net.ServerSocket

object NetworkUtility {


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
