package group.KermetaDoc.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait ClassDefinitionAspect extends group.KermetaDoc.org.kermeta.language.structure.GenericTypeDefinitionAspect with `_root_`.org.kermeta.language.structure.ClassDefinition{
def Scalainv : java.util.List[_root_.org.kermeta.language.structure.Constraint]={new RichKermetaList(this.getInv())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.Constraint]]
def Scalainv_=(value : java.util.List[_root_.org.kermeta.language.structure.Constraint])={this.getInv().clear
this.getInv().addAll(value)
}
def ScalaisAbstract : _root_.java.lang.Boolean={this.getIsAbstract()}.asInstanceOf[_root_.java.lang.Boolean]
def ScalaisAbstract_=(value : _root_.java.lang.Boolean)={this.setIsAbstract(value)}
def ScalaownedAttribute : java.util.List[_root_.org.kermeta.language.structure.Property]={new RichKermetaList(this.getOwnedAttribute())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.Property]]
def ScalaownedAttribute_=(value : java.util.List[_root_.org.kermeta.language.structure.Property])={this.getOwnedAttribute().clear
this.getOwnedAttribute().addAll(value)
}
def ScalaownedOperation : java.util.List[_root_.org.kermeta.language.structure.Operation]={new RichKermetaList(this.getOwnedOperation())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.Operation]]
def ScalaownedOperation_=(value : java.util.List[_root_.org.kermeta.language.structure.Operation])={this.getOwnedOperation().clear
this.getOwnedOperation().addAll(value)
}
def ScalaisSingleton : _root_.java.lang.Boolean={this.getIsSingleton()}.asInstanceOf[_root_.java.lang.Boolean]
def ScalaisSingleton_=(value : _root_.java.lang.Boolean)={this.setIsSingleton(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.ClassDefinition"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

