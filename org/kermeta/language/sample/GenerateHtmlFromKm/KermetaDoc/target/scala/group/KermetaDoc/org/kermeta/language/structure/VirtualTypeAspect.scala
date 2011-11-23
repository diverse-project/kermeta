package group.KermetaDoc.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait VirtualTypeAspect extends group.KermetaDoc.org.kermeta.language.structure.ObjectTypeVariableAspect with `_root_`.org.kermeta.language.structure.VirtualType{
def ScalaclassDefinition : _root_.org.kermeta.language.structure.ClassDefinition={this.getClassDefinition()}.asInstanceOf[_root_.org.kermeta.language.structure.ClassDefinition]
def ScalaclassDefinition_=(value : _root_.org.kermeta.language.structure.ClassDefinition)={this.setClassDefinition(value)}
def ScalamodelType : _root_.org.kermeta.language.structure.ModelTypeVariable={this.getModelType()}.asInstanceOf[_root_.org.kermeta.language.structure.ModelTypeVariable]
def ScalamodelType_=(value : _root_.org.kermeta.language.structure.ModelTypeVariable)={this.setModelType(value)}
def ScalatypeParamBinding : java.util.List[_root_.org.kermeta.language.structure.TypeVariableBinding]={new RichKermetaList(this.getTypeParamBinding())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.TypeVariableBinding]]
def ScalatypeParamBinding_=(value : java.util.List[_root_.org.kermeta.language.structure.TypeVariableBinding])={this.getTypeParamBinding().clear
this.getTypeParamBinding().addAll(value)
}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.VirtualType"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

