package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait EPackageAspect extends k2.standard.KermetaObjectAspect with org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore.ENamedElementAspect with `_root_`.org.eclipse.emf.ecore.EPackage{
def ScalansURI : _root_.java.lang.String={this.getNsURI().asInstanceOf[_root_.java.lang.String]}
def ScalansURI_=(`~value` : _root_.java.lang.String):Unit={this.setNsURI(`~value`)}
def ScalansPrefix : _root_.java.lang.String={this.getNsPrefix().asInstanceOf[_root_.java.lang.String]}
def ScalansPrefix_=(`~value` : _root_.java.lang.String):Unit={this.setNsPrefix(`~value`)}
def ScalaeFactoryInstance : _root_.org.eclipse.emf.ecore.EFactory={this.getEFactoryInstance().asInstanceOf[_root_.org.eclipse.emf.ecore.EFactory]}
def ScalaeFactoryInstance_=(`~value` : _root_.org.eclipse.emf.ecore.EFactory):Unit={this.setEFactoryInstance(`~value`)}
def ScalaeClassifiers : k2.standard.ReflectiveOrderedSet[_root_.org.eclipse.emf.ecore.EPackage,_root_.org.eclipse.emf.ecore.EClassifier]={  new k2.standard.RichReflectiveOrderedSet[_root_.org.eclipse.emf.ecore.EPackage,_root_.org.eclipse.emf.ecore.EClassifier](thisUpper = -1,value=this.getEClassifiers())}
def ScalaeClassifiers_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EClassifier]):Unit={this.getEClassifiers().clear
this.getEClassifiers().addAll(`~value`)
}
def ScalaeSubpackages : k2.standard.ReflectiveOrderedSet[_root_.org.eclipse.emf.ecore.EPackage,_root_.org.eclipse.emf.ecore.EPackage]={  new k2.standard.RichReflectiveOrderedSet[_root_.org.eclipse.emf.ecore.EPackage,_root_.org.eclipse.emf.ecore.EPackage](thisUpper = -1,value=this.getESubpackages())}
def ScalaeSubpackages_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EPackage]):Unit={this.getESubpackages().clear
this.getESubpackages().addAll(`~value`)
}
def ScalaeSuperPackage : _root_.org.eclipse.emf.ecore.EPackage={this.getESuperPackage().asInstanceOf[_root_.org.eclipse.emf.ecore.EPackage]}

    def getAllClasses():_root_.k2.standard.KermetaBag[_root_.org.eclipse.emf.ecore.EClass] = {
var `~result` : _root_.k2.standard.KermetaBag[_root_.org.eclipse.emf.ecore.EClass] = null.asInstanceOf[_root_.k2.standard.KermetaBag[_root_.org.eclipse.emf.ecore.EClass]]; 
  { 


{
`~result` = (_root_.k2.standard.KerRichFactory.createBag[_root_.org.eclipse.emf.ecore.EClass]).asInstanceOf[_root_.k2.standard.KermetaBag[_root_.org.eclipse.emf.ecore.EClass]];
((this).ScalaeClassifiers).each({(classifier : _root_.org.eclipse.emf.ecore.EClassifier)=>

{
if ((classifier).isInstanceOf[_root_.org.eclipse.emf.ecore.EClass])

{
(`~result`).add((classifier).asInstanceOf[_root_.org.eclipse.emf.ecore.EClass])}
}
})
((this).ScalaeSubpackages).each({(pkg : _root_.org.eclipse.emf.ecore.EPackage)=>

{
(`~result`).addAll((pkg).getAllClasses())}
})}
        }
 return `~result`
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EPackage"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

