package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait LambdaExpressionAspect extends EcoreRichAspectImplicit with ObjectAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		this.getParameters().foreach(e=> e.generateScalaCode(res))
		res.append("=>")
		this.getBody().generateScalaCode(res)
	}
	/*
def generateVisitor(tabsString 	: String) : String = { 
		 
			var returnType :String = ""//"(";
			this.getParameters.foreach(e=>returnType = returnType + e.generateVisitor(tabsString) )
			returnType = returnType +"=>"
   			returnType = returnType + this.getBody().generateVisitor(tabsString);
//			returnType = returnType + ")";

			return returnType;
	}  */
}
