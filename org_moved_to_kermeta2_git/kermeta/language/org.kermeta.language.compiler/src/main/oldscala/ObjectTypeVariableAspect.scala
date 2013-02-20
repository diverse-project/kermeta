package org.kermeta.language.compiler.aspects

import scala.collection.JavaConversions._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.RichAspectImplicit._

trait ObjectTypeVariableAspect extends ObjectAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append(this.getName())	
	}
	
	override def getQualifiedNameCompilo():String ={
		return this.getName();  
	}

}
 