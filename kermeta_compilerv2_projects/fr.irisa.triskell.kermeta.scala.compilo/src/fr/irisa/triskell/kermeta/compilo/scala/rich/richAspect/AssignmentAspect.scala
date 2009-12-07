package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._

trait AssignmentAspect extends RichAspectImplicit with ObjectAspect with LogAspect {
	 
	override def generateScalaCode(res : StringBuilder) : Unit = {
		log.debug("Assignment Generation")
		this.getTarget().generateScalaCode(res)
		res.append(" = ")
		this.getValue().generateScalaCode(res)
		
		/* Step looking for a cast */
		var targetClass : StringBuilder = new StringBuilder
		if (!this.isIsCast()){
			if(this.getValue().isInstanceOf[VoidLiteral]){
				this.getTarget.getStaticType.generateScalaCode(targetClass)
			}
		} else { 
    		if (this.getTarget.getStaticType.isInstanceOf[Class]){
    			this.getTarget.getStaticType.generateScalaCode(targetClass)
    		 } else {
            	 if (this.getTarget.getStaticType.isInstanceOf[NamedElement]){
            		 targetClass.append(this.getTarget.getStaticType.asInstanceOf[NamedElement].getName)
            	 } else {
            		 log.debug("TODO Assignment with Cast")
            	 }
    		 }
		}
		/* Generate Cast if found */
		if(!targetClass.toString.equals("")){
			res append ".asInstanceOf["+targetClass.toString+"]"
		}
		res.append(";")
	} 
}
