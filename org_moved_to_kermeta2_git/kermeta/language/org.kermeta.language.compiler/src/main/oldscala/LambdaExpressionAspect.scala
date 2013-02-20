package org.kermeta.language.compiler.aspects

import scala.collection.JavaConversions._
import org.kermeta.language.compiler.Util
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.RichAspectImplicit._

trait LambdaExpressionAspect extends ObjectAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res append ("{(")
		Util.generateProtectedScalaCodeEach(res,this.getParameters(),",")
		res append (")=>")
		this.getBody().generateScalaCode(res)
		res.append("}")
	}
}
