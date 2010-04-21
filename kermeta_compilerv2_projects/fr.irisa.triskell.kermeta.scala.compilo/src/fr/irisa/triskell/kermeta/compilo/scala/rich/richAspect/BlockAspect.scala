package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import org.antlr.stringtemplate.StringTemplate
import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.rich.RichAspectImplicit._

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
  