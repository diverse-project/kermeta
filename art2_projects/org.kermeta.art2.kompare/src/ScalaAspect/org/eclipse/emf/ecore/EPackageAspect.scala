package ScalaAspect.org.eclipse.emf.ecore
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait EPackageAspect extends ScalaAspect.org.eclipse.emf.ecore.ENamedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with org.eclipse.emf.ecore.EPackage{
def ScalansURI : java.lang.String={this.getNsURI()}.asInstanceOf[java.lang.String]
def ScalansURI_=(value : java.lang.String)={this.setNsURI(value)}
def ScalaeSubpackages : java.util.List[_root_.org.eclipse.emf.ecore.EPackage]={this.getESubpackages()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EPackage]]
def ScalaeSubpackages_=(value : java.util.List[_root_.org.eclipse.emf.ecore.EPackage])={this.getESubpackages().clear
this.getESubpackages().addAll(value)
}
def ScalaeSuperPackage : _root_.org.eclipse.emf.ecore.EPackage={this.getESuperPackage()}.asInstanceOf[_root_.org.eclipse.emf.ecore.EPackage]
def ScalansPrefix : java.lang.String={this.getNsPrefix()}.asInstanceOf[java.lang.String]
def ScalansPrefix_=(value : java.lang.String)={this.setNsPrefix(value)}
def ScalaeFactoryInstance : _root_.org.eclipse.emf.ecore.EFactory={this.getEFactoryInstance()}.asInstanceOf[_root_.org.eclipse.emf.ecore.EFactory]
def ScalaeFactoryInstance_=(value : _root_.org.eclipse.emf.ecore.EFactory)={this.setEFactoryInstance(value)}
def ScalaeClassifiers : java.util.List[_root_.org.eclipse.emf.ecore.EClassifier]={this.getEClassifiers()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EClassifier]]
def ScalaeClassifiers_=(value : java.util.List[_root_.org.eclipse.emf.ecore.EClassifier])={this.getEClassifiers().clear
this.getEClassifiers().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("ecore.EPackage"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

