package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait ModelTypeAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.TypeAspect with fr.irisa.triskell.kermeta.language.structure.TypeDefinition with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.ModelType{
def ScalaincludedTypeDefinition : java.util.List[fr.irisa.triskell.kermeta.language.structure.TypeDefinition]={this.getIncludedTypeDefinition()}
def ScalaincludedTypeDefinition_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.TypeDefinition])={this.getIncludedTypeDefinition().clear
this.getIncludedTypeDefinition().addAll(arg)
}
}

