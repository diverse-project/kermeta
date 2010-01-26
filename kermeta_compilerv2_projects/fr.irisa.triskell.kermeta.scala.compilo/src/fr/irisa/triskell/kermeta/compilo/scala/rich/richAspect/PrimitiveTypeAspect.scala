import fr.irisa.triskell.kermeta.language.structureScalaAspect.ObjectAspect;
import fr.irisa.triskell.kermeta.language.structureScalaAspect.PrimitiveTypeAspect;
package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait PrimitiveTypeAspect extends RichAspectImplicit with ObjectAspect with LogAspect {
	
	implicit def rich (xs : PrimitiveTypeAspect) = xs.asInstanceOf[PrimitiveType]

	override def generateScalaCode(res : StringBuilder) : Unit = {
		
		log.debug("PrimitiveType="+this.getName+"|"+Util.hasEcoreTag(this)+"|"+kermeta.utils.TypeEquivalence.getTypeEquivalence(this.getName))
		if (Util.hasEcoreTag(this)){
			var t1 = this.getOwnedTags.filter(e=> "ecore.EDataType_instanceClassName".equals(e.getName))
			var t =
			if (t1 != null && t1.size>0){
				t1.first.getValue;
			}else{
				"java.lang.Object"
			}
			res.append(kermeta.utils.TypeEquivalence.getTypeEquivalence(t))
			log.debug("PrimitiveTypeComplement="+kermeta.utils.TypeEquivalence.getTypeEquivalence(t))	
			/* Check Generique Param */
			try{
				var c = java.lang.Class.forName(kermeta.utils.TypeEquivalence.getTypeEquivalence(t))
				if(c.getTypeParameters.size > 0){
					res.append("[")
					for(i <- 0 until c.getTypeParameters.length ){
						res.append("org.eclipse.emf.ecore.EObject")
						if(i < c.getTypeParameters.length -1){
							res.append(",")
						}
					}
					res.append("]")
				}
			
			
			} catch {
				case _ => 
			}
			
		}else{
		 if (this.getInstanceType !=null){
			 this.getInstanceType.generateScalaCode(res)
		 }
		 else
			 res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(this.eContainer().asInstanceOf[Package].getQualifiedName)+"."+this.getName())
		}

		
	}

}
