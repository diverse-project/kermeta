package ScalaAspect.org.eclipse.emf.ecore
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait EGenericTypeAspect extends ScalaAspect.org.eclipse.emf.ecore.EObjectAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with org.eclipse.emf.ecore.EGenericType{
def ScalaeUpperBound : _root_.org.eclipse.emf.ecore.EGenericType={this.getEUpperBound()}.asInstanceOf[_root_.org.eclipse.emf.ecore.EGenericType]
def ScalaeUpperBound_=(value : _root_.org.eclipse.emf.ecore.EGenericType)={this.setEUpperBound(value)}
def ScalaeTypeArguments : java.util.List[_root_.org.eclipse.emf.ecore.EGenericType]={this.getETypeArguments()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EGenericType]]
def ScalaeTypeArguments_=(value : java.util.List[_root_.org.eclipse.emf.ecore.EGenericType])={this.getETypeArguments().clear
this.getETypeArguments().addAll(value)
}
def ScalaeClassifier : _root_.org.eclipse.emf.ecore.EClassifier={this.getEClassifier()}.asInstanceOf[_root_.org.eclipse.emf.ecore.EClassifier]
def ScalaeClassifier_=(value : _root_.org.eclipse.emf.ecore.EClassifier)={this.setEClassifier(value)}
def ScalaeRawType : _root_.org.eclipse.emf.ecore.EClassifier={this.getERawType()}.asInstanceOf[_root_.org.eclipse.emf.ecore.EClassifier]
def ScalaeTypeParameter : _root_.org.eclipse.emf.ecore.ETypeParameter={this.getETypeParameter()}.asInstanceOf[_root_.org.eclipse.emf.ecore.ETypeParameter]
def ScalaeTypeParameter_=(value : _root_.org.eclipse.emf.ecore.ETypeParameter)={this.setETypeParameter(value)}
def ScalaeLowerBound : _root_.org.eclipse.emf.ecore.EGenericType={this.getELowerBound()}.asInstanceOf[_root_.org.eclipse.emf.ecore.EGenericType]
def ScalaeLowerBound_=(value : _root_.org.eclipse.emf.ecore.EGenericType)={this.setELowerBound(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("ecore.EGenericType"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

