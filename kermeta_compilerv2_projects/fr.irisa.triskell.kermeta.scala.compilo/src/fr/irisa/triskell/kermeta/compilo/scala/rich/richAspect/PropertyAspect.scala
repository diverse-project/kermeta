package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait PropertyAspect extends RichAspectImplicit with ObjectAspect with LogAspect {
	
	
override def generateScalaCode(res : StringBuilder) : Unit = {
	if (Util.hasEcoreTag(this.getOwningClass)){
		 	if (Util.hasEcoreTag(this)){
		 		generateScalGet(res,"")
		 		generateScalSet(res,"")
		 	}else {	
		 		generateAttribute(res)
		 		generateGet(res,"Ker")
		 		generateSet(res,"Ker")
		 		generateScalGet(res,"Ker")
		 		generateScalSet(res,"Ker")

		 		//TODO générer getter et setter si property ajouté par un ecore
		 	}
//		 		value.getGetterBody
//		 		value.getSetterBody
	}else {
		 generateAttribute(res)
		 generateGet(res,"Ker")
		 generateSet(res,"Ker")
		 generateScalGet(res,"Ker")
		 generateScalSet(res,"Ker")

	}
} 
	  
def generateAttribute(res : StringBuilder) : Unit ={
	res.append("var ")
	res.append(Util.protectScalaKeyword(this.getName()))
	res.append(" : ")
	
	if (this.getUpper>1||this.getUpper == -1){
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

	def generateGet(res : StringBuilder,prefix:String) : Unit ={
	res.append("def ")
	var s: StringBuilder = new StringBuilder
	this.getType().asInstanceOf[ObjectAspect].generateScalaCode(s)
	if (s.toString.equals("Boolean")){
			res.append(prefix+"is")
	}else
	{
		res.append(prefix+"get")
	}
		
	res.append(this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size) + "()")
	res.append(" : ")
	getListorType(res)
	res.append("={this." + Util.protectScalaKeyword(this.getName()) + "}")

	
	res.append("\n")
	}

	def generateScalGet(res : StringBuilder,prefix:String) : Unit ={
		res.append("def "+GlobalConfiguration.scalaPrefix)
		res.append(this.getName+"")
		res.append(" : ")
		getListorType(res)
		var s: StringBuilder = new StringBuilder
		this.getType().asInstanceOf[ObjectAspect].generateScalaCode(s)
		res.append("={this.")
		if (s.toString.equals("Boolean")){
			res.append(prefix+"is")
		}else
		{
			res.append(prefix+"get")
		}
		res.append( this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size) + "()" + "}")		
		res.append("\n")
	}

	
	def generateSet(res : StringBuilder,prefix:String) : Unit ={
		if (!this.isIsReadOnly()){
			res.append("def "+prefix+"set")
			res.append(this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size)+"(arg:")
			getListorType(res)
			res.append(")={ this." + Util.protectScalaKeyword(this.getName()) + " = arg}")
			res.append("\n")
		}
	}
	def generateScalSet(res : StringBuilder,prefix:String) : Unit ={
		if (!this.isIsReadOnly()&& !this.isIsDerived()){
		res.append("def "+GlobalConfiguration.scalaPrefix)
		res.append(this.getName+"_=(")
		res.append("arg : ")
		getListorType(res)
		//res.append(")={this.set" + this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size) + "(arg)" + "}")		
	if (this.getUpper>1 ||this.getUpper == -1){
		res.append(")={this."+prefix+"get" + this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size) + "().clear\n")
		res.append("this."+prefix+"get" + this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size) + "().addAll(arg)\n")
		res.append("}")		
	}else{	
		res.append( ")={this."+prefix+"set" + this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size) + "(arg)" + "}")		
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
			this.getType().asInstanceOf[ObjectAspect].generateScalaCode(res)
			res.append("]")
	} else {
		this.getType().asInstanceOf[ObjectAspect].generateScalaCode(res) 
	}
	
	
	}
}
