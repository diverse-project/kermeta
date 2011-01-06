package org.kermeta.language.compiler.visitor

trait IVisitable  {
	
	def accept(visitor : IVisitor)
        
}
    