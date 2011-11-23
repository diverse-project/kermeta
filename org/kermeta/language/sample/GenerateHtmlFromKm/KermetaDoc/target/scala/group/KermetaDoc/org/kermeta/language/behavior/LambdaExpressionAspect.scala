package group.KermetaDoc.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait LambdaExpressionAspect extends group.KermetaDoc.org.kermeta.language.behavior.ExpressionAspect with `_root_`.org.kermeta.language.behavior.LambdaExpression{
def Scalaparameters : java.util.List[_root_.org.kermeta.language.behavior.LambdaParameter]={new RichKermetaList(this.getParameters())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.behavior.LambdaParameter]]
def Scalaparameters_=(value : java.util.List[_root_.org.kermeta.language.behavior.LambdaParameter])={this.getParameters().clear
this.getParameters().addAll(value)
}
def Scalabody : _root_.org.kermeta.language.behavior.Expression={this.getBody()}.asInstanceOf[_root_.org.kermeta.language.behavior.Expression]
def Scalabody_=(value : _root_.org.kermeta.language.behavior.Expression)={this.setBody(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.LambdaExpression"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

