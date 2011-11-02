package group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.org.kermeta.language.sample.callEcoreSample.ImplicitConversion._
trait TypeDefinitionAspect extends group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.NamedElementAspect with group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.TypeContainerAspect with `_root_`.org.kermeta.language.structure.TypeDefinition{
def ScalasuperType : java.util.List[_root_.org.kermeta.language.structure.Type]={new RichKermetaList(this.getSuperType())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.Type]]
def ScalasuperType_=(value : java.util.List[_root_.org.kermeta.language.structure.Type])={this.getSuperType().clear
this.getSuperType().addAll(value)
}
def ScalatypeMappings : java.util.List[_root_.org.kermeta.language.structure.TypeMapping]={new RichKermetaList(this.getTypeMappings())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.TypeMapping]]
def ScalatypeMappings_=(value : java.util.List[_root_.org.kermeta.language.structure.TypeMapping])={this.getTypeMappings().clear
this.getTypeMappings().addAll(value)
}
def ScalaisAspect : _root_.java.lang.Boolean={this.getIsAspect()}.asInstanceOf[_root_.java.lang.Boolean]
def ScalaisAspect_=(value : _root_.java.lang.Boolean)={this.setIsAspect(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.TypeDefinition"); 
         if (cd !=null){ 
 var cl = group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

