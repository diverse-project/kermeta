package my.group.`Test_027_invariant`.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait VariableDeclAspect extends my.group.`Test_027_invariant`.org.kermeta.language.behavior.ExpressionAspect with `_root_`.org.kermeta.language.behavior.VariableDecl{
def Scalainitialization : _root_.org.kermeta.language.behavior.Expression={this.getInitialization().asInstanceOf[_root_.org.kermeta.language.behavior.Expression]}
def Scalainitialization_=(`~value` : _root_.org.kermeta.language.behavior.Expression):Unit={this.setInitialization(`~value`)}
def Scalaidentifier : _root_.java.lang.String={this.getIdentifier().asInstanceOf[_root_.java.lang.String]}
def Scalaidentifier_=(`~value` : _root_.java.lang.String):Unit={this.setIdentifier(`~value`)}
def Scalatype : _root_.org.kermeta.language.behavior.TypeReference={this.getType().asInstanceOf[_root_.org.kermeta.language.behavior.TypeReference]}
def Scalatype_=(`~value` : _root_.org.kermeta.language.behavior.TypeReference):Unit={this.setType(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.VariableDecl"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

