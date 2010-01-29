package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait TypeAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.Type{
def ScalatypeContainer : fr.irisa.triskell.kermeta.language.structure.TypeContainer={this.getTypeContainer()}
def ScalatypeContainer_=(arg : fr.irisa.triskell.kermeta.language.structure.TypeContainer)={this.setTypeContainer(arg)}

}

