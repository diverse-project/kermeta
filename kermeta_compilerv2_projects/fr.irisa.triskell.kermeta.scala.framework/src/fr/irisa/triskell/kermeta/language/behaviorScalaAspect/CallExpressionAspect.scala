package fr.irisa.triskell.kermeta.language.behaviorScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait CallExpressionAspect extends fr.irisa.triskell.kermeta.language.behaviorScalaAspect.ExpressionAspect with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.behavior.CallExpression{
def ScalastaticTypeVariableBindings : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Type]={this.getStaticTypeVariableBindings()}
def ScalastaticTypeVariableBindings_=(arg : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Type])={this.getStaticTypeVariableBindings().clear
this.getStaticTypeVariableBindings().addAll(arg)
}
def Scalaname : java.lang.Object={this.getName()}
def Scalaname_=(arg : java.lang.Object)={this.setName(arg)}
def Scalaparameters : java.util.List[fr.irisa.triskell.kermeta.language.behavior.Expression]={this.getParameters()}
def Scalaparameters_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.behavior.Expression])={this.getParameters().clear
this.getParameters().addAll(arg)
}
}

