package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait TypedElementAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.TypeContainerAspect with ScalaAspect.fr.irisa.triskell.kermeta.language.structure.NamedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.TypedElement{
def Scalatype : _root_.fr.irisa.triskell.kermeta.language.structure.Type={this.getType()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Type]
def Scalatype_=(value : _root_.fr.irisa.triskell.kermeta.language.structure.Type)={this.setType(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.TypedElement"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

