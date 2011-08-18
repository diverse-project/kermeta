package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait ConstraintAspect extends KermetaModelElementAspect with LogAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		log.debug("Generate Constraint {}",this.getName)
		res.append("{\n")
		this.getBody().generateScalaCode(res)
		res.append("}\n")
	}


}
