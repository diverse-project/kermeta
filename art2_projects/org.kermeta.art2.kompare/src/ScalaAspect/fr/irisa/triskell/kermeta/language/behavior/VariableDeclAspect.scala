package ScalaAspect.fr.irisa.triskell.kermeta.language.behavior
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait VariableDeclAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.ExpressionAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.behavior.VariableDecl{
def Scalainitialization : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression={this.getInitialization()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]
def Scalainitialization_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setInitialization(value)}
def Scalatype : _root_.fr.irisa.triskell.kermeta.language.behavior.TypeReference={this.getType()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.TypeReference]
def Scalatype_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.TypeReference)={this.setType(value)}
def Scalaidentifier : java.lang.String={this.getIdentifier()}.asInstanceOf[java.lang.String]
def Scalaidentifier_=(value : java.lang.String)={this.setIdentifier(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.behavior.VariableDecl"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

