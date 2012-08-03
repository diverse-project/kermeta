package mainPackage
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait CarAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.mainPackage.Car{
var name : _root_.java.lang.String= _
def KergetName() : _root_.java.lang.String={this.name}
def KersetName(arg:_root_.java.lang.String)={ this.name = arg}
def Scalaname : _root_.java.lang.String={this.KergetName().asInstanceOf[_root_.java.lang.String]}
def Scalaname_=(`~value` : _root_.java.lang.String):Unit={this.KersetName(`~value`)}
override def checkInvariants(stopOnError : Boolean){
val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ("name_not_null" -> (()=>{


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
val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ("name_not_null" -> (()=>{


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
val invariants : scala.collection.immutable.HashMap[String,Condition] = scala.collection.immutable.HashMap( ("name_not_null" -> (()=>{


{
_root_.k2.utils.UTilScala.isNotEqual(((this).Scalaname),null)}
}
)) )
return invariants
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("mainPackage.Car"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

