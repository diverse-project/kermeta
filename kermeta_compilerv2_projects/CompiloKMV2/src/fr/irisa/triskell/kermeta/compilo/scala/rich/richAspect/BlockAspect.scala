package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._

trait BlockAspect extends EcoreRichAspectImplicit with ObjectAspect {
	
	implicit def rich (xs : BlockAspect) = xs.asInstanceOf[Block]
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append("{\n") 
		this.getStatement().foreach(exp => {
			exp.generateScalaCode(res)
			res.append("\n")
		})
		res.append("}\n")
	}
	
}
  