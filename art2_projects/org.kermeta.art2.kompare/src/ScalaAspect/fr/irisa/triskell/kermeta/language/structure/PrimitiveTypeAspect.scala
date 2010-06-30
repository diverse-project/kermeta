package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait PrimitiveTypeAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.DataTypeAspect with ScalaAspect.fr.irisa.triskell.kermeta.language.structure.TypeContainerAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.PrimitiveType{
def ScalainstanceType : _root_.fr.irisa.triskell.kermeta.language.structure.Type={this.getInstanceType()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Type]
def ScalainstanceType_=(value : _root_.fr.irisa.triskell.kermeta.language.structure.Type)={this.setInstanceType(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.PrimitiveType"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

