package org.kermeta.language.compiler.aspects.sub

import scala.collection.JavaConversions._
import org.kermeta.language.compiler.Util
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.aspects.ImplicitAspects._

trait OperationAspect extends ObjectAspect {

  lazy val OperationAspect_self = self.asInstanceOf[Operation]

  def generateSignature(res : StringBuilder) : Unit = {
    if (!Util.hasCompilerIgnoreTag(OperationAspect_self)){
      //log.debug("Operation={}",this.getName)
      res.append("\n   ")
      //TODO in fact it should limit this case to operation that come from Kermeta Object
      if (OperationAspect_self.getSuperOperation()!=null   && !Util.hasEcoreTag( OperationAspect_self.getSuperOperation().asInstanceOf[Operation].getOwningClass )      ){
        res.append(" override")
      }
      res.append(" def ")
      //if (this.getOwnedTags.exists(e=> "EMF_renameAs".equals(e.asInstanceOf[Tag].getName()))){
      //  res.append(Util.protectScalaKeyword(this.getOwnedTags.filter( e => "EMF_renameAs".equals(e.asInstanceOf[Tag].getName())).get(0).getValue))
      //}else{
      res.append(Util.protectScalaKeyword(Util.getEcoreRenameOperation(OperationAspect_self)))
      //}
      this.generateParamerterOp( res)
      /* Default constructor declaration */
      res.append("(")
      var i = 0;
      OperationAspect_self.getOwnedParameter.foreach(par => {
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
      this.getListorType(res1)
      if ("_root_.kermeta.standard.Void".equals(res1.toString)){
        res.append("Unit")
      }else{
        res.append(res1)
      }
    }
  }
	
  override def generateScalaCode(res : StringBuilder) : Unit = {
    if (!Util.hasCompilerIgnoreTag(OperationAspect_self)){
      //log.debug("Operation={}",this.getName)
      res.append("\n   ")
      if (OperationAspect_self.getSuperOperation()!=null          ){
        res.append(" override")
      }
      res.append(" def ")
      //if (this.getOwnedTags.exists(e=> "EMF_renameAs".equals(e.asInstanceOf[Tag].getName()))){
      //  res.append(Util.protectScalaKeyword(this.getOwnedTags.filter( e => "EMF_renameAs".equals(e.asInstanceOf[Tag].getName())).get(0).getValue))
      //}else{
      res.append(Util.protectScalaKeyword(Util.getEcoreRenameOperation(OperationAspect_self)))
      //}
      this.generateParamerterOp( res)
      /* Default constructor declaration */
      res.append("(")
      var i = 0;
      OperationAspect_self.getOwnedParameter.foreach(par => {
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
      this.getListorType(res1)
      if ("_root_.kermeta.standard.Void".equals(res1.toString)){
        res.append("Unit")
      }else{
        res.append(res1)
      }
      //this.getType.generateScalaCode(res)
      res.append(" = {\n")
      res.append("var result : ")
      this.getListorType(res)
      //   this.getType.generateScalaCode(res)
      //res append "Any"
      res.append(" = null.asInstanceOf[")
      this.getListorType(res)
      //this.getType.generateScalaCode(res)
      res.append("]; \n")
      if (OperationAspect_self.getBody!= null){
				
        OperationAspect_self.getBody().asInstanceOf[Object].generateScalaCode(res)
      }
      res append " return result\n}\n"
      //this.getType.generateScalaCode(res)
      //res append "]\n}\n"
      //res.append("}/*End_"+this.getName()+"*/\n")
      //} else {
      //  res.append("\n")
      //}
    }
  }
  def generateParamerterOp(res1:StringBuilder) = {
    if (OperationAspect_self.getTypeParameter().size()>0){  res1.append("[")
                                                          var ii = 0;
                                                          OperationAspect_self.getTypeParameter.foreach{param=>
        if (ii>0) {res1.append(",")}
        res1.append(param.asInstanceOf[Object].getQualifiedNameCompilo())
        ii= ii+1
      }
                                                          res1.append("]")
    }
  }

  def getListorType(res:StringBuilder)={

    var res1 : StringBuilder = new StringBuilder

    if (OperationAspect_self.getUpper>1 ||OperationAspect_self.getUpper == -1){
      if (OperationAspect_self.getIsOrdered.booleanValue){
        res.append("org.eclipse.emf.common.util.EList[")
      }else{
        //TODO gestion des SETs
        res.append("org.eclipse.emf.common.util.EList[")
      }
      OperationAspect_self.getType().asInstanceOf[Object].generateScalaCode(res1)
      res.append(getLocalTypeEquivalence(res1.toString))
      res.append("]")
    } else {
      OperationAspect_self.getType().asInstanceOf[Object].generateScalaCode(res1)
      res.append(getLocalTypeEquivalence(res1.toString))
    }
  }

  def getListorType(param:Parameter,res:StringBuilder)={
    var res1 : StringBuilder = new StringBuilder
    if (param.getUpper>1 ||param.getUpper == -1){
      if (param.getIsOrdered.booleanValue){
        res.append("org.eclipse.emf.common.util.EList[")
      }else{
        //TODO gestion des SETs
        res.append("org.eclipse.emf.common.util.EList[")
      }
      param.getType().asInstanceOf[Object].generateScalaCode(res1)
      res.append(getLocalTypeEquivalence(res1.toString))
      res.append("]")
    } else {
      param.getType().asInstanceOf[Object].generateScalaCode(res1)
      res.append(getLocalTypeEquivalence(res1.toString))
    }


  }

  def getLocalTypeEquivalence(t : String ) : String = {
    val booleanRegex = ".*Boolean".r
    t match {
      case "kermeta.standard.Void" => "Unit"
      case "Int" => "java.lang.Integer"
        //TO Improve
        /*case booleanRegex() if (this.getType().isInstanceOf[PrimitiveType]
         && (
         "fr.irisa.triskell.kermeta.language.structure.Boolean".equals(this.getType().asInstanceOf[PrimitiveTypeAspect].whichBoolean) ||
         "org.eclipse.emf.ecore.EBoolean".equals(this.getType().asInstanceOf[PrimitiveTypeAspect].whichBoolean) )
         ) => "Boolean"*/
      case booleanRegex() => "java.lang.Boolean"
      case _ => t
    }
  }
}
case class RichOperation(_self : Operation) extends OperationAspect { self = _self  }