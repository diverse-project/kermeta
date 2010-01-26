package kermeta.kunit
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
trait FailureAspect extends org.eclipse.emf.ecore.impl.EObjectImpl  with fr.irisa.triskell.kermeta.language.structureScalaAspect.ObjectAspect with KunitImplicitConversion{
var message : java.lang.String= _
def getMessage() : java.lang.String={this.message}
def setMessage(arg:java.lang.String)={ this.message = arg}
def Scalamessage : java.lang.String={this.getMessage()}
def Scalamessage_=(arg : java.lang.String)={this.setMessage(arg)}
var failure : kermeta.kunit.Fallible= _
def getFailure() : kermeta.kunit.Fallible={this.failure}
def setFailure(arg:kermeta.kunit.Fallible)={ this.failure = arg}
def Scalafailure : kermeta.kunit.Fallible={this.getFailure()}
def Scalafailure_=(arg : kermeta.kunit.Fallible)={this.setFailure(arg)}

  override   def toString():java.lang.String = {
var result : java.lang.String = null.asInstanceOf[java.lang.String]; 
{
result = failure.toString().plus(" ").plus(message)
}
 return result
}

   def initFrom(fallible : kermeta.kunit.Fallible, msg : java.lang.String):kermeta.kunit.Failure = {
var result : kermeta.kunit.Failure = null.asInstanceOf[kermeta.kunit.Failure]; 
{
failure = fallible
message = msg
result = this
}
 return result
}
}

