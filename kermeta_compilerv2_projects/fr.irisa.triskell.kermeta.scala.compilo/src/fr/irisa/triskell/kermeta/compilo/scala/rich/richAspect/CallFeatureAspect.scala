package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait CallFeatureAspect extends RichAspectImplicit with CallExpressionAspect with LogAspect {

	override def generateScalaCode(res : StringBuilder) : Unit = {
		log.debug("CallFeature Generation {}",this.getName())
		if ("new".equals(this.getName)){ /* Cas Constructeur */
			if (this.getTarget!=null){
				var ty : TypeDefinition =this.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType().asInstanceOf[ParameterizedType].getTypeDefinition()
				res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(ty.eContainer.asInstanceOf[Package].getQualifiedName))
				if (Util.hasEcoreTag(ty.eContainer.asInstanceOf[Package]))
					res.append("ScalaAspect")
				res.append(".RichFactory.create")
				res.append(ty.getName())
				var ty1 : ParameterizedType = this.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType().asInstanceOf[ParameterizedType]
				var i = 0;
				if (ty1.getTypeParamBinding().size > 0){
					res.append("[")	
					ty1.getTypeParamBinding().foreach{e=> if (i>0) res.append(",")	; e.getType().generateScalaCode(res);i=i+1}
					res.append("]")	
					
				}
			} 
		} else { /* Cas Nominal */
			if (this.getTarget!=null){
				this.getTarget().generateScalaCode(res)
				res append "."
			}
			/* GENERATE CALL */
			if (this.getStaticProperty!=null){
				if(this.getTarget() != null){
					var TargetType : StringBuilder = new StringBuilder
					this.getTarget().getStaticType().generateScalaCode(TargetType)
					res.append(GlobalConfiguration.scalaPrefix+kermeta.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, this.getName))
				} else {
					res.append(this.getName())
				}
			} else {
				if(this.getTarget() != null){
					var subs : StringBuilder = new StringBuilder
					this.getTarget().getStaticType().generateScalaCode(subs)
					res.append(kermeta.utils.TypeEquivalence.getMethodEquivalence(subs.toString(), this.getName))
				} else {
					res append this.getName()
				}
			}
			if (this.getStaticOperation!=null){
         	  res append "(" 
         	}
			var i : Int = 1
         	this.getParameters.foreach(e=> {
         		e.generateScalaCode(res)
                if (i< this.getParameters.size()){
                	res append ", "
                }
                i=i+1
            })
         	if (this.getStaticOperation!=null){
         	  res append ")"
         	}			
		}
	}
	
}
