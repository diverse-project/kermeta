package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait LoopAspect extends EcoreRichAspectImplicit with ObjectAspect {
	 
	override def generateScalaCode(res : StringBuilder) : Unit = {
		this.getInitialization().generateScalaCode(res)
		res.append("\n")
		res.append("while (")
		this.getStopCondition().generateScalaCode(res)
		res.append(")\n")
		this.getBody().generateScalaCode(res)
	}
	/*
 def generateVisitor(tabsString 	: String) : String = { 
		 var returnString : String  =this.getInitialization().generateVisitor(tabsString) + "\n"; 
		returnString = returnString +"while (" +this.getStopCondition.generateVisitor(tabsString) + ")"+"\n"
		returnString = returnString +this.getBody.generateVisitor(tabsString)
		return returnString;
	}*/
}
