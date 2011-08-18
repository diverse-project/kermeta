package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import _root_.k2.utils.ReflexivityLoader
import org.antlr.stringtemplate.StringTemplate
import org.eclipse.emf.common.util.EList
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.compilo.scala.visitor._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._
import _root_.java.util.ArrayList

trait ClassDefinitionAspect extends KermetaModelElementAspect with IVisitable {
	
    override def accept(visitor : IVisitor){
        visitor.visit(this)
    }
	
    override def generateScalaCode(res : StringBuilder) : Unit = {
        res.append("import "+ "_root_."+ GlobalConfiguration.frameworkGeneratedPackageName + "."+GlobalConfiguration.implicitConvTraitName +"._\n")
        if (Util.hasEcoreTag(this)){
            res.append("trait ")
            res.append(this.getName())
            res.append("Aspect")
            this.generateParamerterClass(res)
            if (this.getSuperType.size == 0){
              res append " extends "
               // res append Util.protectScalaKeyword(/*org.kermeta.language.structureScalaAspect.aspect.FrameworkAspectUtil.getDefaultAspect(*/this.getQualifiedNameCompilo())
                 res.append("_root_.k2.standard.KermetaObject")
            } else {
                var i = 0;
                this.getSuperType.foreach(superC => {
                        if (i==0) {
                            res.append(" extends ")
                        } else {
                            res.append(" with ")
                        }
					
                        var ty : GenericTypeDefinition = superC.asInstanceOf[Class].getTypeDefinition
						
                       res.append(Util.protectScalaKeyword(Util.getQualifiedNamedAspect(superC.asInstanceOf[Class].getTypeDefinition)))
                        generateBindingParamerterClass(superC.asInstanceOf[Class],res)
                        i=i+1
                    })
				
               // res append " with "+ /*org.kermeta.language.structureScalaAspect.aspect.FrameworkAspectUtil.getDefaultAspect(*/this.getQualifiedNameCompilo()
            }
            
            var param : StringBuilder = new  StringBuilder
            this.generateParamerterClass(param)

              res append " with "
               // res append Util.protectScalaKeyword(/*org.kermeta.language.structureScalaAspect.aspect.FrameworkAspectUtil.getDefaultAspect(*/this.getQualifiedNameCompilo())

            if (!Util.hasEcoreFromAPITag(this)){
                res append Util.protectScalaKeyword("_root_."+Util.getQualifiedNamedBase(this) + param.toString)
            }
            else
                res.append(
                  Util.protectScalaKeyword("_root_."+this.eContainer.asInstanceOf[KermetaModelElementAspect].getQualifiedNameCompilo) + ".itf."+ this.getName() +"Itf" + param.toString)
	    
            res.append("{\n")

				
				
            this.getOwnedAttribute foreach(a=> a.generateScalaCode(res))
            this.getOwnedOperation filter(op=> !Util.hasEcoreTag(op) || op.getBody !=null) foreach(op=> op.generateScalaCode(res))
            this.generateInvariants(res)
            this.generategetQualifiedName(res)
            res.append("}\n")

        }else{
            res.append("trait ")
            res.append(this.getName())
            res.append("Aspect")
            this.generateParamerterClass(res)

            if (this.getSuperType.size == 0){
                //TODO extends a superClassAspect
            }else{
                res.append(" ")
				
                var i = 0;
                this.getSuperType.foreach(superC => {
                        if (i==0) {
                            res.append(" extends ")
                        } else {
                            res.append(" with ")
                        }

            res.append("_root_."+Util.getQualifiedNamedAspect(superC.asInstanceOf[Class].getTypeDefinition))
                        generateBindingParamerterClass(superC.asInstanceOf[Class],res)
                        i=i+1
                    })
            }
            res append " with "+Util.protectScalaKeyword("_root_."+Util.getQualifiedNamedBase(this))
            res.append("{\n")

            this.getOwnedAttribute foreach(a=> a.generateScalaCode(res))
            this.getOwnedOperation filter(op=> !Util.hasEcoreTag(op)) foreach(op=> op.generateScalaCode(res))
            
				
            /* Generate Invariants */
            this.generateInvariants(res)
            this.generategetQualifiedName(res)
      

            res.append("}\n")
        } 
    }


    def generategetQualifiedName(res:StringBuilder) = {
        var qualifiedName = ReflexivityLoader.qualifiedName(this)
        var template = new StringTemplate("override def getMetaClass():org.kermeta.language.structure.Class={\n var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass(\"$ClassName$\"); \n         if (cd !=null){ \n var cl = "+org.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix+".org.kermeta.language.structure."+GlobalConfiguration.factoryName+".createClass \n cl.setTypeDefinition(cd) \n return cl \n }else \n return null; \n }\n")
        template.setAttribute("ClassName", qualifiedName)
        res.append(template.toString)
    }

