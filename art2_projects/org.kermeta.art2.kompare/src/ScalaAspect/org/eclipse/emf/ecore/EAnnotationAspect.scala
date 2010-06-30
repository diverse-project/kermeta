package ScalaAspect.org.eclipse.emf.ecore
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait EAnnotationAspect extends ScalaAspect.org.eclipse.emf.ecore.EModelElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with org.eclipse.emf.ecore.EAnnotation{
def Scalareferences : java.util.List[_root_.org.eclipse.emf.ecore.EObject]={this.getReferences()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EObject]]
def Scalareferences_=(value : java.util.List[_root_.org.eclipse.emf.ecore.EObject])={this.getReferences().clear
this.getReferences().addAll(value)
}
def Scalasource : java.lang.String={this.getSource()}.asInstanceOf[java.lang.String]
def Scalasource_=(value : java.lang.String)={this.setSource(value)}
def Scaladetails : java.util.List[_root_.java.util.Map.Entry[String,String]]={this.getDetails()}.asInstanceOf[java.util.List[_root_.java.util.Map.Entry[String,String]]]
def Scaladetails_=(value : java.util.List[_root_.java.util.Map.Entry[String,String]])={this.getDetails().clear
this.getDetails().addAll(value)
}
def Scalacontents : java.util.List[_root_.org.eclipse.emf.ecore.EObject]={this.getContents()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EObject]]
def Scalacontents_=(value : java.util.List[_root_.org.eclipse.emf.ecore.EObject])={this.getContents().clear
this.getContents().addAll(value)
}
def ScalaeModelElement : _root_.org.eclipse.emf.ecore.EModelElement={this.getEModelElement()}.asInstanceOf[_root_.org.eclipse.emf.ecore.EModelElement]
def ScalaeModelElement_=(value : _root_.org.eclipse.emf.ecore.EModelElement)={this.setEModelElement(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("ecore.EAnnotation"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

