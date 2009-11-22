package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait CallFeatureAspect extends EcoreRichAspectImplicit with CallExpressionAspect {

	override def generateScalaCode(res : StringBuilder) : Unit = {
		if ("new".equals(this.getName)){
			if (this.getTarget!=null){
				var ty : TypeDefinition =this.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType().asInstanceOf[ParameterizedType].getTypeDefinition()
				res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(ty.eContainer.asInstanceOf[Package].getQualifiedName))
				res.append(".RichFactory.create")
				res.append(ty.getName())
				var ty1 : ParameterizedType = this.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType().asInstanceOf[ParameterizedType]
				var i = 0;
				if (ty1.getTypeParamBinding().size > 0){
					res.append("[")	
					ty1.getTypeParamBinding().foreach{e=> if (i>0) res.append(",")	; e.getType().generateScalaCode(res);i=i+1}
					res.append("]")	
					
				}
				//this.getTarget().generateScalaCode(res)
//				res append "()"
			} 
		} else {
			if (this.getTarget!=null){
				this.getTarget().generateScalaCode(res)
				res append "."
			}
			if (this.getStaticProperty!=null){
				//res append "get"+this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size) +"()"
				res.append(Util.scalaPrefix+this.getName)
			} else {  
				println("pass encore par la " + this.getName)
				res.append(kermeta.utils.TypeEquivalence.getMethodEquivalence("String", this.getName))
			}
			if (this.getStaticOperation!=null){
         	  res append "(" 
         	}
			var i : Int = 1
         	this.getParameters.foreach(e=> {
         		e.generateScalaCode(res)
                if (i< this.getParameters.size()){
                	res append ", "
                }
                i=i+1
            })
         	if (this.getStaticOperation!=null){
         	  res append ")"
         	}			
		}
	}
	
	
	/*
override def generateVisitor(tabsString 	: String) : String = { 
				  var returnString : String = "";
		
      if ("new".equals(this.getName))
    		  {
    	  		returnString = returnString+ " "+this.getName + " "
         		 if (this.getTarget!=null)
         			 returnString = returnString+this.getTarget.generateVisitor(tabsString)
         			 returnString = returnString+ " ()"
    		  }
        else{
        		var point : String  ="" 
        		if (this.getTarget!=null){
         			 	returnString = returnString+ this.getTarget.generateVisitor(tabsString)+"."
        		}
          
          if (this.getStaticProperty!=null){
         	returnString = returnString+point + "get"+this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size) +"()"
         	  
         	}else{
         	returnString = returnString+point + this.getName
          }
         	
         	
          
          	
         	if (this.getStaticOperation!=null){
         	  returnString = returnString+"("
         	  
         	}
          
         	returnString = returnString+point
         	Util.concreteClass.push(true)
        	Util.concreteClass.pop()	
        	var i : Int = 1
         	this.getParameters.foreach(e=> {returnString = returnString+e.generateVisitor(tabsString); 
                                           if (i< this.getParameters.size()){
                                             returnString = returnString+", ";
                                           }
                                           i=i+1;})
          	
         	if (this.getStaticOperation!=null){
         	  returnString = returnString+")"
         	  
         	}

          
          }//value
//			returnString = returnString+value.getParameters.foreach(par=> par.generateVisitor(tabsString))	
//    	 returnString = returnString+ ")"
    	 return returnString;
	}  */
}
