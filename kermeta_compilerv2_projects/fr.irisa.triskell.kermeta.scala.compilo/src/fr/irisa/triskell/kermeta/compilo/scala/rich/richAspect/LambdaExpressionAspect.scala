package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait LambdaExpressionAspect extends RichAspectImplicit with ObjectAspect {
	
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append("{")
		var i = 0
		res append ("(")
		this.getParameters().foreach({e=>
			if(i != 0){
				res.append(" , ")
			}
			 e.generateScalaCode(res)
			i = i + 1
			})
		res append (")")
		res.append("=>")
		this.getBody().generateScalaCode(res)
		res.append("}")
	}
}
