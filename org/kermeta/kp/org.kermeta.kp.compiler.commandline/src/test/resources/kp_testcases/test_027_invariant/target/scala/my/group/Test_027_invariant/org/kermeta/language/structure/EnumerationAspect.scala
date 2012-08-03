package my.group.`Test_027_invariant`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait EnumerationAspect extends my.group.`Test_027_invariant`.org.kermeta.language.structure.DataTypeAspect with `_root_`.org.kermeta.language.structure.Enumeration{
def ScalaownedLiteral : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.EnumerationLiteral]={new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.Enumeration,_root_.org.kermeta.language.structure.EnumerationLiteral](thisUpper = -1,value=this.getOwnedLiteral())}
def ScalaownedLiteral_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.EnumerationLiteral]):Unit={this.getOwnedLiteral().clear
this.getOwnedLiteral().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Enumeration"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

