package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._

import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._

trait ModelingUnitAspect extends EcoreRichAspectImplicit with ObjectAspect with IVisitable {
	
	implicit def rich (xs : ModelingUnitAspect) = xs.asInstanceOf[ModelingUnit]
	 
	override def accept(visitor : IVisitor){
		visitor.visit(this)
	}
 
}
