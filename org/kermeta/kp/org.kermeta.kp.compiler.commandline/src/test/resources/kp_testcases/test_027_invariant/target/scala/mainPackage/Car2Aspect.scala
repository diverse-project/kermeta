package mainPackage
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait Car2Aspect  extends _root_.mainPackage.CarAspect with `_root_`.mainPackage.Car2{
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
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("mainPackage.Car2"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

