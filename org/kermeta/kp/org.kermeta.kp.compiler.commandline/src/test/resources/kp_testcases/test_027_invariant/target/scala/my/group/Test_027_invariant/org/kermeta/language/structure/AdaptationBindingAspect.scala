package my.group.`Test_027_invariant`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait AdaptationBindingAspect extends my.group.`Test_027_invariant`.org.kermeta.language.structure.ObjectTypeBindingAspect with `_root_`.org.kermeta.language.structure.AdaptationBinding{
def Scalatarget : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.TypeDefinition]={new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.AdaptationBinding,_root_.org.kermeta.language.structure.TypeDefinition](thisUpper = -1,value=this.getTarget())}
def Scalatarget_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.TypeDefinition]):Unit={this.getTarget().clear
this.getTarget().addAll(`~value`)
}
def Scalasource : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.TypeDefinition]={new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.AdaptationBinding,_root_.org.kermeta.language.structure.TypeDefinition](thisUpper = -1,value=this.getSource())}
def Scalasource_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.TypeDefinition]):Unit={this.getSource().clear
this.getSource().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.AdaptationBinding"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

