package my.group.`Test_027_invariant`.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait UnresolvedCallAspect extends my.group.`Test_027_invariant`.org.kermeta.language.structure.UnresolvedAspect with my.group.`Test_027_invariant`.org.kermeta.language.behavior.CallExpressionAspect with my.group.`Test_027_invariant`.org.kermeta.language.structure.TypeContainerAspect with `_root_`.org.kermeta.language.behavior.UnresolvedCall{
def Scalausings : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Using]={new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.behavior.UnresolvedCall,_root_.org.kermeta.language.structure.Using](thisUpper = -1,value=this.getUsings())}
def Scalausings_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Using]):Unit={this.getUsings().clear
this.getUsings().addAll(`~value`)
}
def Scalatarget : _root_.org.kermeta.language.behavior.Expression={this.getTarget().asInstanceOf[_root_.org.kermeta.language.behavior.Expression]}
def Scalatarget_=(`~value` : _root_.org.kermeta.language.behavior.Expression):Unit={this.setTarget(`~value`)}
def ScalaisAtpre : _root_.java.lang.Boolean={this.getIsAtpre().asInstanceOf[_root_.java.lang.Boolean]}
def ScalaisAtpre_=(`~value` : _root_.java.lang.Boolean):Unit={this.setIsAtpre(`~value`)}
def ScalatargetParent : _root_.org.kermeta.language.structure.Type={this.getTargetParent().asInstanceOf[_root_.org.kermeta.language.structure.Type]}
def ScalatargetParent_=(`~value` : _root_.org.kermeta.language.structure.Type):Unit={this.setTargetParent(`~value`)}
def Scalagenerics : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Type]={new k2.standard.RichReflectiveOrderedSet[org.kermeta.language.behavior.UnresolvedCall,_root_.org.kermeta.language.structure.Type](thisUpper = -1,value=this.getGenerics())}
def Scalagenerics_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.kermeta.language.structure.Type]):Unit={this.getGenerics().clear
this.getGenerics().addAll(`~value`)
}
def ScalaisCalledWithParenthesis : _root_.java.lang.Boolean={this.getIsCalledWithParenthesis().asInstanceOf[_root_.java.lang.Boolean]}
def ScalaisCalledWithParenthesis_=(`~value` : _root_.java.lang.Boolean):Unit={this.setIsCalledWithParenthesis(`~value`)}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.UnresolvedCall"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

