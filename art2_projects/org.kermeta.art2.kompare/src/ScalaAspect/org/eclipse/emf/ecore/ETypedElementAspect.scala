package ScalaAspect.org.eclipse.emf.ecore
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ETypedElementAspect extends ScalaAspect.org.eclipse.emf.ecore.ENamedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with org.eclipse.emf.ecore.ETypedElement{
def Scalamany : java.lang.Boolean={this.isMany()}.asInstanceOf[java.lang.Boolean]
def ScalalowerBound : Int={this.getLowerBound()}.asInstanceOf[Int]
def ScalalowerBound_=(value : Int)={this.setLowerBound(value)}
def Scalaunique : java.lang.Boolean={this.isUnique()}.asInstanceOf[java.lang.Boolean]
def Scalaunique_=(value : java.lang.Boolean)={this.setUnique(value)}
def ScalaeType : _root_.org.eclipse.emf.ecore.EClassifier={this.getEType()}.asInstanceOf[_root_.org.eclipse.emf.ecore.EClassifier]
def ScalaeType_=(value : _root_.org.eclipse.emf.ecore.EClassifier)={this.setEType(value)}
def Scalaordered : java.lang.Boolean={this.isOrdered()}.asInstanceOf[java.lang.Boolean]
def Scalaordered_=(value : java.lang.Boolean)={this.setOrdered(value)}
def Scalarequired : java.lang.Boolean={this.isRequired()}.asInstanceOf[java.lang.Boolean]
def ScalaupperBound : Int={this.getUpperBound()}.asInstanceOf[Int]
def ScalaupperBound_=(value : Int)={this.setUpperBound(value)}
def ScalaeGenericType : _root_.org.eclipse.emf.ecore.EGenericType={this.getEGenericType()}.asInstanceOf[_root_.org.eclipse.emf.ecore.EGenericType]
def ScalaeGenericType_=(value : _root_.org.eclipse.emf.ecore.EGenericType)={this.setEGenericType(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("ecore.ETypedElement"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

