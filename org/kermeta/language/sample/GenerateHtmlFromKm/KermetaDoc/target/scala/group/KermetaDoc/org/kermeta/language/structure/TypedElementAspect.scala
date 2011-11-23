package group.KermetaDoc.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait TypedElementAspect extends group.KermetaDoc.org.kermeta.language.structure.TypeContainerAspect with group.KermetaDoc.org.kermeta.language.structure.NamedElementAspect with `_root_`.org.kermeta.language.structure.TypedElement{
def Scalatype : _root_.org.kermeta.language.structure.Type={this.getType()}.asInstanceOf[_root_.org.kermeta.language.structure.Type]
def Scalatype_=(value : _root_.org.kermeta.language.structure.Type)={this.setType(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.TypedElement"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

