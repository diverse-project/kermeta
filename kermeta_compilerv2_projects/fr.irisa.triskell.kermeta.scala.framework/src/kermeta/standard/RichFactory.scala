package kermeta.standard
object RichFactory {
 def createSet[A] : java.util.List[A] = { new java.util.ArrayList[A] }
 def createOrderedSet[A] : java.util.List[A] = { new java.util.ArrayList[A] }
 def createSequence[A] : java.util.List[A] = { new java.util.ArrayList[A] }
 def createBag[A] : java.util.List[A] = { new java.util.ArrayList[A] }
 def createString : String = { new String }
 def createDouble : Double = { 0.0 }
 def createInteger : Int = { 0 }
 def createBoolean : java.lang.Boolean = { true }
 def createCharacter : Char = { return ' ' }
 def isVoid(o:Any) : java.lang.Boolean = { return o==null }
}

 