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
import org.slf4j.{Logger,LoggerFactory}

object Main extends LogAspect {
//	def log = LoggerFactory.getLogger(this.getClass())

    var outputStream : java.io.OutputStream=null

    def init(propertyurl:String, projectName:String, classqname:String,  operationName:String, classpath:java.util.Collection[String], args:String, outputStream : java.io.OutputStream):Unit ={

        var v = new Properties
        v.load(new FileInputStream(new File(propertyurl)))
        GlobalConfiguration.load(v)
        additionalClassPath = classpath.toList
        this.outputStream = outputStream
    }
 


    var additionalClassPath: List[String] = List()

    var result : Int = -1;
    def getResult() : Int = result ;

    def main(args : Array[String]) : Unit = {

        //STEP 0 - LOAD PROPERTIES FILE
        if (!GlobalConfiguration.init)
        {
            var resource : ResourceBundle = ResourceBundle.getBundle("kermetaCompiler")
            GlobalConfiguration.load(resource)
            println(GlobalConfiguration.outputFolder)
        }
/*       additionalClassPath = List("/home/barais/workspaces/kermetaRuntimeTest/AntWorld/libNative/native.jar"
                                  ,
          "/opt/galileo/eclipse/plugins/org.eclipse.uml2.common_1.5.0.v200905041045.jar","/opt/galileo/eclipse/plugins/org.eclipse.uml2.uml_3.0.1.v200908281330.jar"
        )*/
 /*       "/home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/kompose/fr.irisa.triskell.traceability.model_1.3.2.jar",
        "/home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/kompose/flowEMFEditor_1.0.0.jar",
    "/home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/kompose/org.kermeta.kompose.core.model_0.0.5.jar")
   */



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
	  
	   
        var compilo = new Compiler


//        inputFile = "/home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/tests/000HelloWorld.km"
        inputFile = "/home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/perfs/metamodelPruner.km"
//        inputFile = "/home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo.test/src/test/resources/perfs/001_LoadUML.km"
        if(inputFile != ""){
            log.info("KM compilation begin on "+inputFile)
                    compilo.compile(inputFile)
        } else {
            log.warn("No Input File Found ! ")
        }

        /* Scalac compilation step */
        /*var classpath =EmbettedScalaCompiler.getActualClasspath
         if (additionalClassPath != null)
         classpath = classpath ++ additionalClassPath*/


        if (scalacompile){
            //var compilationResult = EmbettedScalaCompiler.compile(GlobalConfiguration.outputFolder, GlobalConfiguration.outputBinFolder,true,classpath,useFSC)
            /* Scala runner */
            /* if(compilationResult == 0){
             EmbettedScalaRunner.run(GlobalConfiguration.outputBinFolder, "runner.MainRunner", runnerParams)
             }*/
            if (GlobalConfiguration.exec && !GlobalConfiguration.createPackage &&false){
                var classpath =EmbettedScalaCompiler.getActualClasspath
                println(classpath.mkString)
                if (additionalClassPath != null)
                    classpath = classpath ++ additionalClassPath
              //  classpath = classpath ++ List("/home/barais/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo/target/kermeta.compilo.scala-0.0.1-SNAPSHOT.jar")
                var oldOut : java.io.OutputStream = System.out
                var oldErr : java.io.OutputStream = System.err

                if (outputStream != null){
                    System.setOut(new java.io.PrintStream(outputStream))
                    System.setErr(new java.io.PrintStream(outputStream))
                }
                var compilationResult = EmbettedScalaCompiler.compile(GlobalConfiguration.outputFolder, GlobalConfiguration.outputBinFolder,true,classpath,useFSC)
                result = compilationResult
                
                //Scala runner
                if(compilationResult == 0){
                    EmbettedScalaRunner.run(GlobalConfiguration.outputBinFolder, "runner.MainRunner", runnerParams)
                }
                if (outputStream != null){
                    System.setOut(new PrintStream(oldOut))
                    System.setErr(new PrintStream(oldErr))
                }
            }else{
                result = EmbeddedMavenHelper.run(GlobalConfiguration.clean,GlobalConfiguration.createPackage, GlobalConfiguration.standalone, GlobalConfiguration.exec,  additionalClassPath,outputStream)
            }
        }
    }
}
