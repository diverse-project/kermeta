package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait StringLiteralAspect extends EcoreRichAspectImplicit with ObjectAspect {
	
	implicit def rich (xs : StringLiteralAspect) = xs.asInstanceOf[StringLiteral]

	override def generateScalaCode(res : StringBuilder) : Unit = {	
		res.append("\"")
		res.append(this.getValue.replaceAll("\n","\\\\n").replaceAll("\t","\\\\t"))
		res.append("\"")
	} 

}