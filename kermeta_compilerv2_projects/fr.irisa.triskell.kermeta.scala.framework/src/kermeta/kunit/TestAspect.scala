package kermeta.kunit
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
trait TestAspect extends org.eclipse.emf.ecore.impl.EObjectImpl  with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with KunitImplicitConversion{
var log : kermeta.kunit.Log= _
def getLog() : kermeta.kunit.Log={this.log}

def Scalalog : kermeta.kunit.Log={this.getLog()}
def Scalalog_=(arg : kermeta.kunit.Log)={this.setLog(arg)}

   def setLog(log : kermeta.kunit.Log) :Void= {
var result : Void = null.asInstanceOf[Void]; 
{
this.log = log
}
 return result
}

   def run():Void
   def initLog():kermeta.kunit.Log = {
var result : kermeta.kunit.Log = null.asInstanceOf[kermeta.kunit.Log]; 
{
this.log = kermeta.kunit.RichFactory.createLog
result = this.log
}
 return result 
}
}

