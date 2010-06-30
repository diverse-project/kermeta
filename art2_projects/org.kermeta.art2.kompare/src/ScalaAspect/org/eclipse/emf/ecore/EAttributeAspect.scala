package ScalaAspect.org.eclipse.emf.ecore
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait EAttributeAspect extends ScalaAspect.org.eclipse.emf.ecore.EStructuralFeatureAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with org.eclipse.emf.ecore.EAttribute{
def ScalaeAttributeType : _root_.org.eclipse.emf.ecore.EDataType={this.getEAttributeType()}.asInstanceOf[_root_.org.eclipse.emf.ecore.EDataType]
def ScalaiD : java.lang.Boolean={this.isID()}.asInstanceOf[java.lang.Boolean]
def ScalaiD_=(value : java.lang.Boolean)={this.setID(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("ecore.EAttribute"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

