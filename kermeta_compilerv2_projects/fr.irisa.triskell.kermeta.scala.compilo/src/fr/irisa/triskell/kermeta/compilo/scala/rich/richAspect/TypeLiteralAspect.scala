package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._

trait TypeLiteralAspect extends RichAspectImplicit with ObjectAspect {
	 
	override def generateScalaCode(res : StringBuilder) : Unit = {
		/*if (this.getTyperef.getType.isInstanceOf[ParameterizedType]){
			if (Util.hasEcoreTag(this.getTyperef.getType.asInstanceOf[ParameterizedType].getTypeDefinition)){ 
				res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(
						this.getTyperef.getType.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition].eContainer.asInstanceOf[Package].getQualifiedName))
								res.append(".")

			}
		}*/
		res.append(this.getTyperef().getType.getQualifiedNameCompilo())
		/* Check Generique Param */
			try{
				var c = java.lang.Class.forName(this.getTyperef().getType.getQualifiedNameCompilo())
				if(c.getTypeParameters.size > 0){
					res.append("[")
					for(i <- 0 until c.getTypeParameters.length ){
						res.append("_")
						if(i < c.getTypeParameters.length -1){
							res.append(",")
						}
					}
					res.append("]")
				}
			} catch {
				case _ => 
			}
	}
	

}
 