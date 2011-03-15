package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
//import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import java.util._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._
 
trait PrimitiveTypeAspect extends ObjectAspect with LogAspect {
	
    implicit def rich (xs : PrimitiveTypeAspect) = xs.asInstanceOf[PrimitiveType]

    override def generateScalaCode(res : StringBuilder) : Unit = {
		
        log.debug("PrimitiveType="+this.getName+"|"+Util.hasEcoreTag(this)+"|"+kermeta.utils.TypeEquivalence.getTypeEquivalence(this.getName))
        if (Util.hasEcoreTag(this)){
            var t1 = this.getKOwnedTags.filter(e=> "ecore.EDataType_instanceClassName".equals(e.getName))
            var t =
                if (t1 != null && t1.size>0){
                    t1.first.getValue;
                }else{
                    this.getName match {
                        case "String" => "java.lang.String"
                        case "Boolean" => "java.lang.Boolean"
                        case "Integer" => "java.lang.Integer"
                        case "UnlimitedNatural" => "java.lang.Integer"
                        case _ => {println("default "+ this.getName); "java.lang.Object"}
                    }
                }
            //   println("primitive " + t)
            res.append(kermeta.utils.TypeEquivalence.getTypeEquivalence(t))
            log.debug("PrimitiveTypeComplement="+kermeta.utils.TypeEquivalence.getTypeEquivalence(t))
            /* Check Generique Param */
            try{
                var c = java.lang.Class.forName(kermeta.utils.TypeEquivalence.getTypeEquivalence(t))
                if(c.getTypeParameters.size > 0){
                    res.append("[")
                    for(i <- 0 until c.getTypeParameters.length ){
                        res.append("org.eclipse.emf.ecore.EObject")
                        if(i < c.getTypeParameters.length -1){
                            res.append(",")
                        }
                    }
                    res.append("]")
                }
			
			
            } catch {
                case _ =>
            }
			
        }else{
            if (this.getInstanceType !=null){
                this.getInstanceType.asInstanceOf[ObjectAspect].generateScalaCode(res)
            }
            else
                res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(this.eContainer().asInstanceOf[PackageAspect].getQualifiedName)+"."+this.getName())
        }

		
		
    }
	
    override def getQualifiedNameCompilo():String ={
       // var res =  kermeta.utils.TypeEquivalence.getTypeEquivalence(this.eContainer().asInstanceOf[ObjectAspect].getQualifiedNameCompilo() + "."+ this.getName())
       var res = new StringBuilder
       this.generateScalaCode(res)
        return res.toString;
    }

        def whichBoolean():String ={
        var res =  kermeta.utils.TypeEquivalence.getTypeEquivalence(this.eContainer().asInstanceOf[ObjectAspect].getQualifiedNameCompilo() + "."+ this.getName())
       //var res = new StringBuilder
       //this.generateScalaCode(res)
      // println(res)
        return res;
    }


}
