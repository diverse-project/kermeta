package fr.irisa.triskell.kermeta.compilo.scala.visitor

trait IVisitorAsync extends Runnable {

	def init(init : IVisitable,visitor : IVisitor)
        
}
