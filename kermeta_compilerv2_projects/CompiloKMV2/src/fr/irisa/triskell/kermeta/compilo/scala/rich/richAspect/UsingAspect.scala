package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait UsingAspect extends EcoreRichAspectImplicit with ObjectAspect {
	
override def generateScalaCode(res : StringBuilder) = {
	res.append("\n")
	res.append("import ")
	res.append(this.getQualifiedName().replaceAll("::","."))
	res.append("._\n")
}
	/*
 override def generateVisitor(tabsString 	: String) : String = { 
		 	Util.usings = Util.usings + "import "+ this.getQualifiedName.replaceAll("::",".") +  "._\n";
    		
    		return null;
	} 
 */
}
