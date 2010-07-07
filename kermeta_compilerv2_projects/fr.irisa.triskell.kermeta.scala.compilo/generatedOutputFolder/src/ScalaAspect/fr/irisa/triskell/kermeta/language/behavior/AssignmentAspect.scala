package ScalaAspect.fr.irisa.triskell.kermeta.language.behavior
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait AssignmentAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.ExpressionAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.behavior.Assignment{
def Scalavalue : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression={this.getValue()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]
def Scalavalue_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setValue(value)}
def Scalatarget : _root_.fr.irisa.triskell.kermeta.language.behavior.CallExpression={this.getTarget()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.CallExpression]
def Scalatarget_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.CallExpression)={this.setTarget(value)}
def ScalaisCast : java.lang.Boolean={this.isIsCast()}.asInstanceOf[java.lang.Boolean]
def ScalaisCast_=(value : java.lang.Boolean)={this.setIsCast(value)}

    override def accept(visitor : _root_.kermeta.ki.util.ExpressionVisitor):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
(visitor).visitAssignment(this)}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.behavior.Assignment"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

