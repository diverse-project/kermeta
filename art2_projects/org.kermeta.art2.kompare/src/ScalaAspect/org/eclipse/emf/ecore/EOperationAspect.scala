package ScalaAspect.org.eclipse.emf.ecore
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait EOperationAspect extends ScalaAspect.org.eclipse.emf.ecore.ETypedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with org.eclipse.emf.ecore.EOperation{
def ScalaeContainingClass : _root_.org.eclipse.emf.ecore.EClass={this.getEContainingClass()}.asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]
def ScalaeGenericExceptions : java.util.List[_root_.org.eclipse.emf.ecore.EGenericType]={this.getEGenericExceptions()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EGenericType]]
def ScalaeGenericExceptions_=(value : java.util.List[_root_.org.eclipse.emf.ecore.EGenericType])={this.getEGenericExceptions().clear
this.getEGenericExceptions().addAll(value)
}
def ScalaeParameters : java.util.List[_root_.org.eclipse.emf.ecore.EParameter]={this.getEParameters()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EParameter]]
def ScalaeParameters_=(value : java.util.List[_root_.org.eclipse.emf.ecore.EParameter])={this.getEParameters().clear
this.getEParameters().addAll(value)
}
def ScalaeTypeParameters : java.util.List[_root_.org.eclipse.emf.ecore.ETypeParameter]={this.getETypeParameters()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.ETypeParameter]]
def ScalaeTypeParameters_=(value : java.util.List[_root_.org.eclipse.emf.ecore.ETypeParameter])={this.getETypeParameters().clear
this.getETypeParameters().addAll(value)
}
def ScalaeExceptions : java.util.List[_root_.org.eclipse.emf.ecore.EClassifier]={this.getEExceptions()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EClassifier]]
def ScalaeExceptions_=(value : java.util.List[_root_.org.eclipse.emf.ecore.EClassifier])={this.getEExceptions().clear
this.getEExceptions().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("ecore.EOperation"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

