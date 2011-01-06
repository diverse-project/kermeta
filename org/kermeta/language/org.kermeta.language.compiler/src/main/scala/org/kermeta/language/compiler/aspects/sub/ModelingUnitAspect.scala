package org.kermeta.language.compiler.aspects.sub

import org.kermeta.language.compiler.RichAspectImplicit._
import org.kermeta.language.compiler.visitor.IVisitable
import org.kermeta.language.compiler.visitor.IVisitor
import org.kermeta.language.structure.ModelingUnit

trait ModelingUnitAspect extends ObjectAspect with IVisitable {

  lazy val ModelingUnitAspect_self = self.asInstanceOf[ModelingUnit]

	 def accept(visitor : IVisitor){
		visitor.visit(ModelingUnitAspect_self)
	}
	
}
case class RichModelingUnit(_self : ModelingUnit) extends ModelingUnitAspect { self = _self  }