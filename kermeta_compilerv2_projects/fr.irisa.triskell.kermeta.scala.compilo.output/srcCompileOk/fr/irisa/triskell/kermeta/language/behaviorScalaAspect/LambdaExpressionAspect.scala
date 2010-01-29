package fr.irisa.triskell.kermeta.language.behaviorScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait LambdaExpressionAspect extends fr.irisa.triskell.kermeta.language.behaviorScalaAspect.ExpressionAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.behavior.LambdaExpression{
def Scalabody : fr.irisa.triskell.kermeta.language.behavior.Expression={this.getBody()}
def Scalabody_=(arg : fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setBody(arg)}
def Scalaparameters : java.util.List[fr.irisa.triskell.kermeta.language.behavior.LambdaParameter]={this.getParameters()}
def Scalaparameters_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.behavior.LambdaParameter])={this.getParameters().clear
this.getParameters().addAll(arg)
}
}

