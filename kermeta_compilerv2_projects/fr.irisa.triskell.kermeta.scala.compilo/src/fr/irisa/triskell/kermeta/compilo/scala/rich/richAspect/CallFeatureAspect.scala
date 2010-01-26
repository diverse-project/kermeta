package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait CallFeatureAspect extends RichAspectImplicit with CallExpressionAspect with LogAspect {
	
	
	def generateNew(res : StringBuilder) = {
		if (this.getTarget!=null){
				if (this.getTarget.isInstanceOf[TypeLiteral]){
					if (this.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType().isInstanceOf[ParameterizedType]){
				
						var ty : TypeDefinition =this.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType().asInstanceOf[ParameterizedType].getTypeDefinition()
						res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(ty.eContainer.asInstanceOf[Package].getQualifiedName))
						if (Util.hasEcoreTag(ty.eContainer.asInstanceOf[Package]))
							res.append("ScalaAspect")
						res.append(".RichFactory.create")
						res.append(ty.getName())
						var ty1 : ParameterizedType = this.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType().asInstanceOf[ParameterizedType]
						//var i = 0;
						if (ty1.getTypeParamBinding().size > 0){
							res.append("[")	
							Util.generateScalaCodeEach(res,ty1.getTypeParamBinding(),",")
							//ty1.getTypeParamBinding().foreach{e=> if (i>0) res.append(",")	; e.getType().generateScalaCode(res);i=i+1}
							res.append("]")	
						}
					}else{//TODO gérer l'initialisation des types paramétrés
						res.append("null.asInstanceOf[" + this.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType().getQualifiedNameCompilo() + "]")
					}
				}else{
					this.getTarget.asInstanceOf[ObjectAspect].generateScalaCode(res)
				}
			}
	}
	
	def generateTarget(res : StringBuilder){
		if (this.getTarget()!=null){
			this.getTarget().generateScalaCode(res)
		}else{
			println("//TODODODODO " + this.getName);
		}
	}
	def generateParam(res : StringBuilder,openS : String,closeS : String){
		res append openS 
		Util.generateScalaCodeEach(res,this.getParameters,", ")
		res append closeS
	}
	
	def generatePropertyCall(res : StringBuilder){
		var TargetType : StringBuilder = new StringBuilder
		this.getTarget().getStaticType().generateScalaCode(TargetType)
		res.append(GlobalConfiguration.scalaPrefix+kermeta.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, this.getName))
		
	}
	def generateOperationCall(res : StringBuilder){
		var TargetType : StringBuilder = new StringBuilder
		this.getTarget().getStaticType().generateScalaCode(TargetType)
		res.append(kermeta.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, this.getName))
	}
	
	def generateName(res : StringBuilder){
		res.append(this.getName())
	}
	def generatePropertyName(res : StringBuilder){
		res.append(GlobalConfiguration.scalaPrefix + this.getName())
	}
	
	def generateKUnitCase(res : StringBuilder){
		this.getTarget().generateScalaCode(res)
		res append ".run("
		var i = 0
		this.getParameters.foreach(e=> {
			if(i != 0) { res append ", " }
			res append "classOf[" 
         	var className :StringBuilder = new StringBuilder
         	e.generateScalaCode(className)
         	className.insert(className.lastIndexOf(".")+1,"Rich")
         	res.append(className.toString())
         	res append "]"
			i = i + 1
		})
		res append ")"
	}

	override def generateScalaCode(res : StringBuilder) : Unit = {
		log.debug("CallFeature={}",this.getName())
		this.getName match {
			case "toString" => { res.append("(");generateTarget(res);res.append("+\"\")")  }
			case "isNotEqual" => {generateTarget(res);res.append(" != ");generateParam(res,"(",")")}
			case "isEqual" => {generateTarget(res);res.append(" == ");generateParam(res,"(",")")}
			case "run" if(this.getTarget != null) => generateKUnitCase(res)
			case "asType" => {generateTarget(res);res.append(".asInstanceOf");generateParam(res,"[","]")}
			case "isKindOf" => {generateTarget(res);res.append(".isInstanceOf");generateParam(res,"[","]")}
			case "asKindOf" => {generateTarget(res);res.append(".asInstanceOf");generateParam(res,"[","]")}
			case "isInstanceOf" => {generateTarget(res);res.append(".isInstanceOf");generateParam(res,"[","]")}
			case "new" => generateNew(res)
			case _ if(this.getTarget != null && this.getStaticOperation!=null && this.getStaticProperty==null) => {generateTarget(res);res.append(".");generateOperationCall(res);generateParam(res,"(",")")}
			case _ if(this.getTarget == null && this.getStaticOperation!=null && this.getStaticProperty==null) => {generateName(res);generateParam(res,"(",")") }
			case _ if(this.getTarget != null && this.getStaticProperty!=null && this.getStaticOperation==null) => {generateTarget(res);res.append(".");generatePropertyCall(res) }
			case _ if(this.getTarget == null && this.getStaticProperty!=null && this.getStaticOperation==null) => {generatePropertyName(res) }		
			case _ if(this.getTarget != null && this.getStaticProperty==null && this.getStaticOperation==null) => {generateTarget(res);res.append(".");generateName(res) }
			case _ => log.debug("!!! Uncatch case ")
		}	
	}
	
	
}
