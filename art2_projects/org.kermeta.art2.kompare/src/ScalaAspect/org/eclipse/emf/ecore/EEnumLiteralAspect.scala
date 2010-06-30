package ScalaAspect.org.eclipse.emf.ecore
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait EEnumLiteralAspect extends ScalaAspect.org.eclipse.emf.ecore.ENamedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with org.eclipse.emf.ecore.EEnumLiteral{
def ScalaeEnum : _root_.org.eclipse.emf.ecore.EEnum={this.getEEnum()}.asInstanceOf[_root_.org.eclipse.emf.ecore.EEnum]
def Scalavalue : Int={this.getValue()}.asInstanceOf[Int]
def Scalavalue_=(value : Int)={this.setValue(value)}
def Scalainstance : org.eclipse.emf.common.util.Enumerator={this.getInstance()}.asInstanceOf[org.eclipse.emf.common.util.Enumerator]
def Scalainstance_=(value : org.eclipse.emf.common.util.Enumerator)={this.setInstance(value)}
def Scalaliteral : java.lang.String={this.getLiteral()}.asInstanceOf[java.lang.String]
def Scalaliteral_=(value : java.lang.String)={this.setLiteral(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("ecore.EEnumLiteral"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

