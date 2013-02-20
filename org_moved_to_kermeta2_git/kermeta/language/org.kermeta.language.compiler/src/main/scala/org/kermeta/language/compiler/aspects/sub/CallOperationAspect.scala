/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.compiler.aspects.sub

import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.Util
import scala.collection.JavaConversions._
import org.kermeta.language.compiler.aspects.ImplicitAspects._

trait CallOperationAspect extends ObjectAspect {

  lazy val CallOperationAspect_self = self.asInstanceOf[CallOperation]

  def generateTarget(res : StringBuilder){
    if (CallOperationAspect_self.getTarget()!=null){
      res.append("(")
      CallOperationAspect_self.getTarget().generateScalaCode(res)
      res.append(").")
    }
  }

  override def generateScalaCode(res : StringBuilder) : Unit = {
    generateTarget(res)
    res.append(Util.protectScalaKeyword(CallOperationAspect_self.getName()))
    res.append("(")
    CallOperationAspect_self.getParameters().foreach(par=> par.generateScalaCode(res))
    res.append(")")
  }

}
case class RichCallOperation(_self : CallOperation) extends CallOperationAspect { self = _self  }