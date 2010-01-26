package fr.irisa.triskell.kermeta.language.behaviorScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait AssignmentAspect extends fr.irisa.triskell.kermeta.language.behaviorScalaAspect.ExpressionAspect with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.behavior.Assignment{
def Scalatarget : fr.irisa.triskell.kermeta.language.behavior.CallExpression={this.getTarget()}
def Scalatarget_=(arg : fr.irisa.triskell.kermeta.language.behavior.CallExpression)={this.setTarget(arg)}
def Scalavalue : fr.irisa.triskell.kermeta.language.behavior.Expression={this.getValue()}
def Scalavalue_=(arg : fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setValue(arg)}
def ScalaisCast : java.lang.Object={this.getIsCast()}
def ScalaisCast_=(arg : java.lang.Object)={this.setIsCast(arg)}
}

