package org.kermeta.language.compiler.aspects

import scala.collection.JavaConversions._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.RichAspectImplicit._

trait RescueAspect extends ObjectAspect with LogAspect {
  this : Rescue =>
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		log.debug("Rescue")
		
                if(this.getExceptionType != null){
                  res.append("case "+this.getExceptionName()+":")
                  this.getExceptionType.asInstanceOf[ObjectAspect].generateScalaCode(res)
                } else {
                  res.append("case _ ")
                }
		res.append(" => {")
		this.getBody().foreach(b => {b.asInstanceOf[ObjectAspect].generateScalaCode(res);res.append("\n")})
		res.append("}\n")
	}

}
