package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait MultiplicityElementAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.TypedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.MultiplicityElement{
def ScalaisOrdered : java.lang.Boolean={this.isIsOrdered()}.asInstanceOf[java.lang.Boolean]
def ScalaisOrdered_=(value : java.lang.Boolean)={this.setIsOrdered(value)}
def Scalaupper : Int={this.getUpper()}.asInstanceOf[Int]
def Scalaupper_=(value : Int)={this.setUpper(value)}
def Scalalower : Int={this.getLower()}.asInstanceOf[Int]
def Scalalower_=(value : Int)={this.setLower(value)}
def ScalaisUnique : java.lang.Boolean={this.isIsUnique()}.asInstanceOf[java.lang.Boolean]
def ScalaisUnique_=(value : java.lang.Boolean)={this.setIsUnique(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.MultiplicityElement"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

