package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait GenericTypeDefinitionAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.TypeDefinitionAspect with `_root_`.org.kermeta.language.structure.GenericTypeDefinition{
def ScalatypeParameter : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.GenericTypeDefinition,_root_.org.kermeta.language.structure.TypeVariable]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.GenericTypeDefinition,_root_.org.kermeta.language.structure.TypeVariable](thisUpper = -1,value=this.getTypeParameter())}
def ScalatypeParameter_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.TypeVariable]):Unit={this.getTypeParameter().clear
this.getTypeParameter().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.GenericTypeDefinition"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

