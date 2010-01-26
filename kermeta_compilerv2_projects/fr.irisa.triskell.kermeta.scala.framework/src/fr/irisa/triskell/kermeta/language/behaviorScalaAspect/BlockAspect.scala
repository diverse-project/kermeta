package fr.irisa.triskell.kermeta.language.behaviorScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait BlockAspect extends fr.irisa.triskell.kermeta.language.behaviorScalaAspect.ExpressionAspect with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.behavior.Block{
def Scalastatement : java.util.List[fr.irisa.triskell.kermeta.language.behavior.Expression]={this.getStatement()}
def Scalastatement_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.behavior.Expression])={this.getStatement().clear
this.getStatement().addAll(arg)
}
def ScalarescueBlock : java.util.List[fr.irisa.triskell.kermeta.language.behavior.Rescue]={this.getRescueBlock()}
def ScalarescueBlock_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.behavior.Rescue])={this.getRescueBlock().clear
this.getRescueBlock().addAll(arg)
}
}

