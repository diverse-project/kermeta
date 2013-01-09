package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait PackageAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.NamedElementAspect with org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.TypeDefinitionContainerAspect with `_root_`.org.kermeta.language.structure.Package{
def ScalanestedPackage : k2.standard.ReflectiveOrderedSet[_root_.org.kermeta.language.structure.Package,_root_.org.kermeta.language.structure.Package]={  new k2.standard.RichReflectiveOrderedSet[_root_.org.kermeta.language.structure.Package,_root_.org.kermeta.language.structure.Package](thisUpper = -1,value=this.getNestedPackage())}
def ScalanestedPackage_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Package]):Unit={this.getNestedPackage().clear
this.getNestedPackage().addAll(`~value`)
}
def ScalanestingPackage : _root_.org.kermeta.language.structure.Package={this.getNestingPackage().asInstanceOf[_root_.org.kermeta.language.structure.Package]}
def ScalanestingPackage_=(`~value` : _root_.org.kermeta.language.structure.Package):Unit={this.setNestingPackage(`~value`)}
def Scalauri : _root_.java.lang.String={this.getUri().asInstanceOf[_root_.java.lang.String]}
def Scalauri_=(`~value` : _root_.java.lang.String):Unit={this.setUri(`~value`)}
def ScalaownedAdaptationOperators : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.Package,_root_.org.kermeta.language.structure.AdaptationOperator]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.Package,_root_.org.kermeta.language.structure.AdaptationOperator](thisUpper = -1,value=this.getOwnedAdaptationOperators())}
def ScalaownedAdaptationOperators_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.AdaptationOperator]):Unit={this.getOwnedAdaptationOperators().clear
this.getOwnedAdaptationOperators().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Package"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

