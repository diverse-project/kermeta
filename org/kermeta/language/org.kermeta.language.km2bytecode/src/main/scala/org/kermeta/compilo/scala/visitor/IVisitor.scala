package org.kermeta.compilo.scala.visitor

import org.kermeta.language._
import org.kermeta.language.structure._ 
import org.kermeta.language.behavior._

trait IVisitor {
	  
	def visit(par : ModelingUnit)
	 
	def visit(par : Package) 
	
	def visit(par : ClassDefinition)
 
	def init()
	
	def close()
}  
  


class AcceptablePackage(par: Package) extends IVisitable{
  def accept(visitor : IVisitor){
    visitor.visit(par)
  }
}

class AcceptableClassDef(cl: ClassDefinition) extends IVisitable{
  def accept(visitor : IVisitor){
    visitor.visit(cl)
  }
}

class AcceptableModelingUnit(cl: ModelingUnit) extends IVisitable{
  def accept(visitor : IVisitor){
    visitor.visit(cl)
  }
}
