package my.group.`Test_027_invariant`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait TypeAspect extends my.group.`Test_027_invariant`.org.kermeta.language.structure.KermetaModelElementAspect with `_root_`.org.kermeta.language.structure.Type{
def ScalatypeContainer : _root_.org.kermeta.language.structure.TypeContainer={this.getTypeContainer().asInstanceOf[_root_.org.kermeta.language.structure.TypeContainer]}
def ScalatypeContainer_=(`~value` : _root_.org.kermeta.language.structure.TypeContainer):Unit={this.setTypeContainer(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Type"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

