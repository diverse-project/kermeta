package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait MessagePortTypeAspect extends ScalaAspect.art2.PortTypeAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.MessagePortType{
def Scalafilters : java.util.List[_root_.art2.TypedElement]={this.getFilters()}.asInstanceOf[java.util.List[_root_.art2.TypedElement]]
def Scalafilters_=(value : java.util.List[_root_.art2.TypedElement])={this.getFilters().clear
this.getFilters().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.MessagePortType"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

