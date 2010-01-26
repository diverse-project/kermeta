package fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait TypeVariableBindingAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect.TypeContainerAspect with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.scala.framework.language.structure.TypeVariableBinding{
def Scalatype : fr.irisa.triskell.kermeta.scala.framework.language.structure.Type={this.getType()}
def Scalatype_=(arg : fr.irisa.triskell.kermeta.scala.framework.language.structure.Type)={this.setType(arg)}
def Scalavariable : fr.irisa.triskell.kermeta.scala.framework.language.structure.TypeVariable={this.getVariable()}
def Scalavariable_=(arg : fr.irisa.triskell.kermeta.scala.framework.language.structure.TypeVariable)={this.setVariable(arg)}
}

