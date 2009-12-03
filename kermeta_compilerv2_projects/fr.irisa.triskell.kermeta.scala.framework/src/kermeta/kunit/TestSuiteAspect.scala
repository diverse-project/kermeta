package kermeta.kunit
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
trait TestSuiteAspect extends org.eclipse.emf.ecore.impl.EObjectImpl  with kermeta.kunit.TestAspect with KunitImplicitConversion{
var tests :  java.util.List[kermeta.kunit.Test]= new java.util.ArrayList[kermeta.kunit.Test]
def getTests() : java.util.List[kermeta.kunit.Test]={this.tests}
def setTests(arg:java.util.List[kermeta.kunit.Test])={ this.tests = arg}
def Scalatests : java.util.List[kermeta.kunit.Test]={this.getTests()}
def Scalatests_=(arg : java.util.List[kermeta.kunit.Test])={this.getTests().clear
this.getTests().addAll(arg)
}

   def addAllTestCasesFrom(testCaseClass : java.lang.Class[_]):kermeta.kunit.TestSuite = {
var result : kermeta.kunit.TestSuite = null.asInstanceOf[kermeta.kunit.TestSuite]; 
{
//TODO

result = this
}
 return result
}

   def run():kermeta.standard.Void = {
var result : kermeta.standard.Void = null.asInstanceOf[kermeta.standard.Void]; 
{
tests.each({t=>{
t.setLog(log)
t.run()
}
})
}
 return result
}

   def addAllTestCasesFromAspects(testCaseClass : java.lang.Class[_], anAspect : fr.irisa.triskell.kermeta.language.structure.ClassDefinition):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
anAspect.getOwnedOperation.select({o=>{
	
if (o.getName().size.isGreaterOrEqual(4)){
o.getName.substring(0, 4).equals("test")
}
{  
false
}

}
}).each({o=>{
var testCase : kermeta.kunit.TestCase = null.asInstanceOf[kermeta.kunit.TestCase]
testCase=testCaseClass.asInstanceOf[kermeta.kunit.TestCase]
testCase.setTestMethodName(o.getName)
this.tests.add(testCase)
}
}) 
}
 return result
}
}

