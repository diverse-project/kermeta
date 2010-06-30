package ScalaAspect.fr.irisa.triskell.kermeta.language.behavior
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait LoopAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.ExpressionAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.behavior.Loop{
def Scalainitialization : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression={this.getInitialization()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]
def Scalainitialization_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setInitialization(value)}
def Scalabody : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression={this.getBody()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]
def Scalabody_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setBody(value)}
def ScalastopCondition : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression={this.getStopCondition()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]
def ScalastopCondition_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setStopCondition(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.behavior.Loop"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

