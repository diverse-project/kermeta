/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.aspects

import org.kermeta.art2._
import scala.collection.JavaConversions._
import Art2Aspects._


case class MBindingAspect(self : MBinding) {

  def isModelEquals(ct : MBinding) : Boolean = {
//    b.getPorts.forall({p=>
//        ct.getPorts.exists({p2 => p2.isModelEquals(p) })
//    })
//
//
//
    self.getHub.isModelEquals(ct.getHub) && self.getPort.isModelEquals(ct.getPort)

  }

}
