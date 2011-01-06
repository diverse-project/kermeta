package org.kermeta.language.compiler.aspects

import org.kermeta.language.compiler.RichAspectImplicit._

trait TypeVariableBindingAspect extends ObjectAspect {
	 
	override def generateScalaCode(res : StringBuilder) = {
		this.getType().generateScalaCode(res)
	}		 
	
}
 