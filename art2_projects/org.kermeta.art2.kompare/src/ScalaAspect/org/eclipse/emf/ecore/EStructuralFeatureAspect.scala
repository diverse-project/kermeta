package ScalaAspect.org.eclipse.emf.ecore
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait EStructuralFeatureAspect extends ScalaAspect.org.eclipse.emf.ecore.ETypedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with org.eclipse.emf.ecore.EStructuralFeature{
def Scalavolatile : java.lang.Boolean={this.isVolatile()}.asInstanceOf[java.lang.Boolean]
def Scalavolatile_=(value : java.lang.Boolean)={this.setVolatile(value)}
def ScalaeContainingClass : _root_.org.eclipse.emf.ecore.EClass={this.getEContainingClass()}.asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]
def ScaladefaultValueLiteral : java.lang.String={this.getDefaultValueLiteral()}.asInstanceOf[java.lang.String]
def ScaladefaultValueLiteral_=(value : java.lang.String)={this.setDefaultValueLiteral(value)}
def Scalatransient : java.lang.Boolean={this.isTransient()}.asInstanceOf[java.lang.Boolean]
def Scalatransient_=(value : java.lang.Boolean)={this.setTransient(value)}
def Scalaunsettable : java.lang.Boolean={this.isUnsettable()}.asInstanceOf[java.lang.Boolean]
def Scalaunsettable_=(value : java.lang.Boolean)={this.setUnsettable(value)}
def Scaladerived : java.lang.Boolean={this.isDerived()}.asInstanceOf[java.lang.Boolean]
def Scaladerived_=(value : java.lang.Boolean)={this.setDerived(value)}
def ScaladefaultValue : java.lang.Object={this.getDefaultValue()}.asInstanceOf[java.lang.Object]
def Scalachangeable : java.lang.Boolean={this.isChangeable()}.asInstanceOf[java.lang.Boolean]
def Scalachangeable_=(value : java.lang.Boolean)={this.setChangeable(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("ecore.EStructuralFeature"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

