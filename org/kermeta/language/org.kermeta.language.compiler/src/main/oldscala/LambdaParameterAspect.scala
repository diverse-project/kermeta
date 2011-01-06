package org.kermeta.language.compiler.aspects

import scala.collection.JavaConversions._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.RichAspectImplicit._

trait LambdaParameterAspect extends ObjectAspect {
	
	implicit def rich (xs : LambdaParameterAspect) = xs.asInstanceOf[LambdaParameter]
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append(this.getName())
		if(this.getType() != null) {
			res.append(" : ")
			this.getType().asInstanceOf[ObjectAspect].generateScalaCode(res)
		}
	}
}
