package kermeta.kunit
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
trait TestRunnerAspect extends org.eclipse.emf.ecore.impl.EObjectImpl  with fr.irisa.triskell.kermeta.scala.framework.language.structure.Object with KunitImplicitConversion{
var log : kermeta.kunit.Log= _
def getLog() : kermeta.kunit.Log={this.log}
def setLog(arg:kermeta.kunit.Log)={ this.log = arg}
def Scalalog : kermeta.kunit.Log={this.getLog()}
def Scalalog_=(arg : kermeta.kunit.Log)={this.setLog(arg)}

   def runTest(test : kermeta.kunit.Test):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
log = kermeta.kunit.RichFactory.createLog
test.setLog(log)
test.run()
}
 return result
}

   def printTestResult():kermeta.standard.Void = {
var result : kermeta.standard.Void = null.asInstanceOf[kermeta.standard.Void]; 
{
stdio.writeln("\n---------------------------------------------  TEST RESULTS-----------------------------------------------\n")
if (log.failures.empty().not()){
stdio.writeln("\nFailures: ")
log.failures.each({f=>{
stdio.writeln("\n   ".plus(f.toString()))
}
})
}

if (log.errors.empty().not()){
stdio.writeln("\nErrors: ")
log.errors.each({e=>{
stdio.writeln("\n   ".plus(e.toString()))
}
})
}

if (log.harnessErrors.empty().not()){
stdio.writeln("\nErrors from setUp or tearDown : ")
log.harnessErrors.each({e=>{
stdio.writeln("\n   ".plus(e.toString()))
}
})
}

stdio.writeln("\n Summary: ")
stdio.writeln("   Number of launched tests : ".plus(log.runtests.toString()))
stdio.writeln("   Number of failures : ".plus(log.failures.size().toString()))
stdio.writeln("   Number of errors : ".plus(log.errors.size().toString()))
stdio.writeln("   Number of errors in setUp or tearDown: ".plus(log.harnessErrors.size().toString()))
stdio.writeln("\n-------------------------------------------------------------------------------------------------------------------------------\n")
} 
 return result 
}

   def run(testCaseClass : java.lang.Class[_]):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
runTest(kermeta.kunit.RichFactory.createTestSuite.addAllTestCasesFrom(testCaseClass))
}
 return result
}
}

