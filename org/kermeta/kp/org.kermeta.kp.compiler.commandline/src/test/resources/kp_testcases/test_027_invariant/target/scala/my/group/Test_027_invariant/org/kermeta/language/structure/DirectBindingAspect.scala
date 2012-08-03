package my.group.`Test_027_invariant`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait DirectBindingAspect extends my.group.`Test_027_invariant`.org.kermeta.language.structure.ObjectTypeBindingAspect with `_root_`.org.kermeta.language.structure.DirectBinding{
def Scalatarget : _root_.org.kermeta.language.structure.TypeDefinition={this.getTarget().asInstanceOf[_root_.org.kermeta.language.structure.TypeDefinition]}
def Scalatarget_=(`~value` : _root_.org.kermeta.language.structure.TypeDefinition):Unit={this.setTarget(`~value`)}
def Scalasource : _root_.org.kermeta.language.structure.TypeDefinition={this.getSource().asInstanceOf[_root_.org.kermeta.language.structure.TypeDefinition]}
def Scalasource_=(`~value` : _root_.org.kermeta.language.structure.TypeDefinition):Unit={this.setSource(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.DirectBinding"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

