package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ConstraintAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.NamedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.Constraint{
def Scalabody : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression={this.getBody()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]
def Scalabody_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setBody(value)}
def ScalapreOwner : _root_.fr.irisa.triskell.kermeta.language.structure.Operation={this.getPreOwner()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Operation]
def ScalapreOwner_=(value : _root_.fr.irisa.triskell.kermeta.language.structure.Operation)={this.setPreOwner(value)}
def Scalastereotype : fr.irisa.triskell.kermeta.language.structure.ConstraintType={this.getStereotype()}.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.ConstraintType]
def Scalastereotype_=(value : fr.irisa.triskell.kermeta.language.structure.ConstraintType)={this.setStereotype(value)}
def ScalapostOwner : _root_.fr.irisa.triskell.kermeta.language.structure.Operation={this.getPostOwner()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Operation]
def ScalapostOwner_=(value : _root_.fr.irisa.triskell.kermeta.language.structure.Operation)={this.setPostOwner(value)}
def Scalalanguage : fr.irisa.triskell.kermeta.language.structure.ConstraintLanguage={this.getLanguage()}.asInstanceOf[fr.irisa.triskell.kermeta.language.structure.ConstraintLanguage]
def Scalalanguage_=(value : fr.irisa.triskell.kermeta.language.structure.ConstraintLanguage)={this.setLanguage(value)}
def ScalainvOwner : _root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition={this.getInvOwner()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition]
def ScalainvOwner_=(value : _root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition)={this.setInvOwner(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.Constraint"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

