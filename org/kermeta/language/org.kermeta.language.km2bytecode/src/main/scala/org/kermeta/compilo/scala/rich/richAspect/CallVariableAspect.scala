package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import java.util._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait CallVariableAspect extends KermetaModelElementAspect with LogAspect {
	 
	override def generateScalaCode(res : StringBuilder) : Unit = {
		log.debug("CallVariable={}",this.getName())
		res.append(Util.protectScalaKeyword(this.getName()))
		if(this.getParameters() != null && this.getParameters().size > 0){
			res append "("
			Util.generateScalaCodeEach(res,this.getParameters(),",")
			res append ")"
		}
	}

}
