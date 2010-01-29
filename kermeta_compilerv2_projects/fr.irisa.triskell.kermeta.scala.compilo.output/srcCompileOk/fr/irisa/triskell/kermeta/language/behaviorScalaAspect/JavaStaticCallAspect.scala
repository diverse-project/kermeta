package fr.irisa.triskell.kermeta.language.behaviorScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait JavaStaticCallAspect extends fr.irisa.triskell.kermeta.language.behaviorScalaAspect.ExpressionAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall{
def Scalajmethod : java.lang.String={this.getJmethod()}
def Scalajmethod_=(arg : java.lang.String)={this.setJmethod(arg)}
def Scalajclass : java.lang.String={this.getJclass()}
def Scalajclass_=(arg : java.lang.String)={this.setJclass(arg)}
def Scalaparameters : java.util.List[fr.irisa.triskell.kermeta.language.behavior.Expression]={this.getParameters()}
def Scalaparameters_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.behavior.Expression])={this.getParameters().clear
this.getParameters().addAll(arg)
}
}

