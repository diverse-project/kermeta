package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._

trait PackageAspect extends RichAspectImplicit with ObjectAspect with IVisitable {
	
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
