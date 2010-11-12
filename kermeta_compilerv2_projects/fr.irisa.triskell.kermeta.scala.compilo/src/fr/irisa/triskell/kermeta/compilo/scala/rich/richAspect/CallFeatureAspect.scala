package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._
import fr.irisa.triskell.kermeta.compilo.scala.rich.RichAspectImplicit._

trait CallFeatureAspect extends CallExpressionAspect with LogAspect {
	
	
    def generateNew(res : StringBuilder) = {

        if (this.getTarget!=null){
            if (this.getTarget.isInstanceOf[TypeLiteral]){
                if (this.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType().isInstanceOf[ParameterizedType]){
				
                    var ty : TypeDefinition =this.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType().asInstanceOf[ParameterizedType].getTypeDefinition()
                    res.append("_root_.")
                    if (Util.hasEcoreTag(ty.eContainer.asInstanceOf[Package])){
                        res.append(GlobalConfiguration.scalaAspectPrefix+".")
                    }
                    res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(ty.eContainer.asInstanceOf[Package].getQualifiedNameCompilo))
                    res.append(".RichFactory.create")
                    res.append(ty.getName())
                    var ty1 : ParameterizedType = this.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType().asInstanceOf[ParameterizedType]
                    //var i = 0;
                    if (ty1.getTypeParamBinding().size > 0){
                        res.append("[")
                        Util.generateScalaCodeEach(res,ty1.getTypeParamBinding(),",")
                        //ty1.getTypeParamBinding().foreach{e=> if (i>0) res.append(",")	; e.getType().generateScalaCode(res);i=i+1}
                        res.append("]")
                    }
                }
                else{//TODO gérer l'initialisation des types paramétrés
                    res.append("null.asInstanceOf[" + this.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType().getQualifiedNameCompilo() + "]")
                }
            }else{
                res.append("utils.UTilScala.newInstance(")
                this.getTarget.asInstanceOf[ObjectAspect].generateScalaCode(res)
                res.append(")")

            }
        }
    }
	
	
    def generateTarget(res : StringBuilder){
        if (this.getTarget()!=null){
            res.append("(")
            this.getTarget().generateScalaCode(res)
            res.append(")")
        }else{
            println("//TODODODODO " + this.getName);
        }
    }
    def generateParam(res : StringBuilder,openS : String,closeS : String){
        res append openS
        Util.generateScalaCodeEach(res,this.getParameters,", ")
        res append closeS
    }
	
    def generatePropertyCall(res : StringBuilder){
        var TargetType : StringBuilder = new StringBuilder
        this.getTarget().getStaticType().generateScalaCode(TargetType)
        res.append(GlobalConfiguration.scalaPrefix+kermeta.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, this.getName))
		
    }
    def generateOperationCall(res : StringBuilder){
        var TargetType : StringBuilder = new StringBuilder
    
        this.getTarget().getStaticType().generateScalaCode(TargetType)
    
        if(this.getName.contains("split")){
            println("call equivalence")
            //println(Util.protectScalaKeyword(kermeta.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, this.getName)))
        }
    
    
        var ops : List[Operation] = this.getTarget().getStaticType().asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getOwnedOperation.filter(op => op.getName.equals(this.getName))
        if (ops.size>0){
            //if (ops.get(0).getOwnedTags.exists(e=> "EMF_renameAs".equals(e.asInstanceOf[Tag].getName()))){
            //  res.append(Util.protectScalaKeyword(ops.get(0).getOwnedTags.filter( e => "EMF_renameAs".equals(e.asInstanceOf[Tag].getName())).get(0).getValue))
            //}else{
            res.append(Util.protectScalaKeyword(kermeta.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, this.getName)))

            //}
        }else{
            res.append(Util.protectScalaKeyword(kermeta.utils.TypeEquivalence.getMethodEquivalence(TargetType.toString, Util.getEcoreRenameOperation(this.getStaticOperation))))

        }
    }
	
    def generateName(res : StringBuilder){
        res.append(this.getName())
    }
    def generatePropertyName(res : StringBuilder){
        res.append(GlobalConfiguration.scalaPrefix + this.getName())
    }

    def generateEnumLiteralCall(res : StringBuilder){
        if (Util.hasEcoreTag(this.getStaticEnumLiteral.getEnumeration)){
            var res1 : StringBuilder = new StringBuilder
            generateName(res1)
            res.append(res1.toString.toUpperCase())
        }else{
            generateName(res)
        }
    }

    def generateIsInstance(res : StringBuilder){
        res.append(this.getName())
    }

    def generateKUnitCase(res : StringBuilder){
        this.getTarget().generateScalaCode(res)
        res append ".run("
        var i = 0
        this.getParameters.foreach(e=> {
                if(i != 0) { res append ", " }
                res append "classOf["
                var className :StringBuilder = new StringBuilder
                e.generateScalaCode(className)
                className.insert(className.lastIndexOf(".")+1,"Rich")
                res.append(className.toString())
                res append "]"
                i = i + 1
            })
        res append ")"
    }

    def generateInstanceOf(res:StringBuilder, o : fr.irisa.triskell.kermeta.language.structure.Object)={
        res.append("[")
        if (o.isInstanceOf[TypeLiteral]){
            //res.append("_root_.")
            o.asInstanceOf[TypeLiteral].generateScalaCodeForInstanceOf(res)
        }
        else{
            o.asInstanceOf[ObjectAspect].generateScalaCode(res)
        }
        res.append("]")

    }
  
    /* TO MERGE */
    def generateIsInstanceOf(res:StringBuilder, o : fr.irisa.triskell.kermeta.language.structure.Object)={
        if (o.isInstanceOf[TypeLiteral]){
            generateTarget(res);
            res.append(".");
    
            res.append("isInstanceOf[")
            //res.append("_root_.")
            o.asInstanceOf[TypeLiteral].generateScalaCodeForInstanceOf(res)
            res.append("]")
        }
        else{
            res.append("utils.UTilScala.isInstanceOf(")

            generateTarget(res);
            res.append(",");
    
            o.asInstanceOf[ObjectAspect].generateScalaCode(res)
            res.append(")")
        }
        res.append("\n")    
    }  
  
  
    def generateClone(res:StringBuilder){
        res.append("(scalaUtil.Util.clone(");generateTarget(res);res.append(","); this.getParameters.get(0).generateScalaCode(res);res.append("))"); 
            if (this.getTarget.isInstanceOf[TypeLiteral]){
                res.append(".asInstanceOf[")
               // if (this.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType.isInstanceOf[Class]){
                    res.append("_root_." +kermeta.utils.TypeEquivalence.getTypeEquivalence(_root_.utils.UTilScala.getQualifiedNameType(this.getTarget.asInstanceOf[TypeLiteral].getTyperef().getType, ".")))
                    res.append("]")
                //}else{
                 //   res.append("_root_." + _root_.utils.UTilScala.getQualifiedNameType(this.getTyperef().getType, "."))
                //}
            }
    }
    
    

            override def generateScalaCode(res : StringBuilder) : Unit = {
                log.debug("CallFeature={}",this.getName())
                this.getName match {
                    case "clone" =>  { generateClone(res)  }
      
                    case "and" =>  { res.append("(");generateTarget(res);res.append(").and");generateParam(res,"(",")"); }
                        //case "isVoid" => { res.append("(");generateTarget(res);res.append("==null)")  }
                    case "toString" => { res.append("(");generateTarget(res);res.append("+\"\")")  }
                    case "isNotEqual" => {generateTarget(res);res.append(" != ");generateParam(res,"(",")")}
                    case "isEqual" => {generateTarget(res);res.append(" == ");generateParam(res,"(",")")}
                    case "equals" => {res.append("(");generateTarget(res);res.append(" == ");generateParam(res,"(",")");res.append(")");}
                        //case "run" if(this.getTarget != null) => generateKUnitCase(res)
        
        
                    case "asType" => {generateTarget(res);res.append(".asInstanceOf");generateInstanceOf(res, this.getParameters.get(0))}
      
                    case "asKindOf" => {generateTarget(res);res.append(".asInstanceOf");generateInstanceOf(res, this.getParameters.get(0))}
                        //case "isInstanceOf" => {generateTarget(res);res.append(".isInstanceOf");generateInstanceOf(res, this.getParameters.get(0))}
                    case "isInstance" => {generateParam(res,"","") ;res.append(".isInstanceOf");generateInstanceOf(res, this.getTarget)}
      
                    case "isKindOf" => generateIsInstanceOf(res,this.getParameters.get(0) )
                    case "isInstanceOf" => generateIsInstanceOf(res,this.getParameters.get(0) )
        
      
                    case "isVoid" => { res.append("_root_.kermeta.standard.RichFactory.isVoid("); generateTarget(res);res.append(")");}
                    case "add"
                        if (this.getTarget != null && this.getTarget.getStaticType != null && this.getTarget.getStaticType.isInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class]
                            && (this.getTarget.getStaticType.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class].getTypeDefinition.getName.equals("OrderedSet")
                                ||this.getTarget.getStaticType.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class].getTypeDefinition.getName.equals("Set")))
                                    =>{generateTarget(res);res.append(".");res.append("addUnique");generateParam(res,"(",")")}
                    case "addAll"
                        if (this.getTarget != null && (this.getTarget.getStaticType != null && this.getTarget.getStaticType.isInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class]) //|| (this.getStaticProperty != null && this.getStaticProperty.getType.isInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class]))
                            && (this.getTarget.getStaticType.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class].getTypeDefinition.getName.equals("OrderedSet")
                                ||this.getTarget.getStaticType.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.Class].getTypeDefinition.getName.equals("Set")))
                                    =>{generateTarget(res);res.append(".");res.append("addAllUnique");generateParam(res,"(",")")}
                    case "new" => generateNew(res)
                    case _ if(this.getTarget != null && this.getStaticOperation!=null && this.getStaticProperty==null) => {generateTarget(res);res.append(".");generateOperationCall(res);generateParam(res,"(",")")}
                    case _ if(this.getTarget == null && this.getStaticOperation!=null && this.getStaticProperty==null) => {res.append(Util.getEcoreRenameOperation(this.getStaticOperation));generateParam(res,"(",")") }
                    case _ if(this.getTarget != null && this.getStaticProperty!=null && this.getStaticOperation==null) => {generateTarget(res);res.append(".");generatePropertyCall(res) }
                    case _ if(this.getTarget == null && this.getStaticProperty!=null && this.getStaticOperation==null) => {generatePropertyName(res) }
                    case _ if(this.getTarget != null && this.getStaticProperty==null && this.getStaticOperation==null && this.getStaticEnumLiteral !=null ) => {generateTarget(res);res.append(".");generateEnumLiteralCall(res); }
                    case _ if(this.getTarget != null && this.getStaticProperty==null && this.getStaticOperation==null && this.getStaticEnumLiteral ==null) => {generateTarget(res);res.append(".");generateName(res) }
                    case _ => log.debug("!!! Uncatch case ")
 
                }
            }
	
	
        }
