package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait ConstraintAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.NamedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.Constraint{
def Scalabody : fr.irisa.triskell.kermeta.language.behavior.Expression={this.getBody()}
def Scalabody_=(arg : fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setBody(arg)}
def ScalapreOwner : fr.irisa.triskell.kermeta.language.structure.Operation={this.getPreOwner()}
def ScalapreOwner_=(arg : fr.irisa.triskell.kermeta.language.structure.Operation)={this.setPreOwner(arg)}
def Scalastereotype : fr.irisa.triskell.kermeta.language.structure.ConstraintType={this.getStereotype()}
def Scalastereotype_=(arg : fr.irisa.triskell.kermeta.language.structure.ConstraintType)={this.setStereotype(arg)}
def ScalapostOwner : fr.irisa.triskell.kermeta.language.structure.Operation={this.getPostOwner()}
def ScalapostOwner_=(arg : fr.irisa.triskell.kermeta.language.structure.Operation)={this.setPostOwner(arg)}
def Scalalanguage : fr.irisa.triskell.kermeta.language.structure.ConstraintLanguage={this.getLanguage()}
def Scalalanguage_=(arg : fr.irisa.triskell.kermeta.language.structure.ConstraintLanguage)={this.setLanguage(arg)}
def ScalainvOwner : fr.irisa.triskell.kermeta.language.structure.ClassDefinition={this.getInvOwner()}
def ScalainvOwner_=(arg : fr.irisa.triskell.kermeta.language.structure.ClassDefinition)={this.setInvOwner(arg)}
}

