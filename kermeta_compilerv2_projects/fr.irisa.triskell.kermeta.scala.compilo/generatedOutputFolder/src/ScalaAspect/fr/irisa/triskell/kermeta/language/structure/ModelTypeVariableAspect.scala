package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ModelTypeVariableAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.TypeVariableAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable{
def ScalavirtualType : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.VirtualType]={this.getVirtualType()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.VirtualType]]
def ScalavirtualType_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.VirtualType])={this.getVirtualType().clear
this.getVirtualType().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.ModelTypeVariable"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

