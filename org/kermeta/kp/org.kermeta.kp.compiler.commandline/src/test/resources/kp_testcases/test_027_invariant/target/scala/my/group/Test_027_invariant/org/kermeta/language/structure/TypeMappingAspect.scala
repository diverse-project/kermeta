package my.group.`Test_027_invariant`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait TypeMappingAspect extends my.group.`Test_027_invariant`.org.kermeta.language.structure.TypeContainerAspect with `_root_`.org.kermeta.language.structure.TypeMapping{
def ScalatargetType : _root_.org.kermeta.language.structure.Type={this.getTargetType().asInstanceOf[_root_.org.kermeta.language.structure.Type]}
def ScalatargetType_=(`~value` : _root_.org.kermeta.language.structure.Type):Unit={this.setTargetType(`~value`)}
def ScalasourceType : _root_.org.kermeta.language.structure.TypeDefinition={this.getSourceType().asInstanceOf[_root_.org.kermeta.language.structure.TypeDefinition]}
def ScalasourceType_=(`~value` : _root_.org.kermeta.language.structure.TypeDefinition):Unit={this.setSourceType(`~value`)}
def Scalamapping : _root_.k2.standard.KermetaObject={this.getMapping().asInstanceOf[_root_.k2.standard.KermetaObject]}
def Scalamapping_=(`~value` : _root_.k2.standard.KermetaObject):Unit={this.setMapping(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.TypeMapping"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

