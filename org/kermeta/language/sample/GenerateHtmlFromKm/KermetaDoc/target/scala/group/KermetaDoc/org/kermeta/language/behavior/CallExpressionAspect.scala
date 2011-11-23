package group.KermetaDoc.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait CallExpressionAspect extends group.KermetaDoc.org.kermeta.language.behavior.ExpressionAspect with `_root_`.org.kermeta.language.behavior.CallExpression{
def Scalaparameters : java.util.List[_root_.org.kermeta.language.behavior.Expression]={new RichKermetaList(this.getParameters())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.behavior.Expression]]
def Scalaparameters_=(value : java.util.List[_root_.org.kermeta.language.behavior.Expression])={this.getParameters().clear
this.getParameters().addAll(value)
}
def Scalaname : _root_.java.lang.String={this.getName()}.asInstanceOf[_root_.java.lang.String]
def Scalaname_=(value : _root_.java.lang.String)={this.setName(value)}
def ScalastaticTypeVariableBindings : java.util.List[_root_.org.kermeta.language.structure.Type]={new RichKermetaList(this.getStaticTypeVariableBindings())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.Type]]
def ScalastaticTypeVariableBindings_=(value : java.util.List[_root_.org.kermeta.language.structure.Type])={this.getStaticTypeVariableBindings().clear
this.getStaticTypeVariableBindings().addAll(value)
}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.CallExpression"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

