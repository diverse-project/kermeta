package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait IntegrationPatternAspect extends ScalaAspect.art2.NamedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.IntegrationPattern{
def ScalaextraFonctionalProperties : java.util.List[_root_.art2.ExtraFonctionalProperty]={this.getExtraFonctionalProperties()}.asInstanceOf[java.util.List[_root_.art2.ExtraFonctionalProperty]]
def ScalaextraFonctionalProperties_=(value : java.util.List[_root_.art2.ExtraFonctionalProperty])={this.getExtraFonctionalProperties().clear
this.getExtraFonctionalProperties().addAll(value)
}
def ScalaportTypes : java.util.List[_root_.art2.PortTypeRef]={this.getPortTypes()}.asInstanceOf[java.util.List[_root_.art2.PortTypeRef]]
def ScalaportTypes_=(value : java.util.List[_root_.art2.PortTypeRef])={this.getPortTypes().clear
this.getPortTypes().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.IntegrationPattern"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

