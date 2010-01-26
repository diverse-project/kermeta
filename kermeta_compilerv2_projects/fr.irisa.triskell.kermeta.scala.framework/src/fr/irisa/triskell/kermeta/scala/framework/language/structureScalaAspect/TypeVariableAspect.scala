package fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait TypeVariableAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect.TypeContainerAspect with fr.irisa.triskell.kermeta.scala.framework.language.structure.Type with fr.irisa.triskell.kermeta.scala.framework.language.structure.NamedElement with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.scala.framework.language.structure.TypeVariable{
def Scalasupertype : fr.irisa.triskell.kermeta.scala.framework.language.structure.Type={this.getSupertype()}
def Scalasupertype_=(arg : fr.irisa.triskell.kermeta.scala.framework.language.structure.Type)={this.setSupertype(arg)}
}

