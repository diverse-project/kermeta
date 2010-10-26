/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.port

import org.kermeta.art2.framework.Art2Actor
import org.kermeta.art2.framework.Art2Port
import org.kermeta.art2.framework.message.Art2FragmentBindMessage
import org.kermeta.art2.framework.message.Art2FragmentUnbindMessage
import org.slf4j.LoggerFactory

trait Art2RequiredPort extends Art2Port {

  def getName : String
  def getInOut : Boolean
  var delegate : Option[Art2Actor] = None
  var logger = LoggerFactory.getLogger(this.getClass);

  private var isBind : Boolean = false
  def getIsBind = isBind

  private def bind(bindmsg : Art2FragmentBindMessage) ={
    delegate = Some(bindmsg.getProxy)
    isBind = true
  }

  private def unbind(unbindmsg: Art2FragmentUnbindMessage)= {
    delegate = None
    isBind = false
  }

  override def internal_process(msg : Any) = msg match {
    case bindmsg : Art2FragmentBindMessage => { bind(bindmsg);reply(true) }
    case unbindmsg : Art2FragmentUnbindMessage => { unbind(unbindmsg);reply(true) }
      /* other kind of message send */
    case _ @ msg => {
        delegate match {
          case None => react {
              case bindmsg : Art2FragmentBindMessage => bind(bindmsg)
              case STOP_ACTOR(f) => pauseState = false ; stopRequest(f)
            }
          case Some(d) => {
              if(getInOut){
                try { reply(d !? msg) } catch { case _ @ e=> logger.error("error sending message  ",e) }
              } else {
                try { d ! msg } catch { case _ @ e=> logger.error("error sending message  ",e) }
              }
            }
        }
      }

  }
}
