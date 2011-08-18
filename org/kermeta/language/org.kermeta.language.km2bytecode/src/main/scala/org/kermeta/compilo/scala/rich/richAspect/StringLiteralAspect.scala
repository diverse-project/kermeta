package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import java.util._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait StringLiteralAspect extends KermetaModelElementAspect {

	override def generateScalaCode(res : StringBuilder) : Unit = {	
		res.append("\"")
    
                var stringlit = this.getValue
                var stringlitRes = new StringBuilder
                for (i <- 0 until stringlit.size) {
                  stringlit.charAt(i) match {
                    case '"'=> stringlitRes.append("\\");stringlitRes.append("\"")
                    case '\\' => stringlitRes.append("\\");stringlitRes.append("\\")
                    case '\n' => stringlitRes.append("\\n");
                    case '\t' => stringlitRes.append("\\t");
                    case _ @ c => stringlitRes.append(c)
        
        
                  }
                }
    
		res.append(stringlitRes.toString)//.replaceAll("\n","\\\\n").replaceAll("\t","\\\\t") )
		res.append("\"")
	} 

}