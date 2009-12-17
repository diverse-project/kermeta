package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._

trait TypeLiteralAspect extends RichAspectImplicit with ObjectAspect {
	
	implicit def rich (xs : TypeLiteralAspect) = xs.asInstanceOf[TypeLiteral]
	 
	override def generateScalaCode(res : StringBuilder) : Unit = {
		/*if (this.getTyperef.getType.isInstanceOf[ParameterizedType]){
			if (Util.hasEcoreTag(this.getTyperef.getType.asInstanceOf[ParameterizedType].getTypeDefinition)){ 
				res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(
						this.getTyperef.getType.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition].eContainer.asInstanceOf[Package].getQualifiedName))
								res.append(".")

			}
		}*/
		
		println("toto " +this.getTyperef().getType.getQualifiedNameCompilo())
		res.append(this.getTyperef().getType.getQualifiedNameCompilo())
	}
	

}
 