package ScalaAspect.fr.irisa.triskell.kermeta.language.behavior
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait RescueAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.behavior.Rescue{
def ScalaexceptionName : java.lang.String={this.getExceptionName()}.asInstanceOf[java.lang.String]
def ScalaexceptionName_=(value : java.lang.String)={this.setExceptionName(value)}
def Scalabody : java.util.List[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]={this.getBody()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]]
def Scalabody_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression])={this.getBody().clear
this.getBody().addAll(value)
}
def ScalaexceptionType : _root_.fr.irisa.triskell.kermeta.language.behavior.TypeReference={this.getExceptionType()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.TypeReference]
def ScalaexceptionType_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.TypeReference)={this.setExceptionType(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.behavior.Rescue"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

