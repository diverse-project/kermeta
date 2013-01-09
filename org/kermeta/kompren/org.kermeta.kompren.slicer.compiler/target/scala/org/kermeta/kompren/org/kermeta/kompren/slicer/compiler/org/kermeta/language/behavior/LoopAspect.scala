package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait LoopAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.behavior.ExpressionAspect with `_root_`.org.kermeta.language.behavior.Loop{
def Scalainitialization : _root_.org.kermeta.language.behavior.Expression={this.getInitialization().asInstanceOf[_root_.org.kermeta.language.behavior.Expression]}
def Scalainitialization_=(`~value` : _root_.org.kermeta.language.behavior.Expression):Unit={this.setInitialization(`~value`)}
def Scalabody : _root_.org.kermeta.language.behavior.Expression={this.getBody().asInstanceOf[_root_.org.kermeta.language.behavior.Expression]}
def Scalabody_=(`~value` : _root_.org.kermeta.language.behavior.Expression):Unit={this.setBody(`~value`)}
def ScalastopCondition : _root_.org.kermeta.language.behavior.Expression={this.getStopCondition().asInstanceOf[_root_.org.kermeta.language.behavior.Expression]}
def ScalastopCondition_=(`~value` : _root_.org.kermeta.language.behavior.Expression):Unit={this.setStopCondition(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.Loop"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

