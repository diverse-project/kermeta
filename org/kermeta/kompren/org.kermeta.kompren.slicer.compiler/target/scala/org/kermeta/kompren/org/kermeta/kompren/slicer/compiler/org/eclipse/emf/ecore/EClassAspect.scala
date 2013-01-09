package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait EClassAspect extends k2.standard.KermetaObjectAspect with org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore.EClassifierAspect with `_root_`.org.eclipse.emf.ecore.EClass{
def Scalaabstract : _root_.java.lang.Boolean={this.isAbstract().asInstanceOf[_root_.java.lang.Boolean]}
def Scalaabstract_=(`~value` : _root_.java.lang.Boolean):Unit={this.setAbstract(`~value`)}
def Scalainterface : _root_.java.lang.Boolean={this.isInterface().asInstanceOf[_root_.java.lang.Boolean]}
def Scalainterface_=(`~value` : _root_.java.lang.Boolean):Unit={this.setInterface(`~value`)}
def ScalaeSuperTypes : k2.standard.ReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EClass]={  new k2.standard.RichReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EClass](thisUpper = -1,value=this.getESuperTypes())}
def ScalaeSuperTypes_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EClass]):Unit={this.getESuperTypes().clear
this.getESuperTypes().addAll(`~value`)
}
def ScalaeOperations : k2.standard.ReflectiveOrderedSet[_root_.org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EOperation]={  new k2.standard.RichReflectiveOrderedSet[_root_.org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EOperation](thisUpper = -1,value=this.getEOperations())}
def ScalaeOperations_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EOperation]):Unit={this.getEOperations().clear
this.getEOperations().addAll(`~value`)
}
def ScalaeAllAttributes : k2.standard.ReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EAttribute]={  new k2.standard.RichReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EAttribute](thisUpper = -1,value=this.getEAllAttributes())}
def ScalaeAllReferences : k2.standard.ReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EReference]={  new k2.standard.RichReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EReference](thisUpper = -1,value=this.getEAllReferences())}
def ScalaeReferences : k2.standard.ReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EReference]={  new k2.standard.RichReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EReference](thisUpper = -1,value=this.getEReferences())}
def ScalaeAttributes : k2.standard.ReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EAttribute]={  new k2.standard.RichReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EAttribute](thisUpper = -1,value=this.getEAttributes())}
def ScalaeAllContainments : k2.standard.ReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EReference]={  new k2.standard.RichReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EReference](thisUpper = -1,value=this.getEAllContainments())}
def ScalaeAllOperations : k2.standard.ReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EOperation]={  new k2.standard.RichReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EOperation](thisUpper = -1,value=this.getEAllOperations())}
def ScalaeAllStructuralFeatures : k2.standard.ReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EStructuralFeature]={  new k2.standard.RichReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EStructuralFeature](thisUpper = -1,value=this.getEAllStructuralFeatures())}
def ScalaeAllSuperTypes : k2.standard.ReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EClass]={  new k2.standard.RichReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EClass](thisUpper = -1,value=this.getEAllSuperTypes())}
def ScalaeIDAttribute : _root_.org.eclipse.emf.ecore.EAttribute={this.getEIDAttribute().asInstanceOf[_root_.org.eclipse.emf.ecore.EAttribute]}
def ScalaeStructuralFeatures : k2.standard.ReflectiveOrderedSet[_root_.org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EStructuralFeature]={  new k2.standard.RichReflectiveOrderedSet[_root_.org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EStructuralFeature](thisUpper = -1,value=this.getEStructuralFeatures())}
def ScalaeStructuralFeatures_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EStructuralFeature]):Unit={this.getEStructuralFeatures().clear
this.getEStructuralFeatures().addAll(`~value`)
}
def ScalaeGenericSuperTypes : k2.standard.ReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EGenericType]={  new k2.standard.RichReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EGenericType](thisUpper = -1,value=this.getEGenericSuperTypes())}
def ScalaeGenericSuperTypes_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EGenericType]):Unit={this.getEGenericSuperTypes().clear
this.getEGenericSuperTypes().addAll(`~value`)
}
def ScalaeAllGenericSuperTypes : k2.standard.ReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EGenericType]={  new k2.standard.RichReflectiveOrderedSet[org.eclipse.emf.ecore.EClass,_root_.org.eclipse.emf.ecore.EGenericType](thisUpper = -1,value=this.getEAllGenericSuperTypes())}

    def getConcreteSubClasses(allClasses : _root_.k2.standard.KermetaBag[_root_.org.eclipse.emf.ecore.EClass]):_root_.k2.standard.KermetaSequence[_root_.org.eclipse.emf.ecore.EClass] = {
var `~result` : _root_.k2.standard.KermetaSequence[_root_.org.eclipse.emf.ecore.EClass] = null.asInstanceOf[_root_.k2.standard.KermetaSequence[_root_.org.eclipse.emf.ecore.EClass]]; 
  { 


{
`~result` = ((allClasses).select({(clazz : _root_.org.eclipse.emf.ecore.EClass)=>

{
(((clazz).Scalaabstract).not()).andThen({(b : _root_.java.lang.Boolean)=>

{
(this).isSuperTypeOfBis(clazz)}
})}
})).asInstanceOf[_root_.k2.standard.KermetaSequence[_root_.org.eclipse.emf.ecore.EClass]];}
        }
 return `~result`
}

    def canBeRootClass(allClasses : _root_.k2.standard.KermetaBag[_root_.org.eclipse.emf.ecore.EClass]):_root_.java.lang.Boolean = {
var `~result` : _root_.java.lang.Boolean = null.asInstanceOf[_root_.java.lang.Boolean]; 
  { 


{
`~result` = (((((this).Scalaabstract).not()).andThen({(b : _root_.java.lang.Boolean)=>

{
((this).ScalaeStructuralFeatures).exists({(st : _root_.org.eclipse.emf.ecore.EStructuralFeature)=>

{
((st).isInstanceOf[_root_.org.eclipse.emf.ecore.EReference]).andThen({(b2 : _root_.java.lang.Boolean)=>

{
((st).asInstanceOf[_root_.org.eclipse.emf.ecore.EReference]).Scalacontainment}
})}
})}
})).andThen({(b : _root_.java.lang.Boolean)=>

{
((allClasses).exists({(clazz : _root_.org.eclipse.emf.ecore.EClass)=>

{
(_root_.k2.utils.UTilScala.isNotEqual((this),clazz)).andThen({(b2 : _root_.java.lang.Boolean)=>

{
(clazz).hasStructFeatureWithType(this)}
})}
})).not()}
})).asInstanceOf[_root_.java.lang.Boolean];}
        }
 return `~result`
}

    def hasStructFeatureWithType(clazz : _root_.org.eclipse.emf.ecore.EClass):_root_.java.lang.Boolean = {
var `~result` : _root_.java.lang.Boolean = null.asInstanceOf[_root_.java.lang.Boolean]; 
  { 


{
`~result` = (((this).ScalaeStructuralFeatures).exists({(st : _root_.org.eclipse.emf.ecore.EStructuralFeature)=>

{
((st).isInstanceOf[_root_.org.eclipse.emf.ecore.EReference]).andThen({(b3 : _root_.java.lang.Boolean)=>

{
(((st).asInstanceOf[_root_.org.eclipse.emf.ecore.EReference]).Scalacontainment).andThen({(b2 : _root_.java.lang.Boolean)=>

{
(((((st).ScalaeType).getQualifiedName()) == ((clazz).getQualifiedName()))).orElse({(b : _root_.java.lang.Boolean)=>

{
(((st).ScalaeType).isInstanceOf[_root_.org.eclipse.emf.ecore.EClass]).andThen({(b2 : _root_.java.lang.Boolean)=>

{
(((st).ScalaeType).asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]).isSuperTypeOfBis(clazz)}
})}
})}
})}
})}
})).asInstanceOf[_root_.java.lang.Boolean];}
        }
 return `~result`
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("ecore.EClass"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

