package my.group.`Test_027_invariant`.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait LambdaExpressionAspect extends my.group.`Test_027_invariant`.org.kermeta.language.behavior.ExpressionAspect with `_root_`.org.kermeta.language.behavior.LambdaExpression{
def Scalaparameters : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.behavior.LambdaParameter]={new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.behavior.LambdaExpression,_root_.org.kermeta.language.behavior.LambdaParameter](thisUpper = -1,value=this.getParameters())}
def Scalaparameters_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.behavior.LambdaParameter]):Unit={this.getParameters().clear
this.getParameters().addAll(`~value`)
}
def Scalabody : _root_.org.kermeta.language.behavior.Expression={this.getBody().asInstanceOf[_root_.org.kermeta.language.behavior.Expression]}
def Scalabody_=(`~value` : _root_.org.kermeta.language.behavior.Expression):Unit={this.setBody(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.LambdaExpression"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

