package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait EGenericTypeAspect extends k2.standard.KermetaObjectAspect with `_root_`.org.eclipse.emf.ecore.EGenericType{
def ScalaeUpperBound : _root_.org.eclipse.emf.ecore.EGenericType={this.getEUpperBound().asInstanceOf[_root_.org.eclipse.emf.ecore.EGenericType]}
def ScalaeUpperBound_=(`~value` : _root_.org.eclipse.emf.ecore.EGenericType):Unit={this.setEUpperBound(`~value`)}
def ScalaeTypeArguments : k2.standard.ReflectiveOrderedSet[org.eclipse.emf.ecore.EGenericType,_root_.org.eclipse.emf.ecore.EGenericType]={  new k2.standard.RichReflectiveOrderedSet[org.eclipse.emf.ecore.EGenericType,_root_.org.eclipse.emf.ecore.EGenericType](thisUpper = -1,value=this.getETypeArguments())}
def ScalaeTypeArguments_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EGenericType]):Unit={this.getETypeArguments().clear
this.getETypeArguments().addAll(`~value`)
}
def ScalaeRawType : _root_.org.eclipse.emf.ecore.EClassifier={this.getERawType().asInstanceOf[_root_.org.eclipse.emf.ecore.EClassifier]}
def ScalaeLowerBound : _root_.org.eclipse.emf.ecore.EGenericType={this.getELowerBound().asInstanceOf[_root_.org.eclipse.emf.ecore.EGenericType]}
def ScalaeLowerBound_=(`~value` : _root_.org.eclipse.emf.ecore.EGenericType):Unit={this.setELowerBound(`~value`)}
def ScalaeTypeParameter : _root_.org.eclipse.emf.ecore.ETypeParameter={this.getETypeParameter().asInstanceOf[_root_.org.eclipse.emf.ecore.ETypeParameter]}
def ScalaeTypeParameter_=(`~value` : _root_.org.eclipse.emf.ecore.ETypeParameter):Unit={this.setETypeParameter(`~value`)}
def ScalaeClassifier : _root_.org.eclipse.emf.ecore.EClassifier={this.getEClassifier().asInstanceOf[_root_.org.eclipse.emf.ecore.EClassifier]}
def ScalaeClassifier_=(`~value` : _root_.org.eclipse.emf.ecore.EClassifier):Unit={this.setEClassifier(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EGenericType"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

