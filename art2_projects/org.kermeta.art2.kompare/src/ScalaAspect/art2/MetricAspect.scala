package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait MetricAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.Metric{
def Scalamin : java.lang.String={this.getMin()}.asInstanceOf[java.lang.String]
def Scalamin_=(value : java.lang.String)={this.setMin(value)}
def ScalabestValue : java.lang.String={this.getBestValue()}.asInstanceOf[java.lang.String]
def ScalabestValue_=(value : java.lang.String)={this.setBestValue(value)}
def Scalamax : java.lang.String={this.getMax()}.asInstanceOf[java.lang.String]
def Scalamax_=(value : java.lang.String)={this.setMax(value)}
def Scalaname : java.lang.String={this.getName()}.asInstanceOf[java.lang.String]
def Scalaname_=(value : java.lang.String)={this.setName(value)}
def Scalavalue : java.lang.String={this.getValue()}.asInstanceOf[java.lang.String]
def Scalavalue_=(value : java.lang.String)={this.setValue(value)}
def Scalatype : java.lang.String={this.getType()}.asInstanceOf[java.lang.String]
def Scalatype_=(value : java.lang.String)={this.setType(value)}
def Scalaaverage : java.lang.String={this.getAverage()}.asInstanceOf[java.lang.String]
def Scalaaverage_=(value : java.lang.String)={this.setAverage(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.Metric"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

