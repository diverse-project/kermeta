package org.kermeta.language.compiler.aspects

import scala.collection.JavaConversions._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.RichAspectImplicit._

trait DataTypeAspect extends ObjectAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
           // println("passe pa la " + this.getName)
            res.append(this.eContainer().asInstanceOf[Package].getQualifiedName)
		res.append(".")
		res.append(this.getName())
	}

}
