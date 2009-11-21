package fr.irisa.triskell.kermeta.compilo.scala

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._ 
import fr.irisa.triskell.kermeta.compilo.scala.loader._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._
import fr.irisa.triskell.kermeta.compilo.scala.visitor.impl._

object Main extends EcoreRichAspectImplicit {
  def main(args : Array[String]) : Unit = {
		  
		   
		  
	  var t: LoadModelHelper = new LoadModelHelper()  ;
	  BehaviorPackage.eINSTANCE.setEFactoryInstance(new fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl());
	  StructurePackage.eINSTANCE.setEFactoryInstance(new fr.irisa.triskell.kermeta.compilo.scala.rich.RichStructureFactoryImpl());
		  
	      
	//var v : ModelingUnit = t.loadKM("tp1.km");  
	//var v : ModelingUnit = t.loadKM("../compilerv2_test/helloWorld/HelloWorld.km");  
//	var v : ModelingUnit = t.loadKM("../compilerv2_test/testAssignement/testAssignement2.km")
	var v : ModelingUnit = t.loadKM("../compilerv2_test/testAssignement/testAssignement.km") 
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
  }
}
