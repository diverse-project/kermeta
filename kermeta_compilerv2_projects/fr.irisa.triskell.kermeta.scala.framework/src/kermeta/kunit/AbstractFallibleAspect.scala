package kermeta.kunit
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
trait AbstractFallibleAspect extends org.eclipse.emf.ecore.impl.EObjectImpl  with fr.irisa.triskell.kermeta.language.structureScalaAspect.ObjectAspect with KunitImplicitConversion{

   def assertTrue(condition : Boolean):Void
   def distil(s : java.lang.String):java.lang.String = {
var result : java.lang.String = null.asInstanceOf[java.lang.String]; 
{
result = ""
var white : Boolean = false
var i : Int = 0
while (!(i.equals(s.size))) 
{
var c : java.lang.String = s.elementAt(i).toString()
if (" \n\t".indexOf(c).isGreaterOrEqual(0)){
if (white.not()){
white = true
result = result.plus(" ")
}

}
{
result = result.plus(c)
if (white){
white = false
}

}

i = i.plus(1)
}

}
 return result
}

   def assertFalseWithMsg(condition : Boolean, message : java.lang.String):Void
   def fail(msg : java.lang.String):Void
   def assertEqual(expected : java.lang.String, actual : java.lang.String):Void
   def assertFalse(condition : Boolean):Void
   def assertTrueWithMsg(condition : Boolean, message : java.lang.String):Void
   def assert(condition : Boolean):Void
   def assertSimilar(expected : java.lang.String, actual : java.lang.String):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
var exp : java.lang.String = distil(expected)
var act : java.lang.String = distil(actual)
assertWithMsg(exp.equals(act), "\nexpected\t:[".plus(exp).plus("] != \nactual  \t:[").plus(act).plus("]"))
}
 return result
}

   def assertWithMsg(condition : Boolean, msg : java.lang.String):Void}

