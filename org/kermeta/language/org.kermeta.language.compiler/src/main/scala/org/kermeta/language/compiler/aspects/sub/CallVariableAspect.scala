/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.compiler.aspects.sub

import scala.collection.JavaConversions._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.Util
import org.kermeta.language.compiler.aspects.ImplicitAspects._

trait CallVariableAspect extends ObjectAspect {

  lazy val CallVariableAspect_self = self.asInstanceOf[CallVariable]

  override def generateScalaCode(res : StringBuilder) : Unit = {
    res.append(Util.protectScalaKeyword(CallVariableAspect_self.getName()))
    if(CallVariableAspect_self.getParameters() != null && CallVariableAspect_self.getParameters().size > 0){
      res append "("
      Util.generateScalaCodeEach(res,CallVariableAspect_self.getParameters(),",")
      res append ")"
    }
  }

}
case class RichCallVariable(_self : CallVariable) extends CallVariableAspect { self = _self  }