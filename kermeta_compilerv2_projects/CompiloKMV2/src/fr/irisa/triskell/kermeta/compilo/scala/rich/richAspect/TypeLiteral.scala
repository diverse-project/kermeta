package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._


trait TypeLiteralAspect extends EcoreRichAspectImplicit with ObjectAspect {
	 
	override def generateScalaCode(res : StringBuilder) : Unit = {
		if (this.getTyperef.getType.isInstanceOf[ParameterizedType]){ 
				if (Util.hasEcoreTag(this.getTyperef.getType.asInstanceOf[ParameterizedType].getTypeDefinition)){ 
			res.append(this.getTyperef.getType.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition].eContainer.asInstanceOf[Package].getQualifiedName)
			res.append(".km")
   		}}
		res.append(this.getTyperef.getName)
	}
/*	
override def generateVisitor(tabsString 	: String) : String = { 
		 var returnString : String = "";
   		 if (Util.hasEcoreTag(this.getTyperef.getType.asInstanceOf[ParameterizedType].getTypeDefinition)){ 
   		      returnString = returnString+ this.getTyperef.getType.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition].eContainer.asInstanceOf[Package].getQualifiedName + ".km."
   		   }
		 returnString = returnString+ this.getTyperef.getName 
    	 return returnString;
	}*/
}
 