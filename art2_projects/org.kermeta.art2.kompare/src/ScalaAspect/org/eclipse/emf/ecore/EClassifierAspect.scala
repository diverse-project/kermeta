package ScalaAspect.org.eclipse.emf.ecore
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait EClassifierAspect extends ScalaAspect.org.eclipse.emf.ecore.ENamedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with org.eclipse.emf.ecore.EClassifier{
def ScalainstanceClassName : java.lang.String={this.getInstanceClassName()}.asInstanceOf[java.lang.String]
def ScalainstanceClassName_=(value : java.lang.String)={this.setInstanceClassName(value)}
def ScalaePackage : _root_.org.eclipse.emf.ecore.EPackage={this.getEPackage()}.asInstanceOf[_root_.org.eclipse.emf.ecore.EPackage]
def ScalainstanceClass : java.lang.Class[_]={this.getInstanceClass()}.asInstanceOf[java.lang.Class[_]]
def ScaladefaultValue : java.lang.Object={this.getDefaultValue()}.asInstanceOf[java.lang.Object]
def ScalaeTypeParameters : java.util.List[_root_.org.eclipse.emf.ecore.ETypeParameter]={this.getETypeParameters()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.ETypeParameter]]
def ScalaeTypeParameters_=(value : java.util.List[_root_.org.eclipse.emf.ecore.ETypeParameter])={this.getETypeParameters().clear
this.getETypeParameters().addAll(value)
}
def ScalainstanceTypeName : java.lang.String={this.getInstanceTypeName()}.asInstanceOf[java.lang.String]
def ScalainstanceTypeName_=(value : java.lang.String)={this.setInstanceTypeName(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("ecore.EClassifier"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

