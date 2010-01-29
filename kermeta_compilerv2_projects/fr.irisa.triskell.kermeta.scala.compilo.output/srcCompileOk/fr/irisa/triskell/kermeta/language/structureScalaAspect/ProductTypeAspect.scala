package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait ProductTypeAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.TypeContainerAspect with fr.irisa.triskell.kermeta.language.structure.Type with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.ProductType{
def Scalatype : java.util.List[fr.irisa.triskell.kermeta.language.structure.Type]={this.getType()}
def Scalatype_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Type])={this.getType().clear
this.getType().addAll(arg)
}
}

