package org.kermeta.language.compiler.aspects

import scala.collection.JavaConversions._
import org.kermeta.language._
import org.kermeta.language.compiler.Util
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import java.util._
import org.kermeta.language.compiler.RichAspectImplicit._

trait CallValueAspect extends ObjectAspect with LogAspect {

    override def generateScalaCode(res : StringBuilder) : Unit = {
        log.debug("CallValue={}",this.getName())
        res.append(Util.protectScalaKeyword(this.getName()))

        if (this.getParameters().size>0){
            res.append("(")
            this.getParameters().foreach(par => par.generateScalaCode(res))
            res.append(")")
        }
    }
	 
}
