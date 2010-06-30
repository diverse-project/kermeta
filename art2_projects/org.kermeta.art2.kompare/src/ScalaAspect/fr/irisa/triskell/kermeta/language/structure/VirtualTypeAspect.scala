package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait VirtualTypeAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariableAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.VirtualType{
def ScalamodelType : _root_.fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable={this.getModelType()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable]
def ScalamodelType_=(value : _root_.fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable)={this.setModelType(value)}
def ScalatypeParamBinding : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding]={this.getTypeParamBinding()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding]]
def ScalatypeParamBinding_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding])={this.getTypeParamBinding().clear
this.getTypeParamBinding().addAll(value)
}
def ScalaclassDefinition : _root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition={this.getClassDefinition()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition]
def ScalaclassDefinition_=(value : _root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition)={this.setClassDefinition(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.VirtualType"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

