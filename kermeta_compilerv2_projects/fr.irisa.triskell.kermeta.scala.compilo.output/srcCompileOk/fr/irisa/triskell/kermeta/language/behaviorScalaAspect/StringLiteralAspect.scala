package fr.irisa.triskell.kermeta.language.behaviorScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait StringLiteralAspect extends fr.irisa.triskell.kermeta.language.behaviorScalaAspect.LiteralAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.behavior.StringLiteral{
def Scalavalue : java.lang.String={this.getValue()}
def Scalavalue_=(arg : java.lang.String)={this.setValue(arg)}
}

