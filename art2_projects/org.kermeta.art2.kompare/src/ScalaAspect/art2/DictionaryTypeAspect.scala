package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait DictionaryTypeAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.DictionaryType{
def ScaladefaultValues : java.util.List[_root_.art2.DictionaryValue]={this.getDefaultValues()}.asInstanceOf[java.util.List[_root_.art2.DictionaryValue]]
def ScaladefaultValues_=(value : java.util.List[_root_.art2.DictionaryValue])={this.getDefaultValues().clear
this.getDefaultValues().addAll(value)
}
def Scalaattributes : java.util.List[_root_.art2.DictionaryAttribute]={this.getAttributes()}.asInstanceOf[java.util.List[_root_.art2.DictionaryAttribute]]
def Scalaattributes_=(value : java.util.List[_root_.art2.DictionaryAttribute])={this.getAttributes().clear
this.getAttributes().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.DictionaryType"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

