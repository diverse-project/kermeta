package my.group.`Test_027_invariant`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait PartialBindingAspect extends my.group.`Test_027_invariant`.org.kermeta.language.structure.ModelTypeBindingAspect with `_root_`.org.kermeta.language.structure.PartialBinding{
def ScalawithRespectTo : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Operation]={new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.PartialBinding,_root_.org.kermeta.language.structure.Operation](thisUpper = -1,value=this.getWithRespectTo())}
def ScalawithRespectTo_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Operation]):Unit={this.getWithRespectTo().clear
this.getWithRespectTo().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.PartialBinding"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

