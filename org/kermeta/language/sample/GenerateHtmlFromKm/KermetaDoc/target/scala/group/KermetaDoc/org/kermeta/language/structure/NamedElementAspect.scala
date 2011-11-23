package group.KermetaDoc.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait NamedElementAspect extends group.KermetaDoc.org.kermeta.language.structure.KermetaModelElementAspect with `_root_`.org.kermeta.language.structure.NamedElement{
def Scalaname : _root_.java.lang.String={this.getName()}.asInstanceOf[_root_.java.lang.String]
def Scalaname_=(value : _root_.java.lang.String)={this.setName(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.NamedElement"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

