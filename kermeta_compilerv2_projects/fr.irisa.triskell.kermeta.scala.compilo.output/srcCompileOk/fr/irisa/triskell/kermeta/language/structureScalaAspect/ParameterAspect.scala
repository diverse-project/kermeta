package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait ParameterAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.MultiplicityElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.Parameter{
def Scalaoperation : fr.irisa.triskell.kermeta.language.structure.Operation={this.getOperation()}
def Scalaoperation_=(arg : fr.irisa.triskell.kermeta.language.structure.Operation)={this.setOperation(arg)}
}

