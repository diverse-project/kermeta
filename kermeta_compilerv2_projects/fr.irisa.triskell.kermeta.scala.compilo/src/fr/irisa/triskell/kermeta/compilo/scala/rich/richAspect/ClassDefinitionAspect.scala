package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._

trait ClassDefinitionAspect extends RichAspectImplicit with ObjectAspect with IVisitable {
	
	
	override def accept(visitor : IVisitor){ 
		visitor.visit(this) 
	}	 
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		if (Util.hasEcoreTag(this)){
			res.append("trait ")
			res.append(this.getName())
			res.append("Aspect") 
			
  			if (this.getSuperType.size == 1 && "Object".equals(this.getSuperType.first.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition].getName) && !Util.hasEcoreTag(this.getSuperType.first.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition])){
					//res.append(" extends "+Util.traitname)
	  			//TODO extends a superClassAspect		  
			} else {
				var i = 0;
				this.getSuperType.foreach(superC => {
					if (i==0) {
						res.append(" extends ")
						var ty : GenericTypeDefinition = superC.asInstanceOf[Class].getTypeDefinition
						res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(ty.eContainer.asInstanceOf[Package].getQualifiedName))
						
						if (Util.hasEcoreTag(ty.eContainer.asInstanceOf[Package]) && !ty.eContainer.asInstanceOf[Package].getQualifiedName().equals("language.structure")){
							println(ty.eContainer.asInstanceOf[Package].getQualifiedName())	
							res.append("ScalaAspect")
								
						}
						res.append(".")
						res.append(superC.asInstanceOf[Class].getTypeDefinition.getName)
						res.append("Aspect")
					}else{
						res.append(" with ")
						var ty : GenericTypeDefinition = superC.asInstanceOf[Class].getTypeDefinition
						res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(ty.eContainer.asInstanceOf[Package].getQualifiedName))
						res.append(".")
						res.append(superC.asInstanceOf[Class].getTypeDefinition.getName)
					}
					i=i+1
				})
				
				res append " with "+ fr.irisa.triskell.kermeta.scala.framework.language.structure.FrameworkAspectUtil.getDefaultAspect(this.getQualifiedNameCompilo())
				res append " with "+GlobalConfiguration.frameworkGeneratedPackageName + "."+GlobalConfiguration.implicitConvTraitName
				}
				res.append("{\n")
				this.getOwnedAttribute foreach(a=> a.generateScalaCode(res))
				this.getOwnedOperation filter(op=> !Util.hasEcoreTag(op)) foreach(op=> op.generateScalaCode(res))
				res.append("}\n")
  		}else{
			res.append("trait ")
			res.append(this.getName())
			res.append("Aspect")
	  		if (this.getSuperType.size == 0){
					//res.append(" extends "+Util.traitname)
	  			//TODO extends a superClassAspect
			}else{
				res.append(" extends org.eclipse.emf.ecore.impl.EObjectImpl ")
//				var i = 0;
				this.getSuperType.foreach(superC => {
//					if (i==0) {
/*						res.append(" extends ")
						var ty : GenericTypeDefinition = superC.asInstanceOf[Class].getTypeDefinition
						res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(ty.eContainer.asInstanceOf[Package].getQualifiedName))
						res.append(".")
						res.append(superC.asInstanceOf[Class].getTypeDefinition.getName)
*///					}else{
						res.append(" with ")
						var ty : GenericTypeDefinition = superC.asInstanceOf[Class].getTypeDefinition
						res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(ty.eContainer.asInstanceOf[Package].getQualifiedName))
						res.append(".")
						res.append(superC.asInstanceOf[Class].getTypeDefinition.getName)
						res.append("Aspect")
								//returnedString =returnedString + ", " +superC.getName; 
//					}
//					i=i+1
				})
				res append " with "+GlobalConfiguration.frameworkGeneratedPackageName + "."+GlobalConfiguration.implicitConvTraitName
			}
  				res.append("{\n")

				this.getOwnedAttribute foreach(a=> a.generateScalaCode(res))
				this.getOwnedOperation filter(op=> !Util.hasEcoreTag(op)) foreach(op=> op.generateScalaCode(res))
				this.getInv() foreach(a=> a.generateScalaCode(res))
				
				/* Generate checkInvariants */
				res.append("override def checkInvariants(){\n")
				this.getInv() foreach(a=> {
					res.append("if(!"+a.getName()+"){throw kermeta.exceptions.RichFactory.createConstraintViolatedInvException }\n")
				})
				
				res.append("}\n")
				/* End checkInvariants Generation  */
				
	    		res.append("}\n")
	  	}
	}
	
	
	override def getQualifiedNameCompilo():String ={
		return this.eContainer().asInstanceOf[ObjectAspect].getQualifiedNameCompilo() + "."+ this.getName();
	  
	}
 	
	
}
