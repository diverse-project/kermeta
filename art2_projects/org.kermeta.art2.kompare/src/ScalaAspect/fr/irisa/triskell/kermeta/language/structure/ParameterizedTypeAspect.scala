package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ParameterizedTypeAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.TypeAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.ParameterizedType{
def ScalatypeParamBinding : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding]={this.getTypeParamBinding()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding]]
def ScalatypeParamBinding_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding])={this.getTypeParamBinding().clear
this.getTypeParamBinding().addAll(value)
}
def ScalatypeDefinition : _root_.fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition={this.getTypeDefinition()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition]
def ScalatypeDefinition_=(value : _root_.fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition)={this.setTypeDefinition(value)}
def ScalavirtualTypeBinding : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding]={this.getVirtualTypeBinding()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding]]
def ScalavirtualTypeBinding_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding])={this.getVirtualTypeBinding().clear
this.getVirtualTypeBinding().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.ParameterizedType"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

