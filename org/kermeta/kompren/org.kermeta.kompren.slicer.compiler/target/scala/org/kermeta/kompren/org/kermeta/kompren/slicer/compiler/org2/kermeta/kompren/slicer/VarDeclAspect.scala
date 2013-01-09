package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait VarDeclAspect extends k2.standard.KermetaObjectAspect with `_root_`.org2.kermeta.kompren.slicer.VarDecl{
def ScalavarName : _root_.java.lang.String={this.getVarName().asInstanceOf[_root_.java.lang.String]}
def ScalavarName_=(`~value` : _root_.java.lang.String):Unit={this.setVarName(`~value`)}
def Scalatype : _root_.org.eclipse.emf.ecore.EClass={this.getType().asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]}
def Scalatype_=(`~value` : _root_.org.eclipse.emf.ecore.EClass):Unit={this.setType(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org2.kermeta.kompren.slicer.VarDecl"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

