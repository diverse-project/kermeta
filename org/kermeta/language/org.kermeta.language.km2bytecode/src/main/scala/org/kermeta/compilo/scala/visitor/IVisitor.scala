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
  