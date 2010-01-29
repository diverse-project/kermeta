package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait TypeVariableAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.TypeContainerAspect with fr.irisa.triskell.kermeta.language.structure.Type with fr.irisa.triskell.kermeta.language.structure.NamedElement with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.TypeVariable{
def Scalasupertype : fr.irisa.triskell.kermeta.language.structure.Type={this.getSupertype()}
def Scalasupertype_=(arg : fr.irisa.triskell.kermeta.language.structure.Type)={this.setSupertype(arg)}
}

