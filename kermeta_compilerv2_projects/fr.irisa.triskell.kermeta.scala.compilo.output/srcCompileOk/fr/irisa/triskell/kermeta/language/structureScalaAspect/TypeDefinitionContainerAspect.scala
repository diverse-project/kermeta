package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait TypeDefinitionContainerAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.NamedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.TypeDefinitionContainer{
def ScalaownedTypeDefinition : java.util.List[fr.irisa.triskell.kermeta.language.structure.TypeDefinition]={this.getOwnedTypeDefinition()}
def ScalaownedTypeDefinition_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.TypeDefinition])={this.getOwnedTypeDefinition().clear
this.getOwnedTypeDefinition().addAll(arg)
}
}

