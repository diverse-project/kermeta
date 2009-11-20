package fr.irisa.triskell.kermeta.compilo.scala.visitor

import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._

trait IVisitor {
	
	def visit(par : ModelingUnit)
	 
	def visit(par : Package)
	
	def visit(par : ClassDefinition)
 
}  
  