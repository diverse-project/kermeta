package fr.irisa.triskell.kermeta.language.behaviorScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait LambdaParameterAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.behavior.LambdaParameter{
def Scalaname : java.lang.Object={this.getName()}
def Scalaname_=(arg : java.lang.Object)={this.setName(arg)}
def Scalatype : fr.irisa.triskell.kermeta.language.behavior.TypeReference={this.getType()}
def Scalatype_=(arg : fr.irisa.triskell.kermeta.language.behavior.TypeReference)={this.setType(arg)}
}

