package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait PropertyAdaptationOperatorAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.AdaptationOperatorAspect with `_root_`.org.kermeta.language.structure.PropertyAdaptationOperator{
def Scalatarget : _root_.org.kermeta.language.structure.Property={this.getTarget().asInstanceOf[_root_.org.kermeta.language.structure.Property]}
def Scalatarget_=(`~value` : _root_.org.kermeta.language.structure.Property):Unit={this.setTarget(`~value`)}
def Scalagetter : _root_.java.lang.String={this.getGetter().asInstanceOf[_root_.java.lang.String]}
def Scalagetter_=(`~value` : _root_.java.lang.String):Unit={this.setGetter(`~value`)}
def Scalasetter : _root_.java.lang.String={this.getSetter().asInstanceOf[_root_.java.lang.String]}
def Scalasetter_=(`~value` : _root_.java.lang.String):Unit={this.setSetter(`~value`)}
def Scalaadder : _root_.java.lang.String={this.getAdder().asInstanceOf[_root_.java.lang.String]}
def Scalaadder_=(`~value` : _root_.java.lang.String):Unit={this.setAdder(`~value`)}
def Scalaremover : _root_.java.lang.String={this.getRemover().asInstanceOf[_root_.java.lang.String]}
def Scalaremover_=(`~value` : _root_.java.lang.String):Unit={this.setRemover(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.PropertyAdaptationOperator"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

