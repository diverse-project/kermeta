package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait PropertyConstraintAspect  extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ConstraintAspect with ScalaAspect.fr.irisa.triskell.kermeta.language.structure.PropertyConstraint{
var property : _root_.fr.irisa.triskell.kermeta.language.structure.Property= _
def KergetProperty() : _root_.fr.irisa.triskell.kermeta.language.structure.Property={this.property}
def KersetProperty(arg:_root_.fr.irisa.triskell.kermeta.language.structure.Property)={ this.property = arg}
def Scalaproperty : _root_.fr.irisa.triskell.kermeta.language.structure.Property={this.KergetProperty()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Property]
def Scalaproperty_=(value : _root_.fr.irisa.triskell.kermeta.language.structure.Property)={this.KersetProperty(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.PropertyConstraint"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

