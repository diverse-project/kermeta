package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait ObjectAspect extends LogAspect {
	
  def generateScalaCode(res : StringBuilder) : Unit = {
	  log.debug("ObjectAspect Generate")
	  res.append("/*TODO GenScalaCode "+ this.getClass +" */")
  }
  
  def getQualifiedNameCompilo():String ={return ""}
  
}
