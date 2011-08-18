package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import _root_.java.util._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait CallPropertyAspect extends CallExpressionAspect with LogAspect {
	
	



    def generateTarget(res : StringBuilder){
        if (this.getTarget()!=null){
            res.append("(")
            this.getTarget().generateScalaCode(res)
            res.append(")")
        }else{
            println("//TODODODODO " + this.getName);
        }
    }


    def generatePropertyCall(res : StringBuilder){
        var TargetType : StringBuilder = new StringBuilder
        this.getTarget().getStaticType().generateScalaCode(TargetType)
        res.append(GlobalConfiguration.scalaPrefix+k2.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, this.getName))

    }
    

    def generateName(res : StringBuilder){
        res.append(this.getName())
    }
    def generatePropertyName(res : StringBuilder){
        res.append(GlobalConfiguration.scalaPrefix + this.getName())
    }







            override def generateScalaCode(res : StringBuilder) : Unit = {
                log.debug("CallProperty={}",this.getName())
                  if(this.getTarget != null )  {generateTarget(res);res.append(".");generatePropertyCall(res) }
                 else  {generatePropertyName(res) }

            }
	
	
        }
