package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait CompositeTypeAspect extends ScalaAspect.art2.ComponentTypeAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.CompositeType{
def Scalawires : java.util.List[_root_.art2.Wire]={this.getWires()}.asInstanceOf[java.util.List[_root_.art2.Wire]]
def Scalawires_=(value : java.util.List[_root_.art2.Wire])={this.getWires().clear
this.getWires().addAll(value)
}
def Scalachilds : java.util.List[_root_.art2.ComponentType]={this.getChilds()}.asInstanceOf[java.util.List[_root_.art2.ComponentType]]
def Scalachilds_=(value : java.util.List[_root_.art2.ComponentType])={this.getChilds().clear
this.getChilds().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.CompositeType"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

