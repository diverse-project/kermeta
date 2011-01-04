package org.kermeta.language.compiler.aspects

import org.antlr.stringtemplate.StringTemplate
import org.kermeta.language.compiler.Util
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.RichAspectImplicit._
import scala.collection.JavaConversions._

trait BlockAspect extends ObjectAspect with LogAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {

		log.debug("BlockAspect Generation ")
		res.append("\n\n")
		var template = new StringTemplate("try {\n $body$ \n} catch {\n $catchBody$ }\n")
		var body,catchBody = new StringBuilder
		Util.generateScalaCodeEach(body,this.getStatement(),"\n") //BODY GEN
		this.getRescueBlock().foreach(b => { b.generateScalaCode(catchBody) }) //CATCH GEN
		//RESULT GEN
		if(this.getRescueBlock().size() > 0){
			template.setAttribute("body", body.toString)
			template.setAttribute("catchBody", catchBody)
			res.append(template.toString)
		} else {
			res.append("{\n"+body.toString+"}\n")
		}

	}
}
  