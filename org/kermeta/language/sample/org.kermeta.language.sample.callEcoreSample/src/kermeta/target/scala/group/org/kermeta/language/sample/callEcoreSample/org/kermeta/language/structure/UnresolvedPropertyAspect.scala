package group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.org.kermeta.language.sample.callEcoreSample.ImplicitConversion._
trait UnresolvedPropertyAspect extends group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.AbstractPropertyAspect with group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.UnresolvedAspect with `_root_`.org.kermeta.language.structure.UnresolvedProperty{
def ScalapropertyIdentifier : _root_.java.lang.String={this.getPropertyIdentifier()}.asInstanceOf[_root_.java.lang.String]
def ScalapropertyIdentifier_=(value : _root_.java.lang.String)={this.setPropertyIdentifier(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.UnresolvedProperty"); 
         if (cd !=null){ 
 var cl = group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

