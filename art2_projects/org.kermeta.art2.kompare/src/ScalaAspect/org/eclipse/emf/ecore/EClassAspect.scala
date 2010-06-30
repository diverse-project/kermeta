package ScalaAspect.org.eclipse.emf.ecore
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait EClassAspect extends ScalaAspect.org.eclipse.emf.ecore.EClassifierAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ClassDefinition with org.eclipse.emf.ecore.EClass{
def ScalaeStructuralFeatures : java.util.List[_root_.org.eclipse.emf.ecore.EStructuralFeature]={this.getEStructuralFeatures()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EStructuralFeature]]
def ScalaeStructuralFeatures_=(value : java.util.List[_root_.org.eclipse.emf.ecore.EStructuralFeature])={this.getEStructuralFeatures().clear
this.getEStructuralFeatures().addAll(value)
}
def Scalaabstract : java.lang.Boolean={this.isAbstract()}.asInstanceOf[java.lang.Boolean]
def Scalaabstract_=(value : java.lang.Boolean)={this.setAbstract(value)}
def ScalaeOperations : java.util.List[_root_.org.eclipse.emf.ecore.EOperation]={this.getEOperations()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EOperation]]
def ScalaeOperations_=(value : java.util.List[_root_.org.eclipse.emf.ecore.EOperation])={this.getEOperations().clear
this.getEOperations().addAll(value)
}
def ScalaeAllAttributes : java.util.List[_root_.org.eclipse.emf.ecore.EAttribute]={this.getEAllAttributes()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EAttribute]]
def ScalaeReferences : java.util.List[_root_.org.eclipse.emf.ecore.EReference]={this.getEReferences()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EReference]]
def Scalainterface : java.lang.Boolean={this.isInterface()}.asInstanceOf[java.lang.Boolean]
def Scalainterface_=(value : java.lang.Boolean)={this.setInterface(value)}
def ScalaeSuperTypes : java.util.List[_root_.org.eclipse.emf.ecore.EClass]={this.getESuperTypes()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EClass]]
def ScalaeSuperTypes_=(value : java.util.List[_root_.org.eclipse.emf.ecore.EClass])={this.getESuperTypes().clear
this.getESuperTypes().addAll(value)
}
def ScalaeAllReferences : java.util.List[_root_.org.eclipse.emf.ecore.EReference]={this.getEAllReferences()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EReference]]
def ScalaeAllContainments : java.util.List[_root_.org.eclipse.emf.ecore.EReference]={this.getEAllContainments()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EReference]]
def ScalaeGenericSuperTypes : java.util.List[_root_.org.eclipse.emf.ecore.EGenericType]={this.getEGenericSuperTypes()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EGenericType]]
def ScalaeGenericSuperTypes_=(value : java.util.List[_root_.org.eclipse.emf.ecore.EGenericType])={this.getEGenericSuperTypes().clear
this.getEGenericSuperTypes().addAll(value)
}
def ScalaeAllGenericSuperTypes : java.util.List[_root_.org.eclipse.emf.ecore.EGenericType]={this.getEAllGenericSuperTypes()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EGenericType]]
def ScalaeAttributes : java.util.List[_root_.org.eclipse.emf.ecore.EAttribute]={this.getEAttributes()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EAttribute]]
def ScalaeIDAttribute : _root_.org.eclipse.emf.ecore.EAttribute={this.getEIDAttribute()}.asInstanceOf[_root_.org.eclipse.emf.ecore.EAttribute]
def ScalaeAllStructuralFeatures : java.util.List[_root_.org.eclipse.emf.ecore.EStructuralFeature]={this.getEAllStructuralFeatures()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EStructuralFeature]]
def ScalaeAllOperations : java.util.List[_root_.org.eclipse.emf.ecore.EOperation]={this.getEAllOperations()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EOperation]]
def ScalaeAllSuperTypes : java.util.List[_root_.org.eclipse.emf.ecore.EClass]={this.getEAllSuperTypes()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EClass]]
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("ecore.EClass"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

