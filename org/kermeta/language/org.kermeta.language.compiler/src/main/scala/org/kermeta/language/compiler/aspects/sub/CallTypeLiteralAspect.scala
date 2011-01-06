/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.compiler.aspects.sub

import org.kermeta.language.structure.ClassDefinition
import org.kermeta.language.structure.ParameterizedType
import scala.collection.JavaConversions._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.aspects.ImplicitAspects._

trait CallTypeLiteralAspect extends ObjectAspect {

  lazy val CallTypeLiteralAspect_self = self.asInstanceOf[CallTypeLiteral]

  override def generateScalaCode(res : StringBuilder) : Unit = {

    CallTypeLiteralAspect_self.getTyperef.getType match {
      case pt : ParameterizedType => {
          pt.getTypeDefinition match {
            case cd : ClassDefinition if(cd.getIsSingleton != null && cd.getIsSingleton.booleanValue) => res.append(cd.getQualifiedNameCompilo)
            case _ => res.append("/* TODO "+this.getClass.getSimpleName+" */")
          }
      }
      case _ => res.append("/* TODO "+this.getClass.getSimpleName+" */")

    }

  }

}
case class RichCallTypeLiteral(_self : CallTypeLiteral) extends CallTypeLiteralAspect { self = _self  }