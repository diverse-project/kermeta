package my.group.`Test_027_invariant`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait ModelTypeAspect extends my.group.`Test_027_invariant`.org.kermeta.language.structure.TypeAspect with my.group.`Test_027_invariant`.org.kermeta.language.structure.TypeDefinitionAspect with my.group.`Test_027_invariant`.org.kermeta.language.structure.TypeDefinitionContainerAspect with `_root_`.org.kermeta.language.structure.ModelType{
def ScalatypeDefinitions : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.TypeDefinition]={new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.ModelType,_root_.org.kermeta.language.structure.TypeDefinition](thisUpper = -1,value=this.getTypeDefinitions())}
def ScalatypeDefinitions_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.TypeDefinition]):Unit={this.getTypeDefinitions().clear
this.getTypeDefinitions().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.ModelType"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

