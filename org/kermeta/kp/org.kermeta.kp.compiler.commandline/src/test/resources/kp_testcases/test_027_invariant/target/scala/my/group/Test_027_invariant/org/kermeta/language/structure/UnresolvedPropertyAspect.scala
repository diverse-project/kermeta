package my.group.`Test_027_invariant`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait UnresolvedPropertyAspect extends my.group.`Test_027_invariant`.org.kermeta.language.structure.AbstractPropertyAspect with my.group.`Test_027_invariant`.org.kermeta.language.structure.UnresolvedAspect with `_root_`.org.kermeta.language.structure.UnresolvedProperty{
def ScalapropertyIdentifier : _root_.java.lang.String={this.getPropertyIdentifier().asInstanceOf[_root_.java.lang.String]}
def ScalapropertyIdentifier_=(`~value` : _root_.java.lang.String):Unit={this.setPropertyIdentifier(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.UnresolvedProperty"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

