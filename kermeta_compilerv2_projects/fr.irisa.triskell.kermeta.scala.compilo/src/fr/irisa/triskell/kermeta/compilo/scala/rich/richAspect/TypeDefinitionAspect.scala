package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect



trait TypeDefinitionAspect extends ObjectAspect {
  override def generateScalaCode(res : StringBuilder) : Unit = {
	  res.append("/*TODO TypeDefinitionAspect "+ this.getClass +" */")
  }
}
