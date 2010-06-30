package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait DeployUnitAspect extends ScalaAspect.art2.NamedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.DeployUnit{
def ScalagroupName : java.lang.String={this.getGroupName()}.asInstanceOf[java.lang.String]
def ScalagroupName_=(value : java.lang.String)={this.setGroupName(value)}
def ScalaunitName : java.lang.String={this.getUnitName()}.asInstanceOf[java.lang.String]
def ScalaunitName_=(value : java.lang.String)={this.setUnitName(value)}
def Scalaversion : java.lang.String={this.getVersion()}.asInstanceOf[java.lang.String]
def Scalaversion_=(value : java.lang.String)={this.setVersion(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.DeployUnit"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

