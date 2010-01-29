package fr.irisa.triskell.kermeta.language.behaviorScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait VariableDeclAspect extends fr.irisa.triskell.kermeta.language.behaviorScalaAspect.ExpressionAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.behavior.VariableDecl{
def Scalainitialization : fr.irisa.triskell.kermeta.language.behavior.Expression={this.getInitialization()}
def Scalainitialization_=(arg : fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setInitialization(arg)}
def Scalatype : fr.irisa.triskell.kermeta.language.behavior.TypeReference={this.getType()}
def Scalatype_=(arg : fr.irisa.triskell.kermeta.language.behavior.TypeReference)={this.setType(arg)}
def Scalaidentifier : java.lang.String={this.getIdentifier()}
def Scalaidentifier_=(arg : java.lang.String)={this.setIdentifier(arg)}
}

