package group.km2html.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.km2html.ImplicitConversion._
trait UnresolvedCallAspect extends group.km2html.org.kermeta.language.structure.UnresolvedAspect with group.km2html.org.kermeta.language.behavior.CallExpressionAspect with group.km2html.org.kermeta.language.structure.TypeContainerAspect with `_root_`.org.kermeta.language.behavior.UnresolvedCall{
def Scalausings : java.util.List[_root_.org.kermeta.language.structure.Using]={new RichKermetaList(this.getUsings())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.Using]]
def Scalausings_=(value : java.util.List[_root_.org.kermeta.language.structure.Using])={this.getUsings().clear
this.getUsings().addAll(value)
}
def Scalatarget : _root_.org.kermeta.language.behavior.Expression={this.getTarget()}.asInstanceOf[_root_.org.kermeta.language.behavior.Expression]
def Scalatarget_=(value : _root_.org.kermeta.language.behavior.Expression)={this.setTarget(value)}
def ScalaisAtpre : _root_.java.lang.Boolean={this.getIsAtpre()}.asInstanceOf[_root_.java.lang.Boolean]
def ScalaisAtpre_=(value : _root_.java.lang.Boolean)={this.setIsAtpre(value)}
def ScalatargetParent : _root_.org.kermeta.language.structure.Type={this.getTargetParent()}.asInstanceOf[_root_.org.kermeta.language.structure.Type]
def ScalatargetParent_=(value : _root_.org.kermeta.language.structure.Type)={this.setTargetParent(value)}
def Scalagenerics : java.util.List[_root_.org.kermeta.language.structure.Type]={new RichKermetaList(this.getGenerics())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.Type]]
def Scalagenerics_=(value : java.util.List[_root_.org.kermeta.language.structure.Type])={this.getGenerics().clear
this.getGenerics().addAll(value)
}
def ScalaisCalledWithParenthesis : _root_.java.lang.Boolean={this.getIsCalledWithParenthesis()}.asInstanceOf[_root_.java.lang.Boolean]
def ScalaisCalledWithParenthesis_=(value : _root_.java.lang.Boolean)={this.setIsCalledWithParenthesis(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.UnresolvedCall"); 
         if (cd !=null){ 
 var cl = group.km2html.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

