package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect
 
import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._

trait PackageAspect extends EcoreRichAspectImplicit with ObjectAspect with IVisitable {
	
	
	/*
	override def generateScalaCode(res : StringBuilder) : Unit = {
		if(this.getName() != "ecore"){ //TODO REMOVE DEBUG MODE
			Console.println("Skip package "+this.getName)
			return
		} 
		
		if(Util.hasEcoreTag(this)){
			Console.println("//TODO GEN ECORE")
			//generateFromEcore(res)
		} else {
			if("kermeta".equals(getQualifiedName())||"kermeta.standard".equals(getQualifiedName())||"kermeta.io".equals(getQualifiedName())||"kermeta.persistence".equals(getQualifiedName())||"kermeta.utils".equals(getQualifiedName())){
				Console.println("//TODO GEN KM FW")
			} else {
				generateFromKM(res)
			}
		}
	}*/
	
	
	
	override def accept(visitor : IVisitor){
		visitor.visit(this)
	}	  
	
	def getQualifiedName():String ={
		var res : String="" 
        if (this.getNestingPackage !=null){
            res = this.getNestingPackage.getName +"."
        }
        res = res + this.getName
        return res
	}

}
