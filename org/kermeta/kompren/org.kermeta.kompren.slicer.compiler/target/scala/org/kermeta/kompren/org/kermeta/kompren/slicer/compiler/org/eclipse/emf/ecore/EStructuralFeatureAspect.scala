package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait EStructuralFeatureAspect extends k2.standard.KermetaObjectAspect with org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore.ETypedElementAspect with `_root_`.org.eclipse.emf.ecore.EStructuralFeature{
def Scalachangeable : _root_.java.lang.Boolean={this.isChangeable().asInstanceOf[_root_.java.lang.Boolean]}
def Scalachangeable_=(`~value` : _root_.java.lang.Boolean):Unit={this.setChangeable(`~value`)}
def Scalavolatile : _root_.java.lang.Boolean={this.isVolatile().asInstanceOf[_root_.java.lang.Boolean]}
def Scalavolatile_=(`~value` : _root_.java.lang.Boolean):Unit={this.setVolatile(`~value`)}
def Scalatransient : _root_.java.lang.Boolean={this.isTransient().asInstanceOf[_root_.java.lang.Boolean]}
def Scalatransient_=(`~value` : _root_.java.lang.Boolean):Unit={this.setTransient(`~value`)}
def ScaladefaultValueLiteral : _root_.java.lang.String={this.getDefaultValueLiteral().asInstanceOf[_root_.java.lang.String]}
def ScaladefaultValueLiteral_=(`~value` : _root_.java.lang.String):Unit={this.setDefaultValueLiteral(`~value`)}
def ScaladefaultValue : _root_.k2.standard.KermetaObject={this.getDefaultValue().asInstanceOf[_root_.k2.standard.KermetaObject]}
def Scalaunsettable : _root_.java.lang.Boolean={this.isUnsettable().asInstanceOf[_root_.java.lang.Boolean]}
def Scalaunsettable_=(`~value` : _root_.java.lang.Boolean):Unit={this.setUnsettable(`~value`)}
def Scaladerived : _root_.java.lang.Boolean={this.isDerived().asInstanceOf[_root_.java.lang.Boolean]}
def Scaladerived_=(`~value` : _root_.java.lang.Boolean):Unit={this.setDerived(`~value`)}
def ScalaeContainingClass : _root_.org.eclipse.emf.ecore.EClass={this.getEContainingClass().asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]}

    def getValidKermetaName():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ((this).Scalaname).asInstanceOf[_root_.java.lang.String];
if ((((((((((((((((((((((((((((((((((((((((((((((this).Scalaname) == ("result"))).or((((this).Scalaname) == ("is")))).or((((this).Scalaname) == ("class")))).or((((this).Scalaname) == ("aspect")))).or((((this).Scalaname) == ("inherits")))).or((((this).Scalaname) == ("do")))).or((((this).Scalaname) == ("value")))).or((((this).Scalaname) == ("if")))).or((((this).Scalaname) == ("then")))).or((((this).Scalaname) == ("else")))).or((((this).Scalaname) == ("loop")))).or((((this).Scalaname) == ("until")))).or((((this).Scalaname) == ("operation")))).or((((this).Scalaname) == ("method")))).or((((this).Scalaname) == ("end")))).or((((this).Scalaname) == ("reference")))).or((((this).Scalaname) == ("attribute")))).or((((this).Scalaname) == ("package")))).or((((this).Scalaname) == ("using")))).or((((this).Scalaname) == ("require")))).or((((this).Scalaname) == ("self")))).or((((this).Scalaname) == ("bag")))).or((((this).Scalaname) == ("Void")))).or((((this).Scalaname) == ("not")))).or((((this).Scalaname) == ("oset")))).or((((this).Scalaname) == ("from")))).or((((this).Scalaname) == ("super")))).or((((this).Scalaname) == ("init")))).or((((this).Scalaname) == ("true")))).or((((this).Scalaname) == ("false")))).or((((this).Scalaname) == ("var")))).or((((this).Scalaname) == ("raise")))).or((((this).Scalaname) == ("rescue")))).or((((this).Scalaname) == ("getter")))).or((((this).Scalaname) == ("pre")))).or((((this).Scalaname) == ("post")))).or((((this).Scalaname) == ("setter")))).or((((this).Scalaname) == ("property")))).or((((this).Scalaname) == ("abstract")))).or((((this).Scalaname) == ("enumeration")))).or((((this).Scalaname) == ("set")))).or((((this).Scalaname) == ("inv")))).or((((this).Scalaname) == ("extern"))))

{
`~result` = (("~").plus(`~result`)).asInstanceOf[_root_.java.lang.String];}
}
        }
 return `~result`
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EStructuralFeature"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

