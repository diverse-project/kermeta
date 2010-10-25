/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.aspects

import org.kermeta.art2._
import scala.collection.JavaConversions._
import Art2Aspects._

case class TypeDefinitionAspect(selfTD : TypeDefinition) {

  def isModelEquals(pct : TypeDefinition) : Boolean = {
    pct.getName == selfTD.getName
    /* deep compare */
  }

  def isUpdated(pTD : TypeDefinition) : Boolean = {
    if(selfTD.getDeployUnit != null && pTD.getDeployUnit != null ){
      selfTD.getDeployUnit.getHashcode != pTD.getDeployUnit.getHashcode
    } else {
      true
    }
  }

}
