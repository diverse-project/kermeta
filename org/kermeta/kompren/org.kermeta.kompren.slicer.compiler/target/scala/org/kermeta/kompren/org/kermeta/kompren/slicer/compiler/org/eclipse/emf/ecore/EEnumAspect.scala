package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait EEnumAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore.EDataTypeAspect with `_root_`.org.eclipse.emf.ecore.EEnum{
def ScalaeLiterals : k2.standard.ReflectiveOrderedSet[_root_.org.eclipse.emf.ecore.EEnum,_root_.org.eclipse.emf.ecore.EEnumLiteral]={  new k2.standard.RichReflectiveOrderedSet[_root_.org.eclipse.emf.ecore.EEnum,_root_.org.eclipse.emf.ecore.EEnumLiteral](thisUpper = -1,value=this.getELiterals())}
def ScalaeLiterals_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EEnumLiteral]):Unit={this.getELiterals().clear
this.getELiterals().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EEnum"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

