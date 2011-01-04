package org.kermeta.language.compiler.aspects

import scala.collection.JavaConversions._
import org.kermeta.language.compiler.Util
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.RichAspectImplicit._

trait ProductTypeAspect extends ObjectAspect {
	
  override def generateScalaCode(res : StringBuilder) : Unit = {
	  res.append("(")
	  Util.generateScalaCodeEach(res,this.getType,",")
	  res.append(")")
  }
  
  
  
}
