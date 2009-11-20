package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait CallVariableAspect extends EcoreRichAspectImplicit with ObjectAspect {
	 
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append(this.getName())
	}
	/*
def generateVisitor(tabsString 	: String) : String = { 
				  var returnString : String = "";
		 returnString = returnString+ this.getName
		 
//			returnString = returnString+value.getParameters.foreach(par=> par.generateVisitor(tabsString))	
//    	 returnString = returnString+ ")"
    	 return returnString;

	}  */
}
