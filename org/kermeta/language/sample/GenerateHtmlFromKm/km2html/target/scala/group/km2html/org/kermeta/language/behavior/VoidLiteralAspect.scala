package group.km2html.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.km2html.ImplicitConversion._
trait VoidLiteralAspect extends group.km2html.org.kermeta.language.behavior.LiteralAspect with `_root_`.org.kermeta.language.behavior.VoidLiteral{
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.VoidLiteral"); 
         if (cd !=null){ 
 var cl = group.km2html.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

