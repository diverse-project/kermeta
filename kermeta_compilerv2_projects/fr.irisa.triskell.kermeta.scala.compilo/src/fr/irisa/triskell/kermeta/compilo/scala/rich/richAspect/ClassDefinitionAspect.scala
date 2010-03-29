package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import kermeta.utils.ReflexivityLoader
import org.antlr.stringtemplate.StringTemplate
import org.antlr.stringtemplate.StringTemplateGroup
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.impl.EObjectImpl
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._

trait ClassDefinitionAspect extends RichAspectImplicit with ObjectAspect with IVisitable {
	
    override def accept(visitor : IVisitor){
        visitor.visit(this)
    }
	
    override def generateScalaCode(res : StringBuilder) : Unit = {
        if (Util.hasEcoreTag(this)){
            res.append("trait ")
            res.append(this.getName())
            res.append("Aspect")
            this.generateParamerterClass(res)
			
			
            if (this.getSuperType.size == 0){//1 && "Object".equals(this.getSuperType.first.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition].getName) ){
                res append " extends "+ fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.FrameworkAspectUtil.getDefaultAspect(this.getQualifiedNameCompilo())
                // res.append(" with ScalaAspect.org.eclipse.emf.ecore.EObjectAspect")
                res append " with "+GlobalConfiguration.frameworkGeneratedPackageName + "."+GlobalConfiguration.implicitConvTraitName
            } else {
                var i = 0;
                this.getSuperType.foreach(superC => {
                        if (i==0) {
                            res.append(" extends ")
                        } else {
                            res.append(" with ")
                        }
					
                        var ty : GenericTypeDefinition = superC.asInstanceOf[Class].getTypeDefinition
						
			/*
                        var packName = kermeta.utils.TypeEquivalence.getPackageEquivalence(ty.eContainer.asInstanceOf[Package].getQualifiedName)
                        if (Util.hasEcoreTag(ty.eContainer.asInstanceOf[Package]) ){
                            packName = GlobalConfiguration.scalaAspectPrefix+"."+packName
                        }
                        res.append(Util.protectScalaKeyword(packName))
						
						
                        res.append(".")
                        res.append(superC.asInstanceOf[Class].getTypeDefinition.getName)
                        res.append("Aspect")
                        */
                        res.append(Util.getQualifiedNamedAspect(superC.asInstanceOf[Class].getTypeDefinition))
                        generateBindingParamerterClass(superC.asInstanceOf[Class],res)
                        /*}else{
                         res.append(" with ")
                         var ty : GenericTypeDefinition = superC.asInstanceOf[Class].getTypeDefinition
                         res.append(Util.protectScalaKeyword(kermeta.utils.TypeEquivalence.getPackageEquivalence(ty.eContainer.asInstanceOf[Package].getQualifiedName)))
                         res.append(".")
                         res.append(Util.protectScalaKeyword(superC.asInstanceOf[Class].getTypeDefinition.getName))
                         }*/
                        i=i+1
                    })
				
                res append " with "+ fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.FrameworkAspectUtil.getDefaultAspect(this.getQualifiedNameCompilo())
                res append " with "+GlobalConfiguration.frameworkGeneratedPackageName + "."+GlobalConfiguration.implicitConvTraitName
            }
            res append " with "+Util.protectScalaKeyword(Util.getQualifiedNamedBase(this))
	   // res.append("{\n")
      res.append("{this:"+Util.protectScalaKeyword(Util.protectScalaKeyword(Util.getQualifiedNamedBase(this)))+"=>\n")
				
				
				
            this.getOwnedAttribute foreach(a=> a.generateScalaCode(res))
            this.getOwnedOperation filter(op=> !Util.hasEcoreTag(op) || op.getBody !=null) foreach(op=> op.generateScalaCode(res))
            this.generategetQualifiedName(res)
            res.append("}\n")

        }else{
            res.append("trait ")
            res.append(this.getName())
            res.append("Aspect")
            this.generateParamerterClass(res)

            if (this.getSuperType.size == 0){
                //res.append(" extends "+Util.traitname)
                //TODO extends a superClassAspect
            }else{
                //res.append(" extends org.eclipse.emf.ecore.impl.EObjectImpl ")
                res.append(" ")
				
                var i = 0;
                this.getSuperType.foreach(superC => {
                        if (i==0) {
                            res.append(" extends ")
                        } else {
                            res.append(" with ")
                        }
                        /*						res.append(" extends ")
                         var ty : GenericTypeDefinition = superC.asInstanceOf[Class].getTypeDefinition
                         res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(ty.eContainer.asInstanceOf[Package].getQualifiedName))
                         res.append(".")
                         res.append(superC.asInstanceOf[Class].getTypeDefinition.getName)
                         *///					}else{
                        //res.append(" with ")
                        //var ty : GenericTypeDefinition = superC.asInstanceOf[Class].getTypeDefinition
                        //if (Util.hasEcoreTag(ty) ){
                        //    res.append(GlobalConfiguration.scalaAspectPrefix+".")
                        //}
                        //res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(ty.eContainer.asInstanceOf[Package].getQualifiedName))
            
								
                        //res.append(".")

            //println(superC.asInstanceOf[Class].getTypeDefinition.getQualifiedNameCompilo)

            res.append(Util.getQualifiedNamedAspect(superC.asInstanceOf[Class].getTypeDefinition))
            //res.append(superC.asInstanceOf[Class].getTypeDefinition.getQualifiedNameCompilo)
                        //res.append("Aspect")
                        generateBindingParamerterClass(superC.asInstanceOf[Class],res)
                        //returnedString =returnedString + ", " +superC.getName;
                        //					}
                        i=i+1
                    })
                res append " with "+GlobalConfiguration.frameworkGeneratedPackageName + "."+GlobalConfiguration.implicitConvTraitName
            }
            //res.append("{\n")
            res.append("{this:"+Util.protectScalaKeyword(Util.protectScalaKeyword(Util.getQualifiedNamedBase(this)))+"=>\n")

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
        var template = new StringTemplate("override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={\n var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass(\"$ClassName$\"); \n         if (cd !=null){ \n var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure. RichFactory.createClass \n cl.setTypeDefinition(cd) \n return cl \n }else \n return null; \n }\n")
        template.setAttribute("ClassName", qualifiedName)
        res.append(template.toString)
    }

    def generateInvariants(res1:StringBuilder) = {
        var listInv = this.getAllInvariants
        if(this.getInv().size() > 0){
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
        }
    }


  
    def getAllInvariants() : EList[Constraint] =  {
        var result = this.getInv
        this.getSuperType.foreach{st =>
            st match {
                case cd:Class => {

                        //TODO OPTIMISE WITH FLATTEN
                        if(result.forall({inv => { true }})){
                            result.addAll(cd.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition].getAllInvariants)
                        }
            
                    }
                case _ => println(st)
            }
        }
        return result
    }
	
    override def getQualifiedNameCompilo():String = {

      var baseName : String = kermeta.utils.TypeEquivalence.getTypeEquivalence(this.eContainer().asInstanceOf[ObjectAspect].getQualifiedNameCompilo() + "."+ this.getName())
      return baseName

    /*
    if(baseName.contains("fr.irisa.triskell.kermeta.language.structure.Object")){
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
