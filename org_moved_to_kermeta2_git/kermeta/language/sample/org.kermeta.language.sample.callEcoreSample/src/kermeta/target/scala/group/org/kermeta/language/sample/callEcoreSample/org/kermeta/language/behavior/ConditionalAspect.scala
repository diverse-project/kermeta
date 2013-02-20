package group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.org.kermeta.language.sample.callEcoreSample.ImplicitConversion._
trait ConditionalAspect extends group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.behavior.ExpressionAspect with `_root_`.org.kermeta.language.behavior.Conditional{
def ScalathenBody : _root_.org.kermeta.language.behavior.Expression={this.getThenBody()}.asInstanceOf[_root_.org.kermeta.language.behavior.Expression]
def ScalathenBody_=(value : _root_.org.kermeta.language.behavior.Expression)={this.setThenBody(value)}
def ScalaelseBody : _root_.org.kermeta.language.behavior.Expression={this.getElseBody()}.asInstanceOf[_root_.org.kermeta.language.behavior.Expression]
def ScalaelseBody_=(value : _root_.org.kermeta.language.behavior.Expression)={this.setElseBody(value)}
def Scalacondition : _root_.org.kermeta.language.behavior.Expression={this.getCondition()}.asInstanceOf[_root_.org.kermeta.language.behavior.Expression]
def Scalacondition_=(value : _root_.org.kermeta.language.behavior.Expression)={this.setCondition(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.Conditional"); 
         if (cd !=null){ 
 var cl = group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

