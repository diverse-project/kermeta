package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait StringLiteralAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.behavior.LiteralAspect with `_root_`.org.kermeta.language.behavior.StringLiteral{
def Scalavalue : _root_.java.lang.String={this.getValue().asInstanceOf[_root_.java.lang.String]}
def Scalavalue_=(`~value` : _root_.java.lang.String):Unit={this.setValue(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.StringLiteral"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

