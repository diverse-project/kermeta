package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait RadiusAspect extends k2.standard.KermetaObjectAspect with `_root_`.org2.kermeta.kompren.slicer.Radius{
def ScalafocusedClasses : k2.standard.ReflectiveOrderedSet[org2.kermeta.kompren.slicer.Radius,_root_.org2.kermeta.kompren.slicer.SlicedClass]={  new k2.standard.RichReflectiveOrderedSet[org2.kermeta.kompren.slicer.Radius,_root_.org2.kermeta.kompren.slicer.SlicedClass](thisUpper = -1,value=this.getFocusedClasses())}
def ScalafocusedClasses_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedClass]):Unit={this.getFocusedClasses().clear
this.getFocusedClasses().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org2.kermeta.kompren.slicer.Radius"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

