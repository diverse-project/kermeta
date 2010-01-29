package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait MultiplicityElementAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.TypedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.MultiplicityElement{
def ScalaisOrdered : Boolean={this.isIsOrdered()}
def ScalaisOrdered_=(arg : Boolean)={this.setIsOrdered(arg)}
def Scalaupper : Int={this.getUpper()}
def Scalaupper_=(arg : Int)={this.setUpper(arg)}
def Scalalower : Int={this.getLower()}
def Scalalower_=(arg : Int)={this.setLower(arg)}
def ScalaisUnique : Boolean={this.isIsUnique()}
def ScalaisUnique_=(arg : Boolean)={this.setIsUnique(arg)}
}

