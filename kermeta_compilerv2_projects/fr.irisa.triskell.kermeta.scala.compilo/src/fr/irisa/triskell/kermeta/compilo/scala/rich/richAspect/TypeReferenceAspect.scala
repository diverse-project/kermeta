package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait TypeReferenceAspect extends RichAspectImplicit with ObjectAspect {
	
	implicit def rich (xs : TypeReferenceAspect) = xs.asInstanceOf[TypeReference]
	  
	override def generateScalaCode(res : StringBuilder) : Unit = {
		//res.append(this.getName)
		this.getType().generateScalaCode(res)
		
	}
}

