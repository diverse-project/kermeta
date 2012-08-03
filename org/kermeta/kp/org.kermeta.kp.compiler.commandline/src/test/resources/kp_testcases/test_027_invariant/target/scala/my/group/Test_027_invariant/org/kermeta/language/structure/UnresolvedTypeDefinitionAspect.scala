package my.group.`Test_027_invariant`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait UnresolvedTypeDefinitionAspect extends my.group.`Test_027_invariant`.org.kermeta.language.structure.UnresolvedAspect with my.group.`Test_027_invariant`.org.kermeta.language.structure.TypeDefinitionAspect with `_root_`.org.kermeta.language.structure.UnresolvedTypeDefinition{
def Scalausings : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Using]={new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.UnresolvedTypeDefinition,_root_.org.kermeta.language.structure.Using](thisUpper = -1,value=this.getUsings())}
def Scalausings_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Using]):Unit={this.getUsings().clear
this.getUsings().addAll(`~value`)
}
def ScalatypeDefinitionIdentifier : _root_.java.lang.String={this.getTypeDefinitionIdentifier().asInstanceOf[_root_.java.lang.String]}
def ScalatypeDefinitionIdentifier_=(`~value` : _root_.java.lang.String):Unit={this.setTypeDefinitionIdentifier(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.UnresolvedTypeDefinition"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

