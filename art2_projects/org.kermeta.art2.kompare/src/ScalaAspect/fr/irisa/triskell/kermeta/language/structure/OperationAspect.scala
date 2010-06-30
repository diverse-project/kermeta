package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait OperationAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.MultiplicityElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.Operation{
def ScalatypeParameter : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.TypeVariable]={this.getTypeParameter()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.TypeVariable]]
def ScalatypeParameter_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.TypeVariable])={this.getTypeParameter().clear
this.getTypeParameter().addAll(value)
}
def Scalabody : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression={this.getBody()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]
def Scalabody_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setBody(value)}
def Scalapost : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Constraint]={this.getPost()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Constraint]]
def Scalapost_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Constraint])={this.getPost().clear
this.getPost().addAll(value)
}
def ScalaownedParameter : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Parameter]={this.getOwnedParameter()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Parameter]]
def ScalaownedParameter_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Parameter])={this.getOwnedParameter().clear
this.getOwnedParameter().addAll(value)
}
def ScalaisAbstract : java.lang.Boolean={this.isIsAbstract()}.asInstanceOf[java.lang.Boolean]
def ScalaisAbstract_=(value : java.lang.Boolean)={this.setIsAbstract(value)}
def ScalaraisedException : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type]={this.getRaisedException()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type]]
def ScalaraisedException_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Type])={this.getRaisedException().clear
this.getRaisedException().addAll(value)
}
def Scalapre : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Constraint]={this.getPre()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Constraint]]
def Scalapre_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Constraint])={this.getPre().clear
this.getPre().addAll(value)
}
def ScalasuperOperation : _root_.fr.irisa.triskell.kermeta.language.structure.Operation={this.getSuperOperation()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Operation]
def ScalasuperOperation_=(value : _root_.fr.irisa.triskell.kermeta.language.structure.Operation)={this.setSuperOperation(value)}
def ScalaowningClass : _root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition={this.getOwningClass()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition]
def ScalaowningClass_=(value : _root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition)={this.setOwningClass(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.Operation"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

