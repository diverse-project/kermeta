package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import _root_.java.util._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait KermetaModelElementAspect extends LogAspect {
  
  def generateScalaCode(res : StringBuilder) : Unit = {
	  log.debug("KermetaModelElementAspect Generate")
	  res.append("/*TODO GenScalaCode "+ this.getClass +" */")
  }
  
  def getQualifiedNameCompilo():String ={return ""}

  
}
