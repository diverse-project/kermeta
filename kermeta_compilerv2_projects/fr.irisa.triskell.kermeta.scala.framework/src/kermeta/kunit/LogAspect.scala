package kermeta.kunit
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
trait LogAspect extends org.eclipse.emf.ecore.impl.EObjectImpl  with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with KunitImplicitConversion{
var failures : java.util.List[kermeta.kunit.Failure]= new java.util.ArrayList[kermeta.kunit.Failure]
def getFailures() : java.util.List[kermeta.kunit.Failure]={this.failures}
def setFailures(arg:java.util.List[kermeta.kunit.Failure])={ this.failures = arg}
def Scalafailures : java.util.List[kermeta.kunit.Failure]={this.getFailures()}
def Scalafailures_=(arg : java.util.List[kermeta.kunit.Failure])={this.getFailures().clear
this.getFailures().addAll(arg) 
}
var errors : java.util.List[kermeta.kunit.Error]= new java.util.ArrayList[kermeta.kunit.Error]
def getErrors() : java.util.List[kermeta.kunit.Error]={this.errors}
def setErrors(arg:java.util.List[kermeta.kunit.Error])={ this.errors = arg}
def Scalaerrors : java.util.List[kermeta.kunit.Error]={this.getErrors()}
def Scalaerrors_=(arg : java.util.List[kermeta.kunit.Error])={this.getErrors().clear
this.getErrors().addAll(arg)
}
var runtests : Int= 0
def getRuntests() : Int={this.runtests}
def setRuntests(arg:Int)={ this.runtests = arg}
def Scalaruntests : Int={this.getRuntests()}
def Scalaruntests_=(arg : Int)={this.setRuntests(arg)}
var harnessErrors : java.util.List[kermeta.kunit.Error]= new java.util.ArrayList[kermeta.kunit.Error]
def getHarnessErrors() : java.util.List[kermeta.kunit.Error]={this.harnessErrors}
def setHarnessErrors(arg:java.util.List[kermeta.kunit.Error])={ this.harnessErrors = arg}
def ScalaharnessErrors : java.util.List[kermeta.kunit.Error]={this.getHarnessErrors()}
def ScalaharnessErrors_=(arg : java.util.List[kermeta.kunit.Error])={this.getHarnessErrors().clear
this.getHarnessErrors().addAll(arg)
}

   def addSetUpError(test : kermeta.kunit.Fallible, e : kermeta.exceptions.Exception):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
harnessErrors.add(kermeta.kunit.RichFactory.createError.initFrom(test, e).makeSetUp())
}
 return result
}

   def addTestError(test : kermeta.kunit.Fallible, e : kermeta.exceptions.Exception):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
errors.add(kermeta.kunit.RichFactory.createError.initFrom(test, e))
}
 return result
}

   def addFailure(test : kermeta.kunit.Fallible, msg : java.lang.String):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
failures.add(kermeta.kunit.RichFactory.createFailure.initFrom(test, msg))
}
 return result
}

   def addTearDownError(test : kermeta.kunit.Fallible, e : kermeta.exceptions.Exception):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
harnessErrors.add(kermeta.kunit.RichFactory.createError.initFrom(test, e).makeTearDown())
}
 return result
}

   def newAttempt():Void = { 
var result : Void = null.asInstanceOf[Void]; 
{
if (runtests.equals(null)){
runtests = 0
}

runtests = 1.plus(runtests)
}
 return result
}
}

