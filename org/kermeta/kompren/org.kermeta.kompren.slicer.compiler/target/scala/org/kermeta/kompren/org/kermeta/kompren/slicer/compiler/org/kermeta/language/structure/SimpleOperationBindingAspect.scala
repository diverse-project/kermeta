package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait SimpleOperationBindingAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.OperationBindingAspect with `_root_`.org.kermeta.language.structure.SimpleOperationBinding{
def Scalasource : _root_.org.kermeta.language.structure.Operation={this.getSource().asInstanceOf[_root_.org.kermeta.language.structure.Operation]}
def Scalasource_=(`~value` : _root_.org.kermeta.language.structure.Operation):Unit={this.setSource(`~value`)}
def Scalatarget : _root_.org.kermeta.language.structure.Operation={this.getTarget().asInstanceOf[_root_.org.kermeta.language.structure.Operation]}
def Scalatarget_=(`~value` : _root_.org.kermeta.language.structure.Operation):Unit={this.setTarget(`~value`)}
def ScalaownedParameterBindings : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.SimpleOperationBinding,_root_.org.kermeta.language.structure.SimpleParameterBinding]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.SimpleOperationBinding,_root_.org.kermeta.language.structure.SimpleParameterBinding](thisUpper = -1,value=this.getOwnedParameterBindings())}
def ScalaownedParameterBindings_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.SimpleParameterBinding]):Unit={this.getOwnedParameterBindings().clear
this.getOwnedParameterBindings().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.SimpleOperationBinding"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

