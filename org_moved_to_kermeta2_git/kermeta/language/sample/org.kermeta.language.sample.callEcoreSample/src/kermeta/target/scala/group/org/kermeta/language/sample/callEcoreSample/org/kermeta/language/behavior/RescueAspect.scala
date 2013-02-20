package group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.org.kermeta.language.sample.callEcoreSample.ImplicitConversion._
trait RescueAspect extends group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.KermetaModelElementAspect with `_root_`.org.kermeta.language.behavior.Rescue{
def Scalabody : java.util.List[_root_.org.kermeta.language.behavior.Expression]={new RichKermetaList(this.getBody())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.behavior.Expression]]
def Scalabody_=(value : java.util.List[_root_.org.kermeta.language.behavior.Expression])={this.getBody().clear
this.getBody().addAll(value)
}
def ScalaexceptionType : _root_.org.kermeta.language.behavior.TypeReference={this.getExceptionType()}.asInstanceOf[_root_.org.kermeta.language.behavior.TypeReference]
def ScalaexceptionType_=(value : _root_.org.kermeta.language.behavior.TypeReference)={this.setExceptionType(value)}
def ScalaexceptionName : _root_.java.lang.String={this.getExceptionName()}.asInstanceOf[_root_.java.lang.String]
def ScalaexceptionName_=(value : _root_.java.lang.String)={this.setExceptionName(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.Rescue"); 
         if (cd !=null){ 
 var cl = group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

