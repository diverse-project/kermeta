package ScalaAspect.org.eclipse.emf.ecore
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait EModelElementAspect extends ScalaAspect.org.eclipse.emf.ecore.EObjectAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with org.eclipse.emf.ecore.EModelElement{
def ScalaeAnnotations : java.util.List[_root_.org.eclipse.emf.ecore.EAnnotation]={this.getEAnnotations()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EAnnotation]]
def ScalaeAnnotations_=(value : java.util.List[_root_.org.eclipse.emf.ecore.EAnnotation])={this.getEAnnotations().clear
this.getEAnnotations().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("ecore.EModelElement"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

