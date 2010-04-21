package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.rich.RichAspectImplicit._

trait AssignmentAspect extends ObjectAspect with LogAspect {
    this : Assignment =>
    override def generateScalaCode(res : StringBuilder) : Unit = {
        log.debug("Assignment={}",this.toString)
        if (this.isIsCast()){
            res append "try{\n"
        }
		
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
            if (this.getTarget.getStaticType.isInstanceOf[Class] || this.getTarget.getStaticType.isInstanceOf[PrimitiveType]){
                this.getTarget.getStaticType.generateScalaCode(targetClass)
            }else {
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
        if (this.isIsCast()){
            res append "\n}catch { case e:ClassCastException => {}}\n"
        }

    }
}
