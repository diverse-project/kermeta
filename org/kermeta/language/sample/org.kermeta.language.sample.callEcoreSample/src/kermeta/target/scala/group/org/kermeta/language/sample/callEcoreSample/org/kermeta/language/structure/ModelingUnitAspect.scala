package group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.org.kermeta.language.sample.callEcoreSample.ImplicitConversion._
trait ModelingUnitAspect extends group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.TypeDefinitionContainerAspect with group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.KermetaModelElementAspect with `_root_`.org.kermeta.language.structure.ModelingUnit{
def Scalapackages : java.util.List[_root_.org.kermeta.language.structure.Package]={new RichKermetaList(this.getPackages())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.Package]]
def Scalapackages_=(value : java.util.List[_root_.org.kermeta.language.structure.Package])={this.getPackages().clear
this.getPackages().addAll(value)
}
def ScalanamespacePrefix : _root_.java.lang.String={this.getNamespacePrefix()}.asInstanceOf[_root_.java.lang.String]
def ScalanamespacePrefix_=(value : _root_.java.lang.String)={this.setNamespacePrefix(value)}
def Scalarequires : java.util.List[_root_.org.kermeta.language.structure.Require]={new RichKermetaList(this.getRequires())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.Require]]
def Scalarequires_=(value : java.util.List[_root_.org.kermeta.language.structure.Require])={this.getRequires().clear
this.getRequires().addAll(value)
}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.ModelingUnit"); 
         if (cd !=null){ 
 var cl = group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

