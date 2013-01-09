package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait TypeContainerAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KermetaModelElementAspect with `_root_`.org.kermeta.language.structure.TypeContainer{
def ScalacontainedType : k2.standard.ReflectiveSet[_root_.org.kermeta.language.structure.TypeContainer,_root_.org.kermeta.language.structure.Type]={  new k2.standard.RichReflectiveSet[_root_.org.kermeta.language.structure.TypeContainer,_root_.org.kermeta.language.structure.Type](thisUpper = -1,value=this.getContainedType())}
def ScalacontainedType_=(`~value` : k2.standard.KermetaSet[_root_.org.kermeta.language.structure.Type]):Unit={this.getContainedType().clear
this.getContainedType().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.TypeContainer"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

