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
            if (this.getSuperOperation()!=null          ){
                res.append(" override")
            }
            res.append(" def ")
            if (this.getOwnedTags.exists(e=> "EMF_renameAs".equals(e.asInstanceOf[Tag].getName()))){
                res.append(Util.protectScalaKeyword(this.getOwnedTags.filter( e => "EMF_renameAs".equals(e.asInstanceOf[Tag].getName())).get(0).getValue))
            }else{
                res.append(Util.protectScalaKeyword(Util.getEcoreRenameOperation(this)))
            }
            this.generateParamerterOp( res)
            /* Default constructor declaration */
            res.append("(")
            var i = 0;
            this.getOwnedParameter.foreach(par => {
                    if (i==0) {
                        res.append(Util.protectScalaKeyword(par.getName()))
                        res.append(" : ")
                        this.getListorType(par, res)//par.getType.generateScalaCode(res)
                    }else{
                        res.append(", ")
                        res.append(Util.protectScalaKeyword(par.getName()))
                        res.append(" : ")
                        this.getListorType(par, res)//					par.getType.generateScalaCode(res)
                    }
                    i=i + 1
                })
            res.append("):")
            /* Return Type Declaration */
            this.getListorType(res)
            //this.getType.generateScalaCode(res)
            if (this.getBody!= null){
                res.append(" = {\n")
                res.append("var result : ")
                this.getListorType(res)
                //   this.getType.generateScalaCode(res)
                //res append "Any"
                res.append(" = null.asInstanceOf[")
                this.getListorType(res)
                //this.getType.generateScalaCode(res)
                res.append("]; \n")
				
                this.getBody().generateScalaCode(res)
                res append " return result\n}\n"
                //this.getType.generateScalaCode(res)
                //res append "]\n}\n"
                //res.append("}/*End_"+this.getName()+"*/\n")
            } else {
                res.append("\n")
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

    def getListorType(res:StringBuilder)={
	if (this.getUpper>1 ||this.getUpper == -1){
            if (this.isIsOrdered){
                res.append("java.util.List[")
            }else{
                //TODO gestion des SETs
                res.append("java.util.List[")
            }
            this.getType().asInstanceOf[ObjectAspect].generateScalaCode(res)
            res.append("]")
	} else {
            this.getType().asInstanceOf[ObjectAspect].generateScalaCode(res)
	}


    }

    def getListorType(param:Parameter,res:StringBuilder)={
	if (param.getUpper>1 ||param.getUpper == -1){
            if (param.isIsOrdered){
                res.append("java.util.List[")
            }else{
                //TODO gestion des SETs
                res.append("java.util.List[")
            }
            param.getType().asInstanceOf[ObjectAspect].generateScalaCode(res)
            res.append("]")
	} else {
            param.getType().asInstanceOf[ObjectAspect].generateScalaCode(res)
	}


    }


}
