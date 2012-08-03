package mainPackage
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait Car3Aspect  extends _root_.mainPackage.Car2Aspect with `_root_`.mainPackage.Car3{
var wheels : k2.standard.KermetaOrderedSet[_root_.mainPackage.Wheel] = k2.standard.KerRichFactory.createOrderedSet[_root_.mainPackage.Wheel]
def KergetWheels() : k2.standard.KermetaOrderedSet[_root_.mainPackage.Wheel]={this.wheels}
def KersetWheels(arg:k2.standard.KermetaOrderedSet[_root_.mainPackage.Wheel])={ this.wheels = arg}
def Scalawheels : k2.standard.KermetaOrderedSet[_root_.mainPackage.Wheel]={new k2.standard.RichReflectiveOrderedSet[mainPackage.Car3,_root_.mainPackage.Wheel](thisUpper = -1,value=this.KergetWheels())}
def Scalawheels_=(`~value` : k2.standard.KermetaOrderedSet[_root_.mainPackage.Wheel]):Unit={this.KergetWheels().clear
this.KergetWheels().addAll(`~value`)
}
override def checkInvariants(stopOnError : Boolean){
val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ("name_not_null_nor_empty" -> (()=>{


{
if (_root_.k2.utils.UTilScala.isNotEqual(((this).Scalaname),null))

{
_root_.k2.utils.UTilScala.isNotEqual(((this).Scalaname),"")}
else 


{
false}
}
}
)),("name_not_null" -> (()=>{


{
_root_.k2.utils.UTilScala.isNotEqual(((this).Scalaname),null)}
}
)) )
if(stopOnError)
  checkParamInvariants(invariants)
else
  checkParamInvariants(invariants, constraintDiagnostic)
}
override def checkAllInvariants(stopOnError : Boolean){
val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ("name_not_null_nor_empty" -> (()=>{


{
if (_root_.k2.utils.UTilScala.isNotEqual(((this).Scalaname),null))

{
_root_.k2.utils.UTilScala.isNotEqual(((this).Scalaname),"")}
else 


{
false}
}
}
)),("name_not_null" -> (()=>{


{
_root_.k2.utils.UTilScala.isNotEqual(((this).Scalaname),null)}
}
)) )
if(stopOnError)
  checkParamInvariants(invariants)
else
  checkParamInvariants(invariants, constraintDiagnostic)
}
override def getInvariants() :  scala.collection.immutable.HashMap[String,Condition] = {
val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ("name_not_null_nor_empty" -> (()=>{


{
if (_root_.k2.utils.UTilScala.isNotEqual(((this).Scalaname),null))

{
_root_.k2.utils.UTilScala.isNotEqual(((this).Scalaname),"")}
else 


{
false}
}
}
)),("name_not_null" -> (()=>{


{
_root_.k2.utils.UTilScala.isNotEqual(((this).Scalaname),null)}
}
)) )
return invariants
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("mainPackage.Car3"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

