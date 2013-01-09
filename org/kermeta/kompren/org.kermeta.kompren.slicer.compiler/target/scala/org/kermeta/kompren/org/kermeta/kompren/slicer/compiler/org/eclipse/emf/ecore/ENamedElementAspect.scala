package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait ENamedElementAspect extends k2.standard.KermetaObjectAspect with org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore.EModelElementAspect with `_root_`.org.eclipse.emf.ecore.ENamedElement{
def Scalaname : _root_.java.lang.String={this.getName().asInstanceOf[_root_.java.lang.String]}
def Scalaname_=(`~value` : _root_.java.lang.String):Unit={this.setName(`~value`)}

    def getQualifiedName():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ((this).Scalaname).asInstanceOf[_root_.java.lang.String];
if (((_root_.k2.standard.KerRichFactory.isVoid(((this).container()))).not()).andThen({(b : _root_.java.lang.Boolean)=>

{
((this).container()).isInstanceOf[_root_.org.eclipse.emf.ecore.ENamedElement]}
}))

{
`~result` = ((((((this).container()).asInstanceOf[_root_.org.eclipse.emf.ecore.ENamedElement]).getQualifiedName()).plus("::")).plus((this).Scalaname)).asInstanceOf[_root_.java.lang.String];}
}
        }
 return `~result`
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.ENamedElement"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

