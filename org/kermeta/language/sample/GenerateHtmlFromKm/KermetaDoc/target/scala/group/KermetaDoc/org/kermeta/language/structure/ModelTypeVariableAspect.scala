package group.KermetaDoc.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait ModelTypeVariableAspect extends group.KermetaDoc.org.kermeta.language.structure.TypeVariableAspect with `_root_`.org.kermeta.language.structure.ModelTypeVariable{
def ScalavirtualType : java.util.List[_root_.org.kermeta.language.structure.VirtualType]={new RichKermetaList(this.getVirtualType())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.VirtualType]]
def ScalavirtualType_=(value : java.util.List[_root_.org.kermeta.language.structure.VirtualType])={this.getVirtualType().clear
this.getVirtualType().addAll(value)
}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.ModelTypeVariable"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

