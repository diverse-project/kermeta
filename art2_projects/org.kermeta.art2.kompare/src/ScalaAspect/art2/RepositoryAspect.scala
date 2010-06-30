package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait RepositoryAspect extends ScalaAspect.art2.NamedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.Repository{
def Scalaunits : java.util.List[_root_.art2.DeployUnit]={this.getUnits()}.asInstanceOf[java.util.List[_root_.art2.DeployUnit]]
def Scalaunits_=(value : java.util.List[_root_.art2.DeployUnit])={this.getUnits().clear
this.getUnits().addAll(value)
}
def Scalaurl : java.lang.String={this.getUrl()}.asInstanceOf[java.lang.String]
def Scalaurl_=(value : java.lang.String)={this.setUrl(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.Repository"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

