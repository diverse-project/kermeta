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
import fr.irisa.triskell.embedded._

object Main extends LogAspect {
  def main(args : Array[String]) : Unit = {
	  
	  var inputFile : String = ""
	  var runnerParams = List[String]()
	  var useFSC = false
	 	  
	 	  for(a <- args){
	 	 	  log.debug("Param : "+a)
	 	  }
	  

	  for (i <- 0 until args.length) args(i).replaceAll("\"", "").trim() match {
	 	  case "-help" | "-h" => println("Usage: scala Main [-help|-input INPUTFILE|-runp param1,param2|-fsc]")
	 	  case "-input" | "-i" => { 
	 	 	  var nextI : Int = i + 1
	 	 	  if(nextI < args.length){ 
	 	 	 	  inputFile = args(nextI).replaceAll("\"", "").trim()
	 	 	 	  log.debug("Input File : {}",inputFile)
	 	 	  } else {
	 	 	 	  log.warn("Parameter Error")
	 	 	  }
	 	  }
	 	  case "-runp" => {
	 	 	  var nextI : Int = i + 1
	 	 	  if(nextI < args.length){ 
	 	 	 	  runnerParams =  args(nextI).split(",").toList
	 	 	 	  log.debug("Runner Param : {}",args(nextI))
	 	 	  } else {
	 	 	 	  log.warn("Parameter Error")
	 	 	  }
	 	  }
	 	  case "-fsc" => { useFSC = true }
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
	  
 // inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/tests/068_testVariableInit.main.km"
	// inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/tests/037_testLambda.main.km"
//	 inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/tests/078_testAddVoidInReflectiveCollection.main.km"
	 //inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/tests/075_PropertyEqualityUsingEnum.main.km"
    // inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/testEcore/012_TypeFromEcore.km"
  // inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/testEcore/015_EcoreDocHelper.km"
   //inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/tests/075_PropertyEqualityUsingEnum.main.km"
<<<<<<< .mine
	//    inputFile = "/Users/ffouquet/Documents/DEV/workspaces/fr.irisa.triskell.kermeta.compiloV2/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/uml/001_LoadUML.km"
=======
//	    inputFile = "/Users/ffouquet/Documents/DEV/workspaces/fr.irisa.triskell.kermeta.compiloV2/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/uml/001_LoadUML.km"
	    	
	    inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/Art2DroolsMatcher/Art2DROOLSPatternFramework.km"
>>>>>>> .r10131
	//    inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/LoadSaveKm/0001LoadAndSaveKm.km"
   //inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/testReflection/kermeta/reflection.km"
//   inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/tests/016_testParametricClasses.main.km"
   //inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/tests/0012_kunit.km"
	  //compilo.compile("../compilerv2_test/tests/010_testLoop.main.km")
	  
	  
	  
		 
	 //inputFile = "/Users/ffouquet/Documents/DEV/workspaces/art/ART2BluePrint/src/main.km"
	  
	  //inputFile = "/Users/ffouquet/Documents/DEV/workspaces/pruner/MetamodelPruner/src/kermeta/metamodelPruner.km"
	  
	//  inputFile = "/Users/ffouquet/Documents/DEV/workspaces/fr.irisa.triskell.kermeta.compiloV2/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/testEcore/013_LoadEcore.km"
	  
	 	  inputFile = "/Users/ffouquet/Documents/DEV/workspaces/art/org.kermeta.ArtKomparator/src/kermeta/Launcher.km"
	 	  runnerParams = List("///Users/ffouquet/Documents/DEV/workspaces/runtime-artIDE/Drop/multi_sample.xmi")
		 
	  if(inputFile != ""){
	 	  log.info("KM compilation begin on "+inputFile)
		  compilo.compile(inputFile) 
	  } else {
	 	  log.warn("No Input File Found ! ")
	  }

	   /* Scalac compilation step */
<<<<<<< .mine
	   var compilationResult = EmbettedScalaCompiler.compile(GlobalConfiguration.outputFolder, GlobalConfiguration.outputBinFolder,true,EmbettedScalaCompiler.getActualClasspath,useFSC)
=======
	   var classpath : java.util.List[String] = new java.util.ArrayList[String]
	   classpath.addAll(List(System.getProperty("java.class.path")))
	  // classpath ++ "" 
	   classpath.add("/home/barais/workspaces/kermetaCompilerRuntime2/fr.irisa.triskell.kermeta.scala.compilo/outputclasspathAdditionalLib/org.kermeta.art.adapter_1.0.0.jar")
	   classpath.add("/home/barais/workspaces/kermetaCompilerRuntime2/fr.irisa.triskell.kermeta.scala.compilo/outputclasspathAdditionalLib/org.kermeta.art.model_1.1.1.jar")
	   classpath.add("/home/barais/workspaces/kermetaCompilerRuntime2/fr.irisa.triskell.kermeta.scala.compilo/outputclasspathAdditionalLib/org.kermeta.art.model.pattern_1.0.0.jar")
	   var compilationResult = EmbettedScalaCompiler.compile(GlobalConfiguration.outputFolder, GlobalConfiguration.outputBinFolder,true,classpath.toList,useFSC)
>>>>>>> .r10131
	   
	   /* Scala runner */
	   if(compilationResult == 0){
		   EmbettedScalaRunner.run(GlobalConfiguration.outputBinFolder, "runner.MainRunner", runnerParams)
	   }
	   
	   
	   
  }
}
