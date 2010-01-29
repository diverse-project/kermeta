package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait PropertyConstraintAspect  extends fr.irisa.triskell.kermeta.language.structureScalaAspect.ConstraintAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion{
var property : fr.irisa.triskell.kermeta.language.structure.Property= _
def KergetProperty() : fr.irisa.triskell.kermeta.language.structure.Property={this.property}
def KersetProperty(arg:fr.irisa.triskell.kermeta.language.structure.Property)={ this.property = arg}
def Scalaproperty : fr.irisa.triskell.kermeta.language.structure.Property={this.KergetProperty()}
def Scalaproperty_=(arg : fr.irisa.triskell.kermeta.language.structure.Property)={this.KersetProperty(arg)}
}

