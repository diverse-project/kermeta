package fr.irisa.triskell.kermeta.language.behaviorScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait ConditionalAspect extends fr.irisa.triskell.kermeta.language.behaviorScalaAspect.ExpressionAspect with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.behavior.Conditional{
def ScalathenBody : fr.irisa.triskell.kermeta.language.behavior.Expression={this.getThenBody()}
def ScalathenBody_=(arg : fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setThenBody(arg)}
def Scalacondition : fr.irisa.triskell.kermeta.language.behavior.Expression={this.getCondition()}
def Scalacondition_=(arg : fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setCondition(arg)}
def ScalaelseBody : fr.irisa.triskell.kermeta.language.behavior.Expression={this.getElseBody()}
def ScalaelseBody_=(arg : fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setElseBody(arg)}
}

