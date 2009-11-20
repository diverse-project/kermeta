package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait PrimitiveTypeAspect extends EcoreRichAspectImplicit with ObjectAspect {
	
override def generateScalaCode(res : StringBuilder) : Unit = {
	 if (Util.hasEcoreTag(this)){
		 res.append(this.getOwnedTags.filter(e=> "ecore.EDataType_instanceClassName".equals(e.getName)).first.getValue)
	 }
}
	/*
 def generateVisitor(tabsString 	: String) : String = { 
		if (Util.hasEcoreTag(this)){
		  return this.getOwnedTags.filter(e=> "ecore.EDataType_instanceClassName".equals(e.getName)).first.getValue
		}  
		return this.getName;
	}*/
}
