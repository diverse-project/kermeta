package my.group.`Test_027_invariant`.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait ParameterAspect extends my.group.`Test_027_invariant`.org.kermeta.language.structure.MultiplicityElementAspect with `_root_`.org.kermeta.language.structure.Parameter{
def Scalaoperation : _root_.org.kermeta.language.structure.Operation={this.getOperation().asInstanceOf[_root_.org.kermeta.language.structure.Operation]}
def Scalaoperation_=(`~value` : _root_.org.kermeta.language.structure.Operation):Unit={this.setOperation(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Parameter"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

