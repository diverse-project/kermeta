package fr.irisa.triskell.kermeta.language.behaviorScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait CallVariableAspect extends fr.irisa.triskell.kermeta.language.behaviorScalaAspect.CallExpressionAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.behavior.CallVariable{
def ScalaisAtpre : Boolean={this.isIsAtpre()}
def ScalaisAtpre_=(arg : Boolean)={this.setIsAtpre(arg)}
}

