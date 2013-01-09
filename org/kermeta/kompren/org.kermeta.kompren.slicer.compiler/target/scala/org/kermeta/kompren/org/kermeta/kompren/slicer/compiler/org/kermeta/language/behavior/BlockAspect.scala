package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait BlockAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.behavior.ExpressionAspect with `_root_`.org.kermeta.language.behavior.Block{
def Scalastatement : k2.standard.ReflectiveOrderedSet[org.kermeta.language.behavior.Block,_root_.org.kermeta.language.behavior.Expression]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.behavior.Block,_root_.org.kermeta.language.behavior.Expression](thisUpper = -1,value=this.getStatement())}
def Scalastatement_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.behavior.Expression]):Unit={this.getStatement().clear
this.getStatement().addAll(`~value`)
}
def ScalarescueBlock : k2.standard.ReflectiveOrderedSet[org.kermeta.language.behavior.Block,_root_.org.kermeta.language.behavior.Rescue]={  new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.behavior.Block,_root_.org.kermeta.language.behavior.Rescue](thisUpper = -1,value=this.getRescueBlock())}
def ScalarescueBlock_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.behavior.Rescue]):Unit={this.getRescueBlock().clear
this.getRescueBlock().addAll(`~value`)
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.Block"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

