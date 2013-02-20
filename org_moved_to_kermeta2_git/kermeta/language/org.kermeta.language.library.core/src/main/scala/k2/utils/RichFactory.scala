package k2.utils

object KerRichFactory {
	
	def createStringBuffer = new StringBuilder
	def createHashtable[K,T]() = new _root_.java.util.HashMap[K,T]()
    def createStack[K] = new _root_.java.util.Stack[K]
}
