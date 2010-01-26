package fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait TypeContainerAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.scala.framework.language.structure.TypeContainer{
def ScalacontainedType : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Type]={this.getContainedType()}
def ScalacontainedType_=(arg : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Type])={this.getContainedType().clear
this.getContainedType().addAll(arg)
}
}

