/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.aspects

import org.kermeta.art2._
import scala.collection.JavaConversions._
import Art2Aspects._

case class DeployUnitAspect(self : DeployUnit) {

  def isModelEquals(other : DeployUnit) : Boolean = {
    if(other.getName == null || self.getName == null){
      other.getUnitName == self.getUnitName && other.getGroupName == self.getGroupName && other.getVersion == self.getVersion
    } else {
      self.getName == other.getName
    }
  }

}
