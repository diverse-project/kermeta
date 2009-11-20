package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait PropertyAspect extends EcoreRichAspectImplicit with ObjectAspect {
	
override def generateScalaCode(res : StringBuilder) : Unit = {
	if (Util.hasEcoreTag(this.getOwningClass)){
		 	if (Util.hasEcoreTag(this)){
		 			//Rien
		 	}else {	
		 		generateAttribute(res)
		 		//TODO générer getter et setter si property ajouté par un ecore
		 	}
//		 		value.getGetterBody
//		 		value.getSetterBody
	}else {
		 generateAttribute(res)
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
				res.append("java.util.Set[")        
			}
			this.getType()generateScalaCode(res)
			res.append("]")
	} else {
		this.getType()generateScalaCode(res) 
	}
	res.append("\n")
	}
}
