package ScalaAspect.fr.irisa.triskell.kermeta.language.behavior
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait TypeLiteralAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.LiteralAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.behavior.TypeLiteral{
def Scalatyperef : _root_.fr.irisa.triskell.kermeta.language.behavior.TypeReference={this.getTyperef()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.TypeReference]
def Scalatyperef_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.TypeReference)={this.setTyperef(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.behavior.TypeLiteral"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

