package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._ 
import org.kermeta.language.behavior._

trait OperationAspect extends ObjectVisitor with LogAspect {
	
 

  def generateSignature(thi:Operation,res : StringBuilder) : Unit = {
    if (!Util.hasCompilerIgnoreTag(thi)){
      log.debug("Operation={}",thi.getName)
      res.append("\n   ")
      //TODO in fact it should limit this case to operation that come from Kermeta Object
      if (thi.getSuperOperation()!=null   && !Util.hasEcoreTag( thi.getSuperOperation().asInstanceOf[Operation].getOwningClass )      ){
               res.append(" override")
      }
      res.append(" def ")
      //if (this.getOwnedTags.exists(e=> "EMF_renameAs".equals(e.asInstanceOf[Tag].getName()))){
      //  res.append(Util.protectScalaKeyword(this.getOwnedTags.filter( e => "EMF_renameAs".equals(e.asInstanceOf[Tag].getName())).get(0).getValue))
      //}else{
        res.append(Util.protectScalaKeyword(Util.getEcoreRenameOperation(thi)))
      //}
      generateParamerterOp(thi, res)
      /* Default constructor declaration */
      res.append("(")
      var i = 0;
      thi.getOwnedParameter.foreach(par => {
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
      res.append(") : ")
      var res1 = new StringBuilder
      this.getListorType(thi,res1)
      if ("_root_.k2.standard.Void".equals(res1.toString)){
        res.append("Unit")
      }else{
        res.append(res1)
      }
    }
  }
	
  def visitOperation(thi:Operation,res : StringBuilder) : Unit = {
    if (!Util.hasCompilerIgnoreTag(thi)){
      log.debug("Operation={}",thi.getName)
      res.append("\n   ")
      if (thi.getSuperOperation()!=null          ){
        res.append(" override")
      }
      res.append(" def ")
      //if (this.getOwnedTags.exists(e=> "EMF_renameAs".equals(e.asInstanceOf[Tag].getName()))){
      //  res.append(Util.protectScalaKeyword(this.getOwnedTags.filter( e => "EMF_renameAs".equals(e.asInstanceOf[Tag].getName())).get(0).getValue))
      //}else{
        res.append(Util.protectScalaKeyword(Util.getEcoreRenameOperation(thi)))
      //}
      generateParamerterOp(thi, res)
      /* Default constructor declaration */
      res.append("(")
      var i = 0;
      thi.getOwnedParameter.foreach(par => {
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
     var res1 = new StringBuilder
      this.getListorType(thi,res1)
      if ("_root_.k2.standard.Void".equals(res1.toString)){
        res.append("Unit")
        
      }else{
        res.append(res1)
      }
      //this.getType.generateScalaCode(res)
        res.append(" = {\n")
        res.append("var `~result` : ")
        this.getListorType(thi,res)
        //   this.getType.generateScalaCode(res)
        //res append "Any"
        res.append(" = null.asInstanceOf[")
        this.getListorType(thi,res)
        //this.getType.generateScalaCode(res)
        res.append("]; \n try { \n")
      if (thi.getBody!= null){
				
        visit(thi.getBody(),res)
      }
res append "        }\n"
res append "catch {\n"
res append "case e :_root_.k2.exceptions.Exception => {throw e}\n"
res append "  case e => {\n"
res append "    val tutu18 = _root_.k2.exceptions.KerRichFactory.createException;\n"
res append "  	tutu18.message = \"error in kermeta code on operation " + getQualifiedNameCompilo(thi.eContainer) +"."+thi.getName +"\"\n"
res append "  	  tutu18.setStackTrace(e.getStackTrace)\n"
res append "  	  throw tutu18\n"
res append "  }\n}\n"
        
      if ("Unit".equals(res1.toString) || "_root_.k2.standard.Void".equals(res1.toString)){
        res append " \n}\n"
      } 
      else{
             //   println(res1.toString())

          res append " return `~result`\n}\n"
      }
        //this.getType.generateScalaCode(res)
        //res append "]\n}\n"
        //res.append("}/*End_"+this.getName()+"*/\n")
      //} else {
      //  res.append("\n")
      //}
    }
  }
  def generateParamerterOp(thi:Operation,res1:StringBuilder) = {
    if (thi.getTypeParameter().size()>0){  res1.append("[")
                                          var ii = 0;
                                          thi.getTypeParameter.foreach{param=>
        if (ii>0) {res1.append(",")}
        res1.append(getQualifiedNameCompilo(param))
        ii= ii+1
      }
                                          res1.append("]")
    }
  }

  def getListorType(thi:Operation,res:StringBuilder)={

    var res1 : StringBuilder = new StringBuilder

    if (thi.getUpper>1 ||thi.getUpper == -1){
      if (thi.getIsOrdered != null && thi.getIsOrdered){
        res.append("org.eclipse.emf.common.util.EList[")
      }else{
        //TODO gestion des SETs
        res.append("org.eclipse.emf.common.util.EList[")
      }

      visit(thi.getType(),res1)
      res.append(res1.toString)
      res.append("]")

    } else {


    	visit(thi.getType(),res1)
    	res.append(res1.toString)

    }


  }

  def getListorType(param:Parameter,res:StringBuilder)={
    var res1 : StringBuilder = new StringBuilder
    if (param.getUpper>1 ||param.getUpper == -1){
      if (param.getIsOrdered != null && param.getIsOrdered){
        res.append("org.eclipse.emf.common.util.EList[")
      }else{
        //TODO gestion des SETs
        res.append("org.eclipse.emf.common.util.EList[")
      }
      visit(param.getType(),res1)
      res.append(res1.toString)
      res.append("]")
    } else {
      visit(param.getType(),res1)
      res.append(res1.toString)
    }


  }

 /* def getLocalTypeEquivalence(t : String ) : String = {
    val booleanRegex = ".*Boolean".r
    t match {
        case "k2.standard.Void" => "Unit"
        //case "Int" => "java.lang.Integer"
        //TO Improve
                /*case booleanRegex() if (this.getType().isInstanceOf[PrimitiveType]
                    && (
                        "org.kermeta.language.structure.Boolean".equals(this.getType().asInstanceOf[PrimitiveTypeAspect].whichBoolean) ||
                        "org.eclipse.emf.ecore.EBoolean".equals(this.getType().asInstanceOf[PrimitiveTypeAspect].whichBoolean) )
                ) => "Boolean"*/
        //case booleanRegex() => "java.lang.Boolean"
        case _ => t
    }
  }*/


}
