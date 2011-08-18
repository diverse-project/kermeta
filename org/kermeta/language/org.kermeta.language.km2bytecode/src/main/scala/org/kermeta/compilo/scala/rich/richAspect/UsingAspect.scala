package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import java.util._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait UsingAspect extends KermetaModelElementAspect {
	                                                         
	override def generateScalaCode(res : StringBuilder) = {
		//res.append("\n")
		//res.append("import ")
		//res.append(this.getQualifiedName().replaceAll("::","."))
		//res.append("._\n")
	} 
	
}
