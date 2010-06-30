package ScalaAspect.fr.irisa.triskell.kermeta.language.behavior
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait BlockAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.ExpressionAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.behavior.Block{
def Scalastatement : java.util.List[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]={this.getStatement()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]]
def Scalastatement_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression])={this.getStatement().clear
this.getStatement().addAll(value)
}
def ScalarescueBlock : java.util.List[_root_.fr.irisa.triskell.kermeta.language.behavior.Rescue]={this.getRescueBlock()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.behavior.Rescue]]
def ScalarescueBlock_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.behavior.Rescue])={this.getRescueBlock().clear
this.getRescueBlock().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.behavior.Block"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

