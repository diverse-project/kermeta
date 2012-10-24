package org.kermeta.compilo.scala.visitor

import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.util.ModelingUnit

trait IVisitor {
	  
	def visit(par : ModelingUnit)
	
	def visit(par : Metamodel)
	 
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

class AcceptableMetamodel(mm: Metamodel) extends IVisitable{
  def accept(visitor : IVisitor){
    visitor.visit(mm)
  }
}

class AcceptableModelingUnit(cl: ModelingUnit) extends IVisitable{
  def accept(visitor : IVisitor){
    visitor.visit(cl)
  }
}
