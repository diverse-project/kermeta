package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ComponentTypeLibraryAspect extends ScalaAspect.art2.DeployUnitAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.ComponentTypeLibrary{
def ScalasubComponentTypes : java.util.List[_root_.art2.ComponentType]={this.getSubComponentTypes()}.asInstanceOf[java.util.List[_root_.art2.ComponentType]]
def ScalasubComponentTypes_=(value : java.util.List[_root_.art2.ComponentType])={this.getSubComponentTypes().clear
this.getSubComponentTypes().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.ComponentTypeLibrary"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

