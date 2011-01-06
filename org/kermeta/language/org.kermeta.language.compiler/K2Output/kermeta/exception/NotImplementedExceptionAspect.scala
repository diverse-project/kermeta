package kermeta.exception
import _root_.kermeta.io._
import _root_.kermeta.standard._
import _root_.kermeta.standard.JavaConversions._
import _root_.kermeta.standard.PrimitiveConversion._
import _root_.kermeta.kunit.KunitConversions._
import _root_.ScalaImplicit.generated.ImplicitConversion._
trait NotImplementedExceptionAspect with `_root_`{
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   _root_.kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.exception.NotImplementedException"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

