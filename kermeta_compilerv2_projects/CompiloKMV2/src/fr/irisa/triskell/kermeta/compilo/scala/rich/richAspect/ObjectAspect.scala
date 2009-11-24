package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._


trait ObjectAspect extends GenerateScalaCodeAspect {
     
  override def generateScalaCode(res : StringBuilder) : Unit = {
	  res.append("/*TODO GenScalaCode "+ this.getClass +" */")
  }
}
