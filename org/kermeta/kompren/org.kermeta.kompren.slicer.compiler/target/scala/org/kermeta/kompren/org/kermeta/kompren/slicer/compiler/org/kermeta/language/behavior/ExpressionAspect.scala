package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait ExpressionAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KermetaModelElementAspect with org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.TypeContainerAspect with `_root_`.org.kermeta.language.behavior.Expression{
def ScalastaticType : _root_.org.kermeta.language.structure.Type={this.getStaticType().asInstanceOf[_root_.org.kermeta.language.structure.Type]}
def ScalastaticType_=(`~value` : _root_.org.kermeta.language.structure.Type):Unit={this.setStaticType(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.Expression"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

