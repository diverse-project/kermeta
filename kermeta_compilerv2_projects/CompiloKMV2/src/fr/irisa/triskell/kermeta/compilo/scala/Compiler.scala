package fr.irisa.triskell.kermeta.compilo.scala

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.loader._  
import fr.irisa.triskell.kermeta.compilo.scala.visitor._
import fr.irisa.triskell.kermeta.compilo.scala.visitor.impl._
import java.util.concurrent.TimeUnit

class Compiler extends EcoreRichAspectImplicit {
	
	def compile(url : String){
		var startTime = System.currentTimeMillis /* Init time */
		
		Util.cleanFolder(GlobalConfiguration.outputFolder)
	
		var t: LoadModelHelper = new LoadModelHelper()  ;
		BehaviorPackage.eINSTANCE.setEFactoryInstance(new RichBehaviorFactoryImpl())
		StructurePackage.eINSTANCE.setEFactoryInstance(new RichStructureFactoryImpl())
		
		var v : ModelingUnit = t.loadKM(url) /* Load KM Model */
	  	var midTime= System.currentTimeMillis() - startTime
		println("Loading process complete in "+(midTime)+" millisecondes ")
		
		var visitorAspect = new ScalaAspectVisitor
		var futur = VisitorAsyncUtility.runAfterCallback(v,visitorAspect) 
  	
		var visitorImplicitFactory = new ScalaFactoryAndImplicitVisitor
		VisitorAsyncUtility.runAfter(v,visitorImplicitFactory)
  	
		futur.get /* Waiting for ScalaAspectVisitor finish submit subtask before close pool ()  */ 
		Util.threadExecutor.shutdown /* Send ended signal to pool */
		Util.threadExecutor.awaitTermination(600,TimeUnit.SECONDS) /* Waiting for all tasks finished */
		
		var endTime= System.currentTimeMillis() - startTime
		println("Compilation process complete in "+(endTime)+" millisecondes ")
	}

}
