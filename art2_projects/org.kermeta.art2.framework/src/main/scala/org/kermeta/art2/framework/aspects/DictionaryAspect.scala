/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.aspects

import org.kermeta.art2._
import scala.collection.JavaConversions._
import Art2Aspects._

case class DictionaryAspect(self : Dictionary) {

  def isUpdated(other : Dictionary) : Boolean = {
    if(self != null){
      if(other != null){
        self.getValues.exists(v=> {
            other.getValues.find(ov=> ov.getAttribute.getName == v.getAttribute.getName  ) match {
              case None => true
              case Some(fv)=> fv.getValue != v.getValue
            }
          })
      } else {
        true
      }
    } else {
      other != null
    }

    true
  }

}
