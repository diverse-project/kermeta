package org.kermeta.language.compiler.aspects

trait TypeDefinitionAspect extends ObjectAspect {
  override def generateScalaCode(res : StringBuilder) : Unit = {
    res.append("/*TODO TypeDefinitionAspect "+ this.getClass +" */")
  }
}
