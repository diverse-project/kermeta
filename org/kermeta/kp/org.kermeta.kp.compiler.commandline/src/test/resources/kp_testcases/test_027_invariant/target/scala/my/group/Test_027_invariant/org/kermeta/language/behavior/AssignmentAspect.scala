package my.group.`Test_027_invariant`.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait AssignmentAspect extends my.group.`Test_027_invariant`.org.kermeta.language.behavior.ExpressionAspect with `_root_`.org.kermeta.language.behavior.Assignment{
def Scalatarget : _root_.org.kermeta.language.behavior.CallExpression={this.getTarget().asInstanceOf[_root_.org.kermeta.language.behavior.CallExpression]}
def Scalatarget_=(`~value` : _root_.org.kermeta.language.behavior.CallExpression):Unit={this.setTarget(`~value`)}
def Scalavalue : _root_.org.kermeta.language.behavior.Expression={this.getValue().asInstanceOf[_root_.org.kermeta.language.behavior.Expression]}
def Scalavalue_=(`~value` : _root_.org.kermeta.language.behavior.Expression):Unit={this.setValue(`~value`)}
def ScalaisCast : _root_.java.lang.Boolean={this.getIsCast().asInstanceOf[_root_.java.lang.Boolean]}
def ScalaisCast_=(`~value` : _root_.java.lang.Boolean):Unit={this.setIsCast(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.Assignment"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

