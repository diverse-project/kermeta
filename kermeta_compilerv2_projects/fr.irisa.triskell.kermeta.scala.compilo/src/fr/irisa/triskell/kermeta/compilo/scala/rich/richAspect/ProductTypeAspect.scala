package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._

trait ProductTypeAspect extends RichAspectImplicit with ObjectAspect {
	
  override def generateScalaCode(res : StringBuilder) : Unit = {
	  res.append("(")
	  var i = 0
	  for(t <- this.getType){
	 	  if(i != 0) res append " , "
	 	  t.generateScalaCode(res)
	 	  i = i + 1
	  }
	  res.append(")")
  }
  
}
