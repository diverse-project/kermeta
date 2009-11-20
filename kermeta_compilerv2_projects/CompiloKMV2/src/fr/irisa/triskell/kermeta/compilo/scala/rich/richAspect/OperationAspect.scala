package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait OperationAspect extends EcoreRichAspectImplicit with ObjectAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		res.append("\n"+"   def ")
		res.append(this.getName())
		res.append("(")
		var i:int  = 0;
		this.getOwnedParameter.foreach(par => {
			if (i==0) { 
				res.append(par.getName()+" : ")
				par.getType.generateScalaCode(res)
			}else{
				res.append(", ")
				res.append(par.getName())
				res.append(" : ")
				par.getType.generateScalaCode(res)
			}
			i=i+1;
		})
		res.append(")")
		if (this.getBody!= null){
			res.append(" = ")
			this.getBody().generateScalaCode(res)
			//res.append("}/*End_"+this.getName()+"*/\n")
		}
	}
	
	//	override def generateVisitor(tabsString 	: String) : String = { 
	//	 	 var returnString : String = "def "+ this.getName + "(";
     		
    // 	var i:int  = 0;
     	/*
		this.getOwnedParameter.foreach(par => 
     		{
						if (i==0) {
							returnString =returnString + par.getName +" : "+ par.getType.generateVisitor(tabsString) 
						}else{
							returnString =returnString +", "+ par.getName +" : "+ par.getType.generateVisitor(tabsString)  
						}
						i=i+1;
					}
				)
				*/
     		
       /*
     		returnString = returnString + ") :";// + value.getType().getClass + " ";
			returnString = returnString + this.getType().generateVisitor(tabsString) 
    		returnString = returnString + "={"; 
			if (this.getBody!= null){
			  returnString = returnString +"var result : "+ this.getType().generateVisitor(tabsString)+"=null;\n"
    		returnString = returnString + this.getBody.generateVisitor(tabsString) 
    		returnString = returnString +"\nreturn result;\n"
			}
			returnString = returnString +"}\n"
			*/
	//		return returnString;
  
	//}
}
