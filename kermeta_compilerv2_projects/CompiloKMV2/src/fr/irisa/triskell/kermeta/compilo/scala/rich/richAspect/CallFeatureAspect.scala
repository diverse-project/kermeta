package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait CallFeatureAspect extends EcoreRichAspectImplicit with ObjectAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		if ("new".equals(this.getName)){
			res append " "+this.getName()+" "
			if (this.getTarget!=null){
				this.getTarget().generateScalaCode(res)
				res append "()"
			} 
		} else {
			if (this.getTarget!=null){
				this.getTarget().generateScalaCode(res)
				res append "."
			}
			if (this.getStaticProperty!=null){
				res append "get"+this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size) +"()"
			} else {
				res append this.getName
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
