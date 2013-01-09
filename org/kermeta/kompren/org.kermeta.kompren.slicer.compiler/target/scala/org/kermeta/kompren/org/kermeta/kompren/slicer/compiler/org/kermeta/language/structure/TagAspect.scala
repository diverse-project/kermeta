package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait TagAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KermetaModelElementAspect with `_root_`.org.kermeta.language.structure.Tag{
def Scalaname : _root_.java.lang.String={this.getName().asInstanceOf[_root_.java.lang.String]}
def Scalaname_=(`~value` : _root_.java.lang.String):Unit={this.setName(`~value`)}
def Scalavalue : _root_.java.lang.String={this.getValue().asInstanceOf[_root_.java.lang.String]}
def Scalavalue_=(`~value` : _root_.java.lang.String):Unit={this.setValue(`~value`)}
def Scalaobject : k2.standard.ReflectiveOrderedSet[_root_.org.kermeta.language.structure.Tag,_root_.org.kermeta.language.structure.KermetaModelElement]={  new k2.standard.RichReflectiveOrderedSet[_root_.org.kermeta.language.structure.Tag,_root_.org.kermeta.language.structure.KermetaModelElement](thisUpper = -1,value=this.getObject())}
def Scalaobject_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.KermetaModelElement]):Unit={this.getObject().clear
this.getObject().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Tag"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

