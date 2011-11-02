package group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.org.kermeta.language.sample.callEcoreSample.ImplicitConversion._
trait KermetaModelElementAspect extends _root_.k2.standard.KermetaObject with `_root_`.org.kermeta.language.structure.KermetaModelElement{
def ScalakTag : java.util.List[_root_.org.kermeta.language.structure.Tag]={new RichKermetaList(this.getKTag())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.Tag]]
def ScalakTag_=(value : java.util.List[_root_.org.kermeta.language.structure.Tag])={this.getKTag().clear
this.getKTag().addAll(value)
}
def ScalakOwnedTags : java.util.List[_root_.org.kermeta.language.structure.Tag]={new RichKermetaList(this.getKOwnedTags())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.Tag]]
def ScalakOwnedTags_=(value : java.util.List[_root_.org.kermeta.language.structure.Tag])={this.getKOwnedTags().clear
this.getKOwnedTags().addAll(value)
}
def ScalakType : _root_.org.kermeta.language.structure.Type={this.getKType()}.asInstanceOf[_root_.org.kermeta.language.structure.Type]
def ScalakType_=(value : _root_.org.kermeta.language.structure.Type)={this.setKType(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.KermetaModelElement"); 
         if (cd !=null){ 
 var cl = group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

