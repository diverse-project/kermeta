package kermeta.kunit
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
trait ErrorAspect extends org.eclipse.emf.ecore.impl.EObjectImpl  with fr.irisa.triskell.kermeta.language.structureScalaAspect.ObjectAspect  with KunitImplicitConversion{
var error : kermeta.kunit.Fallible= _
def getError() : kermeta.kunit.Fallible={this.error}
def setError(arg:kermeta.kunit.Fallible)={ this.error = arg}
def Scalaerror : kermeta.kunit.Fallible={this.getError()}
def Scalaerror_=(arg : kermeta.kunit.Fallible)={this.setError(arg)}
var exception : kermeta.exceptions.Exception= _
def getException() : kermeta.exceptions.Exception={this.exception}
def setException(arg:kermeta.exceptions.Exception)={ this.exception = arg}
def Scalaexception : kermeta.exceptions.Exception={this.getException()}
def Scalaexception_=(arg : kermeta.exceptions.Exception)={this.setException(arg)}
var kind : kermeta.kunit.ErrorKind.ErrorKind= _
def getKind() : kermeta.kunit.ErrorKind.ErrorKind={this.kind}
def setKind(arg:kermeta.kunit.ErrorKind.ErrorKind)={ this.kind = arg}
def Scalakind : kermeta.kunit.ErrorKind.ErrorKind={this.getKind()}
def Scalakind_=(arg : kermeta.kunit.ErrorKind.ErrorKind)={this.setKind(arg)}

   def makeTearDown():kermeta.kunit.Error = {
var result : kermeta.kunit.Error = null.asInstanceOf[kermeta.kunit.Error]; 
{
kind = ErrorKind.tearDownError
result = this
}
 return result
}

   def makeSetUp():kermeta.kunit.Error = {
var result : kermeta.kunit.Error = null.asInstanceOf[kermeta.kunit.Error]; 
{
kind = ErrorKind.setUpError
result = this
}
 return result
}

   override def toString():java.lang.String = {
var result : java.lang.String = null.asInstanceOf[java.lang.String]; 
{
if (kind.equals(ErrorKind.testError)){
result = error.toString()
}
{
result = error.getMetaClass().getName.plus(".")
if (kind.equals(ErrorKind.setUpError)){
result = result.plus("setUp()")
}
{
result = result.plus("tearDown()")
}

}

result = result.plus(" raised ").plus(exception.getMetaClass().getName)
if (exception.message.isNotEqual(null)){
result = result.plus("\n    Caused by: ").plus(exception.message)
}
{
result = result.plus("\n    (no message)")
}

if (exception.stackTrace.isNotEqual(null)){
result = result.plus("\n    Stack Trace:\n").plus(exception.stackTrace)
}
{
result = result.plus("\n    (no stack trace)")
}

}
 return result
}

   def initFrom(error : kermeta.kunit.Fallible, e : kermeta.exceptions.Exception):kermeta.kunit.Error = {
var result : kermeta.kunit.Error = null.asInstanceOf[kermeta.kunit.Error]; 
{
this.error = error
exception = e
kind = ErrorKind.testError
result = this
}
 return result
}
}

