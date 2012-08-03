package my.group.`Test_027_invariant`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait TypeVariableBindingAspect extends my.group.`Test_027_invariant`.org.kermeta.language.structure.TypeContainerAspect with my.group.`Test_027_invariant`.org.kermeta.language.structure.KermetaModelElementAspect with `_root_`.org.kermeta.language.structure.TypeVariableBinding{
def Scalavariable : _root_.org.kermeta.language.structure.TypeVariable={this.getVariable().asInstanceOf[_root_.org.kermeta.language.structure.TypeVariable]}
def Scalavariable_=(`~value` : _root_.org.kermeta.language.structure.TypeVariable):Unit={this.setVariable(`~value`)}
def Scalatype : _root_.org.kermeta.language.structure.Type={this.getType().asInstanceOf[_root_.org.kermeta.language.structure.Type]}
def Scalatype_=(`~value` : _root_.org.kermeta.language.structure.Type):Unit={this.setType(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.TypeVariableBinding"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

