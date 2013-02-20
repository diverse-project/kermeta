package group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.org.kermeta.language.sample.callEcoreSample.ImplicitConversion._
trait JavaStaticCallAspect extends group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.behavior.ExpressionAspect with `_root_`.org.kermeta.language.behavior.JavaStaticCall{
def Scalaparameters : java.util.List[_root_.org.kermeta.language.behavior.Expression]={new RichKermetaList(this.getParameters())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.behavior.Expression]]
def Scalaparameters_=(value : java.util.List[_root_.org.kermeta.language.behavior.Expression])={this.getParameters().clear
this.getParameters().addAll(value)
}
def Scalajclass : _root_.java.lang.String={this.getJclass()}.asInstanceOf[_root_.java.lang.String]
def Scalajclass_=(value : _root_.java.lang.String)={this.setJclass(value)}
def Scalajmethod : _root_.java.lang.String={this.getJmethod()}.asInstanceOf[_root_.java.lang.String]
def Scalajmethod_=(value : _root_.java.lang.String)={this.setJmethod(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.JavaStaticCall"); 
         if (cd !=null){ 
 var cl = group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

