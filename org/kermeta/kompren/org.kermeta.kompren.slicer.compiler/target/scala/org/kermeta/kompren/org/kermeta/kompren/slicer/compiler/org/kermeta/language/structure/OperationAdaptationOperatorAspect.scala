package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait OperationAdaptationOperatorAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.AdaptationOperatorAspect with `_root_`.org.kermeta.language.structure.OperationAdaptationOperator{
def Scalabody : _root_.java.lang.String={this.getBody().asInstanceOf[_root_.java.lang.String]}
def Scalabody_=(`~value` : _root_.java.lang.String):Unit={this.setBody(`~value`)}
def Scalatarget : _root_.org.kermeta.language.structure.Operation={this.getTarget().asInstanceOf[_root_.org.kermeta.language.structure.Operation]}
def Scalatarget_=(`~value` : _root_.org.kermeta.language.structure.Operation):Unit={this.setTarget(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.OperationAdaptationOperator"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

