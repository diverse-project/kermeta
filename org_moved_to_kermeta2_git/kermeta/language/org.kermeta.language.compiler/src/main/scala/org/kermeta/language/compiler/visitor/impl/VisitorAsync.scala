package org.kermeta.language.compiler.visitor.impl

import org.kermeta.language.compiler.visitor._
import org.kermeta.language.compiler._
import java.util.concurrent.Future

class VisitorAsync extends IVisitorAsync {

  
	var initValue : IVisitable = _
	var visitorValue : IVisitor = _
	
	def init(init : IVisitable,visitor : IVisitor){
		initValue = init
		visitorValue = visitor
	}
	
	def run {
		visitorValue.init()
		initValue.accept(visitorValue)
		visitorValue.close()
	}
}

object VisitorAsyncUtility {
	
	def runAfter(init : IVisitable,visitor : IVisitor){
		var runnable = new VisitorAsync
		runnable.init(init, visitor)
		Util.threadExecutor.execute(runnable)
	}
	
	def runAfterCallback(init : IVisitable,visitor : IVisitor)  ={
		var runnable = new VisitorAsync
		runnable.init(init, visitor)
		Util.threadExecutor.submit(runnable)
	}
	
}