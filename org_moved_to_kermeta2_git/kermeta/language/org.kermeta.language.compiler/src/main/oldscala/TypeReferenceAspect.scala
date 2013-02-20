package org.kermeta.language.compiler.aspects

import org.kermeta.language.compiler.RichAspectImplicit._

trait TypeReferenceAspect extends ObjectAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
         //   println(this.getName + " " + this.getType)
		this.getType().generateScalaCode(res)
		
	}
}

