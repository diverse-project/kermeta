package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._

trait BlockAspect extends RichAspectImplicit with ObjectAspect with LogAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		log.debug("BlockAspect Generation ")
		
		if(this.getRescueBlock().size() > 0){ res.append("try ") }  
		res.append("{\n") 
		this.getStatement().foreach(exp => {
			exp.generateScalaCode(res)
			res.append("\n")
		})
		res.append("}\n")
		if(this.getRescueBlock().size() > 0){
			res.append(" catch {\n")
			this.getRescueBlock().foreach(b => { b.generateScalaCode(res) })
			res.append("}\n")
		}
	}
	
}
  