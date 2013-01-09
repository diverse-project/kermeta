package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait UnresolvedOperationAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.AbstractOperationAspect with org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.UnresolvedAspect with org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.TypeContainerAspect with `_root_`.org.kermeta.language.structure.UnresolvedOperation{
def ScalaoperationIdentifier : _root_.java.lang.String={this.getOperationIdentifier().asInstanceOf[_root_.java.lang.String]}
def ScalaoperationIdentifier_=(`~value` : _root_.java.lang.String):Unit={this.setOperationIdentifier(`~value`)}
def Scalafrom : _root_.org.kermeta.language.structure.Type={this.getFrom().asInstanceOf[_root_.org.kermeta.language.structure.Type]}
def Scalafrom_=(`~value` : _root_.org.kermeta.language.structure.Type):Unit={this.setFrom(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.UnresolvedOperation"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

