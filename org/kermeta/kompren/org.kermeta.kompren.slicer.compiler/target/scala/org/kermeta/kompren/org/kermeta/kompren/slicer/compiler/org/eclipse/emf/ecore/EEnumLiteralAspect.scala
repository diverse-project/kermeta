package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait EEnumLiteralAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore.ENamedElementAspect with `_root_`.org.eclipse.emf.ecore.EEnumLiteral{
def Scalavalue : _root_.java.lang.Integer={this.getValue().asInstanceOf[_root_.java.lang.Integer]}
def Scalavalue_=(`~value` : _root_.java.lang.Integer):Unit={this.setValue(`~value`)}
def Scalainstance : org.eclipse.emf.common.util.Enumerator={this.getInstance().asInstanceOf[org.eclipse.emf.common.util.Enumerator]}
def Scalainstance_=(`~value` : org.eclipse.emf.common.util.Enumerator):Unit={this.setInstance(`~value`)}
def Scalaliteral : _root_.java.lang.String={this.getLiteral().asInstanceOf[_root_.java.lang.String]}
def Scalaliteral_=(`~value` : _root_.java.lang.String):Unit={this.setLiteral(`~value`)}
def ScalaeEnum : _root_.org.eclipse.emf.ecore.EEnum={this.getEEnum().asInstanceOf[_root_.org.eclipse.emf.ecore.EEnum]}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EEnumLiteral"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

