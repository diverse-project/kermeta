package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait SlicedPropertyAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicedElementAspect with `_root_`.org2.kermeta.kompren.slicer.SlicedProperty{
def Scalaopposite : _root_.org2.kermeta.kompren.slicer.OppositeCreation={this.getOpposite().asInstanceOf[_root_.org2.kermeta.kompren.slicer.OppositeCreation]}
def Scalaopposite_=(`~value` : _root_.org2.kermeta.kompren.slicer.OppositeCreation):Unit={this.setOpposite(`~value`)}
def Scalasrc : _root_.org2.kermeta.kompren.slicer.VarDecl={this.getSrc().asInstanceOf[_root_.org2.kermeta.kompren.slicer.VarDecl]}
def Scalasrc_=(`~value` : _root_.org2.kermeta.kompren.slicer.VarDecl):Unit={this.setSrc(`~value`)}
def Scalatgt : _root_.org2.kermeta.kompren.slicer.VarDecl={this.getTgt().asInstanceOf[_root_.org2.kermeta.kompren.slicer.VarDecl]}
def Scalatgt_=(`~value` : _root_.org2.kermeta.kompren.slicer.VarDecl):Unit={this.setTgt(`~value`)}
def Scaladomain : _root_.org.eclipse.emf.ecore.EStructuralFeature={this.getDomain().asInstanceOf[_root_.org.eclipse.emf.ecore.EStructuralFeature]}
def Scaladomain_=(`~value` : _root_.org.eclipse.emf.ecore.EStructuralFeature):Unit={this.setDomain(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org2.kermeta.kompren.slicer.SlicedProperty"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

