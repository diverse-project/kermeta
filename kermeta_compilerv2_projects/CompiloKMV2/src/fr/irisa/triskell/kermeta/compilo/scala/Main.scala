/* Main.scala
 * Creation date: November 25, 2009
 * License: EPL
 * Copyright: IRISA / INRIA / Universite Rennes 1
 * Authors: Olivier BARAIS <barais@irisa.fr>
 *			Francois FOUQUET <ffouquet@irisa.fr>
 */

package fr.irisa.triskell.kermeta.compilo.scala
  
import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.loader._  
import fr.irisa.triskell.kermeta.compilo.scala.visitor._
import fr.irisa.triskell.kermeta.compilo.scala.visitor.impl._

object Main extends LogAspect {
  def main(args : Array[String]) : Unit = {
	  
	  var inputFile : String = ""
	 	  
	 	  for(a <- args){
	 	 	  log.debug("Param : "+a)
	 	  }
	  

	  for (i <- 0 until args.length) args(i).replaceAll("\"", "").trim() match {
	 	  case "-help" | "-h" => println("Usage: scala Main [-help|-input INPUTFILE]")
	 	  case "-input" | "-i" => { 
	 	 	  var nextI : Int = i + 1
	 	 	  if(nextI < args.length){ 
	 	 	 	  inputFile = args(nextI).replaceAll("\"", "").trim()
	 	 	 	  log.debug("Input File : {}",inputFile)
	 	 	  } else {
	 	 	 	  log.warn("Parameter Error")
	 	 	  }
	 	  }
	 	  case _ =>
	   }
	  
	  
	 // System.setProperty("fr.irisa.triskell", "5")
	 
	 // var t: LoadModelHelper = new LoadModelHelper()  ;
	  
	//  BehaviorPackage.eINSTANCE.setEFactoryInstance(new RichBehaviorFactoryImpl())
	//  StructurePackage.eINSTANCE.setEFactoryInstance(new RichStructureFactoryImpl())
		  
	      
	//var v : ModelingUnit = t.loadKM("tp1.km");  
	//var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/000HelloWorld.km");  
	//var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/001testAssignement2.km")
	//var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/001testAssignement.km") 
  	//var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/002_testArithm.main.km") 
//  	var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/003_testOpCall.main.km")
//  	var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/004_testOpOpCall.main.km")
  	//var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/005_testOpPkgCall.main.km")
  	//var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/006_testClosure.km")
  	
  	//var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/010_testLoop.main.km")
  	//var v : ModelingUnit = t.loadKM("../compilerv2_test/tests/011_testBenchmark.main.km")
  	//var v : ModelingUnit = t.loadKM("../compilerv2_test/testEcore/012_TypeFromEcore.km")
  	//var v : ModelingUnit = t.loadKM("../compilerv2_test/testEcore/013_LoadEcore.km")
  	//var res = new StringBuilder
  	/*
  	var visitorAspect = new ScalaAspectVisitor
  	VisitorAsyncUtility.runAfter(v,visitorAspect)
  	var visitorImplicitFactory = new ScalaFactoryAndImplicitVisitor
  	VisitorAsyncUtility.runAfter(v,visitorImplicitFactory)
  	println("DONE")
	     
	Util.threadExecutor.shutdown()
	    */ 
	   
	  var compilo = new Compiler
	  
	  //inputFile = "../compilerv2_test/testReflection/kermeta/reflection.km"
	  
	  //compilo.compile("../compilerv2_test/tests/010_testLoop.main.km")

	  //compilo.compile("../compilerv2_test/tests/006_testClosure.km")
	  if(inputFile != ""){
		  compilo.compile(inputFile)
	  } else {
	 	  log.warn("No Input File Found ! ")
	  }

	  //compilo.compile("../compilerv2_test/testEcore/012_TypeFromEcore.km")
	  //compilo.compile("../compilerv2_test/testEcore/013_LoadEcore.km")
	  //compilo.compile("../compilerv2_test/tests/013_testString.main.km"); 
	  compilo.compile("../compilerv2_test/testReflection/kermeta/reflection.km")
	  
  }
}
