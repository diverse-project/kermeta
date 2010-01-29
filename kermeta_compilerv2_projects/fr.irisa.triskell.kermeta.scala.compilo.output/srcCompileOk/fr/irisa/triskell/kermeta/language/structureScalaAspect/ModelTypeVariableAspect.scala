package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait ModelTypeVariableAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.TypeVariableAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable{
def ScalavirtualType : java.util.List[fr.irisa.triskell.kermeta.language.structure.VirtualType]={this.getVirtualType()}
def ScalavirtualType_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.VirtualType])={this.getVirtualType().clear
this.getVirtualType().addAll(arg)
}
}

