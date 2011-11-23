package group.KermetaDoc.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait PackageAspect extends group.KermetaDoc.org.kermeta.language.structure.NamedElementAspect with group.KermetaDoc.org.kermeta.language.structure.TypeDefinitionContainerAspect with `_root_`.org.kermeta.language.structure.Package{
def ScalanestedPackage : java.util.List[_root_.org.kermeta.language.structure.Package]={new RichKermetaList(this.getNestedPackage())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.Package]]
def ScalanestedPackage_=(value : java.util.List[_root_.org.kermeta.language.structure.Package])={this.getNestedPackage().clear
this.getNestedPackage().addAll(value)
}
def ScalanestingPackage : _root_.org.kermeta.language.structure.Package={this.getNestingPackage()}.asInstanceOf[_root_.org.kermeta.language.structure.Package]
def ScalanestingPackage_=(value : _root_.org.kermeta.language.structure.Package)={this.setNestingPackage(value)}
def Scalauri : _root_.java.lang.String={this.getUri()}.asInstanceOf[_root_.java.lang.String]
def Scalauri_=(value : _root_.java.lang.String)={this.setUri(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Package"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

