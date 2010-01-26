package fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait ParameterAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect.MultiplicityElementAspect with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.scala.framework.language.structure.Parameter{
def Scalaoperation : fr.irisa.triskell.kermeta.scala.framework.language.structure.Operation={this.getOperation()}
def Scalaoperation_=(arg : fr.irisa.triskell.kermeta.scala.framework.language.structure.Operation)={this.setOperation(arg)}
}

