package org.kermeta.language.compiler.aspects.sub

import org.antlr.stringtemplate.StringTemplate
import org.kermeta.language.behavior.Block
import org.kermeta.language.compiler.Util
import scala.collection.JavaConversions._
import org.kermeta.language.compiler.aspects.ImplicitAspects._

trait BlockAspect extends ObjectAspect {

  lazy val BlockAspect_self = self.asInstanceOf[Block]
  
  override def generateScalaCode(res : StringBuilder) : Unit = {
    res.append("\n\n")
    var template = new StringTemplate("try {\n $body$ \n} catch {\n $catchBody$ }\n")
    var body,catchBody = new StringBuilder
    Util.generateScalaCodeEach(body,BlockAspect_self.getStatement(),"\n") //BODY GEN
    BlockAspect_self.getRescueBlock().foreach(b => { b.generateScalaCode(catchBody) }) //CATCH GEN
    //RESULT GEN
    if(BlockAspect_self.getRescueBlock().size() > 0){
      template.setAttribute("body", body.toString)
      template.setAttribute("catchBody", catchBody)
      res.append(template.toString)
    } else {
      res.append("{\n"+body.toString+"}\n")
    }

  }
}
case class RichBlock(_self : Block) extends BlockAspect { self = _self  }
  