package kermeta.kunit
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
trait AssertAspect extends org.eclipse.emf.ecore.impl.EObjectImpl  with kermeta.kunit.AbstractFallibleAspect  with KunitImplicitConversion{

   def assertTrue(condition : Boolean):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
if (condition.not()){
fail("assertTrue failed")
}

}
 return result
}

   def assertFalseWithMsg(condition : Boolean, msg : java.lang.String):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
if (condition){
fail("assertTrueWithMsg failed : ".plus(msg))
}

}
 return result
}

   def fail(msg : java.lang.String):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
var exception : kermeta.kunit.AssertionFailedError = kermeta.kunit.RichFactory.createAssertionFailedError
exception.message = msg
throw exception
}
 return result
}

   def assertEqual(expected : java.lang.String, actual : java.lang.String):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
if (expected.equals(actual).not()){
fail("assertEqual failed\nexpected\t:[".plus(expected).plus("] != \nactual\t:[").plus(actual).plus("]"))
}

}
 return result
}

   def assertFalse(condition : Boolean):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
if (condition){
fail("assertTrue number failed")
}

}
 return result
}

   def assertTrueWithMsg(condition : Boolean, msg : java.lang.String):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
if (condition.not()){
fail("assertTrueWithMsg failed : ".plus(msg))
}

}
 return result
}

   def assert(condition : Boolean):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
if (condition.not()){
fail("assert failed")
}

}
 return result
}

   def assertWithMsg(condition : Boolean, msg : java.lang.String):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
if (condition.not()){
fail("assertTrueWithMsg failed : ".plus(msg))
}

}
 return result
}
}

