package fr.irisa.triskell.kermeta.compilo.scala.visitor

trait IVisitable  {
	
	def accept(visitor : IVisitor)
     
}
    