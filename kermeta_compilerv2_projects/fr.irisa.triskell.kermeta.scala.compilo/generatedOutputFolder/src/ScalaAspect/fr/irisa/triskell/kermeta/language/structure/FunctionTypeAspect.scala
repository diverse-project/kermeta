package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait FunctionTypeAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.TypeContainerAspect with ScalaAspect.fr.irisa.triskell.kermeta.language.structure.TypeAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.FunctionType{
def Scalaleft : _root_.fr.irisa.triskell.kermeta.language.structure.Type={this.getLeft()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Type]
def Scalaleft_=(value : _root_.fr.irisa.triskell.kermeta.language.structure.Type)={this.setLeft(value)}
def Scalaright : _root_.fr.irisa.triskell.kermeta.language.structure.Type={this.getRight()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Type]
def Scalaright_=(value : _root_.fr.irisa.triskell.kermeta.language.structure.Type)={this.setRight(value)}
override def checkInvariants(){
val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ("resultType_must_not_be_a_ProductType" -> (()=>{
((Scalaright).isInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ProductType]).not()}
)) )
checkParamInvariants(invariants)
}
override def checkAllInvariants(){
val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ("resultType_must_not_be_a_ProductType" -> (()=>{
((Scalaright).isInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ProductType]).not()}
)) )
checkParamInvariants(invariants, constraintDiagnostic)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.FunctionType"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

