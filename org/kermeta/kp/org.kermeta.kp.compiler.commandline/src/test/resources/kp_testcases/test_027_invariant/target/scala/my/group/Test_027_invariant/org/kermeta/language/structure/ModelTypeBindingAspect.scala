package my.group.`Test_027_invariant`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait ModelTypeBindingAspect extends my.group.`Test_027_invariant`.org.kermeta.language.structure.KermetaModelElementAspect with `_root_`.org.kermeta.language.structure.ModelTypeBinding{
def ScalaobjectTypeBindings : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.ObjectTypeBinding]={new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.ModelTypeBinding,_root_.org.kermeta.language.structure.ObjectTypeBinding](thisUpper = -1,value=this.getObjectTypeBindings())}
def ScalaobjectTypeBindings_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.ObjectTypeBinding]):Unit={this.getObjectTypeBindings().clear
this.getObjectTypeBindings().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.ModelTypeBinding"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

