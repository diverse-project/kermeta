package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait SlicerAspect extends k2.standard.KermetaObjectAspect with `_root_`.org2.kermeta.kompren.slicer.Slicer{
def Scalaname : _root_.java.lang.String={this.getName().asInstanceOf[_root_.java.lang.String]}
def Scalaname_=(`~value` : _root_.java.lang.String):Unit={this.setName(`~value`)}
def ScalauriMetamodel : _root_.java.lang.String={this.getUriMetamodel().asInstanceOf[_root_.java.lang.String]}
def ScalauriMetamodel_=(`~value` : _root_.java.lang.String):Unit={this.setUriMetamodel(`~value`)}
def Scalaactive : _root_.java.lang.Boolean={this.isActive().asInstanceOf[_root_.java.lang.Boolean]}
def Scalaactive_=(`~value` : _root_.java.lang.Boolean):Unit={this.setActive(`~value`)}
def Scalastrict : _root_.java.lang.Boolean={this.isStrict().asInstanceOf[_root_.java.lang.Boolean]}
def Scalastrict_=(`~value` : _root_.java.lang.Boolean):Unit={this.setStrict(`~value`)}
def Scalahelper : _root_.java.lang.String={this.getHelper().asInstanceOf[_root_.java.lang.String]}
def Scalahelper_=(`~value` : _root_.java.lang.String):Unit={this.setHelper(`~value`)}
def ScalaonStart : _root_.java.lang.String={this.getOnStart().asInstanceOf[_root_.java.lang.String]}
def ScalaonStart_=(`~value` : _root_.java.lang.String):Unit={this.setOnStart(`~value`)}
def ScalaonEnd : _root_.java.lang.String={this.getOnEnd().asInstanceOf[_root_.java.lang.String]}
def ScalaonEnd_=(`~value` : _root_.java.lang.String):Unit={this.setOnEnd(`~value`)}
def Scalaconstraints : k2.standard.ReflectiveOrderedSet[org2.kermeta.kompren.slicer.Slicer,_root_.org2.kermeta.kompren.slicer.Constraint]={  new k2.standard.RichReflectiveOrderedSet[org2.kermeta.kompren.slicer.Slicer,_root_.org2.kermeta.kompren.slicer.Constraint](thisUpper = -1,value=this.getConstraints())}
def Scalaconstraints_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.Constraint]):Unit={this.getConstraints().clear
this.getConstraints().addAll(`~value`)
}
def Scalaradius : _root_.org2.kermeta.kompren.slicer.Radius={this.getRadius().asInstanceOf[_root_.org2.kermeta.kompren.slicer.Radius]}
def Scalaradius_=(`~value` : _root_.org2.kermeta.kompren.slicer.Radius):Unit={this.setRadius(`~value`)}
def ScalaslicedElements : k2.standard.ReflectiveOrderedSet[org2.kermeta.kompren.slicer.Slicer,_root_.org2.kermeta.kompren.slicer.SlicedElement]={  new k2.standard.RichReflectiveOrderedSet[org2.kermeta.kompren.slicer.Slicer,_root_.org2.kermeta.kompren.slicer.SlicedElement](thisUpper = -1,value=this.getSlicedElements())}
def ScalaslicedElements_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedElement]):Unit={this.getSlicedElements().clear
this.getSlicedElements().addAll(`~value`)
}
def ScalainputClasses : k2.standard.ReflectiveOrderedSet[org2.kermeta.kompren.slicer.Slicer,_root_.org.eclipse.emf.ecore.EClass]={  new k2.standard.RichReflectiveOrderedSet[org2.kermeta.kompren.slicer.Slicer,_root_.org.eclipse.emf.ecore.EClass](thisUpper = -1,value=this.getInputClasses())}
def ScalainputClasses_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EClass]):Unit={this.getInputClasses().clear
this.getInputClasses().addAll(`~value`)
}
var slicedClasses : k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedClass] = k2.standard.KerRichFactory.createOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedClass]
def KergetSlicedClasses() : k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedClass]={this.slicedClasses}
def KersetSlicedClasses(arg:k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedClass])={ this.slicedClasses = arg}
def ScalaslicedClasses : k2.standard.ReflectiveOrderedSet[org2.kermeta.kompren.slicer.Slicer,_root_.org2.kermeta.kompren.slicer.SlicedClass]={var `~result` : k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedClass] = null.asInstanceOf[k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedClass]]; 


{
`~result` = (_root_.k2.standard.KerRichFactory.createOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedClass]).asInstanceOf[_root_.k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedClass]];
((this).ScalaslicedElements).each({(se : _root_.org2.kermeta.kompren.slicer.SlicedElement)=>

{
if ((se).isInstanceOf[_root_.org2.kermeta.kompren.slicer.SlicedClass])

{
(`~result`).add((se).asInstanceOf[_root_.org2.kermeta.kompren.slicer.SlicedClass])}
}
})}
() 
 return `~result`
}
def ScalaslicedClasses_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedClass]):Unit={}
var slicedProperties : k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedProperty] = k2.standard.KerRichFactory.createOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedProperty]
def KergetSlicedProperties() : k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedProperty]={this.slicedProperties}
def KersetSlicedProperties(arg:k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedProperty])={ this.slicedProperties = arg}
def ScalaslicedProperties : k2.standard.ReflectiveOrderedSet[org2.kermeta.kompren.slicer.Slicer,_root_.org2.kermeta.kompren.slicer.SlicedProperty]={var `~result` : k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedProperty] = null.asInstanceOf[k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedProperty]]; 


{
`~result` = (_root_.k2.standard.KerRichFactory.createOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedProperty]).asInstanceOf[_root_.k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedProperty]];
((this).ScalaslicedElements).each({(se : _root_.org2.kermeta.kompren.slicer.SlicedElement)=>

{
if ((se).isInstanceOf[_root_.org2.kermeta.kompren.slicer.SlicedProperty])

{
(`~result`).add((se).asInstanceOf[_root_.org2.kermeta.kompren.slicer.SlicedProperty])}
}
})}
() 
 return `~result`
}
def ScalaslicedProperties_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org2.kermeta.kompren.slicer.SlicedProperty]):Unit={}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org2.kermeta.kompren.slicer.Slicer"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

