package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait ETypedElementAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore.ENamedElementAspect with `_root_`.org.eclipse.emf.ecore.ETypedElement{
def Scalaordered : _root_.java.lang.Boolean={this.isOrdered().asInstanceOf[_root_.java.lang.Boolean]}
def Scalaordered_=(`~value` : _root_.java.lang.Boolean):Unit={this.setOrdered(`~value`)}
def Scalaunique : _root_.java.lang.Boolean={this.isUnique().asInstanceOf[_root_.java.lang.Boolean]}
def Scalaunique_=(`~value` : _root_.java.lang.Boolean):Unit={this.setUnique(`~value`)}
def ScalalowerBound : _root_.java.lang.Integer={this.getLowerBound().asInstanceOf[_root_.java.lang.Integer]}
def ScalalowerBound_=(`~value` : _root_.java.lang.Integer):Unit={this.setLowerBound(`~value`)}
def ScalaupperBound : _root_.java.lang.Integer={this.getUpperBound().asInstanceOf[_root_.java.lang.Integer]}
def ScalaupperBound_=(`~value` : _root_.java.lang.Integer):Unit={this.setUpperBound(`~value`)}
def Scalamany : _root_.java.lang.Boolean={this.isMany().asInstanceOf[_root_.java.lang.Boolean]}
def Scalarequired : _root_.java.lang.Boolean={this.isRequired().asInstanceOf[_root_.java.lang.Boolean]}
def ScalaeType : _root_.org.eclipse.emf.ecore.EClassifier={this.getEType().asInstanceOf[_root_.org.eclipse.emf.ecore.EClassifier]}
def ScalaeType_=(`~value` : _root_.org.eclipse.emf.ecore.EClassifier):Unit={this.setEType(`~value`)}
def ScalaeGenericType : _root_.org.eclipse.emf.ecore.EGenericType={this.getEGenericType().asInstanceOf[_root_.org.eclipse.emf.ecore.EGenericType]}
def ScalaeGenericType_=(`~value` : _root_.org.eclipse.emf.ecore.EGenericType):Unit={this.setEGenericType(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.ETypedElement"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

