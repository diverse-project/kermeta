package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait VariableDeclAspect extends EcoreRichAspectImplicit with ObjectAspect {
	
	implicit def rich (xs : VariableDeclAspect) = xs.asInstanceOf[VariableDecl]
	 
override def generateScalaCode(res : StringBuilder) = {
	res.append("var ")
	res.append(this.getIdentifier)
	res.append(" : ")
	this.getType().generateScalaCode(res)
	res.append(" = ")
	if (this.getInitialization !=  null){
		this.getInitialization().generateScalaCode(res)
	}else{ 
		res.append("null")
	}
}
}
