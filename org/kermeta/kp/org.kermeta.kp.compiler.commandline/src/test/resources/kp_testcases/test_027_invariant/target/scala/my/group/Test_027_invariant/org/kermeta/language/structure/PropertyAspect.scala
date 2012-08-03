package my.group.`Test_027_invariant`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait PropertyAspect extends my.group.`Test_027_invariant`.org.kermeta.language.structure.MultiplicityElementAspect with my.group.`Test_027_invariant`.org.kermeta.language.structure.AbstractPropertyAspect with `_root_`.org.kermeta.language.structure.Property{
def Scalaopposite : _root_.org.kermeta.language.structure.AbstractProperty={this.getOpposite().asInstanceOf[_root_.org.kermeta.language.structure.AbstractProperty]}
def Scalaopposite_=(`~value` : _root_.org.kermeta.language.structure.AbstractProperty):Unit={this.setOpposite(`~value`)}
def ScalaisReadOnly : _root_.java.lang.Boolean={this.getIsReadOnly().asInstanceOf[_root_.java.lang.Boolean]}
def ScalaisReadOnly_=(`~value` : _root_.java.lang.Boolean):Unit={this.setIsReadOnly(`~value`)}
def Scaladefault : _root_.java.lang.String={this.getDefault().asInstanceOf[_root_.java.lang.String]}
def Scaladefault_=(`~value` : _root_.java.lang.String):Unit={this.setDefault(`~value`)}
def ScalaisComposite : _root_.java.lang.Boolean={this.getIsComposite().asInstanceOf[_root_.java.lang.Boolean]}
def ScalaisComposite_=(`~value` : _root_.java.lang.Boolean):Unit={this.setIsComposite(`~value`)}
def ScalaisDerived : _root_.java.lang.Boolean={this.getIsDerived().asInstanceOf[_root_.java.lang.Boolean]}
def ScalaisDerived_=(`~value` : _root_.java.lang.Boolean):Unit={this.setIsDerived(`~value`)}
def ScalaisID : _root_.java.lang.Boolean={this.getIsID().asInstanceOf[_root_.java.lang.Boolean]}
def ScalaisID_=(`~value` : _root_.java.lang.Boolean):Unit={this.setIsID(`~value`)}
def ScalagetterBody : _root_.org.kermeta.language.behavior.Expression={this.getGetterBody().asInstanceOf[_root_.org.kermeta.language.behavior.Expression]}
def ScalagetterBody_=(`~value` : _root_.org.kermeta.language.behavior.Expression):Unit={this.setGetterBody(`~value`)}
def ScalasetterBody : _root_.org.kermeta.language.behavior.Expression={this.getSetterBody().asInstanceOf[_root_.org.kermeta.language.behavior.Expression]}
def ScalasetterBody_=(`~value` : _root_.org.kermeta.language.behavior.Expression):Unit={this.setSetterBody(`~value`)}
def ScalaisGetterAbstract : _root_.java.lang.Boolean={this.getIsGetterAbstract().asInstanceOf[_root_.java.lang.Boolean]}
def ScalaisGetterAbstract_=(`~value` : _root_.java.lang.Boolean):Unit={this.setIsGetterAbstract(`~value`)}
def ScalaisSetterAbstract : _root_.java.lang.Boolean={this.getIsSetterAbstract().asInstanceOf[_root_.java.lang.Boolean]}
def ScalaisSetterAbstract_=(`~value` : _root_.java.lang.Boolean):Unit={this.setIsSetterAbstract(`~value`)}
def ScalaownedUnresolvedProperties : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.UnresolvedProperty]={new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.Property,_root_.org.kermeta.language.structure.UnresolvedProperty](thisUpper = -1,value=this.getOwnedUnresolvedProperties())}
def ScalaownedUnresolvedProperties_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.UnresolvedProperty]):Unit={this.getOwnedUnresolvedProperties().clear
this.getOwnedUnresolvedProperties().addAll(`~value`)
}
def ScalaowningClass : _root_.org.kermeta.language.structure.ClassDefinition={this.getOwningClass().asInstanceOf[_root_.org.kermeta.language.structure.ClassDefinition]}
def ScalaowningClass_=(`~value` : _root_.org.kermeta.language.structure.ClassDefinition):Unit={this.setOwningClass(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Property"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

