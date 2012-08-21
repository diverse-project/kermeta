package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import java.util._

trait CallFeatureAspect extends ObjectVisitor with LogAspect {
	
	
    def generateNew(thi:CallFeature,res : StringBuilder) = {

        if (thi.getTarget!=null){
            if (thi.getTarget.isInstanceOf[CallTypeLiteral]){
                if (thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType().isInstanceOf[ParameterizedType]){
				
                    var ty : TypeDefinition =thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType().asInstanceOf[ParameterizedType].getTypeDefinition()
                    res.append("_root_.")
                    if (Util.hasEcoreTag(ty.eContainer.asInstanceOf[Package])){
                        res.append(GlobalConfiguration.scalaAspectPrefix+".")
                    }
                    res.append(k2.utils.TypeEquivalence.getPackageEquivalence(getQualifiedNameCompilo(ty.eContainer)))
                    res.append("."+GlobalConfiguration.factoryName+".create")
                    res.append(ty.getName())
                    var ty1 : ParameterizedType = thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType().asInstanceOf[ParameterizedType]
                    //var i = 0;
                    if (ty1.getTypeParamBinding().size > 0){
                        res.append("[")
                        generateScalaCodeEach(res,ty1.getTypeParamBinding(),",")
                        //ty1.getTypeParamBinding().foreach{e=> if (i>0) res.append(",")	; e.getType().generateScalaCode(res);i=i+1}
                        res.append("]")
                    }
                }
                else{
                	res.append("{")
                	res.append("val name = " +
                	    "_root_.k2.utils.TypeEquivalence.getTypeEquivalenceReverse(" +
                	    "$"+getQualifiedNameCompilo(thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType()) +
                	    ".erasure.getName" +
                	    ")\n" +
                	    "val c = scalaUtil.Util.getMetaClass(name)\n" +
                	    "if (c!=null){\n" +
                		"_root_.k2.utils.UTilScala.newInstance(c).asInstanceOf[" +
                		getQualifiedNameCompilo(thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType()) +
                	    "]\n" +
                		"}")
                	res.append("else throw new RuntimeException(\"Impossible to instantiate a type parameter which is not a class\")\n")
                	res.append("}")
                }
            }else{
                res.append("_root_.k2.utils.UTilScala.newInstance(")
                visit(thi.getTarget,res)
                res.append(")")

            }
        }
    }
	
	
    def generateTarget(thi:CallFeature,res : StringBuilder){
        if (thi.getTarget()!=null){
            res.append("(")
//            log.debug(""+thi.getTarget())
            visit(thi.getTarget(),res)
            res.append(")")
        }else{
            println("//TODODODODO " + thi.getName);
        }
    }
    def generateParam(thi:CallFeature,res : StringBuilder,openS : String,closeS : String){
        res append openS
        generateScalaCodeEach(res,thi.getParameters,", ")
        res append closeS
    }
	
