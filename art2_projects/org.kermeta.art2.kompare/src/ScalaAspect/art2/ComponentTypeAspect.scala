package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ComponentTypeAspect extends ScalaAspect.art2.DeployUnitAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.ComponentType{
def ScalaextraFonctionalProperties : _root_.art2.ExtraFonctionalProperty={this.getExtraFonctionalProperties()}.asInstanceOf[_root_.art2.ExtraFonctionalProperty]
def ScalaextraFonctionalProperties_=(value : _root_.art2.ExtraFonctionalProperty)={this.setExtraFonctionalProperties(value)}
def ScalastopMethod : java.lang.String={this.getStopMethod()}.asInstanceOf[java.lang.String]
def ScalastopMethod_=(value : java.lang.String)={this.setStopMethod(value)}
def ScalaintegrationPatterns : java.util.List[_root_.art2.IntegrationPattern]={this.getIntegrationPatterns()}.asInstanceOf[java.util.List[_root_.art2.IntegrationPattern]]
def ScalaintegrationPatterns_=(value : java.util.List[_root_.art2.IntegrationPattern])={this.getIntegrationPatterns().clear
this.getIntegrationPatterns().addAll(value)
}
def Scalabean : java.lang.String={this.getBean()}.asInstanceOf[java.lang.String]
def Scalabean_=(value : java.lang.String)={this.setBean(value)}
def Scalaprovided : java.util.List[_root_.art2.PortTypeRef]={this.getProvided()}.asInstanceOf[java.util.List[_root_.art2.PortTypeRef]]
def Scalaprovided_=(value : java.util.List[_root_.art2.PortTypeRef])={this.getProvided().clear
this.getProvided().addAll(value)
}
def ScalafactoryBean : java.lang.String={this.getFactoryBean()}.asInstanceOf[java.lang.String]
def ScalafactoryBean_=(value : java.lang.String)={this.setFactoryBean(value)}
def Scaladictionary : _root_.art2.DictionaryType={this.getDictionary()}.asInstanceOf[_root_.art2.DictionaryType]
def Scaladictionary_=(value : _root_.art2.DictionaryType)={this.setDictionary(value)}
def Scalarequired : java.util.List[_root_.art2.PortTypeRef]={this.getRequired()}.asInstanceOf[java.util.List[_root_.art2.PortTypeRef]]
def Scalarequired_=(value : java.util.List[_root_.art2.PortTypeRef])={this.getRequired().clear
this.getRequired().addAll(value)
}
def ScalastartMethod : java.lang.String={this.getStartMethod()}.asInstanceOf[java.lang.String]
def ScalastartMethod_=(value : java.lang.String)={this.setStartMethod(value)}

    def isEquals(ct : _root_.art2.ComponentType):java.lang.Boolean = {
var result : java.lang.Boolean = null.asInstanceOf[java.lang.Boolean]; 


{
if ((((ct).Scalaname) == ((this).Scalaname)))

{
result = true;}
else 


{
result = false;}
}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.ComponentType"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

