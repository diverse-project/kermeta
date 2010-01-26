package fr.irisa.triskell.kermeta.language.behaviorScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait RescueAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.behavior.Rescue{
def Scalabody : java.util.List[fr.irisa.triskell.kermeta.language.behavior.Expression]={this.getBody()}
def Scalabody_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.behavior.Expression])={this.getBody().clear
this.getBody().addAll(arg)
}
def ScalaexceptionName : java.lang.Object={this.getExceptionName()}
def ScalaexceptionName_=(arg : java.lang.Object)={this.setExceptionName(arg)}
def ScalaexceptionType : fr.irisa.triskell.kermeta.language.behavior.TypeReference={this.getExceptionType()}
def ScalaexceptionType_=(arg : fr.irisa.triskell.kermeta.language.behavior.TypeReference)={this.setExceptionType(arg)}
}

