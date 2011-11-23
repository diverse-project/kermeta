package group.KermetaDoc.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait ConstraintAspect extends group.KermetaDoc.org.kermeta.language.structure.NamedElementAspect with `_root_`.org.kermeta.language.structure.Constraint{
def Scalabody : _root_.org.kermeta.language.behavior.Expression={this.getBody()}.asInstanceOf[_root_.org.kermeta.language.behavior.Expression]
def Scalabody_=(value : _root_.org.kermeta.language.behavior.Expression)={this.setBody(value)}
def Scalastereotype : _root_.org.kermeta.language.structure.ConstraintType={this.getStereotype()}.asInstanceOf[_root_.org.kermeta.language.structure.ConstraintType]
def Scalastereotype_=(value : _root_.org.kermeta.language.structure.ConstraintType)={this.setStereotype(value)}
def Scalalanguage : _root_.org.kermeta.language.structure.ConstraintLanguage={this.getLanguage()}.asInstanceOf[_root_.org.kermeta.language.structure.ConstraintLanguage]
def Scalalanguage_=(value : _root_.org.kermeta.language.structure.ConstraintLanguage)={this.setLanguage(value)}
def ScalainvOwner : _root_.org.kermeta.language.structure.ClassDefinition={this.getInvOwner()}.asInstanceOf[_root_.org.kermeta.language.structure.ClassDefinition]
def ScalainvOwner_=(value : _root_.org.kermeta.language.structure.ClassDefinition)={this.setInvOwner(value)}
def ScalapreOwner : _root_.org.kermeta.language.structure.Operation={this.getPreOwner()}.asInstanceOf[_root_.org.kermeta.language.structure.Operation]
def ScalapreOwner_=(value : _root_.org.kermeta.language.structure.Operation)={this.setPreOwner(value)}
def ScalapostOwner : _root_.org.kermeta.language.structure.Operation={this.getPostOwner()}.asInstanceOf[_root_.org.kermeta.language.structure.Operation]
def ScalapostOwner_=(value : _root_.org.kermeta.language.structure.Operation)={this.setPostOwner(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Constraint"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

