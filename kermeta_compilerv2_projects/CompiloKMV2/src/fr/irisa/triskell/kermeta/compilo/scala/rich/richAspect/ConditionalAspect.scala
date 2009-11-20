package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait ConditionalAspect extends EcoreRichAspectImplicit with ObjectAspect {
	 
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append("if (")
		this.getCondition().generateScalaCode(res)
		res.append(")")
		this.getThenBody().generateScalaCode(res)
		if(this.getElseBody()!=null){
			this.getElseBody().generateScalaCode(res)
		}
	}
/*	
def generateVisitor(tabsString 	: String) : String = { 
		 var returnString : String = "if (";
		 returnString = returnString+ this.getCondition.generateVisitor(tabsString)
		 returnString = returnString+")"
		 returnString = returnString+ this.getThenBody.generateVisitor(tabsString)
		 if (this.getElseBody!=null){returnString = returnString+"else"
		 returnString = returnString+ this.getElseBody.generateVisitor(tabsString)
		 }
    	 return returnString;
	} */
}
