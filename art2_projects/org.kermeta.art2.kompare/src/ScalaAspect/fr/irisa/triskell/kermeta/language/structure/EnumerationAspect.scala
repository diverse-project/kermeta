package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait EnumerationAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.DataTypeAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.Enumeration{
def ScalaownedLiteral : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral]={this.getOwnedLiteral()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral]]
def ScalaownedLiteral_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral])={this.getOwnedLiteral().clear
this.getOwnedLiteral().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.Enumeration"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

