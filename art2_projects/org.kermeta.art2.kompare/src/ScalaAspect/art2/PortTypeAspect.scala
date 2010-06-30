package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait PortTypeAspect extends ScalaAspect.art2.NamedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.PortType{
def Scalasynchrone : java.lang.Boolean={this.isSynchrone()}.asInstanceOf[java.lang.Boolean]
def Scalasynchrone_=(value : java.lang.Boolean)={this.setSynchrone(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.PortType"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

