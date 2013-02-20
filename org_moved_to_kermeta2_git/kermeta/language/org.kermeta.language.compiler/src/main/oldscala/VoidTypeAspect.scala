package org.kermeta.language.compiler.aspects

trait VoidTypeAspect extends ObjectAspect {

	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append("kermeta.standard.Void")
	}

}
