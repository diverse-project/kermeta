package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait PropertyAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.MultiplicityElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.Property{
var getViolatedConstraintsMustDrillDownCache : Boolean= _
def KerisGetViolatedConstraintsMustDrillDownCache() : Boolean={this.getViolatedConstraintsMustDrillDownCache}
def KersetGetViolatedConstraintsMustDrillDownCache(arg:Boolean)={ this.getViolatedConstraintsMustDrillDownCache = arg}
def ScalagetViolatedConstraintsMustDrillDownCache : Boolean={this.KerisGetViolatedConstraintsMustDrillDownCache()}
def ScalagetViolatedConstraintsMustDrillDownCache_=(arg : Boolean)={this.KersetGetViolatedConstraintsMustDrillDownCache(arg)}
def Scalaopposite : fr.irisa.triskell.kermeta.language.structure.Property={this.getOpposite()}
def Scalaopposite_=(arg : fr.irisa.triskell.kermeta.language.structure.Property)={this.setOpposite(arg)}
def ScalaisDerived : Boolean={this.isIsDerived()}
def ScalaisDerived_=(arg : Boolean)={this.setIsDerived(arg)}
def ScalagetterBody : fr.irisa.triskell.kermeta.language.behavior.Expression={this.getGetterBody()}
def ScalagetterBody_=(arg : fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setGetterBody(arg)}
def ScalasetterBody : fr.irisa.triskell.kermeta.language.behavior.Expression={this.getSetterBody()}
def ScalasetterBody_=(arg : fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setSetterBody(arg)}
def ScalaowningClass : fr.irisa.triskell.kermeta.language.structure.ClassDefinition={this.getOwningClass()}
def ScalaowningClass_=(arg : fr.irisa.triskell.kermeta.language.structure.ClassDefinition)={this.setOwningClass(arg)}
def ScalaisSetterAbstract : Boolean={this.isIsSetterAbstract()}
def ScalaisSetterAbstract_=(arg : Boolean)={this.setIsSetterAbstract(arg)}
def ScalaisComposite : Boolean={this.isIsComposite()}
def ScalaisComposite_=(arg : Boolean)={this.setIsComposite(arg)}
def ScalaisGetterAbstract : Boolean={this.isIsGetterAbstract()}
def ScalaisGetterAbstract_=(arg : Boolean)={this.setIsGetterAbstract(arg)}
def Scaladefault : java.lang.String={this.getDefault()}
def Scaladefault_=(arg : java.lang.String)={this.setDefault(arg)}
def ScalaisReadOnly : Boolean={this.isIsReadOnly()}
def ScalaisReadOnly_=(arg : Boolean)={this.setIsReadOnly(arg)}
var propertyConstraint : fr.irisa.triskell.kermeta.language.structureScalaAspect.PropertyConstraint= _
def KergetPropertyConstraint() : fr.irisa.triskell.kermeta.language.structureScalaAspect.PropertyConstraint={this.propertyConstraint}
def KersetPropertyConstraint(arg:fr.irisa.triskell.kermeta.language.structureScalaAspect.PropertyConstraint)={ this.propertyConstraint = arg}
def ScalapropertyConstraint : fr.irisa.triskell.kermeta.language.structureScalaAspect.PropertyConstraint={this.KergetPropertyConstraint()}
def ScalapropertyConstraint_=(arg : fr.irisa.triskell.kermeta.language.structureScalaAspect.PropertyConstraint)={this.KersetPropertyConstraint(arg)}
def ScalaisID : Boolean={this.isIsID()}
def ScalaisID_=(arg : Boolean)={this.setIsID(arg)}
}

