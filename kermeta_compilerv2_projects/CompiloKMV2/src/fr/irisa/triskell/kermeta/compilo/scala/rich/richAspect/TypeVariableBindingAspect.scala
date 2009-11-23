package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait TypeVariableBindingAspect extends EcoreRichAspectImplicit with ObjectAspect {
	
	implicit def rich (xs : TypeVariableBindingAspect) = xs.asInstanceOf[TypeVariableBinding]
	 
	override def generateScalaCode(res : StringBuilder) = {
		this.getType().asInstanceOf[TypeVariableBindingAspect].generateScalaCode(res)
	}		 
}
 