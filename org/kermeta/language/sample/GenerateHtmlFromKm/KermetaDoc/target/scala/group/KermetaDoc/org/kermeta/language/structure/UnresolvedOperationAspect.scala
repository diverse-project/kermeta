package group.KermetaDoc.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait UnresolvedOperationAspect extends group.KermetaDoc.org.kermeta.language.structure.AbstractOperationAspect with group.KermetaDoc.org.kermeta.language.structure.UnresolvedAspect with group.KermetaDoc.org.kermeta.language.structure.TypeContainerAspect with `_root_`.org.kermeta.language.structure.UnresolvedOperation{
def ScalaoperationIdentifier : _root_.java.lang.String={this.getOperationIdentifier()}.asInstanceOf[_root_.java.lang.String]
def ScalaoperationIdentifier_=(value : _root_.java.lang.String)={this.setOperationIdentifier(value)}
def Scalafrom : _root_.org.kermeta.language.structure.Type={this.getFrom()}.asInstanceOf[_root_.org.kermeta.language.structure.Type]
def Scalafrom_=(value : _root_.org.kermeta.language.structure.Type)={this.setFrom(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.UnresolvedOperation"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

