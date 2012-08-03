package my.group.`Test_027_invariant`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait ModelingUnitAspect extends my.group.`Test_027_invariant`.org.kermeta.language.structure.TypeDefinitionContainerAspect with my.group.`Test_027_invariant`.org.kermeta.language.structure.KermetaModelElementAspect with `_root_`.org.kermeta.language.structure.ModelingUnit{
def Scalapackages : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Package]={new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.ModelingUnit,_root_.org.kermeta.language.structure.Package](thisUpper = -1,value=this.getPackages())}
def Scalapackages_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Package]):Unit={this.getPackages().clear
this.getPackages().addAll(`~value`)
}
def ScalanamespacePrefix : _root_.java.lang.String={this.getNamespacePrefix().asInstanceOf[_root_.java.lang.String]}
def ScalanamespacePrefix_=(`~value` : _root_.java.lang.String):Unit={this.setNamespacePrefix(`~value`)}
def Scalarequires : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Require]={new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.ModelingUnit,_root_.org.kermeta.language.structure.Require](thisUpper = -1,value=this.getRequires())}
def Scalarequires_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Require]):Unit={this.getRequires().clear
this.getRequires().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.ModelingUnit"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

