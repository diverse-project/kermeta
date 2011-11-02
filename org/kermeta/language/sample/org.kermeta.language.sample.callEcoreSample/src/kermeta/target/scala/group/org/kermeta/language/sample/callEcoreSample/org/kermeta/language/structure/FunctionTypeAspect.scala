package group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.org.kermeta.language.sample.callEcoreSample.ImplicitConversion._
trait FunctionTypeAspect extends group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.TypeContainerAspect with group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.TypeAspect with `_root_`.org.kermeta.language.structure.FunctionType{
def Scalaleft : _root_.org.kermeta.language.structure.Type={this.getLeft()}.asInstanceOf[_root_.org.kermeta.language.structure.Type]
def Scalaleft_=(value : _root_.org.kermeta.language.structure.Type)={this.setLeft(value)}
def Scalaright : _root_.org.kermeta.language.structure.Type={this.getRight()}.asInstanceOf[_root_.org.kermeta.language.structure.Type]
def Scalaright_=(value : _root_.org.kermeta.language.structure.Type)={this.setRight(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.FunctionType"); 
         if (cd !=null){ 
 var cl = group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

