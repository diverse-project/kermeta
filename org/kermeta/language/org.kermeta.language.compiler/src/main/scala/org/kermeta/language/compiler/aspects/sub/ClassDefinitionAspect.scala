package org.kermeta.language.compiler.aspects.sub

import org.antlr.stringtemplate.StringTemplate
import scala.collection.JavaConversions._
import org.kermeta.language.structure._
import org.eclipse.emf.common.util.EList
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.FrameworkAspectUtil
import org.kermeta.language.compiler.GlobalConfiguration
import org.kermeta.language.compiler.ReflexivityLoader
import org.kermeta.language.compiler.RichAspectImplicit._
import org.kermeta.language.compiler.TypeEquivalence
import org.kermeta.language.compiler.Util
import org.kermeta.language.compiler.visitor._
import scala.collection.JavaConversions._
import org.kermeta.language.compiler.aspects.ImplicitAspects._
import org.kermeta.language.structure.{ClassDefinition => KClassDefinition}

trait ClassDefinitionAspect extends ObjectAspect with IVisitable {

  lazy val ClassDefinitionAspect_self = self.asInstanceOf[ClassDefinition]

  override def accept(visitor : IVisitor){
    visitor.visit(ClassDefinitionAspect_self)
  }
	
  override def generateScalaCode(res : StringBuilder) : Unit = {
    res.append("import "+ "_root_."+ GlobalConfiguration.frameworkGeneratedPackageName + "."+GlobalConfiguration.implicitConvTraitName +"._\n")
    if (Util.hasEcoreTag(ClassDefinitionAspect_self)){
      res.append("trait ")
      res.append(ClassDefinitionAspect_self.getName())
      res.append("Aspect")
      this.generateParamerterClass(res)
      if (ClassDefinitionAspect_self.getSuperType.size == 0){//1 && "Object".equals(this.getSuperType.first.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition].getName) ){
        res append " extends "
        res append Util.protectScalaKeyword(FrameworkAspectUtil.getDefaultAspect(this.getQualifiedNameCompilo()))
        // res.append(" with ScalaAspect.org.eclipse.emf.ecore.EObjectAspect")
//                res append " with "+GlobalConfiguration.frameworkGeneratedPackageName + "."+GlobalConfiguration.implicitConvTraitName
      } else {
        var i = 0;
        ClassDefinitionAspect_self.getSuperType.foreach(superC => {
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
            res.append(Util.protectScalaKeyword(Util.getQualifiedNamedAspect(superC.asInstanceOf[Class].getTypeDefinition)))
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
				
        res append " with "+ FrameworkAspectUtil.getDefaultAspect(this.getQualifiedNameCompilo())
//                res append " with "+GlobalConfiguration.frameworkGeneratedPackageName + "."+GlobalConfiguration.implicitConvTraitName
      }
      res append " with "+Util.protectScalaKeyword("_root_."+Util.getQualifiedNamedBase(ClassDefinitionAspect_self))
      res.append("{\n")
      //  res.append("{this:"+Util.protectScalaKeyword(Util.getQualifiedNamedBase(this))+"=>\n")
				
				
				
      ClassDefinitionAspect_self.getOwnedAttribute foreach(a=> a.generateScalaCode(res))
      ClassDefinitionAspect_self.getOwnedOperation filter(op=> !Util.hasEcoreTag(op) || op.getBody !=null) foreach(op=> op.generateScalaCode(res))
      generateInvariants(res)
      generategetQualifiedName(res)
      res.append("}\n")

    }else{
      res.append("trait ")
      res.append(ClassDefinitionAspect_self.getName())
      res.append("Aspect")
      this.generateParamerterClass(res)

      if (ClassDefinitionAspect_self.getSuperType.size == 0){
        //res.append(" extends "+Util.traitname)
        //TODO extends a superClassAspect
      }else{
        //res.append(" extends org.eclipse.emf.ecore.impl.EObjectImpl ")
        res.append(" ")
				
        var i = 0;
        ClassDefinitionAspect_self.getSuperType.foreach(superC => {
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

            res.append("_root_."+Util.getQualifiedNamedAspect(superC.asInstanceOf[Class].getTypeDefinition))
            //res.append(superC.asInstanceOf[Class].getTypeDefinition.getQualifiedNameCompilo)
            //res.append("Aspect")
            generateBindingParamerterClass(superC.asInstanceOf[Class],res)
            //returnedString =returnedString + ", " +superC.getName;
            //					}
            i=i+1
          })
        //              res append " with "+GlobalConfiguration.frameworkGeneratedPackageName + "."+GlobalConfiguration.implicitConvTraitName
      }
      res append " with "+Util.protectScalaKeyword("_root_."+Util.getQualifiedNamedBase(ClassDefinitionAspect_self))
      res.append("{\n")
      //res.append("{this:"+Util.protectScalaKeyword(Util.protectScalaKeyword(Util.getQualifiedNamedBase(this)))+"=>\n")

      ClassDefinitionAspect_self.getOwnedAttribute foreach(a=> a.generateScalaCode(res))
      ClassDefinitionAspect_self.getOwnedOperation filter(op=> !Util.hasEcoreTag(op)) foreach(op=> op.generateScalaCode(res))
            
				
      /* Generate Invariants */
      generateInvariants(res)
      generategetQualifiedName(res)
      

      res.append("}\n")
    }
  }


  def generategetQualifiedName(res:StringBuilder) = {
    var qualifiedName = ReflexivityLoader.qualifiedName(ClassDefinitionAspect_self)
    var template = new StringTemplate("override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={\n var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   _root_.kermeta.utils.ReflexivityLoader.getMetaClass(\"$ClassName$\"); \n         if (cd !=null){ \n var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass \n cl.setTypeDefinition(cd) \n return cl \n }else \n return null; \n }\n")
    template.setAttribute("ClassName", qualifiedName)
    res.append(template.toString)
  }

  def generateInvariants(res1:StringBuilder) = {
    var listInv = this.getAllInvariants
    if(ClassDefinitionAspect_self.getInv().size() > 0){
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

    }
  }

  def getAllInvariants() : EList[Constraint] =  {
    var result = ClassDefinitionAspect_self.getInv
    ClassDefinitionAspect_self.getSuperType.foreach{st =>
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

    var baseName : String = TypeEquivalence.getTypeEquivalence(ClassDefinitionAspect_self.eContainer().asInstanceOf[ObjectAspect].getQualifiedNameCompilo() + "."+ ClassDefinitionAspect_self.getName())
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
    ClassDefinitionAspect_self.eContainer().asInstanceOf[PackageAspect].getQualifiedNameKermeta() + "::"+ ClassDefinitionAspect_self.getName();
  }
	
  def generateParamerterClass(res1:StringBuilder) = {
    if (ClassDefinitionAspect_self.getTypeParameter().size()>0){
      var i = 0
      res1.append("[")
      ClassDefinitionAspect_self.getTypeParameter().foreach{param =>
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
case class RichClassDefinition(_self : KClassDefinition) extends ClassDefinitionAspect { self = _self  }
