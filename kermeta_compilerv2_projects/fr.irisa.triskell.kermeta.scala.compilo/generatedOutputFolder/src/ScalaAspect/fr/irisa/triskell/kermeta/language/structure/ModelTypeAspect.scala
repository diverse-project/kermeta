package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ModelTypeAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.TypeAspect with ScalaAspect.fr.irisa.triskell.kermeta.language.structure.TypeDefinitionAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.ModelType{
def ScalaincludedTypeDefinition : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.TypeDefinition]={this.getIncludedTypeDefinition()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.TypeDefinition]]
def ScalaincludedTypeDefinition_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.TypeDefinition])={this.getIncludedTypeDefinition().clear
this.getIncludedTypeDefinition().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.ModelType"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

