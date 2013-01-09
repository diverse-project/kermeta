package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait SlicedClassAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicedElementAspect with `_root_`.org2.kermeta.kompren.slicer.SlicedClass{
def Scalactx : _root_.org2.kermeta.kompren.slicer.VarDecl={this.getCtx().asInstanceOf[_root_.org2.kermeta.kompren.slicer.VarDecl]}
def Scalactx_=(`~value` : _root_.org2.kermeta.kompren.slicer.VarDecl):Unit={this.setCtx(`~value`)}
def Scaladomain : _root_.org.eclipse.emf.ecore.EClass={this.getDomain().asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]}
def Scaladomain_=(`~value` : _root_.org.eclipse.emf.ecore.EClass):Unit={this.setDomain(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org2.kermeta.kompren.slicer.SlicedClass"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

