package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._

trait FunctionTypeAspect extends RichAspectImplicit with ObjectAspect {
	
  override def generateScalaCode(res : StringBuilder) : Unit = {
	  this.getLeft().generateScalaCode(res)
	  res.append(" => ")
	  this.getRight().generateScalaCode(res)
  }
  
}
