package group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.org.kermeta.language.sample.callEcoreSample.ImplicitConversion._
trait AssignmentAspect extends group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.behavior.ExpressionAspect with `_root_`.org.kermeta.language.behavior.Assignment{
def Scalatarget : _root_.org.kermeta.language.behavior.CallExpression={this.getTarget()}.asInstanceOf[_root_.org.kermeta.language.behavior.CallExpression]
def Scalatarget_=(value : _root_.org.kermeta.language.behavior.CallExpression)={this.setTarget(value)}
def Scalavalue : _root_.org.kermeta.language.behavior.Expression={this.getValue()}.asInstanceOf[_root_.org.kermeta.language.behavior.Expression]
def Scalavalue_=(value : _root_.org.kermeta.language.behavior.Expression)={this.setValue(value)}
def ScalaisCast : _root_.java.lang.Boolean={this.getIsCast()}.asInstanceOf[_root_.java.lang.Boolean]
def ScalaisCast_=(value : _root_.java.lang.Boolean)={this.setIsCast(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.Assignment"); 
         if (cd !=null){ 
 var cl = group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

