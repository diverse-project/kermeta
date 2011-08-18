package org.kermeta.compilo.scala.rich.richAspect



trait TypeDefinitionAspect extends KermetaModelElementAspect {
  override def generateScalaCode(res : StringBuilder) : Unit = {
	  res.append("/*TODO TypeDefinitionAspect "+ this.getClass +" */")
  }
}
