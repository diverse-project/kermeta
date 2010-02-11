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
			this.generateParamerterClass(res)
			
			
  			if (this.getSuperType.size == 0){//1 && "Object".equals(this.getSuperType.first.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition].getName) ){
				res append " extends "+ fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.FrameworkAspectUtil.getDefaultAspect(this.getQualifiedNameCompilo())
				res append " with "+GlobalConfiguration.frameworkGeneratedPackageName + "."+GlobalConfiguration.implicitConvTraitName
			} else {
				var i = 0;
				this.getSuperType.foreach(superC => {
					if (i==0) {
						res.append(" extends ")
					} else {
						res.append(" with ")
					}
					
					var ty : GenericTypeDefinition = superC.asInstanceOf[Class].getTypeDefinition
						
						
						var packName = kermeta.utils.TypeEquivalence.getPackageEquivalence(ty.eContainer.asInstanceOf[Package].getQualifiedName)
						if (Util.hasEcoreTag(ty.eContainer.asInstanceOf[Package]) ){
							packName = packName+"ScalaAspect"
						}
						res.append(Util.protectScalaKeyword(packName))
						
						
						res.append(".")
						res.append(superC.asInstanceOf[Class].getTypeDefinition.getName)
						res.append("Aspect")
					/*}else{
						res.append(" with ")
						var ty : GenericTypeDefinition = superC.asInstanceOf[Class].getTypeDefinition
						res.append(Util.protectScalaKeyword(kermeta.utils.TypeEquivalence.getPackageEquivalence(ty.eContainer.asInstanceOf[Package].getQualifiedName)))
						res.append(".")
						res.append(Util.protectScalaKeyword(superC.asInstanceOf[Class].getTypeDefinition.getName))
					}*/
					i=i+1
				})
				
				res append " with "+ fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.FrameworkAspectUtil.getDefaultAspect(this.getQualifiedNameCompilo())
				res append " with "+GlobalConfiguration.frameworkGeneratedPackageName + "."+GlobalConfiguration.implicitConvTraitName
				}
				res append " with "+Util.protectScalaKeyword(this.getQualifiedNameCompilo)
				
				res.append("{\n")
				
				
				
				this.getOwnedAttribute foreach(a=> a.generateScalaCode(res))
				this.getOwnedOperation filter(op=> !Util.hasEcoreTag(op) || op.getBody !=null) foreach(op=> op.generateScalaCode(res))
				res.append("}\n")
  		}else{
			res.append("trait ")
			res.append(this.getName())
			res.append("Aspect")
			this.generateParamerterClass(res)

	  		if (this.getSuperType.size == 0){
					//res.append(" extends "+Util.traitname)
	  			//TODO extends a superClassAspect
			}else{
				//res.append(" extends org.eclipse.emf.ecore.impl.EObjectImpl ")
				res.append(" ")
				
				var i = 0;
				this.getSuperType.foreach(superC => {
					if (i==0) {
						res.append(" extends ")
					} else {
						res.append(" with ")
					}
/*						res.append(" extends ")
						var ty : GenericTypeDefinition = superC.asInstanceOf[Class].getTypeDefinition
						res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(ty.eContainer.asInstanceOf[Package].getQualifiedName))
						res.append(".")
						res.append(superC.asInstanceOf[Class].getTypeDefinition.getName)
*///					}else{
						//res.append(" with ")
						var ty : GenericTypeDefinition = superC.asInstanceOf[Class].getTypeDefinition
						res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(ty.eContainer.asInstanceOf[Package].getQualifiedName))
						if (Util.hasEcoreTag(ty))
							res.append("ScalaAspect")
								
						res.append(".")
						res.append(superC.asInstanceOf[Class].getTypeDefinition.getName)
						res.append("Aspect")
								//returnedString =returnedString + ", " +superC.getName; 
//					}
				i=i+1
				})
				res append " with "+GlobalConfiguration.frameworkGeneratedPackageName + "."+GlobalConfiguration.implicitConvTraitName
			}
  				res.append("{\n")

				this.getOwnedAttribute foreach(a=> a.generateScalaCode(res))
				this.getOwnedOperation filter(op=> !Util.hasEcoreTag(op)) foreach(op=> op.generateScalaCode(res))
				
				/* Generate Invariants */
				if(this.getInv().size() > 0){
					/* Generate checkInvariants */
					res.append("override def checkInvariants(){\n")
					res.append("val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ")
					var i = 0
					this.getInv() foreach(a => {
						if(i != 0) res.append(",")
						res.append("(")
						res.append("\""+a.getName+"\" -> (()=>")
						a.generateScalaCode(res)
						res.append("))")
						i = i + 1
					})
					res.append(" )\n")
					res.append("checkParamInvariants(invariants)\n")
					this.getSuperType.foreach(superC => {
						res.append("super[")
						res.append(superC.asInstanceOf[Class].getTypeDefinition.getName)
						res.append("Aspect].checkInvariants\n")
					})
					//res.append("checkParamInvariants(super.getInvariants)\n")
					res.append("}\n")
					/* End checkInvariants Generation  */
				}
	    		res.append("}\n")
	  	}
	}
	
	
	override def getQualifiedNameCompilo():String ={
		if (!Util.hasEcoreTag(this)  && !Util.hasEcoreTag(this.eContainer().asInstanceOf[Object]) || (Util.hasEcoreTag(this) && Util.hasEcoreTag(this.eContainer().asInstanceOf[Object])))
			return kermeta.utils.TypeEquivalence.getTypeEquivalence(this.eContainer().asInstanceOf[ObjectAspect].getQualifiedNameCompilo() + "."+ this.getName());
		else
			return kermeta.utils.TypeEquivalence.getTypeEquivalence(this.eContainer().asInstanceOf[ObjectAspect].getQualifiedNameCompilo() + "ScalaAspect."+ this.getName());
	}

	def getQualifiedNameKermeta():String ={
		this.eContainer().asInstanceOf[PackageAspect].getQualifiedNameKermeta() + "::"+ this.getName();
	}

	
	def generateParamerterClass(res1:StringBuilder) = {
						if (this.getTypeParameter().size()>0){
					var i = 0
					res1.append("[")
					this.getTypeParameter().foreach{param =>
						if (i>0)
							res1.append(",")
						res1.append(param.getQualifiedNameCompilo())
						i=i+1
					}
					res1.append("]")
				}
	}
 	
	
}
