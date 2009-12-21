package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait ClassAspect extends RichAspectImplicit with TypeVariableBindingAspect with ObjectAspect with LogAspect {

	override def generateScalaCode(res : StringBuilder) : Unit = {
		var pack : String = this.getTypeDefinition().eContainer().asInstanceOf[Package].getQualifiedName 
		pack=kermeta.utils.TypeEquivalence.getPackageEquivalence(pack);
		var s : String = pack + "."+this.getTypeDefinition().asInstanceOf[ClassDefinition].getName 
		//println(s)
//		if (Util.currentPackage.equals(pack))
//				res.append(this.getTypeDefinition().asInstanceOf[ClassDefinition].getName )
//		else
			res.append(kermeta.utils.TypeEquivalence.getTypeEquivalence(s))

		/*
		log.debug("Class={}",this.getName)
		this.getTypeParamBinding.foreach({e=>
			log.debug("ClassBinding={}",e.getType)
			log.debug("ClassBinding={}",e.getQualifiedNameCompilo)
			log.debug("ClassBinding={}",e)
		})
		
		this.getTypeDefinition.asInstanceOf[ClassDefinition].getTypeParameter.foreach(e=>{
			log.debug("ClassGeneric={}{}",e.getName,e.toString)
		})
		log.debug("ClassType={}",this.getTypeDefinition.asInstanceOf[ClassDefinition].getQualifiedNameCompilo)
		*/
		
		//GEN GENERIC PARAM
		/*
		if(this.getTypeDefinition.asInstanceOf[ClassDefinition].getTypeParameter.size > 0){
			res.append("[")
			var i = 0
			this.getTypeDefinition.asInstanceOf[ClassDefinition].getTypeParameter.foreach(e=>{
				if(this.getTypeParamBinding.size > 0){
					if(this.getTypeParamBinding.get(i).getQualifiedNameCompilo.equals("")){
						res.append("_")
					} else {
						res.append(e.getQualifiedNameCompilo)
					}
				}
				if(!this.getTypeDefinition.asInstanceOf[ClassDefinition].getTypeParameter.last.equals(e)) res.append(" , ")
				i = i + 1
			})
			res.append("]")			
		}*/
	}
	
	override def getQualifiedNameCompilo():String ={
		return this.getTypeDefinition().getQualifiedNameCompilo();
	}
 	
	/*
	override def generateScalaCode(res : StringBuilder) : Unit = {
		
		if(this.getName() != "Main"){ //TODO REMOVE DEBUG MODE
			Console.println("Skip Class "+this.getName)
			return
		}
		
  		if (Util.hasEcoreTag(this)){
  			res.append("class ")
  			res.append(this.getName())
  			res.append("Aspect")
//  				returnString ="class Rich"+ this.getName+"(value:"+this.getName +")";
  			if (this.getSuperClass().size == 1 && "Object".equals(this.getSuperClass().first.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition].getName) && !Util.hasEcoreTag(this.getSuperClass().first.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition])){
				res.append(" extends "+Util.traitname) 
			}else{
				var i:int  = 0;
				this.getSuperClass().foreach(superC => 
						{
//							if (i==0) {
//								returnString =returnString + "  extends " +"Rich"+superC.asInstanceOf[Class].getTypeDefinition.getName + "(value:"+superC.asInstanceOf[Class].getTypeDefinition.getName +")"
//							}else{
//								//returnedString =returnedString + ", " +superC.getName; 
//							}
//							i=i+1;
						}
				)
				res.append(" with "+Util.traitname)
			}
  			res.append("{")
  			this.getOwnedAttribute().foreach(a => a.generateScalaCode(res))
  			this.getOwnedOperation().foreach(op => op.generateScalaCode(res))
  			res.append("}\n")
  		}else{
  			res.append("class "+this.getName())
  			if (this.getSuperClass().size == 0){
  				res.append(" extends "+Util.traitname)
  			} else{
  				var i:int  = 0;
  			}
//					var i:int  = 0;
//					this.getSuperType.foreach(superC => 
//						{
//							if (i==0) {
//								returnString =returnString + "  extends " +superC.asInstanceOf[Class].getTypeDefinition.getName
//							}else{
//								//returnedString =returnedString + ", " +superC.getName; 
//							}
//							i=i+1;
//						}
//					)
//					returnString =returnString + "  with "+ Util.traitname
//	
//				}
  			res.append("{")
  			this.getOwnedAttribute().foreach(a => a.generateScalaCode(res))
  			this.getOwnedOperation().foreach(op => op.generateScalaCode(res))
  			res.append("}\n")
	  	}	
	}
*/
}
