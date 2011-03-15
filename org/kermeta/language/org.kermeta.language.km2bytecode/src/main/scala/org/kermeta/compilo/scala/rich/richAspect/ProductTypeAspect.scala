package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala.Util
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait ProductTypeAspect extends ObjectAspect {
	
  override def generateScalaCode(res : StringBuilder) : Unit = {
	  res.append("(")
	  Util.generateScalaCodeEach(res,this.getType,",")
	  res.append(")")
  }
  
  
  
}
