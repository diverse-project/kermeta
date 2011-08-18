package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import java.util._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait DataTypeAspect extends KermetaModelElementAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
           // println("passe pa la " + this.getName)
            res.append(this.eContainer().asInstanceOf[Package].getQualifiedName)
		res.append(".")
		res.append(this.getName())
	}

}
