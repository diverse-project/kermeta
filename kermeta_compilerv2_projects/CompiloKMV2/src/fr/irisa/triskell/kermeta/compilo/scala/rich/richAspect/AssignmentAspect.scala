package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._

trait AssignmentAspect extends EcoreRichAspectImplicit with ObjectAspect {
	
	implicit def rich (xs : AssignmentAspect) = xs.asInstanceOf[Assignment]
	 
	override def generateScalaCode(res : StringBuilder) : Unit = {
		if (!this.isIsCast()){
			this.getTarget().generateScalaCode(res)
			res.append(" = ")
			this.getValue().generateScalaCode(res)
		} else { 
			this.getTarget().generateScalaCode(res)
			res.append("=") 
			var targetClass : String =""
    		if (this.getTarget.getStaticType.isInstanceOf[NamedElement])
    			 targetClass = this.getTarget.getStaticType.asInstanceOf[NamedElement].getName
             else if (this.getTarget.getStaticType.isInstanceOf[Class])
    			 targetClass = this.getTarget.getStaticType.asInstanceOf[Class].getTypeDefinition.getName
             else
            	 targetClass = "//TODO Assignement with cast"	
			this.getValue().generateScalaCode(res)
			res append ".asInstanceOf["+targetClass+"]"
		}
	} 
}
