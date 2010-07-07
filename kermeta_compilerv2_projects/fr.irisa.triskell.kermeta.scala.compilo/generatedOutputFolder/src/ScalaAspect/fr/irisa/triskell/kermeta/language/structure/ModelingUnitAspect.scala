package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ModelingUnitAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.ModelingUnit{
def Scalausings : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Using]={this.getUsings()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Using]]
def Scalausings_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Using])={this.getUsings().clear
this.getUsings().addAll(value)
}
def ScalaincludeFilters : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Filter]={this.getIncludeFilters()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Filter]]
def ScalaincludeFilters_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Filter])={this.getIncludeFilters().clear
this.getIncludeFilters().addAll(value)
}
def Scalapackages : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Package]={this.getPackages()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Package]]
def Scalapackages_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Package])={this.getPackages().clear
this.getPackages().addAll(value)
}
def ScalaexcludeFilters : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Filter]={this.getExcludeFilters()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Filter]]
def ScalaexcludeFilters_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Filter])={this.getExcludeFilters().clear
this.getExcludeFilters().addAll(value)
}
def ScalareferencedModelingUnits : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.ModelingUnit]={this.getReferencedModelingUnits()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.ModelingUnit]]
def ScalareferencedModelingUnits_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.ModelingUnit])={this.getReferencedModelingUnits().clear
this.getReferencedModelingUnits().addAll(value)
}
def Scalarequires : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Require]={this.getRequires()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Require]]
def Scalarequires_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Require])={this.getRequires().clear
this.getRequires().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.ModelingUnit"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

