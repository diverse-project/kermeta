package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait MultiplicityElementAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.TypedElementAspect with `_root_`.org.kermeta.language.structure.MultiplicityElement{
def ScalaisOrdered : _root_.java.lang.Boolean={this.getIsOrdered().asInstanceOf[_root_.java.lang.Boolean]}
def ScalaisOrdered_=(`~value` : _root_.java.lang.Boolean):Unit={this.setIsOrdered(`~value`)}
def ScalaisUnique : _root_.java.lang.Boolean={this.getIsUnique().asInstanceOf[_root_.java.lang.Boolean]}
def ScalaisUnique_=(`~value` : _root_.java.lang.Boolean):Unit={this.setIsUnique(`~value`)}
def Scalalower : _root_.java.lang.Integer={this.getLower().asInstanceOf[_root_.java.lang.Integer]}
def Scalalower_=(`~value` : _root_.java.lang.Integer):Unit={this.setLower(`~value`)}
def Scalaupper : _root_.java.lang.Integer={this.getUpper().asInstanceOf[_root_.java.lang.Integer]}
def Scalaupper_=(`~value` : _root_.java.lang.Integer):Unit={this.setUpper(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.MultiplicityElement"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

