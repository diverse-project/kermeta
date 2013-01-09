package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait EOperationAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore.ETypedElementAspect with `_root_`.org.eclipse.emf.ecore.EOperation{
def ScalaeContainingClass : _root_.org.eclipse.emf.ecore.EClass={this.getEContainingClass().asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]}
def ScalaeTypeParameters : k2.standard.ReflectiveOrderedSet[org.eclipse.emf.ecore.EOperation,_root_.org.eclipse.emf.ecore.ETypeParameter]={  new k2.standard.RichReflectiveOrderedSet[org.eclipse.emf.ecore.EOperation,_root_.org.eclipse.emf.ecore.ETypeParameter](thisUpper = -1,value=this.getETypeParameters())}
def ScalaeTypeParameters_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.ETypeParameter]):Unit={this.getETypeParameters().clear
this.getETypeParameters().addAll(`~value`)
}
def ScalaeParameters : k2.standard.ReflectiveOrderedSet[_root_.org.eclipse.emf.ecore.EOperation,_root_.org.eclipse.emf.ecore.EParameter]={  new k2.standard.RichReflectiveOrderedSet[_root_.org.eclipse.emf.ecore.EOperation,_root_.org.eclipse.emf.ecore.EParameter](thisUpper = -1,value=this.getEParameters())}
def ScalaeParameters_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EParameter]):Unit={this.getEParameters().clear
this.getEParameters().addAll(`~value`)
}
def ScalaeExceptions : k2.standard.ReflectiveOrderedSet[org.eclipse.emf.ecore.EOperation,_root_.org.eclipse.emf.ecore.EClassifier]={  new k2.standard.RichReflectiveOrderedSet[org.eclipse.emf.ecore.EOperation,_root_.org.eclipse.emf.ecore.EClassifier](thisUpper = -1,value=this.getEExceptions())}
def ScalaeExceptions_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EClassifier]):Unit={this.getEExceptions().clear
this.getEExceptions().addAll(`~value`)
}
def ScalaeGenericExceptions : k2.standard.ReflectiveOrderedSet[org.eclipse.emf.ecore.EOperation,_root_.org.eclipse.emf.ecore.EGenericType]={  new k2.standard.RichReflectiveOrderedSet[org.eclipse.emf.ecore.EOperation,_root_.org.eclipse.emf.ecore.EGenericType](thisUpper = -1,value=this.getEGenericExceptions())}
def ScalaeGenericExceptions_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EGenericType]):Unit={this.getEGenericExceptions().clear
this.getEGenericExceptions().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EOperation"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

