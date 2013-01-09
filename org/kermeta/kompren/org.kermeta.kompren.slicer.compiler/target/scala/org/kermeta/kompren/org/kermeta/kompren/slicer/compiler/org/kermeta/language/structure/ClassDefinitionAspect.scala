package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait ClassDefinitionAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.GenericTypeDefinitionAspect with `_root_`.org.kermeta.language.structure.ClassDefinition{
def Scalainv : k2.standard.ReflectiveOrderedSet[_root_.org.kermeta.language.structure.ClassDefinition,_root_.org.kermeta.language.structure.Constraint]={  new k2.standard.RichReflectiveOrderedSet[_root_.org.kermeta.language.structure.ClassDefinition,_root_.org.kermeta.language.structure.Constraint](thisUpper = -1,value=this.getInv())}
def Scalainv_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Constraint]):Unit={this.getInv().clear
this.getInv().addAll(`~value`)
}
def ScalaisAbstract : _root_.java.lang.Boolean={this.getIsAbstract().asInstanceOf[_root_.java.lang.Boolean]}
def ScalaisAbstract_=(`~value` : _root_.java.lang.Boolean):Unit={this.setIsAbstract(`~value`)}
def ScalaownedAttribute : k2.standard.ReflectiveSet[_root_.org.kermeta.language.structure.ClassDefinition,_root_.org.kermeta.language.structure.Property]={  new k2.standard.RichReflectiveSet[_root_.org.kermeta.language.structure.ClassDefinition,_root_.org.kermeta.language.structure.Property](thisUpper = -1,value=this.getOwnedAttribute())}
def ScalaownedAttribute_=(`~value` : k2.standard.KermetaSet[_root_.org.kermeta.language.structure.Property]):Unit={this.getOwnedAttribute().clear
this.getOwnedAttribute().addAll(`~value`)
}
def ScalaownedOperation : k2.standard.ReflectiveSet[_root_.org.kermeta.language.structure.ClassDefinition,_root_.org.kermeta.language.structure.Operation]={  new k2.standard.RichReflectiveSet[_root_.org.kermeta.language.structure.ClassDefinition,_root_.org.kermeta.language.structure.Operation](thisUpper = -1,value=this.getOwnedOperation())}
def ScalaownedOperation_=(`~value` : k2.standard.KermetaSet[_root_.org.kermeta.language.structure.Operation]):Unit={this.getOwnedOperation().clear
this.getOwnedOperation().addAll(`~value`)
}
def ScalaisSingleton : _root_.java.lang.Boolean={this.getIsSingleton().asInstanceOf[_root_.java.lang.Boolean]}
def ScalaisSingleton_=(`~value` : _root_.java.lang.Boolean):Unit={this.setIsSingleton(`~value`)}
def ScalaisFinal : _root_.java.lang.Boolean={this.getIsFinal().asInstanceOf[_root_.java.lang.Boolean]}
def ScalaisFinal_=(`~value` : _root_.java.lang.Boolean):Unit={this.setIsFinal(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.ClassDefinition"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

