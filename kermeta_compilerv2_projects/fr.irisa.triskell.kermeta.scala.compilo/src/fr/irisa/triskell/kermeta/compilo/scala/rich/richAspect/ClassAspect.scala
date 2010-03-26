package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait ClassAspect extends RichAspectImplicit with TypeAspect with ObjectAspect with LogAspect {

    override def generateScalaCode(res : StringBuilder) : Unit = {
        /*var pack : String = this.getTypeDefinition().eContainer().asInstanceOf[Package].getQualifiedName
         pack=kermeta.utils.TypeEquivalence.getPackageEquivalence(pack);
         var s : String = pack + "."+this.getTypeDefinition().asInstanceOf[ClassDefinition].getName
         //		if (Util.currentPackage.equals(pack))
         //				res.append(this.getTypeDefinition().asInstanceOf[ClassDefinition].getName )
         //		else
         res.append(kermeta.utils.TypeEquivalence.getTypeEquivalence(s))*/

        res.append(this.getQualifiedNameCompilo())
        /* Check Generique Param */
			
        if (this.getTypeParamBinding.size()>0){
				
			
            var i : Int = 1
            res.append("[")
            this.getTypeParamBinding.foreach(e=> {
//                    res.append("_<:")
                    e.generateScalaCode(res)
                    if (i< this.getTypeParamBinding.size()){
                        res.append(", ")
                    }
                    i=i+1;
                })
            res.append("]")
         	
            //TODO
        }
        else{
	
			
			
				
            try{
                var c = java.lang.Class.forName(this.getQualifiedNameCompilo())
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
	
    override def getQualifiedNameCompilo():String ={
        var res = new StringBuilder
        res.append(Util.protectScalaKeyword(Util.getQualifiedNamedBase(this.getTypeDefinition)))
        /*if (this.getTypeParamBinding.size>0){
         var i = 0;
         res.append("[")
         this.getTypeParamBinding.foreach(ty => {
         if (i>0) {res.append(",")}
         ty.generateScalaCode(res)
         i = i+1
         })
         res.append("]")

         }*/
        return res.toString
    }
 	
    /*
     override def generateScalaCode(res : StringBuilder) : Unit = {
		
     if(this.getName() != "Main"){ //TODO REMOVE DEBUG MODE
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
