/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.aspects

import org.kermeta.art2._
import scala.collection.JavaConversions._
import Art2Aspects._

case class TypedElementAspect(e : TypedElement) {

  def print(openSep : Char,closeSep:Char) : String = {
    var res : StringBuilder = new StringBuilder
    res.append(e.getName)
    if(e.getGenericTypes.size>0){ res.append(openSep) }
    e.getGenericTypes.foreach{gt=>
      res.append(gt.print(openSep,closeSep))

      if(gt != e.getGenericTypes.last ) res append ","
    }

    if(e.getGenericTypes.size>0){  res.append(closeSep) }
    res.toString
  }

}
