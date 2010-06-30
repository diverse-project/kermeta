package ScalaAspect.fr.irisa.triskell.kermeta.language.behavior
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait LambdaExpressionAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.ExpressionAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.behavior.LambdaExpression{
def Scalabody : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression={this.getBody()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]
def Scalabody_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setBody(value)}
def Scalaparameters : java.util.List[_root_.fr.irisa.triskell.kermeta.language.behavior.LambdaParameter]={this.getParameters()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.behavior.LambdaParameter]]
def Scalaparameters_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.behavior.LambdaParameter])={this.getParameters().clear
this.getParameters().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.behavior.LambdaExpression"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

