package fr.irisa.triskell.kermeta.language.behaviorScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait TypeLiteralAspect extends fr.irisa.triskell.kermeta.language.behaviorScalaAspect.LiteralAspect with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.behavior.TypeLiteral{
def Scalatyperef : fr.irisa.triskell.kermeta.language.behavior.TypeReference={this.getTyperef()}
def Scalatyperef_=(arg : fr.irisa.triskell.kermeta.language.behavior.TypeReference)={this.setTyperef(arg)}
}

