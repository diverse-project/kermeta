package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait CallExpressionAspect extends RichAspectImplicit with ObjectAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append(".")
		res.append(this.getName())
		res.append("(")
		this.getParameters().foreach(par=> par.generateScalaCode(res))
		res.append(")")
	}
	
}
