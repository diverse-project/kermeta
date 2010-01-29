package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait ParameterizedTypeAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.TypeAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.ParameterizedType{
def ScalatypeParamBinding : java.util.List[fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding]={this.getTypeParamBinding()}
def ScalatypeParamBinding_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding])={this.getTypeParamBinding().clear
this.getTypeParamBinding().addAll(arg)
}
def ScalatypeDefinition : fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition={this.getTypeDefinition()}
def ScalatypeDefinition_=(arg : fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition)={this.setTypeDefinition(arg)}
def ScalavirtualTypeBinding : java.util.List[fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding]={this.getVirtualTypeBinding()}
def ScalavirtualTypeBinding_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding])={this.getVirtualTypeBinding().clear
this.getVirtualTypeBinding().addAll(arg)
}
}

