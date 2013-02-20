package org.kermeta.language.compiler.visitor

trait IVisitorAsync extends Runnable {

	def init(init : IVisitable,visitor : IVisitor)
        
}
