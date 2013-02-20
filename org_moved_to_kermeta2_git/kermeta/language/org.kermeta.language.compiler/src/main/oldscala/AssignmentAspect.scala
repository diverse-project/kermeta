package org.kermeta.language.compiler.aspects

import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.RichAspectImplicit._

trait AssignmentAspect extends ObjectAspect with LogAspect {
    this : Assignment =>
    override def generateScalaCode(res : StringBuilder) : Unit = {
        log.debug("Assignment={}",this.toString)
        if (this.getIsCast.booleanValue){
            res append "try{\n"
        }
        this.getTarget().generateScalaCode(res)
        res.append(" = ")
        res append "("	
        this.getValue().generateScalaCode(res)
        res append ")"	
        /* Step looking for a cast */
        var targetClass : StringBuilder = new StringBuilder
        if (!this.getIsCast.booleanValue){
            //if(this.getValue().isInstanceOf[VoidLiteral]){
                this.getTarget.getStaticType.generateScalaCode(targetClass)
            //}
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
        if (this.getIsCast.booleanValue){
            res append "\n}catch { case e:ClassCastException => {}}\n"
        }

    }
}
