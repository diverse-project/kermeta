package fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait VirtualTypeAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect.ObjectTypeVariableAspect with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.scala.framework.language.structure.VirtualType{
def ScalamodelType : fr.irisa.triskell.kermeta.scala.framework.language.structure.ModelTypeVariable={this.getModelType()}
def ScalamodelType_=(arg : fr.irisa.triskell.kermeta.scala.framework.language.structure.ModelTypeVariable)={this.setModelType(arg)}
def ScalatypeParamBinding : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.TypeVariableBinding]={this.getTypeParamBinding()}
def ScalatypeParamBinding_=(arg : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.TypeVariableBinding])={this.getTypeParamBinding().clear
this.getTypeParamBinding().addAll(arg)
}
def ScalaclassDefinition : fr.irisa.triskell.kermeta.scala.framework.language.structure.ClassDefinition={this.getClassDefinition()}
def ScalaclassDefinition_=(arg : fr.irisa.triskell.kermeta.scala.framework.language.structure.ClassDefinition)={this.setClassDefinition(arg)}
}

