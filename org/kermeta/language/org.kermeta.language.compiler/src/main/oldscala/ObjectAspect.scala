/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.compiler.aspects

import org.kermeta.language.structure.{Object => KObject}

trait ObjectAspect {
  
  def generateScalaCode(res : StringBuilder) : Unit = {
	  res.append("/*TODO GenScalaCode "+ this.getClass +" */")
  }

  def getQualifiedNameCompilo():String ={return ""}

}
