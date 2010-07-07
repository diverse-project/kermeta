package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait PackageAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.NamedElementAspect with ScalaAspect.fr.irisa.triskell.kermeta.language.structure.TypeDefinitionContainerAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.Package{
def ScalanestingPackage : _root_.fr.irisa.triskell.kermeta.language.structure.Package={this.getNestingPackage()}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Package]
def ScalanestingPackage_=(value : _root_.fr.irisa.triskell.kermeta.language.structure.Package)={this.setNestingPackage(value)}
def ScalanestedPackage : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Package]={this.getNestedPackage()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Package]]
def ScalanestedPackage_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Package])={this.getNestedPackage().clear
this.getNestedPackage().addAll(value)
}
def Scalauri : java.lang.String={this.getUri()}.asInstanceOf[java.lang.String]
def Scalauri_=(value : java.lang.String)={this.setUri(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.Package"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

