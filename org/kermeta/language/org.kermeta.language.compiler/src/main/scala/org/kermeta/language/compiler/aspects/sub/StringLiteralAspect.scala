package org.kermeta.language.compiler.aspects.sub

import scala.collection.JavaConversions._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.aspects.ImplicitAspects._

trait StringLiteralAspect extends ObjectAspect {

  lazy val StringLiteralAspect_self = self.asInstanceOf[StringLiteral]

  override def generateScalaCode(res : StringBuilder) : Unit = {
    res.append("\"")
    
    var stringlit = StringLiteralAspect_self.getValue
    var stringlitRes = new StringBuilder
    for (i <- 0 until stringlit.size) {
      stringlit.charAt(i) match {
        case '"'=> stringlitRes.append("\\");stringlitRes.append("\"")
        case '\\' => stringlitRes.append("\\");stringlitRes.append("\\")
        case '\n' => stringlitRes.append("\\n");
        case '\t' => stringlitRes.append("\\t");
        case _ @ c => stringlitRes.append(c)
      }
    }
    
    res.append(stringlitRes.toString)//.replaceAll("\n","\\\\n").replaceAll("\t","\\\\t") )
    res.append("\"")
  }
}
case class RichStringLiteral(_self : StringLiteral) extends StringLiteralAspect { self = _self  }