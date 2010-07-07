package ScalaAspect.fr.irisa.triskell.kermeta.language.behavior
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait CallVariableAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.CallExpressionAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.behavior.CallVariable{
def ScalaisAtpre : java.lang.Boolean={this.isIsAtpre()}.asInstanceOf[java.lang.Boolean]
def ScalaisAtpre_=(value : java.lang.Boolean)={this.setIsAtpre(value)}

    override def accept(visitor : _root_.kermeta.ki.util.ExpressionVisitor):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
(visitor).visitCallVariable(this)}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.behavior.CallVariable"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

