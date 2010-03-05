package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._

trait RescueAspect extends RichAspectImplicit with ObjectAspect with LogAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		log.debug("Rescue")
		
                if(this.getExceptionType != null){
                  res.append("case "+this.getExceptionName()+":")
                  this.getExceptionType.generateScalaCode(res)
                } else {
                  res.append("case _ ")
                }
		res.append(" => {")
		this.getBody().foreach(b => {b.generateScalaCode(res);res.append("\n")})
		res.append("}\n")
	}

}
