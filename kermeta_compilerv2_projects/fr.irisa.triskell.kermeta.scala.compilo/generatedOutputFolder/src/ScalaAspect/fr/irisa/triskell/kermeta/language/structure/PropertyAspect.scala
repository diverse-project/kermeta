package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait PropertyAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.MultiplicityElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.Property{
var getViolatedConstraintsMustDrillDownCache : java.lang.Boolean= _
def KerisGetViolatedConstraintsMustDrillDownCache() : java.lang.Boolean={this.getViolatedConstraintsMustDrillDownCache}
def KersetGetViolatedConstraintsMustDrillDownCache(arg:java.lang.Boolean)={ this.getViolatedConstraintsMustDrillDownCache = arg}
def ScalagetViolatedConstraintsMustDrillDownCache : java.lang.Boolean={this.KerisGetViolatedConstraintsMustDrillDownCache()}.asInstanceOf[java.lang.Boolean]
def ScalagetViolatedConstraintsMustDrillDownCache_=(value : java.lang.Boolean)={this.KersetGetViolatedConstraintsMustDrillDownCache(value)}
def ScalaisDerived : java.lang.Boolean={this.isIsDerived()}.asInstanceOf[java.lang.Boolean]
def ScalaisDerived_=(value : java.lang.Boolean)={this.setIsDerived(value)}
def Scalaopposite : _root_.fr.irisa.triskell.kermeta.language.structure.Property={this.getOpposite()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Property]
def Scalaopposite_=(value : _root_.fr.irisa.triskell.kermeta.language.structure.Property)={this.setOpposite(value)}
def ScalagetterBody : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression={this.getGetterBody()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]
def ScalagetterBody_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setGetterBody(value)}
def ScalasetterBody : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression={this.getSetterBody()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]
def ScalasetterBody_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setSetterBody(value)}
def ScalaisSetterAbstract : java.lang.Boolean={this.isIsSetterAbstract()}.asInstanceOf[java.lang.Boolean]
def ScalaisSetterAbstract_=(value : java.lang.Boolean)={this.setIsSetterAbstract(value)}
def ScalaowningClass : _root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition={this.getOwningClass()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition]
def ScalaowningClass_=(value : _root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition)={this.setOwningClass(value)}
def ScalaisGetterAbstract : java.lang.Boolean={this.isIsGetterAbstract()}.asInstanceOf[java.lang.Boolean]
def ScalaisGetterAbstract_=(value : java.lang.Boolean)={this.setIsGetterAbstract(value)}
def ScalaisComposite : java.lang.Boolean={this.isIsComposite()}.asInstanceOf[java.lang.Boolean]
def ScalaisComposite_=(value : java.lang.Boolean)={this.setIsComposite(value)}
def Scaladefault : java.lang.String={this.getDefault()}.asInstanceOf[java.lang.String]
def Scaladefault_=(value : java.lang.String)={this.setDefault(value)}
def ScalaisReadOnly : java.lang.Boolean={this.isIsReadOnly()}.asInstanceOf[java.lang.Boolean]
def ScalaisReadOnly_=(value : java.lang.Boolean)={this.setIsReadOnly(value)}
var propertyConstraint : _root_.ScalaAspect.fr.irisa.triskell.kermeta.language.structure.PropertyConstraint= _
def KergetPropertyConstraint() : _root_.ScalaAspect.fr.irisa.triskell.kermeta.language.structure.PropertyConstraint={this.propertyConstraint}
def KersetPropertyConstraint(arg:_root_.ScalaAspect.fr.irisa.triskell.kermeta.language.structure.PropertyConstraint)={ this.propertyConstraint = arg}
def ScalapropertyConstraint : _root_.ScalaAspect.fr.irisa.triskell.kermeta.language.structure.PropertyConstraint={this.KergetPropertyConstraint()}.asInstanceOf[_root_.ScalaAspect.fr.irisa.triskell.kermeta.language.structure.PropertyConstraint]
def ScalapropertyConstraint_=(value : _root_.ScalaAspect.fr.irisa.triskell.kermeta.language.structure.PropertyConstraint)={this.KersetPropertyConstraint(value)}
def ScalaisID : java.lang.Boolean={this.isIsID()}.asInstanceOf[java.lang.Boolean]
def ScalaisID_=(value : java.lang.Boolean)={this.setIsID(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.Property"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

