package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait ConditionalAspect extends EcoreRichAspectImplicit with ObjectAspect {
	
	implicit def rich (xs : ConditionalAspect) = xs.asInstanceOf[Conditional]
	 
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append("if (")
		this.getCondition().generateScalaCode(res)
		res.append(")")
		this.getThenBody().generateScalaCode(res)
		if(this.getElseBody()!=null){
			this.getElseBody().generateScalaCode(res)
		}
	}

}
