package ScalaAspect.fr.irisa.triskell.kermeta.language.behavior
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait JavaStaticCallAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.ExpressionAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall{
def Scalajmethod : java.lang.String={this.getJmethod()}.asInstanceOf[java.lang.String]
def Scalajmethod_=(value : java.lang.String)={this.setJmethod(value)}
def Scalaparameters : java.util.List[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]={this.getParameters()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]]
def Scalaparameters_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression])={this.getParameters().clear
this.getParameters().addAll(value)
}
def Scalajclass : java.lang.String={this.getJclass()}.asInstanceOf[java.lang.String]
def Scalajclass_=(value : java.lang.String)={this.setJclass(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.behavior.JavaStaticCall"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

