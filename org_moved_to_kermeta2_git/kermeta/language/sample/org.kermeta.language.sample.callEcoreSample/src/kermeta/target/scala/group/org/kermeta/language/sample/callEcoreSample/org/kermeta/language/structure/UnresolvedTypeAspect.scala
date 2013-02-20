package group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.org.kermeta.language.sample.callEcoreSample.ImplicitConversion._
trait UnresolvedTypeAspect extends group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.TypeAspect with group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.UnresolvedAspect with group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.TypeContainerAspect with `_root_`.org.kermeta.language.structure.UnresolvedType{
def Scalausings : java.util.List[_root_.org.kermeta.language.structure.Using]={new RichKermetaList(this.getUsings())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.Using]]
def Scalausings_=(value : java.util.List[_root_.org.kermeta.language.structure.Using])={this.getUsings().clear
this.getUsings().addAll(value)
}
def Scalagenerics : java.util.List[_root_.org.kermeta.language.structure.Type]={new RichKermetaList(this.getGenerics())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.Type]]
def Scalagenerics_=(value : java.util.List[_root_.org.kermeta.language.structure.Type])={this.getGenerics().clear
this.getGenerics().addAll(value)
}
def ScalatypeIdentifier : _root_.java.lang.String={this.getTypeIdentifier()}.asInstanceOf[_root_.java.lang.String]
def ScalatypeIdentifier_=(value : _root_.java.lang.String)={this.setTypeIdentifier(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.UnresolvedType"); 
         if (cd !=null){ 
 var cl = group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

