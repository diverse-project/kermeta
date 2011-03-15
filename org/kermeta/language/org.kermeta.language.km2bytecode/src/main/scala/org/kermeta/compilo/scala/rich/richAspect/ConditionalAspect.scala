package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import java.util._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait ConditionalAspect extends ObjectAspect {
	 
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append("if (")
		this.getCondition().generateScalaCode(res)
		res.append(")")
		this.getThenBody().generateScalaCode(res)
		if(this.getElseBody()!=null){
			res.append("else \n")
			this.getElseBody().generateScalaCode(res)
		}
	}

}
