package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait AdaptationBindingAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.ModelTypeBindingAspect with `_root_`.org.kermeta.language.structure.AdaptationBinding{
def ScalaownedClassDefinitionBindings : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.AdaptationBinding,_root_.org.kermeta.language.structure.ClassDefinitionBinding]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.AdaptationBinding,_root_.org.kermeta.language.structure.ClassDefinitionBinding](thisUpper = -1,value=this.getOwnedClassDefinitionBindings())}
def ScalaownedClassDefinitionBindings_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.ClassDefinitionBinding]):Unit={this.getOwnedClassDefinitionBindings().clear
this.getOwnedClassDefinitionBindings().addAll(`~value`)
}
def ScalaownedEnumerationBindings : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.AdaptationBinding,_root_.org.kermeta.language.structure.EnumerationBinding]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.AdaptationBinding,_root_.org.kermeta.language.structure.EnumerationBinding](thisUpper = -1,value=this.getOwnedEnumerationBindings())}
def ScalaownedEnumerationBindings_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.EnumerationBinding]):Unit={this.getOwnedEnumerationBindings().clear
this.getOwnedEnumerationBindings().addAll(`~value`)
}
def ScalausedAdaptationOperators : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.AdaptationBinding,_root_.org.kermeta.language.structure.UseAdaptationOperator]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.AdaptationBinding,_root_.org.kermeta.language.structure.UseAdaptationOperator](thisUpper = -1,value=this.getUsedAdaptationOperators())}
def ScalausedAdaptationOperators_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.UseAdaptationOperator]):Unit={this.getUsedAdaptationOperators().clear
this.getUsedAdaptationOperators().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.AdaptationBinding"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

