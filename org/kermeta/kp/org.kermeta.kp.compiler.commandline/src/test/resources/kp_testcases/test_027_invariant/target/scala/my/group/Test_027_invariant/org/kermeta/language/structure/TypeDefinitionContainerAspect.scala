package my.group.`Test_027_invariant`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait TypeDefinitionContainerAspect extends my.group.`Test_027_invariant`.org.kermeta.language.structure.NamedElementAspect with `_root_`.org.kermeta.language.structure.TypeDefinitionContainer{
def ScalaownedTypeDefinition : k2.standard.KermetaSet[_root_.org.kermeta.language.structure.TypeDefinition]={new k2.standard.RichReflectiveSet[org.kermeta.language.structure.TypeDefinitionContainer,_root_.org.kermeta.language.structure.TypeDefinition](thisUpper = -1,value=this.getOwnedTypeDefinition())}
def ScalaownedTypeDefinition_=(`~value` : k2.standard.KermetaSet[_root_.org.kermeta.language.structure.TypeDefinition]):Unit={this.getOwnedTypeDefinition().clear
this.getOwnedTypeDefinition().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.TypeDefinitionContainer"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

