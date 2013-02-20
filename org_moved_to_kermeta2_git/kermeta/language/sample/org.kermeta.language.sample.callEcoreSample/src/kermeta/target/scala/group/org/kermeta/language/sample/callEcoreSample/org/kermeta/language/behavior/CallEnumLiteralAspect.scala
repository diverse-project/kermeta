package group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.org.kermeta.language.sample.callEcoreSample.ImplicitConversion._
trait CallEnumLiteralAspect extends group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.behavior.CallExpressionAspect with `_root_`.org.kermeta.language.behavior.CallEnumLiteral{
def ScalastaticEnumLiteral : _root_.org.kermeta.language.structure.EnumerationLiteral={this.getStaticEnumLiteral()}.asInstanceOf[_root_.org.kermeta.language.structure.EnumerationLiteral]
def ScalastaticEnumLiteral_=(value : _root_.org.kermeta.language.structure.EnumerationLiteral)={this.setStaticEnumLiteral(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.CallEnumLiteral"); 
         if (cd !=null){ 
 var cl = group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

