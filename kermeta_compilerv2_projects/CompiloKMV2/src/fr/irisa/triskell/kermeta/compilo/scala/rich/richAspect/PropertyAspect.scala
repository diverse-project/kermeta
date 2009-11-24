package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait PropertyAspect extends EcoreRichAspectImplicit with ObjectAspect {
	
	implicit def rich (xs : PropertyAspect) = xs.asInstanceOf[Property]
	
override def generateScalaCode(res : StringBuilder) : Unit = {
	if (Util.hasEcoreTag(this.getOwningClass)){
		 	if (Util.hasEcoreTag(this)){
		 		generateScalGet(res)
		 		generateScalSet(res)
		 	}else {	
		 		generateAttribute(res)
		 		generateGet(res)
		 		generateSet(res)
		 		generateScalGet(res)
		 		generateScalSet(res)

		 		//TODO générer getter et setter si property ajouté par un ecore
		 	}
//		 		value.getGetterBody
//		 		value.getSetterBody
	}else {
		 generateAttribute(res)
		 generateGet(res)
		 generateSet(res)
		 generateScalGet(res)
		 generateScalSet(res)

	}
} 
	  
def generateAttribute(res : StringBuilder) : Unit ={
	res.append("var ")
	res.append(this.getName())
	res.append(" : ")
	if (this.getUpper>1){
			if (this.isIsOrdered){
				res.append("java.util.List[")
			}else{
				res.append("java.util.List[")        
			}
			this.getType().generateScalaCode(res)
			res.append("] = new java.util.ArrayList[")
			this.getType().generateScalaCode(res)
			res.append("]")

	} else {
		this.getType().generateScalaCode(res) 
		res.append("= _")

	}
	res.append("\n")
	}

	def generateGet(res : StringBuilder) : Unit ={
	res.append("def get")
	res.append(this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size) + "()")
	res.append(" : ")
	getListorType(res)
	res.append("={this." + this.getName + "}")

	
	res.append("\n")
	}

	def generateScalGet(res : StringBuilder) : Unit ={
		res.append("def "+GlobalConfiguration.scalaPrefix)
		res.append(this.getName+"")
		res.append(" : ")
		getListorType(res)
		var s: StringBuilder = new StringBuilder
		this.getType().asInstanceOf[GenerateScalaCodeAspect].generateScalaCode(s)
		res.append("={this.")
		if (s.toString.equals("Boolean")){
			res.append("is")
		}else
		{
			res.append("get")
		}
		res.append( this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size) + "()" + "}")		
		res.append("\n")
	}

	
	def generateSet(res : StringBuilder) : Unit ={
		if (!this.isIsReadOnly()){
			res.append("def set")
			res.append(this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size)+"(arg:")
			getListorType(res)
			res.append(")={ this." + this.getName + " = arg}")
			res.append("\n")
		}
	}
	def generateScalSet(res : StringBuilder) : Unit ={
		if (!this.isIsReadOnly()){
		res.append("def "+GlobalConfiguration.scalaPrefix)
		res.append(this.getName+"_=(")
		res.append("arg : ")
		getListorType(res)
		//res.append(")={this.set" + this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size) + "(arg)" + "}")		
	if (this.getUpper>1 ||this.getUpper == -1){
		res.append(")={this.get" + this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size) + "().clear\n")
		res.append("this.get" + this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size) + "().addAll(arg)\n")
		res.append("}")		
	}else{	
		res.append(")={this.set" + this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size) + "(arg)" + "}")		
	}
		res.append("\n")
		
		}
	}

	
	def getListorType(res:StringBuilder)={
	if (this.getUpper>1 ||this.getUpper == -1){
			if (this.isIsOrdered){
				res.append("java.util.List[")
			}else{
				//TODO gestion des SETs
				res.append("java.util.List[")        
			}
			this.getType().asInstanceOf[GenerateScalaCodeAspect].generateScalaCode(res)
			res.append("]")
	} else {
		this.getType().asInstanceOf[GenerateScalaCodeAspect].generateScalaCode(res) 
	}
	
	
	}
}
