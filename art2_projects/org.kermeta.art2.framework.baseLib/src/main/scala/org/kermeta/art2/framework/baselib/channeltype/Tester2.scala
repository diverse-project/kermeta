/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.baselib.channeltype

import org.kermeta.art2.framework.Art2Actor
import org.kermeta.art2.framework.message.Art2Message

object Tester2 {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

   // var channel = DefaultServiceChannelTypeFactory.createChannel();
    var channel2 = DefaultMessageChannelTypeFactory.createChannel();

  //  var c1a = channel.asInstanceOf[Art2Actor].start
    var c1a2 = channel2.asInstanceOf[Art2Actor].start

    var art2message = new Art2Message

   // c1a ! art2message
    

    c1a2 ! art2message


  //  c1a.asInstanceOf[Art2Actor].stop
    c1a2.asInstanceOf[Art2Actor].stop
    

    println("Hello, world! 2")

  }

}
