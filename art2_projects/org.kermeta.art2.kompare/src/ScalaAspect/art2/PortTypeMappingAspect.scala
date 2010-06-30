package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait PortTypeMappingAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.PortTypeMapping{
def ScalaserviceMethodName : java.lang.String={this.getServiceMethodName()}.asInstanceOf[java.lang.String]
def ScalaserviceMethodName_=(value : java.lang.String)={this.setServiceMethodName(value)}
def ScalabeanMethodName : java.lang.String={this.getBeanMethodName()}.asInstanceOf[java.lang.String]
def ScalabeanMethodName_=(value : java.lang.String)={this.setBeanMethodName(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.PortTypeMapping"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

