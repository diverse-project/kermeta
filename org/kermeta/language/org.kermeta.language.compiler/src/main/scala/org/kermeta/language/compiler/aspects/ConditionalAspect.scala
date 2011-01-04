package org.kermeta.language.compiler.aspects

import scala.collection.JavaConversions._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.RichAspectImplicit._

trait ConditionalAspect extends ObjectAspect {
	 
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append("if (")
		this.getCondition().generateScalaCode(res)
		res.append(")")
		this.getThenBody().generateScalaCode(res)
		if(this.getElseBody()!=null){
			res.append("else \n")
			this.getElseBody().generateScalaCode(res)
		}
	}

}
