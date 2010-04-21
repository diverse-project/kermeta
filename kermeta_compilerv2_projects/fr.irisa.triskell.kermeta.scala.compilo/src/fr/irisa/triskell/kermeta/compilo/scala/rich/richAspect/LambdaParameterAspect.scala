package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._
import fr.irisa.triskell.kermeta.compilo.scala.rich.RichAspectImplicit._

trait LambdaParameterAspect extends ObjectAspect {
	
	implicit def rich (xs : LambdaParameterAspect) = xs.asInstanceOf[LambdaParameter]
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append(this.getName())
		if(this.getType() != null) {
			res.append(" : ")
			this.getType().asInstanceOf[ObjectAspect].generateScalaCode(res)
		}
	}
}
