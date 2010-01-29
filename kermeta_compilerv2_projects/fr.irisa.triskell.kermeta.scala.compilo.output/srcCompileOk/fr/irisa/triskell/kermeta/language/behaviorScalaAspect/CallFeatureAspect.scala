package fr.irisa.triskell.kermeta.language.behaviorScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait CallFeatureAspect extends fr.irisa.triskell.kermeta.language.behaviorScalaAspect.CallExpressionAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.behavior.CallFeature{
def ScalastaticOperation : fr.irisa.triskell.kermeta.language.structure.Operation={this.getStaticOperation()}
def ScalastaticOperation_=(arg : fr.irisa.triskell.kermeta.language.structure.Operation)={this.setStaticOperation(arg)}
def ScalaisAtpre : Boolean={this.isIsAtpre()}
def ScalaisAtpre_=(arg : Boolean)={this.setIsAtpre(arg)}
def Scalatarget : fr.irisa.triskell.kermeta.language.behavior.Expression={this.getTarget()}
def Scalatarget_=(arg : fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setTarget(arg)}
def ScalastaticEnumLiteral : fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral={this.getStaticEnumLiteral()}
def ScalastaticEnumLiteral_=(arg : fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral)={this.setStaticEnumLiteral(arg)}
def ScalastaticProperty : fr.irisa.triskell.kermeta.language.structure.Property={this.getStaticProperty()}
def ScalastaticProperty_=(arg : fr.irisa.triskell.kermeta.language.structure.Property)={this.setStaticProperty(arg)}
}

