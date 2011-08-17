package k2.utils

object KerRichFactory {
	
	def createStringBuffer = new StringBuilder
	def createHashtable[K,T]() = new java.util.HashMap[K,T]()
                  def createStack[K] = new java.util.Stack[K]
}
