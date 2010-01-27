package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait LoopAspect extends RichAspectImplicit with ObjectAspect {
	 
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append("\n\n{")
		this.getInitialization().generateScalaCode(res)
		res.append("\n")
		res.append("while (!(")
		this.getStopCondition().generateScalaCode(res)
		res.append("))\n")
		this.getBody().generateScalaCode(res)
		res.append("}")

	}
}
