package group.km2html.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.km2html.ImplicitConversion._
trait CallPropertyAspect extends group.km2html.org.kermeta.language.behavior.CallFeatureAspect with `_root_`.org.kermeta.language.behavior.CallProperty{
def ScalastaticProperty : _root_.org.kermeta.language.structure.Property={this.getStaticProperty()}.asInstanceOf[_root_.org.kermeta.language.structure.Property]
def ScalastaticProperty_=(value : _root_.org.kermeta.language.structure.Property)={this.setStaticProperty(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.CallProperty"); 
         if (cd !=null){ 
 var cl = group.km2html.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

