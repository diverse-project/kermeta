package my.group.`Test_027_invariant`.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait CallPropertyAspect extends my.group.`Test_027_invariant`.org.kermeta.language.behavior.CallFeatureAspect with `_root_`.org.kermeta.language.behavior.CallProperty{
def ScalastaticProperty : _root_.org.kermeta.language.structure.Property={this.getStaticProperty().asInstanceOf[_root_.org.kermeta.language.structure.Property]}
def ScalastaticProperty_=(`~value` : _root_.org.kermeta.language.structure.Property):Unit={this.setStaticProperty(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.CallProperty"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

