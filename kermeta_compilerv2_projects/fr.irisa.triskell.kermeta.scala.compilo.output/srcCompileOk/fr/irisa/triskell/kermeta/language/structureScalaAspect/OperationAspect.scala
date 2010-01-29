package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait OperationAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.MultiplicityElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.Operation{
def ScalatypeParameter : java.util.List[fr.irisa.triskell.kermeta.language.structure.TypeVariable]={this.getTypeParameter()}
def ScalatypeParameter_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.TypeVariable])={this.getTypeParameter().clear
this.getTypeParameter().addAll(arg)
}
def Scalabody : fr.irisa.triskell.kermeta.language.behavior.Expression={this.getBody()}
def Scalabody_=(arg : fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setBody(arg)}
def ScalaownedParameter : java.util.List[fr.irisa.triskell.kermeta.language.structure.Parameter]={this.getOwnedParameter()}
def ScalaownedParameter_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Parameter])={this.getOwnedParameter().clear
this.getOwnedParameter().addAll(arg)
}
def ScalaisAbstract : Boolean={this.isIsAbstract()}
def ScalaisAbstract_=(arg : Boolean)={this.setIsAbstract(arg)}
def Scalapost : java.util.List[fr.irisa.triskell.kermeta.language.structure.Constraint]={this.getPost()}
def Scalapost_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Constraint])={this.getPost().clear
this.getPost().addAll(arg)
}
def ScalaraisedException : java.util.List[fr.irisa.triskell.kermeta.language.structure.Type]={this.getRaisedException()}
def ScalaraisedException_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Type])={this.getRaisedException().clear
this.getRaisedException().addAll(arg)
}
def Scalapre : java.util.List[fr.irisa.triskell.kermeta.language.structure.Constraint]={this.getPre()}
def Scalapre_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Constraint])={this.getPre().clear
this.getPre().addAll(arg)
}
def ScalasuperOperation : fr.irisa.triskell.kermeta.language.structure.Operation={this.getSuperOperation()}
def ScalasuperOperation_=(arg : fr.irisa.triskell.kermeta.language.structure.Operation)={this.setSuperOperation(arg)}
def ScalaowningClass : fr.irisa.triskell.kermeta.language.structure.ClassDefinition={this.getOwningClass()}
def ScalaowningClass_=(arg : fr.irisa.triskell.kermeta.language.structure.ClassDefinition)={this.setOwningClass(arg)}
}

