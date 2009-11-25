package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect
 
import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait PrimitiveTypeAspect extends RichAspectImplicit with ObjectAspect {
	
	implicit def rich (xs : PrimitiveTypeAspect) = xs.asInstanceOf[PrimitiveType]

	override def generateScalaCode(res : StringBuilder) : Unit = {
		if (Util.hasEcoreTag(this)){
			println("pass par primitive type " + this.getName) 
			var t = this.getOwnedTags.filter(e=> "ecore.EDataType_instanceClassName".equals(e.getName)).first.getValue;
			res.append(kermeta.utils.TypeEquivalence.getTypeEquivalence(t))
			
		}else{
		 if (this.getInstanceType !=null){
			 this.getInstanceType.generateScalaCode(res)
		 }
		 else
			 res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(this.eContainer().asInstanceOf[Package].getQualifiedName)+"."+this.getName())
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
