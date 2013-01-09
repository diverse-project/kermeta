package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait ComplexPropertyBindingAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.PropertyBindingAspect with `_root_`.org.kermeta.language.structure.ComplexPropertyBinding{
def Scalasources : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.ComplexPropertyBinding,_root_.org.kermeta.language.structure.Property]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.ComplexPropertyBinding,_root_.org.kermeta.language.structure.Property](thisUpper = -1,value=this.getSources())}
def Scalasources_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Property]):Unit={this.getSources().clear
this.getSources().addAll(`~value`)
}
def Scalatargets : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.ComplexPropertyBinding,_root_.org.kermeta.language.structure.Property]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.ComplexPropertyBinding,_root_.org.kermeta.language.structure.Property](thisUpper = -1,value=this.getTargets())}
def Scalatargets_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Property]):Unit={this.getTargets().clear
this.getTargets().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.ComplexPropertyBinding"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

