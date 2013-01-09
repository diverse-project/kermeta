package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait EModelElementAspect extends k2.standard.KermetaObjectAspect with `_root_`.org.eclipse.emf.ecore.EModelElement{
def ScalaeAnnotations : k2.standard.ReflectiveOrderedSet[_root_.org.eclipse.emf.ecore.EModelElement,_root_.org.eclipse.emf.ecore.EAnnotation]={  new k2.standard.RichReflectiveOrderedSet[_root_.org.eclipse.emf.ecore.EModelElement,_root_.org.eclipse.emf.ecore.EAnnotation](thisUpper = -1,value=this.getEAnnotations())}
def ScalaeAnnotations_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EAnnotation]):Unit={this.getEAnnotations().clear
this.getEAnnotations().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EModelElement"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

