package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait SimpleClassDefinitionBindingAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.ClassDefinitionBindingAspect with `_root_`.org.kermeta.language.structure.SimpleClassDefinitionBinding{
def ScalaownedPropertyBindings : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.SimpleClassDefinitionBinding,_root_.org.kermeta.language.structure.SimplePropertyBinding]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.SimpleClassDefinitionBinding,_root_.org.kermeta.language.structure.SimplePropertyBinding](thisUpper = -1,value=this.getOwnedPropertyBindings())}
def ScalaownedPropertyBindings_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.SimplePropertyBinding]):Unit={this.getOwnedPropertyBindings().clear
this.getOwnedPropertyBindings().addAll(`~value`)
}
def ScalaownedOperationBindings : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.SimpleClassDefinitionBinding,_root_.org.kermeta.language.structure.SimpleOperationBinding]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.SimpleClassDefinitionBinding,_root_.org.kermeta.language.structure.SimpleOperationBinding](thisUpper = -1,value=this.getOwnedOperationBindings())}
def ScalaownedOperationBindings_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.SimpleOperationBinding]):Unit={this.getOwnedOperationBindings().clear
this.getOwnedOperationBindings().addAll(`~value`)
}
def Scalasource : _root_.org.kermeta.language.structure.ClassDefinition={this.getSource().asInstanceOf[_root_.org.kermeta.language.structure.ClassDefinition]}
def Scalasource_=(`~value` : _root_.org.kermeta.language.structure.ClassDefinition):Unit={this.setSource(`~value`)}
def Scalatarget : _root_.org.kermeta.language.structure.ClassDefinition={this.getTarget().asInstanceOf[_root_.org.kermeta.language.structure.ClassDefinition]}
def Scalatarget_=(`~value` : _root_.org.kermeta.language.structure.ClassDefinition):Unit={this.setTarget(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.SimpleClassDefinitionBinding"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

