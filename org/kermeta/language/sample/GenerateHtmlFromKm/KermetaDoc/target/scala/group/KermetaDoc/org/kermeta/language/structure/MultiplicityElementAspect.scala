package group.KermetaDoc.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait MultiplicityElementAspect extends group.KermetaDoc.org.kermeta.language.structure.TypedElementAspect with `_root_`.org.kermeta.language.structure.MultiplicityElement{
def ScalaisOrdered : _root_.java.lang.Boolean={this.getIsOrdered()}.asInstanceOf[_root_.java.lang.Boolean]
def ScalaisOrdered_=(value : _root_.java.lang.Boolean)={this.setIsOrdered(value)}
def ScalaisUnique : _root_.java.lang.Boolean={this.getIsUnique()}.asInstanceOf[_root_.java.lang.Boolean]
def ScalaisUnique_=(value : _root_.java.lang.Boolean)={this.setIsUnique(value)}
def Scalalower : _root_.java.lang.Integer={this.getLower()}.asInstanceOf[_root_.java.lang.Integer]
def Scalalower_=(value : _root_.java.lang.Integer)={this.setLower(value)}
def Scalaupper : _root_.java.lang.Integer={this.getUpper()}.asInstanceOf[_root_.java.lang.Integer]
def Scalaupper_=(value : _root_.java.lang.Integer)={this.setUpper(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.MultiplicityElement"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

