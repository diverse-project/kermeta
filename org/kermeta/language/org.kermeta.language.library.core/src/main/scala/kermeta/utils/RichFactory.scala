package kermeta.utils

object RichFactory {
	
	def createStringBuffer = new StringBuilder
	def createHashtable[K,T]() = new java.util.HashMap[K,T]()
                  def createStack[K] = new java.util.Stack[K]
}
