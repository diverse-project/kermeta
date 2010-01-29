package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait ClassAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.ParameterizedTypeAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.Class{
def ScalaownedOperation : java.util.List[fr.irisa.triskell.kermeta.language.structure.Operation]={this.getOwnedOperation()}
def ScalasuperClass : java.util.List[fr.irisa.triskell.kermeta.language.structure.Class]={this.getSuperClass()}
def ScalaisAbstract : Boolean={this.isIsAbstract()}
def Scalaname : java.lang.String={this.getName()}
def ScalaownedAttribute : java.util.List[fr.irisa.triskell.kermeta.language.structure.Property]={this.getOwnedAttribute()}

}

