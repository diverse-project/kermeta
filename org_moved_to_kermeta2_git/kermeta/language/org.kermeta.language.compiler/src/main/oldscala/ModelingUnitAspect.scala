package org.kermeta.language.compiler.aspects

import org.kermeta.language.compiler.RichAspectImplicit._
import org.kermeta.language.compiler.visitor.IVisitable
import org.kermeta.language.compiler.visitor.IVisitor

trait ModelingUnitAspect extends ObjectAspect with IVisitable {
	 
	 def accept(visitor : IVisitor){
		visitor.visit(this)
	}
	
}
