package my.group.`Test_027_invariant`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait KermetaModelElementAspect extends k2.standard.KermetaObjectAspect with `_root_`.org.kermeta.language.structure.KermetaModelElement{
def ScalakTag : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Tag]={new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.KermetaModelElement,_root_.org.kermeta.language.structure.Tag](thisUpper = -1,value=this.getKTag())}
def ScalakTag_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Tag]):Unit={this.getKTag().clear
this.getKTag().addAll(`~value`)
}
def ScalakOwnedTags : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Tag]={new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.KermetaModelElement,_root_.org.kermeta.language.structure.Tag](thisUpper = -1,value=this.getKOwnedTags())}
def ScalakOwnedTags_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Tag]):Unit={this.getKOwnedTags().clear
this.getKOwnedTags().addAll(`~value`)
}
def ScalakType : _root_.org.kermeta.language.structure.Type={this.getKType().asInstanceOf[_root_.org.kermeta.language.structure.Type]}
def ScalakType_=(`~value` : _root_.org.kermeta.language.structure.Type):Unit={this.setKType(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.KermetaModelElement"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

