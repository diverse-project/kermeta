package mainPackage
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
trait MainClassAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.mainPackage.MainClass{

    def mainOperation():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
 /*try*/ { 


{
var car : _root_.mainPackage.Car3 = _root_.mainPackage.KerRichFactory.createCar3;
var wheel : _root_.mainPackage.Wheel = _root_.mainPackage.KerRichFactory.createWheel;
(wheel).Scalasize = (2).asInstanceOf[_root_.java.lang.Integer];
((car).Scalawheels).add(wheel)
wheel = (_root_.mainPackage.KerRichFactory.createWheel).asInstanceOf[_root_.mainPackage.Wheel];
(wheel).Scalasize = ((1).uminus()).asInstanceOf[_root_.java.lang.Integer];
((car).Scalawheels).add(wheel)
wheel = (_root_.mainPackage.KerRichFactory.createWheel).asInstanceOf[_root_.mainPackage.Wheel];
(wheel).Scalasize = (0).asInstanceOf[_root_.java.lang.Integer];
((car).Scalawheels).add(wheel)
(car).checkAllInvariants(false)


try {
 (car).checkAllInvariants() 
} catch {
 case e:_root_.k2.exceptions.ConstraintViolatedInv => {(_root_.k2.io.StdIO).writeln((e).Scalamessage)
}
 }
}
        }
/*catch {
case e :_root_.k2.exceptions.Exception => {throw e}
  case e => {
    val tutu18 = _root_.k2.exceptions.KerRichFactory.createException;
  	tutu18.message = "error in kermeta code on operation mainPackage.MainClass.mainOperation"
  	  tutu18.setStackTrace(e.getStackTrace)
  	  throw tutu18
  }
}*/
 return `~result`
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("mainPackage.MainClass"); 
         if (cd !=null){ 
 var cl = _root_.my.group.Test_027_invariant.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

