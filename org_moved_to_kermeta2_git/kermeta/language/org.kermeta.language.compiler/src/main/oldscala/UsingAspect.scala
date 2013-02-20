package org.kermeta.language.compiler.aspects

import org.kermeta.language.compiler.RichAspectImplicit._

trait UsingAspect extends ObjectAspect {
	                                                         
	override def generateScalaCode(res : StringBuilder) = {
		res.append("\n")
		res.append("import ")
		res.append(this.getQualifiedNameCompilo.replaceAll("::","."))
		res.append("._\n")
	} 
	
}
