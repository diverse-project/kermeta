package ScalaAspect.fr.irisa.triskell.kermeta.language.behavior
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ConditionalAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.ExpressionAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.behavior.Conditional{
def ScalathenBody : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression={this.getThenBody()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]
def ScalathenBody_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setThenBody(value)}
def Scalacondition : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression={this.getCondition()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]
def Scalacondition_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setCondition(value)}
def ScalaelseBody : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression={this.getElseBody()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]
def ScalaelseBody_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setElseBody(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.behavior.Conditional"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

