package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait EnumerationLiteralAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.NamedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral{
def Scalaenumeration : fr.irisa.triskell.kermeta.language.structure.Enumeration={this.getEnumeration()}
def Scalaenumeration_=(arg : fr.irisa.triskell.kermeta.language.structure.Enumeration)={this.setEnumeration(arg)}
}

