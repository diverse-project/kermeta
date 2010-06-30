package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait OperationAspect extends ScalaAspect.art2.NamedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.Operation{
def Scalaparameters : java.util.List[_root_.art2.Parameter]={this.getParameters()}.asInstanceOf[java.util.List[_root_.art2.Parameter]]
def Scalaparameters_=(value : java.util.List[_root_.art2.Parameter])={this.getParameters().clear
this.getParameters().addAll(value)
}
def ScalareturnType : _root_.art2.TypedElement={this.getReturnType()}.asInstanceOf[_root_.art2.TypedElement]
def ScalareturnType_=(value : _root_.art2.TypedElement)={this.setReturnType(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.Operation"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

