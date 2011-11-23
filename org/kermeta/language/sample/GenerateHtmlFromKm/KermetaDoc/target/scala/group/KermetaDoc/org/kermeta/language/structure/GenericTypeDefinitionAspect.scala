package group.KermetaDoc.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait GenericTypeDefinitionAspect extends group.KermetaDoc.org.kermeta.language.structure.TypeDefinitionAspect with `_root_`.org.kermeta.language.structure.GenericTypeDefinition{
def ScalatypeParameter : java.util.List[_root_.org.kermeta.language.structure.TypeVariable]={new RichKermetaList(this.getTypeParameter())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.TypeVariable]]
def ScalatypeParameter_=(value : java.util.List[_root_.org.kermeta.language.structure.TypeVariable])={this.getTypeParameter().clear
this.getTypeParameter().addAll(value)
}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.GenericTypeDefinition"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

