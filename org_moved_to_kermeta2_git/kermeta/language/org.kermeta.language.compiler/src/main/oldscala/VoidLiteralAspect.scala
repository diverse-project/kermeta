package org.kermeta.language.compiler.aspects

trait VoidLiteralAspect extends ObjectAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append("null")
	}
	
}