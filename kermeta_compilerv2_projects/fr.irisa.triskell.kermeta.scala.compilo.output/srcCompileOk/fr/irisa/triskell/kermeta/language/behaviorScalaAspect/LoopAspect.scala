package fr.irisa.triskell.kermeta.language.behaviorScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait LoopAspect extends fr.irisa.triskell.kermeta.language.behaviorScalaAspect.ExpressionAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.behavior.Loop{
def Scalainitialization : fr.irisa.triskell.kermeta.language.behavior.Expression={this.getInitialization()}
def Scalainitialization_=(arg : fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setInitialization(arg)}
def Scalabody : fr.irisa.triskell.kermeta.language.behavior.Expression={this.getBody()}
def Scalabody_=(arg : fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setBody(arg)}
def ScalastopCondition : fr.irisa.triskell.kermeta.language.behavior.Expression={this.getStopCondition()}
def ScalastopCondition_=(arg : fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setStopCondition(arg)}
}

