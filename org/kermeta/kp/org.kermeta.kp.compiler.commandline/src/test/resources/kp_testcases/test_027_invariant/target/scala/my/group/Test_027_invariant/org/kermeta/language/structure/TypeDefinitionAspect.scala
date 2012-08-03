package my.group.`Test_027_invariant`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait TypeDefinitionAspect extends my.group.`Test_027_invariant`.org.kermeta.language.structure.NamedElementAspect with my.group.`Test_027_invariant`.org.kermeta.language.structure.TypeContainerAspect with `_root_`.org.kermeta.language.structure.TypeDefinition{
def ScalasuperType : k2.standard.KermetaSet[_root_.org.kermeta.language.structure.Type]={new k2.standard.RichReflectiveSet[org.kermeta.language.structure.TypeDefinition,_root_.org.kermeta.language.structure.Type](thisUpper = -1,value=this.getSuperType())}
def ScalasuperType_=(`~value` : k2.standard.KermetaSet[_root_.org.kermeta.language.structure.Type]):Unit={this.getSuperType().clear
this.getSuperType().addAll(`~value`)
}
def ScalatypeMappings : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.TypeMapping]={new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.TypeDefinition,_root_.org.kermeta.language.structure.TypeMapping](thisUpper = -1,value=this.getTypeMappings())}
def ScalatypeMappings_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.TypeMapping]):Unit={this.getTypeMappings().clear
this.getTypeMappings().addAll(`~value`)
}
def ScalaisAspect : _root_.java.lang.Boolean={this.getIsAspect().asInstanceOf[_root_.java.lang.Boolean]}
def ScalaisAspect_=(`~value` : _root_.java.lang.Boolean):Unit={this.setIsAspect(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.TypeDefinition"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

