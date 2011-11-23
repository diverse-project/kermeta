package group.KermetaDoc.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait ParameterizedTypeAspect extends group.KermetaDoc.org.kermeta.language.structure.TypeAspect with `_root_`.org.kermeta.language.structure.ParameterizedType{
def ScalavirtualTypeBinding : java.util.List[_root_.org.kermeta.language.structure.TypeVariableBinding]={new RichKermetaList(this.getVirtualTypeBinding())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.TypeVariableBinding]]
def ScalavirtualTypeBinding_=(value : java.util.List[_root_.org.kermeta.language.structure.TypeVariableBinding])={this.getVirtualTypeBinding().clear
this.getVirtualTypeBinding().addAll(value)
}
def ScalatypeParamBinding : java.util.List[_root_.org.kermeta.language.structure.TypeVariableBinding]={new RichKermetaList(this.getTypeParamBinding())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.TypeVariableBinding]]
def ScalatypeParamBinding_=(value : java.util.List[_root_.org.kermeta.language.structure.TypeVariableBinding])={this.getTypeParamBinding().clear
this.getTypeParamBinding().addAll(value)
}
def ScalatypeDefinition : _root_.org.kermeta.language.structure.GenericTypeDefinition={this.getTypeDefinition()}.asInstanceOf[_root_.org.kermeta.language.structure.GenericTypeDefinition]
def ScalatypeDefinition_=(value : _root_.org.kermeta.language.structure.GenericTypeDefinition)={this.setTypeDefinition(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.ParameterizedType"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

