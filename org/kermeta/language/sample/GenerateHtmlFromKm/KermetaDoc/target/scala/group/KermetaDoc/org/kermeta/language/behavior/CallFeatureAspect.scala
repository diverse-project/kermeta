package group.KermetaDoc.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait CallFeatureAspect extends group.KermetaDoc.org.kermeta.language.behavior.CallExpressionAspect with `_root_`.org.kermeta.language.behavior.CallFeature{
def Scalatarget : _root_.org.kermeta.language.behavior.Expression={this.getTarget()}.asInstanceOf[_root_.org.kermeta.language.behavior.Expression]
def Scalatarget_=(value : _root_.org.kermeta.language.behavior.Expression)={this.setTarget(value)}
def ScalaisAtpre : _root_.java.lang.Boolean={this.getIsAtpre()}.asInstanceOf[_root_.java.lang.Boolean]
def ScalaisAtpre_=(value : _root_.java.lang.Boolean)={this.setIsAtpre(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.CallFeature"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

