package group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.org.kermeta.language.sample.callEcoreSample.ImplicitConversion._
trait RequireAspect extends group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.KermetaModelElementAspect with `_root_`.org.kermeta.language.structure.Require{
def Scalauri : _root_.java.lang.String={this.getUri()}.asInstanceOf[_root_.java.lang.String]
def Scalauri_=(value : _root_.java.lang.String)={this.setUri(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Require"); 
         if (cd !=null){ 
 var cl = group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

