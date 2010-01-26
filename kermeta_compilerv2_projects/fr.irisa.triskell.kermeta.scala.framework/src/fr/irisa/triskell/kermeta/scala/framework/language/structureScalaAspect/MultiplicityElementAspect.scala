package fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait MultiplicityElementAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect.TypedElementAspect with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.scala.framework.language.structure.MultiplicityElement{
def ScalaisOrdered : java.lang.Object={this.getIsOrdered()}
def ScalaisOrdered_=(arg : java.lang.Object)={this.setIsOrdered(arg)}
def Scalaupper : java.lang.Object={this.getUpper()}
def Scalaupper_=(arg : java.lang.Object)={this.setUpper(arg)}
def Scalalower : java.lang.Object={this.getLower()}
def Scalalower_=(arg : java.lang.Object)={this.setLower(arg)}
def ScalaisUnique : java.lang.Object={this.getIsUnique()}
def ScalaisUnique_=(arg : java.lang.Object)={this.setIsUnique(arg)}
}

