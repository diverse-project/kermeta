package ScalaAspect.fr.irisa.triskell.kermeta.language.behavior
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait LambdaParameterAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.behavior.LambdaParameter{
def Scalaname : java.lang.String={this.getName()}.asInstanceOf[java.lang.String]
def Scalaname_=(value : java.lang.String)={this.setName(value)}
def Scalatype : _root_.fr.irisa.triskell.kermeta.language.behavior.TypeReference={this.getType()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.TypeReference]
def Scalatype_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.TypeReference)={this.setType(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.behavior.LambdaParameter"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

