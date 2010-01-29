package fr.irisa.triskell.kermeta.language.behaviorScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait RaiseAspect extends fr.irisa.triskell.kermeta.language.behaviorScalaAspect.ExpressionAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.behavior.Raise{
def Scalaexpression : fr.irisa.triskell.kermeta.language.behavior.Expression={this.getExpression()}
def Scalaexpression_=(arg : fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setExpression(arg)}
}

