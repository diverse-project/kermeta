/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.compiler.aspects.sub

import org.kermeta.language.structure.{Object => KObject}

trait ObjectAspect extends BaseAspect {
  
  def generateScalaCode(res : StringBuilder) : Unit = {
	  res.append("/*TODO GenScalaCode "+ self.getClass +" */")
  }

  def getQualifiedNameCompilo():String ={return ""}

}

case class RichObject(_self : KObject) extends ObjectAspect { self = _self  }
