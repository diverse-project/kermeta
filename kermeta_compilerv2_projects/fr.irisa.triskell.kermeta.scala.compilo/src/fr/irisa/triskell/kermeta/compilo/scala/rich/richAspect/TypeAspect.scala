package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.compilo.scala.rich.RichAspectImplicit._

trait TypeAspect extends ObjectAspect with LogAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		log.debug("TypeAspect")
		res append "/*TODO TYPE GENCODE */"
	}

}
