package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait FunctionTypeAspect extends ObjectAspect {
	
  override def generateScalaCode(res : StringBuilder) : Unit = {
	  log.debug("FonctionType,{}",this.getLeft.toString)
	  this.getLeft().generateScalaCode(res)
	  res.append(" => ")
	  this.getRight().generateScalaCode(res)
  }
  
}
