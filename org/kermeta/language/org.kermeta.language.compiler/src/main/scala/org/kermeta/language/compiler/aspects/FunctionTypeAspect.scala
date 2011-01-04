package org.kermeta.language.compiler.aspects

import org.kermeta.language.compiler.RichAspectImplicit._

trait FunctionTypeAspect extends ObjectAspect {
	
  override def generateScalaCode(res : StringBuilder) : Unit = {
	  log.debug("FonctionType,{}",this.getLeft.toString)
	  this.getLeft().generateScalaCode(res)
	  res.append(" => ")
	  this.getRight().generateScalaCode(res)
  }
  
}
