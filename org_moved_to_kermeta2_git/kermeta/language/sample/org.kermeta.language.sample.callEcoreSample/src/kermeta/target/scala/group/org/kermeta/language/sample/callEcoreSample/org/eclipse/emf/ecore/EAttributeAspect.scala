package group.org.kermeta.language.sample.callEcoreSample.org.eclipse.emf.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.org.kermeta.language.sample.callEcoreSample.ImplicitConversion._
trait EAttributeAspect extends group.org.kermeta.language.sample.callEcoreSample.org.eclipse.emf.ecore.EStructuralFeatureAspect with `_root_`.org.eclipse.emf.ecore.EAttribute{
def ScalaiD : _root_.java.lang.Boolean={this.isID()}.asInstanceOf[_root_.java.lang.Boolean]
def ScalaiD_=(value : _root_.java.lang.Boolean)={this.setID(value)}
def ScalaeAttributeType : _root_.org.eclipse.emf.ecore.EDataType={this.getEAttributeType()}.asInstanceOf[_root_.org.eclipse.emf.ecore.EDataType]
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EAttribute"); 
         if (cd !=null){ 
 var cl = group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

