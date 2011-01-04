package org.kermeta.language.compiler.aspects

import scala.collection.JavaConversions._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.RichAspectImplicit._

trait LoopAspect extends ObjectAspect {
	 
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append("\n\n{")
		this.getInitialization().generateScalaCode(res)
		res.append("\n")
		res.append("while (!(")
		this.getStopCondition().generateScalaCode(res)
		res.append("))\n")
		this.getBody().generateScalaCode(res)
		res.append("}")

	}
}
