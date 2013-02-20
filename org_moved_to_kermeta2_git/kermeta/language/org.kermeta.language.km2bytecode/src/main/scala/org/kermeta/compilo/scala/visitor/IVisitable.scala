package org.kermeta.compilo.scala.visitor

trait IVisitable  {
	
	def accept(visitor : IVisitor)
        
}
    