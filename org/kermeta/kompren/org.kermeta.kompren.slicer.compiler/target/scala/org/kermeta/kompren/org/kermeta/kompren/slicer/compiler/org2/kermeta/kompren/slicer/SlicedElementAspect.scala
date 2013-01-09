package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait SlicedElementAspect extends k2.standard.KermetaObjectAspect with `_root_`.org2.kermeta.kompren.slicer.SlicedElement{
def ScalaisOption : _root_.java.lang.Boolean={this.isIsOption().asInstanceOf[_root_.java.lang.Boolean]}
def ScalaisOption_=(`~value` : _root_.java.lang.Boolean):Unit={this.setIsOption(`~value`)}
def Scalaexpression : _root_.java.lang.String={this.getExpression().asInstanceOf[_root_.java.lang.String]}
def Scalaexpression_=(`~value` : _root_.java.lang.String):Unit={this.setExpression(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org2.kermeta.kompren.slicer.SlicedElement"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

