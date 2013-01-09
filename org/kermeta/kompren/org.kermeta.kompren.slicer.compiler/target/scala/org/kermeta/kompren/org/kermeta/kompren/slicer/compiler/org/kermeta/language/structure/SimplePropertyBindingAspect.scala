package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait SimplePropertyBindingAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.PropertyBindingAspect with `_root_`.org.kermeta.language.structure.SimplePropertyBinding{
def Scalasource : _root_.org.kermeta.language.structure.Property={this.getSource().asInstanceOf[_root_.org.kermeta.language.structure.Property]}
def Scalasource_=(`~value` : _root_.org.kermeta.language.structure.Property):Unit={this.setSource(`~value`)}
def Scalatarget : _root_.org.kermeta.language.structure.Property={this.getTarget().asInstanceOf[_root_.org.kermeta.language.structure.Property]}
def Scalatarget_=(`~value` : _root_.org.kermeta.language.structure.Property):Unit={this.setTarget(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.SimplePropertyBinding"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

