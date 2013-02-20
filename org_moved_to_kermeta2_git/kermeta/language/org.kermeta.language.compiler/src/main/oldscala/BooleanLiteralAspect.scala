package org.kermeta.language.compiler.aspects

import scala.collection.JavaConversions._
import java.util._
import org.kermeta.language.compiler.RichAspectImplicit._

trait BooleanLiteralAspect extends ObjectAspect {
	 
	override def generateScalaCode(res : StringBuilder) : Unit = {
          res.append(this.getValue);
	} 

}
