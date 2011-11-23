package group.KermetaDoc.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait TypeDefinitionContainerAspect extends group.KermetaDoc.org.kermeta.language.structure.NamedElementAspect with `_root_`.org.kermeta.language.structure.TypeDefinitionContainer{
def ScalaownedTypeDefinition : java.util.List[_root_.org.kermeta.language.structure.TypeDefinition]={new RichKermetaList(this.getOwnedTypeDefinition())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.TypeDefinition]]
def ScalaownedTypeDefinition_=(value : java.util.List[_root_.org.kermeta.language.structure.TypeDefinition])={this.getOwnedTypeDefinition().clear
this.getOwnedTypeDefinition().addAll(value)
}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.TypeDefinitionContainer"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

