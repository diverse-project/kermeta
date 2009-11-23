package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait CallVariableAspect extends EcoreRichAspectImplicit with ObjectAspect {
	
	implicit def rich (xs : CallVariableAspect) = xs.asInstanceOf[CallVariable]
	 
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append(this.getName())
	}

}
