package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait PortTypeRefAspect extends ScalaAspect.art2.NamedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.PortTypeRef{
def Scalaref : _root_.art2.PortType={this.getRef()}.asInstanceOf[_root_.art2.PortType]
def Scalaref_=(value : _root_.art2.PortType)={this.setRef(value)}
def Scalamappings : java.util.List[_root_.art2.PortTypeMapping]={this.getMappings()}.asInstanceOf[java.util.List[_root_.art2.PortTypeMapping]]
def Scalamappings_=(value : java.util.List[_root_.art2.PortTypeMapping])={this.getMappings().clear
this.getMappings().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.PortTypeRef"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

