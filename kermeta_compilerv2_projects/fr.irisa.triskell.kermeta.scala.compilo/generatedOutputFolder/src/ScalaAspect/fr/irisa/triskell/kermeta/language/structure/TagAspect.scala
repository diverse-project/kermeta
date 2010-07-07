package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait TagAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.Tag{
def Scalaname : java.lang.String={this.getName()}.asInstanceOf[java.lang.String]
def Scalaname_=(value : java.lang.String)={this.setName(value)}
def Scalavalue : java.lang.String={this.getValue()}.asInstanceOf[java.lang.String]
def Scalavalue_=(value : java.lang.String)={this.setValue(value)}
def Scalaobject : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Object]={this.getObject()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Object]]
def Scalaobject_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Object])={this.getObject().clear
this.getObject().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.Tag"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

