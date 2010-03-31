/* Main.scala
 * Creation date: November 25, 2009
 * License: EPL
 * Copyright: IRISA / INRIA / Universite Rennes 1
 * Authors: Olivier BARAIS <barais@irisa.fr>
 *			Francois FOUQUET <ffouquet@irisa.fr>
 */

package fr.irisa.triskell.kermeta.compilo.scala
  
import fr.irisa.triskell.kermeta.compilo.scala.rich._
import java.io.File
import java.io.FileInputStream
import java.io.PrintStream
import java.util.Properties
import java.util.ResourceBundle
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._
import fr.irisa.triskell.kermeta.compilo.scala.visitor.impl._
import fr.irisa.triskell.embedded._

object Main extends LogAspect {

  var outputStream : java.io.OutputStream=null

  def init(propertyurl:String, projectName:String, classqname:String,  operationName:String, classpath:java.util.Collection[String], args:String, outputStream : java.io.OutputStream):Unit ={

    var v = new Properties
    v.load(new FileInputStream(new File(propertyurl)))
    GlobalConfiguration.load(v)
    additionalClassPath = classpath.toList
    this.outputStream = outputStream
  }
 

  var additionalClassPath: List[String] = List()

  def main(args : Array[String]) : Unit = {

    //STEP 0 - LOAD PROPERTIES FILE
    if (!GlobalConfiguration.init)
    {
      var resource : ResourceBundle = ResourceBundle.getBundle("kermetaCompiler")
      GlobalConfiguration.load(resource)
      println(GlobalConfiguration.outputFolder)
    }

  //  additionalClassPath = List("/Users/ffouquet/Desktop/fumlKermeta.jar")
    //additionalClassPath + "/Users/ffouquet/Documents/DEV/workspaces/fr.irisa.triskell.kermeta.compiloV2/fr.irisa.triskell.kermeta.scala.compilo.output/lib/test1.jar"
   // additionalClassPath = List("/Users/ffouquet/Documents/DEV/workspaces/art/org.kermeta.art.model/target/art2.model-1.1.0-SNAPSHOT.jar")
   additionalClassPath = List("/Users/ffouquet/Documents/DEV/workspaces/art/org.kermeta.art.model/target/art2.model-1.1.0-SNAPSHOT.jar")



    var inputFile : String = ""
    var runnerParams = List[String]()
    var useFSC = false
    var scalacompile = true
	 	  
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
      case "-nocompile" =>{
          scalacompile = false
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
	  
    //      inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/tests/068_testVariableInit.main.km"
    // inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/tests/037_testLambda.main.km"
//	 inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/tests/078_testAddVoidInReflectiveCollection.main.km"
    //inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/tests/075_PropertyEqualityUsingEnum.main.km"
    // inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/testEcore/012_TypeFromEcore.km"
    // inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/testEcore/015_EcoreDocHelper.km"
    //inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/tests/075_PropertyEqualityUsingEnum.main.km"

//    inputFile = "/Users/ffouquet/Documents/DEV/workspaces/fr.irisa.triskell.kermeta.compiloV2/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/uml/001_LoadUML.km"

//    inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/uml/001_LoadUML.km"
	    	
    //    inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/Art2DroolsMatcher/Art2DROOLSPatternFramework.km"
    //       inputFile="/home/barais/workspaces/kermetaRuntimeTest/Test/src/kermeta/new_file.km"
    //    inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/LoadSaveKm/0001LoadAndSaveKm.km"
    //inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/testReflection/kermeta/reflection.km"
//   inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/tests/016_testParametricClasses.main.km"
    //inputFile = "../fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/tests/0012_kunit.km"
    //compilo.compile("../compilerv2_test/tests/010_testLoop.main.km")
	  
	  
	  
		 
    //inputFile = "/Users/ffouquet/Documents/DEV/workspaces/art/ART2BluePrint/src/main.km"
	  
    //inputFile = "/Users/ffouquet/Documents/DEV/workspaces/pruner/MetamodelPruner/src/kermeta/metamodelPruner.km"
	  
    //  inputFile = "/Users/ffouquet/Documents/DEV/workspaces/fr.irisa.triskell.kermeta.compiloV2/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/testEcore/013_LoadEcore.km"
	  
    //inputFile = "/Users/ffouquet/Documents/DEV/workspaces/art/org.kermeta.ArtKomparator/src/kermeta/Launcher.km"
    //runnerParams = List("///Users/ffouquet/Documents/DEV/workspaces/runtime-artIDE/Drop/multi_sample.xmi")
    //
    //
    //

    inputFile = "/Users/ffouquet/Documents/DEV/workspaces/art/org.kermeta.ArtDslCommand/src/kermeta/ArtDslCommand.km"

    //inputFile = "/home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/Speeds/StaticSemanticChecker.km"
    //inputFile = "/home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/reflexivity/Serializer.km"
    //inputFile = "/home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/reflexivity/reflexivity.km"
    //   inputFile = "/home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/pruner/metamodelPruner.km"
//        inputFile = "/home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/pruner/TestCollection.km"
    //inputFile = "/Users/ffouquet/NetBeansProjects/KermetaCompiler/kermeta_compilerv2_projects/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/tests/025simpleInvariant.km"

    // inputFile = "/Users/ffouquet/NetBeansProjects/KermetaCompiler/kermeta_compilerv2_projects/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/tests/022_InvWithMultipleInheritance.km"


    //  inputFile = "/Users/ffouquet/Desktop/SpeedWorkspace/SpeedsStaticSemantics-2.1.6/l1/kermeta/StaticSemanticChecker.km"

    // inputFile = "/Users/ffouquet/Desktop/FUMLStarter.km"

    //inputFile = "/Users/ffouquet/Documents/DEV/workspaces/fr.irisa.triskell.kermeta.compiloV2/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/testEcore/012_TypeFromEcore.km"

   // inputFile = "/Users/ffouquet/Documents/DEV/workspaces/fuml/fr.irisa.triskell.fuml/src/kermeta/fuml/FUMLStarter.km"


    if(inputFile != ""){
      log.info("KM compilation begin on "+inputFile)
      compilo.compile(inputFile)
    } else {
      log.warn("No Input File Found ! ")
    }

    /* Scalac compilation step */
    var classpath =EmbettedScalaCompiler.getActualClasspath
    if (additionalClassPath != null)
      classpath = classpath ++ additionalClassPath


    if (scalacompile){
      var compilationResult = EmbettedScalaCompiler.compile(GlobalConfiguration.outputFolder, GlobalConfiguration.outputBinFolder,true,classpath,useFSC)
      /* Scala runner */
      /* if(compilationResult == 0){
       EmbettedScalaRunner.run(GlobalConfiguration.outputBinFolder, "runner.MainRunner", runnerParams)
       }*/
      /* if (GlobalConfiguration.exec && !GlobalConfiguration.createPackage ){
       var classpath =EmbettedScalaCompiler.getActualClasspath
       println(classpath.mkString)
       if (additionalClassPath != null)
       classpath = classpath ++ additionalClassPath
       //classpath = classpath ++ List("/home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo/target/kermeta.compilo.scala-0.0.1-SNAPSHOT.jar")
       var oldOut : java.io.OutputStream = System.out
       var oldErr : java.io.OutputStream = System.err

       if (outputStream != null){
       System.setOut(new java.io.PrintStream(outputStream))
       System.setErr(new java.io.PrintStream(outputStream))
       }
       var compilationResult = EmbettedScalaCompiler.compile(GlobalConfiguration.outputFolder, GlobalConfiguration.outputBinFolder,true,classpath,useFSC)
       //Scala runner
       if(compilationResult == 0){
       EmbettedScalaRunner.run(GlobalConfiguration.outputBinFolder, "runner.MainRunner", runnerParams)
       }
       if (outputStream != null){
       System.setOut(new PrintStream(oldOut))
       System.setErr(new PrintStream(oldErr))
       }
       }else{*/
      EmbeddedMavenHelper.run(GlobalConfiguration.clean,GlobalConfiguration.createPackage, GlobalConfiguration.standalone, GlobalConfiguration.exec,  additionalClassPath,outputStream)
      //  }
    }
  }
}
