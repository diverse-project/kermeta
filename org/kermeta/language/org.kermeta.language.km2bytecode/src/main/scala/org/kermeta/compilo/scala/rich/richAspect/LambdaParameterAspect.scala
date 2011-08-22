package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import java.util._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait LambdaParameterAspect extends KermetaModelElementAspect {
	
	implicit def rich (xs : LambdaParameterAspect) = xs.asInstanceOf[LambdaParameter]
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append(Util.protectScalaKeyword(this.getName()))
		if(this.getType() != null) {
			res.append(" : ")
			this.getType().asInstanceOf[KermetaModelElementAspect].generateScalaCode(res)
		}
	}
}
