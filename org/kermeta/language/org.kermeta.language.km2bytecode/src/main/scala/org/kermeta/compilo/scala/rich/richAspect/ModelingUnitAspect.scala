package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.compilo.scala.visitor._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait ModelingUnitAspect extends ObjectAspect with IVisitable {
	 
	 def accept(visitor : IVisitor){
		visitor.visit(this)
	}
	
}
