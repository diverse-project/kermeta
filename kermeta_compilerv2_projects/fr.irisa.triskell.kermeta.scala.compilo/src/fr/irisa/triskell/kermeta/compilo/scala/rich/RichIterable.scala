package fr.irisa.triskell.kermeta.compilo.scala.rich

case class ForeachContext(actualIndice : Int,size : Int) {
	def isFirst : Boolean = actualIndice == 0
	def isLast : Boolean = actualIndice == (size-1)
}

class RichIterable[P](iter : Iterable[P]) {

	def foreachCtx(f : (P,ForeachContext)=>Unit){
		val lenght = iter.size
		var i = 0
		for(e <- iter){
			f(e.asInstanceOf[P],ForeachContext(i,lenght))
			i = i + 1
		}
	}

}
