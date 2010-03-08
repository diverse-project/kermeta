package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import org.antlr.stringtemplate.StringTemplate
import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait VariableDeclAspect extends RichAspectImplicit with ObjectAspect with LogAspect {

	
	override def generateScalaCode(res : StringBuilder) = {
		log.debug("VariableDecl={}",this.getIdentifier)
		var template = new StringTemplate("var $ident$ : $type$ = $init$;")
		var typeVal,initVal = new StringBuilder
		this.getType().asInstanceOf[ObjectAspect].generateScalaCode(typeVal)
       	template.setAttribute("ident", Util.protectScalaKeyword(this.getIdentifier))
		template.setAttribute("type" , typeVal.toString)
		if(this.getInitialization !=  null){
                        //     println(" VariableDeclAspect " + this.getType + "  " + this.getInitialization())
	
			this.getInitialization().generateScalaCode(initVal)
		} else {
			initVal.append("null.asInstanceOf["+typeVal.toString+"]")
		}
		template.setAttribute("init" , initVal.toString)
		res.append(template.toString)
	}
	
	
}
