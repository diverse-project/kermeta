package fr.irisa.triskell.kermeta.compilo.scala

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.loader._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._
import fr.irisa.triskell.kermeta.compilo.scala.visitor.impl._

object Main extends EcoreRichAspectImplicit {
  def main(args : Array[String]) : Unit = {
		  
	  var t: LoadModelHelper = new LoadModelHelper()  ;
	  BehaviorPackage.eINSTANCE.setEFactoryInstance(new RichBehaviorFactoryImpl())
	  StructurePackage.eINSTANCE.setEFactoryInstance(new RichStructureFactoryImpl())
		  
	      
	//var v : ModelingUnit = t.loadKM("tp1.km");  
	var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/000HelloWorld.km");  
	//var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/001testAssignement2.km")
	//var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/001testAssignement.km") 
 // 	var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/002_testArithm.main.km") 
//  	var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/003_testOpCall.main.km")
//  	var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/004_testOpOpCall.main.km")
  	//var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/005_testOpPkgCall.main.km")
  	//var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/006_testClosure.km")
  	//var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/010_testLoop.main.km")
  //	var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/011_testBenchmark.main.km")
  	//var res = new StringBuilder
  	var visitorAspect = new ScalaAspectVisitor
  	v.accept(visitorAspect)
  	 
  	var visitorImplicitFactory : ScalaFactoryAndImplicitVisitor = new ScalaFactoryAndImplicitVisitor
  	visitorImplicitFactory.init
  	v.accept(visitorImplicitFactory)
  	visitorImplicitFactory.close
  	println("DONE")
	   
    //v.generateScalaCode(res)
    //Console.println(res.toString())
	   
	   Util.threadExecutor.shutdown()
	   
  }
}
