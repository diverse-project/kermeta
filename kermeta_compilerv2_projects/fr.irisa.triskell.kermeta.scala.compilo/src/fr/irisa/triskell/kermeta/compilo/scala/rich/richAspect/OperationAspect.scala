package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._

trait OperationAspect extends RichAspectImplicit with ObjectAspect with LogAspect {
	
	implicit def rich (xs : OperationAspect) = xs.asInstanceOf[Operation]
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		if (!Util.hasCompilerIgnoreTag(this)){ 
				log.debug("Operation={}",this.getName)
			res.append("\n   ")
			if (this.getSuperOperation()!=null || (Util.hasEcoreTag(this) && this.getBody !=null)){
				res.append(" override")
			}
			res.append(" def ")
                        if (this.getOwnedTags.exists(e=> "EMF_renameAs".equals(e.asInstanceOf[Tag].getName()))){                            
                                res.append(Util.protectScalaKeyword(this.getOwnedTags.filter( e => "EMF_renameAs".equals(e.asInstanceOf[Tag].getName())).get(0).getValue))
                        }else{
                               res.append(Util.protectScalaKeyword(this.getName()))
                        }
                        this.generateParamerterOp( res)
			/* Default constructor declaration */
			res.append("(") 
			var i = 0;
			this.getOwnedParameter.foreach(par => {
				if (i==0) { 
					res.append(Util.protectScalaKeyword(par.getName()))
					res.append(" : ")
					par.getType.generateScalaCode(res)
				}else{
					res.append(", ")
					res.append(Util.protectScalaKeyword(par.getName()))
					res.append(" : ")
					par.getType.generateScalaCode(res)
				}
				i=i + 1
			})
			res.append("):")
			/* Return Type Declaration */
			this.getType.generateScalaCode(res)
			if (this.getBody!= null){
				res.append(" = {\n")
				res.append("var result : ")
				this.getType.generateScalaCode(res)
				//res append "Any"
				res.append(" = null.asInstanceOf[")
				this.getType.generateScalaCode(res)
				res.append("]; \n")
				
				this.getBody().generateScalaCode(res)
				res append " return result\n}\n"
				//this.getType.generateScalaCode(res)
				//res append "]\n}\n"
				//res.append("}/*End_"+this.getName()+"*/\n")
			}
		}
	}
        def generateParamerterOp(res1:StringBuilder) = {
            if (this.getTypeParameter().size()>0){  res1.append("[")
        var ii = 0;
        this.getTypeParameter.foreach{param=>
            if (ii>0) {res1.append(",")}
            res1.append(param.asInstanceOf[ObjectAspect].getQualifiedNameCompilo())
            ii= ii+1
        }
        res1.append("]")
         }
    }
	
}
