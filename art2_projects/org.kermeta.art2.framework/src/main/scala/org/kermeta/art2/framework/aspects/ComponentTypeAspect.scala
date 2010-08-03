/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.aspects

import org.kermeta.art2._
import scala.collection.JavaConversions._
import Art2Aspects._

case class ComponentTypeAspect(ct : ComponentType) {

  def isModelEquals(pct : ComponentType) : Boolean = {
    pct.getName == ct.getName
    /* deep compare */
  }

}
