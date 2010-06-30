package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ServicePortTypeAspect extends ScalaAspect.art2.PortTypeAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.ServicePortType{
def Scalaoperations : java.util.List[_root_.art2.Operation]={this.getOperations()}.asInstanceOf[java.util.List[_root_.art2.Operation]]
def Scalaoperations_=(value : java.util.List[_root_.art2.Operation])={this.getOperations().clear
this.getOperations().addAll(value)
}
def Scalainterface : java.lang.String={this.getInterface()}.asInstanceOf[java.lang.String]
def Scalainterface_=(value : java.lang.String)={this.setInterface(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.ServicePortType"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

