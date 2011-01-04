package org.kermeta.language.compiler.aspects

trait SelfExpressionAspect extends ObjectAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append("this")
	}

}
 