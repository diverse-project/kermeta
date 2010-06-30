package ScalaAspect.fr.irisa.triskell.kermeta.language.behavior
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait CallFeatureAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.CallExpressionAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.behavior.CallFeature{
def ScalastaticOperation : _root_.fr.irisa.triskell.kermeta.language.structure.Operation={this.getStaticOperation()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Operation]
def ScalastaticOperation_=(value : _root_.fr.irisa.triskell.kermeta.language.structure.Operation)={this.setStaticOperation(value)}
def ScalaisAtpre : java.lang.Boolean={this.isIsAtpre()}.asInstanceOf[java.lang.Boolean]
def ScalaisAtpre_=(value : java.lang.Boolean)={this.setIsAtpre(value)}
def Scalatarget : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression={this.getTarget()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.behavior.Expression]
def Scalatarget_=(value : _root_.fr.irisa.triskell.kermeta.language.behavior.Expression)={this.setTarget(value)}
def ScalastaticEnumLiteral : _root_.fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral={this.getStaticEnumLiteral()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral]
def ScalastaticEnumLiteral_=(value : _root_.fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral)={this.setStaticEnumLiteral(value)}
def ScalastaticProperty : _root_.fr.irisa.triskell.kermeta.language.structure.Property={this.getStaticProperty()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Property]
def ScalastaticProperty_=(value : _root_.fr.irisa.triskell.kermeta.language.structure.Property)={this.setStaticProperty(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.behavior.CallFeature"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

