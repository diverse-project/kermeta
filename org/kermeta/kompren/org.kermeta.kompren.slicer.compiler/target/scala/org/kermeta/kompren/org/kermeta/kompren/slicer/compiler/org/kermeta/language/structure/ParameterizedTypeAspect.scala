package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait ParameterizedTypeAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.TypeAspect with `_root_`.org.kermeta.language.structure.ParameterizedType{
def ScalavirtualTypeBinding : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.ParameterizedType,_root_.org.kermeta.language.structure.TypeVariableBinding]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.ParameterizedType,_root_.org.kermeta.language.structure.TypeVariableBinding](thisUpper = -1,value=this.getVirtualTypeBinding())}
def ScalavirtualTypeBinding_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.TypeVariableBinding]):Unit={this.getVirtualTypeBinding().clear
this.getVirtualTypeBinding().addAll(`~value`)
}
def ScalatypeParamBinding : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.ParameterizedType,_root_.org.kermeta.language.structure.TypeVariableBinding]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.ParameterizedType,_root_.org.kermeta.language.structure.TypeVariableBinding](thisUpper = -1,value=this.getTypeParamBinding())}
def ScalatypeParamBinding_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.TypeVariableBinding]):Unit={this.getTypeParamBinding().clear
this.getTypeParamBinding().addAll(`~value`)
}
def ScalatypeDefinition : _root_.org.kermeta.language.structure.GenericTypeDefinition={this.getTypeDefinition().asInstanceOf[_root_.org.kermeta.language.structure.GenericTypeDefinition]}
def ScalatypeDefinition_=(`~value` : _root_.org.kermeta.language.structure.GenericTypeDefinition):Unit={this.setTypeDefinition(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.ParameterizedType"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

