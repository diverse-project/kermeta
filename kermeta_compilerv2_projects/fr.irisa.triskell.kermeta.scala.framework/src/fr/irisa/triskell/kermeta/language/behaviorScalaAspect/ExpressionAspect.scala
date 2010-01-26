package fr.irisa.triskell.kermeta.language.behaviorScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait ExpressionAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect.TypeContainerAspect with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.behavior.Expression{
def ScalastaticType : fr.irisa.triskell.kermeta.scala.framework.language.structure.Type={this.getStaticType()}
def ScalastaticType_=(arg : fr.irisa.triskell.kermeta.scala.framework.language.structure.Type)={this.setStaticType(arg)}
}

