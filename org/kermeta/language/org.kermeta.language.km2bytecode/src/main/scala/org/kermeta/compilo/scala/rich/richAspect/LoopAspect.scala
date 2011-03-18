package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import java.util._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait LoopAspect extends ObjectAspect {
	 
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append("\n\n{")
    if (this.getInitialization.isInstanceOf[Block]){
    Util.generateScalaCodeEach(res,	this.getInitialization().asInstanceOf[Block].getStatement,"\n")
    }else{
      this.getInitialization().generateScalaCode(res)
    }
		res.append("\n")
		res.append("while (!(")
		this.getStopCondition().generateScalaCode(res)
		res.append("))\n")
		this.getBody().generateScalaCode(res)
		res.append("}")

	}
}