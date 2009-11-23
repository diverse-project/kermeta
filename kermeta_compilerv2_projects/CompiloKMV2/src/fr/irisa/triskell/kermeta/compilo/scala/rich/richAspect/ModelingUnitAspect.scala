package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._

import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._

trait ModelingUnitAspect extends EcoreRichAspectImplicit with ObjectAspect with IVisitable {
	/* 
	override def generateScalaCode(res : StringBuilder) : Unit = {
		//this.getPackages().foreach(p => p.generateScalaCode(res) ) 
	}*/ 
	 
	override def accept(visitor : IVisitor){
		visitor.visit(this)
	}
	
	/*
	override def generateVisitor(tabsString : String) : String = { 
		 	var returnString : String = "";
    		Util.usings = "";
    		//value.getUsings.foreach(m => m.generateVisitor(tabsString))
			this.getPackages.foreach(p=> returnString = returnString + p.generateVisitor(tabsString))
    		return returnString;	
	}  */
	/*
    override def createInherithanceTree() = {  

		//this.getPackages.foreach(p=>  Console.println(p.toString))// p.createInherithanceTree())
    	this.getPackages.foreach(p=> p.createInherithanceTree())
		//return null;   
    }  */
    
    
    
}
