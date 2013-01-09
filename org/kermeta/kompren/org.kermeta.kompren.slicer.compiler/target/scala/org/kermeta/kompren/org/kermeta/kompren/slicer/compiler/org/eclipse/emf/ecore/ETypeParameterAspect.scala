package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait ETypeParameterAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore.ENamedElementAspect with `_root_`.org.eclipse.emf.ecore.ETypeParameter{
def ScalaeBounds : k2.standard.ReflectiveOrderedSet[org.eclipse.emf.ecore.ETypeParameter,_root_.org.eclipse.emf.ecore.EGenericType]={  new k2.standard.RichReflectiveOrderedSet[org.eclipse.emf.ecore.ETypeParameter,_root_.org.eclipse.emf.ecore.EGenericType](thisUpper = -1,value=this.getEBounds())}
def ScalaeBounds_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EGenericType]):Unit={this.getEBounds().clear
this.getEBounds().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.ETypeParameter"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

