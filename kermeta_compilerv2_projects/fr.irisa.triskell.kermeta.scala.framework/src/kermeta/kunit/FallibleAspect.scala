package kermeta.kunit
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
trait FallibleAspect extends org.eclipse.emf.ecore.impl.EObjectImpl  with kermeta.kunit.AbstractFallibleAspect with KunitImplicitConversion{
var stopOnFailure : Boolean= _
def isStopOnFailure() : Boolean={this.stopOnFailure}
def setStopOnFailure(arg:Boolean)={ this.stopOnFailure = arg}
def ScalastopOnFailure : Boolean={this.isStopOnFailure()}
def ScalastopOnFailure_=(arg : Boolean)={this.setStopOnFailure(arg)}
var rank : Int= _
def getRank() : Int={this.rank}
def setRank(arg:Int)={ this.rank = arg}
def Scalarank : Int={this.getRank()}
def Scalarank_=(arg : Int)={this.setRank(arg)}

   def assertTrue(condition : Boolean):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
assert(condition)
}
 return result
}

   def getLog():kermeta.kunit.Log
   def assertFalseWithMsg(condition : Boolean, message : java.lang.String):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
assertWithMsg(condition.not(), message)
}
 return result
}

   def fail(msg : java.lang.String):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
if (mustStop()){
var exception : kermeta.kunit.AssertionFailedError = kermeta.kunit.RichFactory.createAssertionFailedError
exception.message = "explicit failure: ".plus(msg)
throw exception
}
{
getLog().addFailure(this, "explicit failure: ".plus(msg))
}

}
 return result
}

   def assertEqual(expected : java.lang.String, actual : java.lang.String):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
assertWithMsg(expected.equals(actual), "\nexpected\t:[".plus(expected).plus("] != \nactual\t:[").plus(actual).plus("]"))
}
 return result
}

   def assertFalse(condition : Boolean):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
assert(condition.not())
}
 return result
}

   def assertTrueWithMsg(condition : Boolean, message : java.lang.String):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
assertWithMsg(condition, message)
}
 return result
}

   def assert(condition : Boolean):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
var number : Int = this.number()
if (condition.not()){
var msg : java.lang.String = "assertion number ".plus(number.toString()).plus(" failed")
if (mustStop()){
var exception : kermeta.kunit.AssertionFailedError = kermeta.kunit.RichFactory.createAssertionFailedError
exception.message = msg
throw exception
}
{
getLog().addFailure(this, msg)
}

}

}
 return result
}

   def number():Int = {
var result : Int = null.asInstanceOf[Int]; 
{
if (rank.isVoid()){
rank = 0
}

rank = rank.plus(1)
result = rank
}
 return result
}

   def assertWithMsg(condition : Boolean, msg : java.lang.String):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
var number : Int = this.number()
if (condition.not()){
var realMsg : java.lang.String = "assertion number ".plus(number.toString()).plus(" failed: ").plus(msg)
if (mustStop()){
var exception : kermeta.kunit.AssertionFailedError = kermeta.kunit.RichFactory.createAssertionFailedError
exception.message = realMsg
throw exception
}
{
getLog().addFailure(this, realMsg)
}

}

}
 return result
}

   def mustStop():Boolean = {
var result : Boolean = null.asInstanceOf[Boolean]; 
{
if (stopOnFailure.isVoid()){
stopOnFailure = true
}

result = stopOnFailure
}
 return result
}
}

