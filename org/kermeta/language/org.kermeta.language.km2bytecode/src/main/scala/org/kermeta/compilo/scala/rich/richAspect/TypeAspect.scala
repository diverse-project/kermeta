package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait TypeAspect extends KermetaModelElementAspect with LogAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		log.debug("TypeAspect")
		res append "/*TODO TYPE GENCODE */"
	}

}
