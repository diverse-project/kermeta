package org.kermeta.language.compiler.aspects

import scala.collection.JavaConversions._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.RichAspectImplicit._

trait ObjectAspect extends LogAspect {
  
  def generateScalaCode(res : StringBuilder) : Unit = {
	  log.debug("ObjectAspect Generate")
	  res.append("/*TODO GenScalaCode "+ this.getClass +" */")
  }
  
  def getQualifiedNameCompilo():String ={return ""}

  
}
