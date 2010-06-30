package ScalaAspect.org.eclipse.emf.ecore
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait EReferenceAspect extends ScalaAspect.org.eclipse.emf.ecore.EStructuralFeatureAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with org.eclipse.emf.ecore.EReference{
def ScalaeReferenceType : _root_.org.eclipse.emf.ecore.EClass={this.getEReferenceType()}.asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]
def ScalaeOpposite : _root_.org.eclipse.emf.ecore.EReference={this.getEOpposite()}.asInstanceOf[_root_.org.eclipse.emf.ecore.EReference]
def ScalaeOpposite_=(value : _root_.org.eclipse.emf.ecore.EReference)={this.setEOpposite(value)}
def ScalaresolveProxies : java.lang.Boolean={this.isResolveProxies()}.asInstanceOf[java.lang.Boolean]
def ScalaresolveProxies_=(value : java.lang.Boolean)={this.setResolveProxies(value)}
def Scalacontainer : java.lang.Boolean={this.isContainer()}.asInstanceOf[java.lang.Boolean]
def ScalaeKeys : java.util.List[_root_.org.eclipse.emf.ecore.EAttribute]={this.getEKeys()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EAttribute]]
def ScalaeKeys_=(value : java.util.List[_root_.org.eclipse.emf.ecore.EAttribute])={this.getEKeys().clear
this.getEKeys().addAll(value)
}
def Scalacontainment : java.lang.Boolean={this.isContainment()}.asInstanceOf[java.lang.Boolean]
def Scalacontainment_=(value : java.lang.Boolean)={this.setContainment(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("ecore.EReference"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

