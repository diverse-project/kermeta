package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait ClassAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.ParameterizedTypeAspect with `_root_`.org.kermeta.language.structure.Class{
def ScalaownedAttribute : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.Class,_root_.org.kermeta.language.structure.Property]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.Class,_root_.org.kermeta.language.structure.Property](thisUpper = -1,value=this.getOwnedAttribute())}
def ScalaownedOperation : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.Class,_root_.org.kermeta.language.structure.Operation]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.Class,_root_.org.kermeta.language.structure.Operation](thisUpper = -1,value=this.getOwnedOperation())}
def ScalasuperClass : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.Class,_root_.org.kermeta.language.structure.Class]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.Class,_root_.org.kermeta.language.structure.Class](thisUpper = -1,value=this.getSuperClass())}
def ScalaisAbstract : _root_.java.lang.Boolean={this.getIsAbstract().asInstanceOf[_root_.java.lang.Boolean]}
def Scalaname : _root_.java.lang.String={this.getName().asInstanceOf[_root_.java.lang.String]}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Class"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

