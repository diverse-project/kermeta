package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait VirtualTypeAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.ObjectTypeVariableAspect with `_root_`.org.kermeta.language.structure.VirtualType{
def ScalaclassDefinition : _root_.org.kermeta.language.structure.ClassDefinition={this.getClassDefinition().asInstanceOf[_root_.org.kermeta.language.structure.ClassDefinition]}
def ScalaclassDefinition_=(`~value` : _root_.org.kermeta.language.structure.ClassDefinition):Unit={this.setClassDefinition(`~value`)}
def ScalamodelType : _root_.org.kermeta.language.structure.ModelTypeVariable={this.getModelType().asInstanceOf[_root_.org.kermeta.language.structure.ModelTypeVariable]}
def ScalamodelType_=(`~value` : _root_.org.kermeta.language.structure.ModelTypeVariable):Unit={this.setModelType(`~value`)}
def ScalatypeParamBinding : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.VirtualType,_root_.org.kermeta.language.structure.TypeVariableBinding]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.VirtualType,_root_.org.kermeta.language.structure.TypeVariableBinding](thisUpper = -1,value=this.getTypeParamBinding())}
def ScalatypeParamBinding_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.TypeVariableBinding]):Unit={this.getTypeParamBinding().clear
this.getTypeParamBinding().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.VirtualType"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

