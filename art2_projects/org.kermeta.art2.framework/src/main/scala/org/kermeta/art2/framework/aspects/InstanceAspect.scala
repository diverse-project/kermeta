/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.aspects

import org.kermeta.art2._
import scala.collection.JavaConversions._
import Art2Aspects._


case class InstanceAspect(cself : org.kermeta.art2.Instance) {

  def isModelEquals(c : org.kermeta.art2.Instance) : Boolean = {
    cself.getName == c.getName
    /* TODO deep compare */
  }

}