    def generatePropertyCall(thi:CallFeature,res : StringBuilder){
        var TargetType : StringBuilder = new StringBuilder
        visit(thi.getTarget().getStaticType(),TargetType)
        res.append(GlobalConfiguration.scalaPrefix+k2.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, thi.getName))
		
    }
    def generateOperationCall(thi:CallOperation,res : StringBuilder){
        var TargetType : StringBuilder = new StringBuilder
    
        visit(thi.getTarget().getStaticType(),TargetType)
    
        if(thi.getTarget().getStaticType().isInstanceOf[Class]){
          var ops : List[Operation] = thi.getTarget().getStaticType().asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getOwnedOperation.filter(op => op.getName.equals(thi.getName))
          if (ops.size>0){
            //if (ops.get(0).getOwnedTags.exists(e=> "EMF_renameAs".equals(e.asInstanceOf[Tag].getName()))){
            //  res.append(Util.protectScalaKeyword(ops.get(0).getOwnedTags.filter( e => "EMF_renameAs".equals(e.asInstanceOf[Tag].getName())).get(0).getValue))
            //}else{
            res.append(Util.protectScalaKeyword(k2.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, Util.getEcoreRenameOperation(thi.getStaticOperation))))

            //}
          }else{
            res.append(Util.protectScalaKeyword(k2.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, Util.getEcoreRenameOperation(thi.getStaticOperation))))
          } 
        } else
          res.append(Util.protectScalaKeyword(k2.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, thi.getName())))
    }
	
    def generateName(thi:CallExpression,res : StringBuilder){
        res.append(thi.getName())
    }
    def generatePropertyName(thi:CallFeature,res : StringBuilder){
        res.append(GlobalConfiguration.scalaPrefix + thi.getName())
    }

    def generateEnumLiteralCall(thi:CallEnumLiteral,res : StringBuilder){
        if (Util.hasEcoreTag(thi.getStaticEnumLiteral.getEnumeration)){
            var res1 : StringBuilder = new StringBuilder
            //generateName(thi,res1)
            res.append("getByName(\""+thi.getStaticEnumLiteral().getName()+"\")")
        }else{
        	res.append(thi.getStaticEnumLiteral().getName())
        //    generateName(thi,res)
        }
    }

    def generateKUnitCase(thi:CallFeature,res : StringBuilder){
        visit(thi.getTarget(),res)
        res append ".run("
        var i = 0
        thi.getParameters.foreach(e=> {
                if(i != 0) { res append ", " }
                res append "classOf["
                var className :StringBuilder = new StringBuilder
                visit(e,className)
                className.insert(className.lastIndexOf(".")+1,"Rich")
                res.append(className.toString())
                res append "]"
                i = i + 1
            })
        res append ")"
    }

    def generateInstanceOf(thi:CallFeature,res:StringBuilder, o : org.kermeta.language.structure.KermetaModelElement)={
        res.append("[")
        if (o.isInstanceOf[CallTypeLiteral]){
            //res.append("_root_.")
            generateScalaCodeForInstanceOf(o.asInstanceOf[CallTypeLiteral],res)
        }
        else{
            visit(o,res)
        }
        res.append("]")

    }
  
    def generateIsInstanceOf(thi:CallFeature,res:StringBuilder, o : org.kermeta.language.structure.KermetaModelElement)={
      o match {
        case o : CallTypeLiteral 
          if(!(isCompiledToScalaType(o.getTyperef().getType()) && thi.getTarget.getStaticType()!=o.getTyperef().getType()) // Avoid problem  like var o:Object:="toto" ; o.isInstanceOf[String] => false because o is a RichString and not a jl.String
              && !thi.getTarget().isInstanceOf[org.kermeta.language.behavior.Literal]) // Scala cannot call isInstanceOf on boolean and integer literals, void literal should be an instance of everything, and callType literal call reflexivity layer anyway => special treatment for literals (anyway, who would ask "toto".isInstanceOf(String) in a real case scenario where speed matters?)
          =>
            generateTarget(thi,res);
            res.append(".isInstanceOf[")
            generateScalaCodeForInstanceOf(o,res)
            res.append("]")
        case o =>
            res.append("_root_.k2.utils.UTilScala.isInstanceOf(")
            generateTarget(thi,res);
            res.append(",");
            visit(o,res)
            res.append(")")
        }
        //res.append("\n")    
    }  
    
    def generateAsType(thi:CallFeature,res:StringBuilder, o : org.kermeta.language.structure.KermetaModelElement)={
      o match {
        case o : CallTypeLiteral 
          if(!(isCompiledToScalaType(o.getTyperef().getType()) && thi.getTarget.getStaticType()!=o.getTyperef().getType())) // Avoid problem  like var o:Object:="toto" ; var s:String := o.asType(String) => error because o is a RichString and not a jl.String
          =>
            generateTarget(thi,res);
            res.append(".asInstanceOf[")
            generateScalaCodeForInstanceOf(o,res)
            res.append("]")
        case o : CallTypeLiteral =>
            res.append("_root_.k2.utils.UTilScala.getValue(")
            generateTarget(thi,res);
            res.append(").asInstanceOf[")
            generateScalaCodeForInstanceOf(o,res)
            res.append("]")
        case _ => throw new Exception("asType must have a type literal as a parameter. Please report this bug.")
        }
        //res.append("\n")    
    }

    def isCompiledToScalaType(thi:org.kermeta.language.structure.Type):java.lang.Boolean={
      Array(
          "_root_.java.lang.String",
          "_root_.java.lang.Integer",
    	  "_root_.java.lang.Boolean",
    	  "_root_.java.lang.Double",
    	  "_root_.org.eclipse.emf.ecore.resource.ResourceSet",
    	  "_root_.org.eclipse.emf.ecore.resource.Resource",
    	  "_root_.java.lang.Character",
    	  "_root_.java.util.Date",
    	  "_root_.java.util.Random",
    	  "_root_.java.lang.Float",
    	  "_root_.java.util.Iterator",
    	  "_root_.java.lang.Long",
    	  "_root_.java.lang.StringBuilder",
    	  "_root_.java.util.Stack",
    	  "_root_.java.util.HashMap",
    	  "_root_.k2.standard.RichNumeric",
    	  "_root_.k2.standard.Comparable",
    	  "_root_.k2.standard.Summable"
      ).contains(getQualifiedNameCompilo(thi))
    }
  
    def generateIsNotEqual(thi:CallFeature,res:StringBuilder) {
      res.append("_root_.k2.utils.UTilScala.isNotEqual(")
      generateTarget(thi,res)
      res.append(",")
      generateParam(thi,res,"","")
      res.append(")")
    }
    
    def generateToString(thi:CallFeature,res:StringBuilder) {
      res.append("_root_.k2.utils.UTilScala.toString(")
      generateTarget(thi,res)
      res.append(")")
    }
  
    def generateClone(thi:CallFeature,res:StringBuilder){
        res.append("(scalaUtil.Util.clone(");generateTarget(thi,res);res.append(","); visit(thi.getParameters.get(0),res);res.append("))"); 
            if (thi.getTarget.isInstanceOf[CallTypeLiteral]){
                res.append(".asInstanceOf[")
               // if (thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType.isInstanceOf[Class]){
                    res.append("_root_." +k2.utils.TypeEquivalence.getTypeEquivalence(_root_.k2.utils.UTilScala.getQualifiedNameTypeJava(thi.getTarget.asInstanceOf[CallTypeLiteral].getTyperef().getType, ".")))
                    res.append("]")
                //}else{
                 //   res.append("_root_." + _root_.utils.UTilScala.getQualifiedNameType(thi.getTyperef().getType, "."))
                //}
            }
    }
    
    

         	def visitCallOperation(thi:CallOperation,res : StringBuilder) : Unit = {
                log.debug("Operation={}",thi.getName())
                thi.getName match {
                    case "clone" =>  { generateClone(thi,res)  }
      
                    case "and" =>  { res.append("(");generateTarget(thi,res);res.append(").and");generateParam(thi,res,"(",")"); }
                    case "toString" if(thi.getParameters().size()==0) => generateToString(thi,res)
                    case "isNotEqual" if(thi.getParameters().size()==1) => generateIsNotEqual(thi,res)
                    case "equals" if(thi.getParameters().size()==1)=> {res.append("(");generateTarget(thi,res);res.append(" == ");generateParam(thi,res,"(",")");res.append(")");}
                        //case "run" if(thi.getTarget != null) => generateKUnitCase(res)
        
                    case "asType" if(thi.getParameters().size()==1) => generateAsType(thi,res,thi.getParameters().get(0)) //{generateTarget(thi,res);res.append(".asInstanceOf");generateInstanceOf(thi,res, thi.getParameters.get(0))}
                    case "isInstanceOf" if(thi.getParameters().size()==1) => generateIsInstanceOf(thi,res,thi.getParameters.get(0) )

                    case "isVoid" => { res.append("_root_.k2.standard."+GlobalConfiguration.factoryName+".isVoid("); generateTarget(thi,res);res.append(")");}
                    case "new" => generateNew(thi,res)
                    case _ if(thi.getTarget != null && thi.getStaticOperation!=null ) => {generateTarget(thi,res);res.append(".");generateOperationCall(thi,res);generateParam(thi,res,"(",")"); }
                    case _ if(thi.getTarget == null && thi.getStaticOperation!=null ) => {res.append(Util.getEcoreRenameOperation(thi.getStaticOperation));generateParam(thi,res,"(",")") }
                    case _ if(thi.getTarget != null && thi.getStaticOperation==null ) => {generateTarget(thi,res);res.append(".");generateName(thi,res) }
                    case _ => log.debug("!!! Uncatch case ")

                    
                }
            }
         	def visitCallProperty(thi:CallProperty,res : StringBuilder) : Unit = {
                log.debug("CallProperty={}",thi.getName())
                thi.getName match {
                    case _ if(thi.getTarget != null && thi.getStaticProperty!=null ) => {generateTarget(thi,res);res.append(".");generatePropertyCall(thi,res) }
                    case _ if(thi.getTarget == null && thi.getStaticProperty!=null ) => {generatePropertyName(thi,res) }
                    case _ if(thi.getTarget != null && thi.getStaticProperty==null) => {generateTarget(thi,res);res.append(".");generateName(thi,res) }
                    case _ => log.debug("!!! Uncatch case ")
 
                }
            }
         	def visitCallEnumLiteral(thi:CallEnumLiteral,res : StringBuilder) : Unit = {
                log.debug("CallEnumLiteral={}",thi.getName())
                thi.getName match {
                    case _ if(thi.getStaticEnumLiteral !=null ) => {                      
                    res.append(getQualifiedNameCompilo(thi.getStaticEnumLiteral.getEnumeration));res.append(".");generateEnumLiteralCall(thi,res); }
                    case _ => log.debug("!!! Uncatch case ")
 
                }
            }
	
	
        }
