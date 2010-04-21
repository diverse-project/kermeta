package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._
import fr.irisa.triskell.kermeta.compilo.scala.rich.RichAspectImplicit._

trait DataTypeAspect extends ObjectAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
           // println("passe pa la " + this.getName)
            res.append(this.eContainer().asInstanceOf[Package].getQualifiedName)
		res.append(".")
		res.append(this.getName())
	}

}
