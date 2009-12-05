package kermeta.kunit
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
trait TestCaseAspect extends org.eclipse.emf.ecore.impl.EObjectImpl  with kermeta.kunit.TestAspect with kermeta.kunit.FallibleAspect with KunitImplicitConversion{
var __testMethodName : java.lang.String= _ 
def get__testMethodName() : java.lang.String={this.__testMethodName}
def set__testMethodName(arg:java.lang.String)={ this.__testMethodName = arg}
def Scala__testMethodName : java.lang.String={this.get__testMethodName()}
def Scala__testMethodName_=(arg : java.lang.String)={this.set__testMethodName(arg)} 

var __tesMethod : java.lang.reflect.Method= _ 
var __tearDownMethod : java.lang.reflect.Method= _ 

   def setUp():Void = {
var result : Void = null.asInstanceOf[Void]; 
{
}
 return result
}

   def raiseIfHasFailures():Void = {
var result : Void = null.asInstanceOf[Void]; 
{
var msg : java.lang.String = ""
if (log.failures.empty().not()){
msg = "Failures: "
log.failures.each({f=>{
msg = msg.plus("\n   ").plus(f.toString())
}
})
var exception : kermeta.kunit.AssertionFailedError = kermeta.kunit.RichFactory.createAssertionFailedError
exception.message = msg
throw exception
}

if (log.errors.empty().not()){
log.errors.each({f=>{
msg = "Errors: "
msg = msg.plus("\n   ").plus(f.toString())
var exception : kermeta.exceptions.Exception = kermeta.exceptions.RichFactory.createException
exception.message = msg
throw exception
}
})
}

}
 return result
}

 override   def getLog():kermeta.kunit.Log = {
var result : kermeta.kunit.Log = null.asInstanceOf[kermeta.kunit.Log]; 
{
result = this.log
}
 return result
}

   def setTestMethodName(name : java.lang.String):kermeta.kunit.TestCase = {
var result : kermeta.kunit.TestCase = null.asInstanceOf[kermeta.kunit.TestCase]; 
{
__testMethodName = name
result = this
}
 return result 
}

   def getTestMethodName():java.lang.String = {
var result : java.lang.String = null.asInstanceOf[java.lang.String]; 
{
result = __testMethodName
}
 return result
}

  override def toString():java.lang.String = {
var result : java.lang.String = null.asInstanceOf[java.lang.String]; 
{
result = this.getMetaClass().getName.plus(".").plus(getTestMethodName()).plus("()")
}
 return result
}

   def run():kermeta.standard.Void = {
var result : kermeta.standard.Void = null.asInstanceOf[kermeta.standard.Void]; 
 //TODO
   try{
	   //TODO ce n'est pas this
	   this.__tesMethod.invoke(this)
	      if (this.__tearDownMethod != null){
			 try{		
				  this.__tearDownMethod.invoke(this )
				  }catch {case e : kermeta.exceptions.Exception => this.getLog().addTestError(this,  e)
			   }

		   }
	   	
	   	//	tearDown
					//rescue (e : exceptions::Exception)
					//	getLog.addTearDownError(self, e)
					//end
	   
	   
   }catch {
	   case e : AssertionFailedError => this.getLog().addFailure(this,  e.message + "\nstack trace:\n" +  e.stackTrace)
	   case e : kermeta.exceptions.Exception => this.getLog().addTestError(this,  e)
   }
      
   
 

  
 return result
}

   def tearDown():Void = {
var result : Void = null.asInstanceOf[Void]; 
{
}
 return result
}
}

