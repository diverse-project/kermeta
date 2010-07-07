package ScalaAspect.fr.irisa.triskell.kermeta.language.behavior
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait IntegerLiteralAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.LiteralAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral{
def Scalavalue : Int={this.getValue()}.asInstanceOf[Int]
def Scalavalue_=(value : Int)={this.setValue(value)}

    override def accept(visitor : _root_.kermeta.ki.util.ExpressionVisitor):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
(visitor).visitIntegerLiteral(this)}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.behavior.IntegerLiteral"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

