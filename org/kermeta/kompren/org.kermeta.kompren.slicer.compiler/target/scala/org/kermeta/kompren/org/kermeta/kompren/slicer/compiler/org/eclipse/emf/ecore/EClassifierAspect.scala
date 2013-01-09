package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait EClassifierAspect extends k2.standard.KermetaObjectAspect with org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore.ENamedElementAspect with `_root_`.org.eclipse.emf.ecore.EClassifier{
def ScalainstanceClassName : _root_.java.lang.String={this.getInstanceClassName().asInstanceOf[_root_.java.lang.String]}
def ScalainstanceClassName_=(`~value` : _root_.java.lang.String):Unit={this.setInstanceClassName(`~value`)}
def ScalainstanceClass : java.lang.Class[Any]={this.getInstanceClass().asInstanceOf[java.lang.Class[Any]]}
def ScaladefaultValue : _root_.k2.standard.KermetaObject={this.getDefaultValue().asInstanceOf[_root_.k2.standard.KermetaObject]}
def ScalainstanceTypeName : _root_.java.lang.String={this.getInstanceTypeName().asInstanceOf[_root_.java.lang.String]}
def ScalainstanceTypeName_=(`~value` : _root_.java.lang.String):Unit={this.setInstanceTypeName(`~value`)}
def ScalaePackage : _root_.org.eclipse.emf.ecore.EPackage={this.getEPackage().asInstanceOf[_root_.org.eclipse.emf.ecore.EPackage]}
def ScalaeTypeParameters : k2.standard.ReflectiveOrderedSet[org.eclipse.emf.ecore.EClassifier,_root_.org.eclipse.emf.ecore.ETypeParameter]={  new k2.standard.RichReflectiveOrderedSet[org.eclipse.emf.ecore.EClassifier,_root_.org.eclipse.emf.ecore.ETypeParameter](thisUpper = -1,value=this.getETypeParameters())}
def ScalaeTypeParameters_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.ETypeParameter]):Unit={this.getETypeParameters().clear
this.getETypeParameters().addAll(`~value`)
}
var outputFocusedRelations : k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedProperty] = k2.standard.KerRichFactory.createOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedProperty]
def KergetOutputFocusedRelations() : k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedProperty]={this.outputFocusedRelations}
def KersetOutputFocusedRelations(arg:k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedProperty])={ this.outputFocusedRelations = arg}
def ScalaoutputFocusedRelations : k2.standard.ReflectiveOrderedSet[org.eclipse.emf.ecore.EClassifier,_root_.org2.kermeta.kompren.slicer.SlicedProperty]={  new k2.standard.RichReflectiveOrderedSet[org.eclipse.emf.ecore.EClassifier,_root_.org2.kermeta.kompren.slicer.SlicedProperty](thisUpper = -1,value=this.KergetOutputFocusedRelations())}
def ScalaoutputFocusedRelations_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedProperty]):Unit={this.KergetOutputFocusedRelations().clear
this.KergetOutputFocusedRelations().addAll(`~value`)
}

    def getVarNameClassifier():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ((this).getVarName((this).Scalaname, false)).asInstanceOf[_root_.java.lang.String];}
        }
 return `~result`
}

    def getVarName(name : _root_.java.lang.String, withS : _root_.java.lang.Boolean):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = (("the").plus(name)).asInstanceOf[_root_.java.lang.String];
if (withS)

{
`~result` = ((`~result`).plus("s")).asInstanceOf[_root_.java.lang.String];}
}
        }
 return `~result`
}

    def getRequiredAttributeName():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ((("required").plus((this).Scalaname)).plus("s")).asInstanceOf[_root_.java.lang.String];}
        }
 return `~result`
}

    def getAddedAttributeName():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ((("added").plus((this).Scalaname)).plus("s")).asInstanceOf[_root_.java.lang.String];}
        }
 return `~result`
}

    def isSuperTypeOfBis(clazz : _root_.org.eclipse.emf.ecore.EClass):_root_.java.lang.Boolean = {
var `~result` : _root_.java.lang.Boolean = null.asInstanceOf[_root_.java.lang.Boolean]; 
  { 


{
`~result` = ((_root_.k2.standard.KerRichFactory.isVoid((clazz))).not()).asInstanceOf[_root_.java.lang.Boolean];
var qualifiedName : _root_.java.lang.String = (this).getQualifiedName();
if (`~result`)

{
`~result` = (((clazz).ScalaeSuperTypes).exists({(cl : _root_.org.eclipse.emf.ecore.EClass)=>

{
(((cl).getQualifiedName()) == (qualifiedName))}
})).asInstanceOf[_root_.java.lang.Boolean];
if ((`~result`).not())

{
`~result` = (((clazz).ScalaeSuperTypes).exists({(st : _root_.org.eclipse.emf.ecore.EClass)=>

{
(this).isSuperTypeOfBis(st)}
})).asInstanceOf[_root_.java.lang.Boolean];}
}
}
        }
 return `~result`
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EClassifier"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

