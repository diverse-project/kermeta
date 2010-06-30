package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait NamespaceAspect extends ScalaAspect.art2.NamedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.Namespace{
def Scalaparent : _root_.art2.Namespace={this.getParent()}.asInstanceOf[_root_.art2.Namespace]
def Scalaparent_=(value : _root_.art2.Namespace)={this.setParent(value)}
def Scalachilds : java.util.List[_root_.art2.Namespace]={this.getChilds()}.asInstanceOf[java.util.List[_root_.art2.Namespace]]
def Scalachilds_=(value : java.util.List[_root_.art2.Namespace])={this.getChilds().clear
this.getChilds().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.Namespace"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

