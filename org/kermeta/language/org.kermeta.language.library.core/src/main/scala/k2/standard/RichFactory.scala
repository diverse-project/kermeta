package k2.standard
object KerRichFactory {
 def createSet[A] : KermetaSet[A] = { new RichKermetaSet[A] }
 def createOrderedSet[A] : KermetaOrderedSet[A] = { new RichKermetaOrderedSet[A] }
 def createSequence[A] : KermetaSequence[A] = { new RichKermetaSequence[A] }
 def createBag[A] : KermetaBag[A] = { new RichKermetaBag[A] }
 def createString : String = { new String }
 def createDouble : Double = { 0.0 }
 def createInteger : Int = { 0 }
 def createLong : Long = { 0 }
 def createShort : Short = { 0 }
 def createBoolean : java.lang.Boolean = { true }
 def createCharacter : Char = { return ' ' }
 def createStringBuffer = new java.lang.StringBuilder
 
 def isVoid(o:Any) : java.lang.Boolean = { var res: Boolean = o==null 
	if (!res && o.isInstanceOf[EObjectImplForPrimitive]){
		res = o.asInstanceOf[EObjectImplForPrimitive].isVoid
	}
	return res;
 }
 def createDate : java.util.Date = {
   new java.util.Date
 }
 
 def createRandom : java.util.Random = new java.util.Random
}

 