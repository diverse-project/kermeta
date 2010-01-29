package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait TypeContainerAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.TypeContainer{
def ScalacontainedType : java.util.List[fr.irisa.triskell.kermeta.language.structure.Type]={this.getContainedType()}
def ScalacontainedType_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Type])={this.getContainedType().clear
this.getContainedType().addAll(arg)
}
}