    def generateInvariants(res1:StringBuilder) = {
        var listInv = this.getAllInvariants

        if(listInv.size() > 0){
            res1.append("override def checkInvariants(){\n")
            res1.append("val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ")
            var i = 0
            listInv.filter(b => !Util.hasCompilerIgnoreTag(b)  ).foreach(a => {
                    if(i != 0) res1.append(",")
                    res1.append("(")
                    res1.append("\""+a.getName+"\" -> (()=>")
                    a.generateScalaCode(res1)
                    res1.append("))")
                    i = i + 1
                })
            res1.append(" )\n")
            res1.append("checkParamInvariants(invariants)\n")
            /*
             this.getSuperType.foreach(superC => {
             res.append("super[")
             res.append(superC.asInstanceOf[Class].getTypeDefinition.getName)
             res.append("Aspect].checkInvariants\n")
             })*/
            //res.append("checkParamInvariants(super.getInvariants)\n")
            res1.append("}\n")
            /* End checkInvariants Generation  */

            res1.append("override def checkAllInvariants(){\n")
            res1.append("val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ")
             i = 0
            listInv.filter(b => !Util.hasCompilerIgnoreTag(b)  ).foreach(a => {
                    if(i != 0) res1.append(",")
                    res1.append("(")
                    res1.append("\""+a.getName+"\" -> (()=>")
                    a.generateScalaCode(res1)
                    res1.append("))")
                    i = i + 1
                })
            res1.append(" )\n")
            res1.append("checkParamInvariants(invariants, constraintDiagnostic)\n")
            
            /*
             this.getSuperType.foreach(superC => {
             res.append("super[")
             res.append(superC.asInstanceOf[Class].getTypeDefinition.getName)
             res.append("Aspect].checkInvariants\n")
             })*/
            //res.append("checkParamInvariants(super.getInvariants)\n")
            res1.append("}\n")

            res1.append("override def getInvariants() :  scala.collection.immutable.HashMap[String,Condition] = {\n")
            res1.append("val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ")
             i = 0
            listInv.filter(b => !Util.hasCompilerIgnoreTag(b)  ).foreach(a => {
                    if(i != 0) res1.append(",")
                    res1.append("(")
                    res1.append("\""+a.getName+"\" -> (()=>")
                    a.generateScalaCode(res1)
                    res1.append("))")
                    i = i + 1
                })
            res1.append(" )\n")
            res1.append("return invariants\n")

            /*
             this.getSuperType.foreach(superC => {
             res.append("super[")
             res.append(superC.asInstanceOf[Class].getTypeDefinition.getName)
             res.append("Aspect].checkInvariants\n")
             })*/
            //res.append("checkParamInvariants(super.getInvariants)\n")
            res1.append("}\n")

        }
    }

    def getAllInvariants() : _root_.java.util.List[Constraint] =  {
        var result = new _root_.java.util.ArrayList[Constraint]()
      result.addAll(this.getInv)
        this.getSuperType.foreach{st =>
            st match {
                case cd:Class => {
                            result.addAll(cd.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition].getAllInvariants)
                    }
                case _ => println("TOTO " + st)
            }
        }
        return result
    }
	
    override def getQualifiedNameCompilo():String = {

      var baseName : String = _root_.k2.utils.TypeEquivalence.getTypeEquivalence(this.eContainer().asInstanceOf[KermetaModelElementAspect].getQualifiedNameCompilo() + "."+ this.getName())
      return baseName

    /*
    if(baseName.contains("org.kermeta.language.structure.Object")){
        log.error("=====INFO "+Util.hasEcoreTag(this)+" "+Util.hasEcoreTag(this.eContainer().asInstanceOf[Object]))
      }

        baseName = baseName match {
        //case _ if(!Util.hasEcoreTag(this) && Util.hasEcoreTag(this.eContainer().asInstanceOf[Object])) => { "ScalaAspect."+baseName }
        case _ if(Util.hasEcoreTag(this) && Util.hasEcoreTag(this.eContainer().asInstanceOf[Object])) => baseName
        case _ if(!Util.hasEcoreTag(this) && !Util.hasEcoreTag(this.eContainer().asInstanceOf[Object])) => baseName
        case _ => { "ScalaAspect."+baseName }
      }

       return baseName*/


    }

    def getQualifiedNameKermeta():String ={
        this.eContainer().asInstanceOf[PackageAspect].getQualifiedNameKermeta() + "::"+ this.getName();
    }
	
    def generateParamerterClass(res1:StringBuilder) = {
        if (this.getTypeParameter().size()>0){
            var i = 0
            res1.append("[")
            this.getTypeParameter().foreach{param =>
                if (i>0)
                    res1.append(",")
                res1.append(param.getQualifiedNameCompilo())
                i=i+1
            }
            res1.append("]")
        }
    }
    def generateBindingParamerterClass(superC:Class,res1:StringBuilder) = {
        if (superC.getTypeParamBinding().size()>0){  res1.append("[")
                                                   var ii = 0;
                                                   superC.getTypeParamBinding.foreach{binding=>
                if (ii>0) {res1.append(",")}
                binding.getType.generateScalaCode(res1)
                ii= ii+1
            }
                                                   res1.append("]")
        }
    }
}
