package fr.irisa.triskell.kermeta.compilo.scala

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._ 
import fr.irisa.triskell.kermeta.compilo.scala.loader._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._
  
object Main extends EcoreRichAspectImplicit {
  def main(args : Array[String]) : Unit = {
		  println("toto")
	  
	  var t: LoadModelHelper = new LoadModelHelper()  ;
	
	   
	//var v : ModelingUnit = t.loadKM("FlatShort.km");  
	var v : ModelingUnit = t.loadKM("tp1.km");  
	
  	//var res = new StringBuilder
  	var visitorAspect = new ScalaAspectVisitor
  	v.accept(visitorAspect)
  	
  	var visitorImplicitFactory : ScalaFactoryAndImplicitVisitor = new ScalaFactoryAndImplicitVisitor
  	visitorImplicitFactory.init
  	v.accept(visitorImplicitFactory)
  	visitorImplicitFactory.close
  	
    //v.generateScalaCode(res)
    //Console.println(res.toString())
  }
}
