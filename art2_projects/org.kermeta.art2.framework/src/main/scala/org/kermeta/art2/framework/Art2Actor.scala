/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

import scala.actors.Actor

trait Art2Actor extends Actor {

  override def start : Actor = super.start

  def stop : Unit = exit

}
