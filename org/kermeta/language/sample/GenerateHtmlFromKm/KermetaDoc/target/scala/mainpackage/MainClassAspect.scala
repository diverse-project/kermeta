package mainpackage
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait MainClassAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.mainpackage.MainClass{

    def mainOperation():Unit = {
var result : _root_.k2.standard.Void = null.asInstanceOf[_root_.k2.standard.Void]; 
 try { 


{
}
        }
catch {
  case e :_root_.k2.exceptions.Exception => {throw e}
  case e :_root_.java.lang.NullPointerException=> {
    val tutu18 = k2.exceptions.KerRichFactory.createCallOnVoidTarget;
    tutu18.message = "CallOnVoidTarget in kermeta code on operation mainpackage.MainClass.mainOperation"
    tutu18.setStackTrace(e.getStackTrace)
    tutu18.initCause(e)
    throw tutu18
  }
  case e => {
    val tutu18 = k2.exceptions.KerRichFactory.createException;
    tutu18.message = "error in kermeta code on operation mainpackage.MainClass.mainOperation"
    tutu18.setStackTrace(e.getStackTrace)
    tutu18.initCause(e)
    throw tutu18
  }
}
 
}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("mainpackage.MainClass"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

