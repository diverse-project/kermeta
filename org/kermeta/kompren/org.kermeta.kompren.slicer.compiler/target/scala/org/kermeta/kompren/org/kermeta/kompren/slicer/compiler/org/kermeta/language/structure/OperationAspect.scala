package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait OperationAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.MultiplicityElementAspect with org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.AbstractOperationAspect with `_root_`.org.kermeta.language.structure.Operation{
def ScalaisAbstract : _root_.java.lang.Boolean={this.getIsAbstract().asInstanceOf[_root_.java.lang.Boolean]}
def ScalaisAbstract_=(`~value` : _root_.java.lang.Boolean):Unit={this.setIsAbstract(`~value`)}
def ScalaraisedException : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.Operation,_root_.org.kermeta.language.structure.Type]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.Operation,_root_.org.kermeta.language.structure.Type](thisUpper = -1,value=this.getRaisedException())}
def ScalaraisedException_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Type]):Unit={this.getRaisedException().clear
this.getRaisedException().addAll(`~value`)
}
def ScalaownedParameter : k2.standard.ReflectiveOrderedSet[_root_.org.kermeta.language.structure.Operation,_root_.org.kermeta.language.structure.Parameter]={  new k2.standard.RichReflectiveOrderedSet[_root_.org.kermeta.language.structure.Operation,_root_.org.kermeta.language.structure.Parameter](thisUpper = -1,value=this.getOwnedParameter())}
def ScalaownedParameter_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Parameter]):Unit={this.getOwnedParameter().clear
this.getOwnedParameter().addAll(`~value`)
}
def Scalapre : k2.standard.ReflectiveOrderedSet[_root_.org.kermeta.language.structure.Operation,_root_.org.kermeta.language.structure.Constraint]={  new k2.standard.RichReflectiveOrderedSet[_root_.org.kermeta.language.structure.Operation,_root_.org.kermeta.language.structure.Constraint](thisUpper = -1,value=this.getPre())}
def Scalapre_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Constraint]):Unit={this.getPre().clear
this.getPre().addAll(`~value`)
}
def Scalapost : k2.standard.ReflectiveOrderedSet[_root_.org.kermeta.language.structure.Operation,_root_.org.kermeta.language.structure.Constraint]={  new k2.standard.RichReflectiveOrderedSet[_root_.org.kermeta.language.structure.Operation,_root_.org.kermeta.language.structure.Constraint](thisUpper = -1,value=this.getPost())}
def Scalapost_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Constraint]):Unit={this.getPost().clear
this.getPost().addAll(`~value`)
}
def Scalabody : _root_.org.kermeta.language.behavior.Expression={this.getBody().asInstanceOf[_root_.org.kermeta.language.behavior.Expression]}
def Scalabody_=(`~value` : _root_.org.kermeta.language.behavior.Expression):Unit={this.setBody(`~value`)}
def ScalasuperOperation : _root_.org.kermeta.language.structure.AbstractOperation={this.getSuperOperation().asInstanceOf[_root_.org.kermeta.language.structure.AbstractOperation]}
def ScalasuperOperation_=(`~value` : _root_.org.kermeta.language.structure.AbstractOperation):Unit={this.setSuperOperation(`~value`)}
def ScalaownedUnresolvedOperations : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.Operation,_root_.org.kermeta.language.structure.UnresolvedOperation]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.Operation,_root_.org.kermeta.language.structure.UnresolvedOperation](thisUpper = -1,value=this.getOwnedUnresolvedOperations())}
def ScalaownedUnresolvedOperations_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.UnresolvedOperation]):Unit={this.getOwnedUnresolvedOperations().clear
this.getOwnedUnresolvedOperations().addAll(`~value`)
}
def ScalaowningClass : _root_.org.kermeta.language.structure.ClassDefinition={this.getOwningClass().asInstanceOf[_root_.org.kermeta.language.structure.ClassDefinition]}
def ScalaowningClass_=(`~value` : _root_.org.kermeta.language.structure.ClassDefinition):Unit={this.setOwningClass(`~value`)}
def ScalatypeParameter : k2.standard.ReflectiveOrderedSet[org.kermeta.language.structure.Operation,_root_.org.kermeta.language.structure.TypeVariable]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.structure.Operation,_root_.org.kermeta.language.structure.TypeVariable](thisUpper = -1,value=this.getTypeParameter())}
def ScalatypeParameter_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.TypeVariable]):Unit={this.getTypeParameter().clear
this.getTypeParameter().addAll(`~value`)
}
def ScalauniqueName : _root_.java.lang.String={this.getUniqueName().asInstanceOf[_root_.java.lang.String]}
def ScalauniqueName_=(`~value` : _root_.java.lang.String):Unit={this.setUniqueName(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Operation"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

