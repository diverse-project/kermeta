package my.group.`Test_027_invariant`.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait BooleanLiteralAspect extends my.group.`Test_027_invariant`.org.kermeta.language.behavior.LiteralAspect with `_root_`.org.kermeta.language.behavior.BooleanLiteral{
def Scalavalue : _root_.java.lang.Boolean={this.getValue().asInstanceOf[_root_.java.lang.Boolean]}
def Scalavalue_=(`~value` : _root_.java.lang.Boolean):Unit={this.setValue(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.BooleanLiteral"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

