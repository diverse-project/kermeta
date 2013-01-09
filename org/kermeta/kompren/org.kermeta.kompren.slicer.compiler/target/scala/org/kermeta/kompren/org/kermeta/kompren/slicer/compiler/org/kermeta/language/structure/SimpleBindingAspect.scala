package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait SimpleBindingAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.ModelTypeBindingAspect with `_root_`.org.kermeta.language.structure.SimpleBinding{
def ScalaownedClassDefinitionBindings : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.SimpleBinding,_root_.org.kermeta.language.structure.SimpleClassDefinitionBinding]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.SimpleBinding,_root_.org.kermeta.language.structure.SimpleClassDefinitionBinding](thisUpper = -1,value=this.getOwnedClassDefinitionBindings())}
def ScalaownedClassDefinitionBindings_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.SimpleClassDefinitionBinding]):Unit={this.getOwnedClassDefinitionBindings().clear
this.getOwnedClassDefinitionBindings().addAll(`~value`)
}
def ScalaownedEnumerationBindings : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.SimpleBinding,_root_.org.kermeta.language.structure.SimpleEnumerationBinding]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.SimpleBinding,_root_.org.kermeta.language.structure.SimpleEnumerationBinding](thisUpper = -1,value=this.getOwnedEnumerationBindings())}
def ScalaownedEnumerationBindings_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.SimpleEnumerationBinding]):Unit={this.getOwnedEnumerationBindings().clear
this.getOwnedEnumerationBindings().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.SimpleBinding"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

