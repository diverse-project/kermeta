package group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.org.kermeta.language.sample.callEcoreSample.ImplicitConversion._
trait VariableDeclAspect extends group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.behavior.ExpressionAspect with `_root_`.org.kermeta.language.behavior.VariableDecl{
def Scalainitialization : _root_.org.kermeta.language.behavior.Expression={this.getInitialization()}.asInstanceOf[_root_.org.kermeta.language.behavior.Expression]
def Scalainitialization_=(value : _root_.org.kermeta.language.behavior.Expression)={this.setInitialization(value)}
def Scalaidentifier : _root_.java.lang.String={this.getIdentifier()}.asInstanceOf[_root_.java.lang.String]
def Scalaidentifier_=(value : _root_.java.lang.String)={this.setIdentifier(value)}
def Scalatype : _root_.org.kermeta.language.behavior.TypeReference={this.getType()}.asInstanceOf[_root_.org.kermeta.language.behavior.TypeReference]
def Scalatype_=(value : _root_.org.kermeta.language.behavior.TypeReference)={this.setType(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.VariableDecl"); 
         if (cd !=null){ 
 var cl = group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

