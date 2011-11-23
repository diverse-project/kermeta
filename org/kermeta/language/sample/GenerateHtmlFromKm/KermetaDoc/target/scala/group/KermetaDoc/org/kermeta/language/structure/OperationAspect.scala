package group.KermetaDoc.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait OperationAspect extends group.KermetaDoc.org.kermeta.language.structure.MultiplicityElementAspect with group.KermetaDoc.org.kermeta.language.structure.AbstractOperationAspect with `_root_`.org.kermeta.language.structure.Operation{
def ScalaisAbstract : _root_.java.lang.Boolean={this.getIsAbstract()}.asInstanceOf[_root_.java.lang.Boolean]
def ScalaisAbstract_=(value : _root_.java.lang.Boolean)={this.setIsAbstract(value)}
def ScalaraisedException : java.util.List[_root_.org.kermeta.language.structure.Type]={new RichKermetaList(this.getRaisedException())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.Type]]
def ScalaraisedException_=(value : java.util.List[_root_.org.kermeta.language.structure.Type])={this.getRaisedException().clear
this.getRaisedException().addAll(value)
}
def ScalaownedParameter : java.util.List[_root_.org.kermeta.language.structure.Parameter]={new RichKermetaList(this.getOwnedParameter())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.Parameter]]
def ScalaownedParameter_=(value : java.util.List[_root_.org.kermeta.language.structure.Parameter])={this.getOwnedParameter().clear
this.getOwnedParameter().addAll(value)
}
def Scalapre : java.util.List[_root_.org.kermeta.language.structure.Constraint]={new RichKermetaList(this.getPre())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.Constraint]]
def Scalapre_=(value : java.util.List[_root_.org.kermeta.language.structure.Constraint])={this.getPre().clear
this.getPre().addAll(value)
}
def Scalapost : java.util.List[_root_.org.kermeta.language.structure.Constraint]={new RichKermetaList(this.getPost())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.Constraint]]
def Scalapost_=(value : java.util.List[_root_.org.kermeta.language.structure.Constraint])={this.getPost().clear
this.getPost().addAll(value)
}
def Scalabody : _root_.org.kermeta.language.behavior.Expression={this.getBody()}.asInstanceOf[_root_.org.kermeta.language.behavior.Expression]
def Scalabody_=(value : _root_.org.kermeta.language.behavior.Expression)={this.setBody(value)}
def ScalasuperOperation : _root_.org.kermeta.language.structure.AbstractOperation={this.getSuperOperation()}.asInstanceOf[_root_.org.kermeta.language.structure.AbstractOperation]
def ScalasuperOperation_=(value : _root_.org.kermeta.language.structure.AbstractOperation)={this.setSuperOperation(value)}
def ScalaownedUnresolvedOperations : java.util.List[_root_.org.kermeta.language.structure.UnresolvedOperation]={new RichKermetaList(this.getOwnedUnresolvedOperations())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.UnresolvedOperation]]
def ScalaownedUnresolvedOperations_=(value : java.util.List[_root_.org.kermeta.language.structure.UnresolvedOperation])={this.getOwnedUnresolvedOperations().clear
this.getOwnedUnresolvedOperations().addAll(value)
}
def ScalaowningClass : _root_.org.kermeta.language.structure.ClassDefinition={this.getOwningClass()}.asInstanceOf[_root_.org.kermeta.language.structure.ClassDefinition]
def ScalaowningClass_=(value : _root_.org.kermeta.language.structure.ClassDefinition)={this.setOwningClass(value)}
def ScalatypeParameter : java.util.List[_root_.org.kermeta.language.structure.TypeVariable]={new RichKermetaList(this.getTypeParameter())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.TypeVariable]]
def ScalatypeParameter_=(value : java.util.List[_root_.org.kermeta.language.structure.TypeVariable])={this.getTypeParameter().clear
this.getTypeParameter().addAll(value)
}
def ScalauniqueName : _root_.java.lang.String={this.getUniqueName()}.asInstanceOf[_root_.java.lang.String]
def ScalauniqueName_=(value : _root_.java.lang.String)={this.setUniqueName(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Operation"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

