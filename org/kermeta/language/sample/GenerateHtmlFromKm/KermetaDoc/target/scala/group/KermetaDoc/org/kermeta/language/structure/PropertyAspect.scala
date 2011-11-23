package group.KermetaDoc.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait PropertyAspect extends group.KermetaDoc.org.kermeta.language.structure.MultiplicityElementAspect with group.KermetaDoc.org.kermeta.language.structure.AbstractPropertyAspect with `_root_`.org.kermeta.language.structure.Property{
def Scalaopposite : _root_.org.kermeta.language.structure.AbstractProperty={this.getOpposite()}.asInstanceOf[_root_.org.kermeta.language.structure.AbstractProperty]
def Scalaopposite_=(value : _root_.org.kermeta.language.structure.AbstractProperty)={this.setOpposite(value)}
def ScalaisReadOnly : _root_.java.lang.Boolean={this.getIsReadOnly()}.asInstanceOf[_root_.java.lang.Boolean]
def ScalaisReadOnly_=(value : _root_.java.lang.Boolean)={this.setIsReadOnly(value)}
def Scaladefault : _root_.java.lang.String={this.getDefault()}.asInstanceOf[_root_.java.lang.String]
def Scaladefault_=(value : _root_.java.lang.String)={this.setDefault(value)}
def ScalaisComposite : _root_.java.lang.Boolean={this.getIsComposite()}.asInstanceOf[_root_.java.lang.Boolean]
def ScalaisComposite_=(value : _root_.java.lang.Boolean)={this.setIsComposite(value)}
def ScalaisDerived : _root_.java.lang.Boolean={this.getIsDerived()}.asInstanceOf[_root_.java.lang.Boolean]
def ScalaisDerived_=(value : _root_.java.lang.Boolean)={this.setIsDerived(value)}
def ScalaisID : _root_.java.lang.Boolean={this.getIsID()}.asInstanceOf[_root_.java.lang.Boolean]
def ScalaisID_=(value : _root_.java.lang.Boolean)={this.setIsID(value)}
def ScalagetterBody : _root_.org.kermeta.language.behavior.Expression={this.getGetterBody()}.asInstanceOf[_root_.org.kermeta.language.behavior.Expression]
def ScalagetterBody_=(value : _root_.org.kermeta.language.behavior.Expression)={this.setGetterBody(value)}
def ScalasetterBody : _root_.org.kermeta.language.behavior.Expression={this.getSetterBody()}.asInstanceOf[_root_.org.kermeta.language.behavior.Expression]
def ScalasetterBody_=(value : _root_.org.kermeta.language.behavior.Expression)={this.setSetterBody(value)}
def ScalaisGetterAbstract : _root_.java.lang.Boolean={this.getIsGetterAbstract()}.asInstanceOf[_root_.java.lang.Boolean]
def ScalaisGetterAbstract_=(value : _root_.java.lang.Boolean)={this.setIsGetterAbstract(value)}
def ScalaisSetterAbstract : _root_.java.lang.Boolean={this.getIsSetterAbstract()}.asInstanceOf[_root_.java.lang.Boolean]
def ScalaisSetterAbstract_=(value : _root_.java.lang.Boolean)={this.setIsSetterAbstract(value)}
def ScalaownedUnresolvedProperties : java.util.List[_root_.org.kermeta.language.structure.UnresolvedProperty]={new RichKermetaList(this.getOwnedUnresolvedProperties())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.UnresolvedProperty]]
def ScalaownedUnresolvedProperties_=(value : java.util.List[_root_.org.kermeta.language.structure.UnresolvedProperty])={this.getOwnedUnresolvedProperties().clear
this.getOwnedUnresolvedProperties().addAll(value)
}
def ScalaowningClass : _root_.org.kermeta.language.structure.ClassDefinition={this.getOwningClass()}.asInstanceOf[_root_.org.kermeta.language.structure.ClassDefinition]
def ScalaowningClass_=(value : _root_.org.kermeta.language.structure.ClassDefinition)={this.setOwningClass(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Property"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

