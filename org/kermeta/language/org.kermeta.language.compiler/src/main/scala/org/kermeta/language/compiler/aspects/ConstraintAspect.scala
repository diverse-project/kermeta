package org.kermeta.language.compiler.aspects

import scala.collection.JavaConversions._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.RichAspectImplicit._

trait ConstraintAspect extends ObjectAspect with LogAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		log.debug("Generate Constraint {}",this.getName)
		res.append("{\n")
		this.getBody().generateScalaCode(res)
		res.append("}\n")
	}

}
