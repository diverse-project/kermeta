package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait GenericTypeDefinitionAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.TypeDefinitionAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition{
def ScalatypeParameter : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.TypeVariable]={this.getTypeParameter()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.TypeVariable]]
def ScalatypeParameter_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.TypeVariable])={this.getTypeParameter().clear
this.getTypeParameter().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.GenericTypeDefinition"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

