package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait TypedElementAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.TypeContainerAspect with fr.irisa.triskell.kermeta.language.structure.NamedElement with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.TypedElement{
def Scalatype : fr.irisa.triskell.kermeta.language.structure.Type={this.getType()}
def Scalatype_=(arg : fr.irisa.triskell.kermeta.language.structure.Type)={this.setType(arg)}
}

