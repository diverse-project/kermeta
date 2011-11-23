package group.km2html.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.km2html.ImplicitConversion._
trait CallOperationAspect extends group.km2html.org.kermeta.language.behavior.CallFeatureAspect with `_root_`.org.kermeta.language.behavior.CallOperation{
def ScalastaticOperation : _root_.org.kermeta.language.structure.Operation={this.getStaticOperation()}.asInstanceOf[_root_.org.kermeta.language.structure.Operation]
def ScalastaticOperation_=(value : _root_.org.kermeta.language.structure.Operation)={this.setStaticOperation(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.CallOperation"); 
         if (cd !=null){ 
 var cl = group.km2html.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

