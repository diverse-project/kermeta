package mainPackage
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait WheelAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.mainPackage.Wheel{
var size : _root_.java.lang.Integer= _
def KergetSize() : _root_.java.lang.Integer={this.size}
def KersetSize(arg:_root_.java.lang.Integer)={ this.size = arg}
def Scalasize : _root_.java.lang.Integer={this.KergetSize().asInstanceOf[_root_.java.lang.Integer]}
def Scalasize_=(`~value` : _root_.java.lang.Integer):Unit={this.KersetSize(`~value`)}
override def checkInvariants(stopOnError : Boolean){
val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ("size_positive" -> (()=>{


{
((this).Scalasize).isGreater(0)}
}
)) )
if(stopOnError)
  checkParamInvariants(invariants)
else
  checkParamInvariants(invariants, constraintDiagnostic)
}
override def checkAllInvariants(stopOnError : Boolean){
val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ("size_positive" -> (()=>{


{
((this).Scalasize).isGreater(0)}
}
)) )
if(stopOnError)
  checkParamInvariants(invariants)
else
  checkParamInvariants(invariants, constraintDiagnostic)
if(size!=null)
  size.checkAllInvariants(stopOnError)
}
override def getInvariants() :  scala.collection.immutable.HashMap[String,Condition] = {
val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ("size_positive" -> (()=>{


{
((this).Scalasize).isGreater(0)}
}
)) )
return invariants
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("mainPackage.Wheel"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

