package ScalaAspect.fr.irisa.triskell.kermeta.language.behavior
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait CallExpressionAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.ExpressionAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.behavior.CallExpression{
def ScalastaticTypeVariableBindings : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type]={this.getStaticTypeVariableBindings()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type]]
def ScalastaticTypeVariableBindings_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type])={this.getStaticTypeVariableBindings().clear
this.getStaticTypeVariableBindings().addAll(value)
}
def Scalaname : java.lang.String={this.getName()}.asInstanceOf[java.lang.String]
def Scalaname_=(value : java.lang.String)={this.setName(value)}
def Scalaparameters : java.util.List[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]={this.getParameters()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]]
def Scalaparameters_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression])={this.getParameters().clear
this.getParameters().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.behavior.CallExpression"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

