package group.KermetaDoc.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait ModelAspect extends group.KermetaDoc.org.kermeta.language.structure.KermetaModelElementAspect with `_root_`.org.kermeta.language.structure.Model{
def Scalacontents : java.util.List[_root_.org.kermeta.language.structure.KermetaModelElement]={new RichKermetaList(this.getContents())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.structure.KermetaModelElement]]
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.Model"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

