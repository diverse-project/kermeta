package fr.irisa.triskell.kermeta.language.behaviorScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait IntegerLiteralAspect extends fr.irisa.triskell.kermeta.language.behaviorScalaAspect.LiteralAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral{
def Scalavalue : Int={this.getValue()}
def Scalavalue_=(arg : Int)={this.setValue(arg)}
}

