/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.compiler.aspects.sub

import org.kermeta.language.structure._
import org.kermeta.language.behavior._

trait EmptyExpressionAspect extends ObjectAspect {
  
  override def generateScalaCode(res : StringBuilder) : Unit = {}
  
}
case class RichEmptyExpression(_self : EmptyExpression) extends EmptyExpressionAspect { self = _self  }
