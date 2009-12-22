package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala.Util

trait ProductTypeAspect extends RichAspectImplicit with ObjectAspect {
	
  override def generateScalaCode(res : StringBuilder) : Unit = {
	  res.append("(")
	  Util.generateScalaCodeEach(res,this.getType,",")
	  res.append(")")
  }
  
  
  
}
