package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait ConstraintAspect extends org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.NamedElementAspect with `_root_`.org.kermeta.language.structure.Constraint{
def Scalabody : _root_.org.kermeta.language.behavior.Expression={this.getBody().asInstanceOf[_root_.org.kermeta.language.behavior.Expression]}
def Scalabody_=(`~value` : _root_.org.kermeta.language.behavior.Expression):Unit={this.setBody(`~value`)}
def Scalastereotype : _root_.org.kermeta.language.structure.ConstraintType={this.getStereotype().asInstanceOf[_root_.org.kermeta.language.structure.ConstraintType]}
def Scalastereotype_=(`~value` : _root_.org.kermeta.language.structure.ConstraintType):Unit={this.setStereotype(`~value`)}
def Scalalanguage : _root_.org.kermeta.language.structure.ConstraintLanguage={this.getLanguage().asInstanceOf[_root_.org.kermeta.language.structure.ConstraintLanguage]}
def Scalalanguage_=(`~value` : _root_.org.kermeta.language.structure.ConstraintLanguage):Unit={this.setLanguage(`~value`)}
def ScalainvOwner : _root_.org.kermeta.language.structure.ClassDefinition={this.getInvOwner().asInstanceOf[_root_.org.kermeta.language.structure.ClassDefinition]}
def ScalainvOwner_=(`~value` : _root_.org.kermeta.language.structure.ClassDefinition):Unit={this.setInvOwner(`~value`)}
def ScalapreOwner : _root_.org.kermeta.language.structure.Operation={this.getPreOwner().asInstanceOf[_root_.org.kermeta.language.structure.Operation]}
def ScalapreOwner_=(`~value` : _root_.org.kermeta.language.structure.Operation):Unit={this.setPreOwner(`~value`)}
def ScalapostOwner : _root_.org.kermeta.language.structure.Operation={this.getPostOwner().asInstanceOf[_root_.org.kermeta.language.structure.Operation]}
def ScalapostOwner_=(`~value` : _root_.org.kermeta.language.structure.Operation):Unit={this.setPostOwner(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Constraint"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

