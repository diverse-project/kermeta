package fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait PropertyAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect.MultiplicityElementAspect with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.scala.framework.language.structure.Property{
var getViolatedConstraintsMustDrillDownCache : java.lang.Object= _
def KergetGetViolatedConstraintsMustDrillDownCache() : java.lang.Object={this.getViolatedConstraintsMustDrillDownCache}
def KersetGetViolatedConstraintsMustDrillDownCache(arg:java.lang.Object)={ this.getViolatedConstraintsMustDrillDownCache = arg}
def ScalagetViolatedConstraintsMustDrillDownCache : java.lang.Object={this.KergetGetViolatedConstraintsMustDrillDownCache()}
def ScalagetViolatedConstraintsMustDrillDownCache_=(arg : java.lang.Object)={this.KersetGetViolatedConstraintsMustDrillDownCache(arg)}
def ScalaisDerived : java.lang.Object={this.getIsDerived()}
def ScalaisDerived_=(arg : java.lang.Object)={this.setIsDerived(arg)}
def Scalaopposite : fr.irisa.triskell.kermeta.scala.framework.language.structure.Property={this.getOpposite()}
def Scalaopposite_=(arg : fr.irisa.triskell.kermeta.scala.framework.language.structure.Property)={this.setOpposite(arg)}
def ScalagetterBody : fr.irisa.triskell.kermeta.language.behavior.Expression={this.getGetterBody()}
def ScalagetterBody_=(arg : fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setGetterBody(arg)}
def ScalasetterBody : fr.irisa.triskell.kermeta.language.behavior.Expression={this.getSetterBody()}
def ScalasetterBody_=(arg : fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setSetterBody(arg)}
def ScalaowningClass : fr.irisa.triskell.kermeta.scala.framework.language.structure.ClassDefinition={this.getOwningClass()}
def ScalaowningClass_=(arg : fr.irisa.triskell.kermeta.scala.framework.language.structure.ClassDefinition)={this.setOwningClass(arg)}
def ScalaisSetterAbstract : java.lang.Object={this.getIsSetterAbstract()}
def ScalaisSetterAbstract_=(arg : java.lang.Object)={this.setIsSetterAbstract(arg)}
def ScalaisGetterAbstract : java.lang.Object={this.getIsGetterAbstract()}
def ScalaisGetterAbstract_=(arg : java.lang.Object)={this.setIsGetterAbstract(arg)}
def ScalaisComposite : java.lang.Object={this.getIsComposite()}
def ScalaisComposite_=(arg : java.lang.Object)={this.setIsComposite(arg)}
def Scaladefault : java.lang.Object={this.getDefault()}
def Scaladefault_=(arg : java.lang.Object)={this.setDefault(arg)}
def ScalaisReadOnly : java.lang.Object={this.getIsReadOnly()}
def ScalaisReadOnly_=(arg : java.lang.Object)={this.setIsReadOnly(arg)}
var propertyConstraint : fr.irisa.triskell.kermeta.scala.framework.language.structure.PropertyConstraint= _
def KergetPropertyConstraint() : fr.irisa.triskell.kermeta.scala.framework.language.structure.PropertyConstraint={this.propertyConstraint}
def KersetPropertyConstraint(arg:fr.irisa.triskell.kermeta.scala.framework.language.structure.PropertyConstraint)={ this.propertyConstraint = arg}
def ScalapropertyConstraint : fr.irisa.triskell.kermeta.scala.framework.language.structure.PropertyConstraint={this.KergetPropertyConstraint()}
def ScalapropertyConstraint_=(arg : fr.irisa.triskell.kermeta.scala.framework.language.structure.PropertyConstraint)={this.KersetPropertyConstraint(arg)}
def ScalaisID : java.lang.Object={this.getIsID()}
def ScalaisID_=(arg : java.lang.Object)={this.setIsID(arg)}

    def getViolatedConstraintsMustDrillDown():java.lang.Object = {
var result : java.lang.Object = null.asInstanceOf[java.lang.Object]; 
{
if (ScalagetViolatedConstraintsMustDrillDownCache.isVoid()){
ScalagetViolatedConstraintsMustDrillDownCache = kermeta.standard.ValueType.isSuperTypeOf(this.Scalatype).not();}

result = ScalagetViolatedConstraintsMustDrillDownCache;}
 return result
}
}

