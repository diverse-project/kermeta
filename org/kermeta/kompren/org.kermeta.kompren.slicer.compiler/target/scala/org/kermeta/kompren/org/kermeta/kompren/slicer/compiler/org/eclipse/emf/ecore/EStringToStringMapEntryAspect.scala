package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait EStringToStringMapEntryAspect extends k2.standard.KermetaObjectAspect with `_root_`.java.util.Map.Entry[String,String]{
def Scalakey : _root_.java.lang.String={this.getKey().asInstanceOf[_root_.java.lang.String]}
def Scalakey_=(`~value` : _root_.java.lang.String):Unit={this.setKey(`~value`)}
def Scalavalue : _root_.java.lang.String={this.getValue().asInstanceOf[_root_.java.lang.String]}
def Scalavalue_=(`~value` : _root_.java.lang.String):Unit={this.setValue(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EStringToStringMapEntry"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

