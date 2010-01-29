package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait ModelingUnitAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.ModelingUnit{
def Scalausings : java.util.List[fr.irisa.triskell.kermeta.language.structure.Using]={this.getUsings()}
def Scalausings_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Using])={this.getUsings().clear
this.getUsings().addAll(arg)
}
def Scalapackages : java.util.List[fr.irisa.triskell.kermeta.language.structure.Package]={this.getPackages()}
def Scalapackages_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Package])={this.getPackages().clear
this.getPackages().addAll(arg)
}
def ScalaincludeFilters : java.util.List[fr.irisa.triskell.kermeta.language.structure.Filter]={this.getIncludeFilters()}
def ScalaincludeFilters_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Filter])={this.getIncludeFilters().clear
this.getIncludeFilters().addAll(arg)
}
def ScalaexcludeFilters : java.util.List[fr.irisa.triskell.kermeta.language.structure.Filter]={this.getExcludeFilters()}
def ScalaexcludeFilters_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Filter])={this.getExcludeFilters().clear
this.getExcludeFilters().addAll(arg)
}
def ScalareferencedModelingUnits : java.util.List[fr.irisa.triskell.kermeta.language.structure.ModelingUnit]={this.getReferencedModelingUnits()}
def ScalareferencedModelingUnits_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.ModelingUnit])={this.getReferencedModelingUnits().clear
this.getReferencedModelingUnits().addAll(arg)
}
def Scalarequires : java.util.List[fr.irisa.triskell.kermeta.language.structure.Require]={this.getRequires()}
def Scalarequires_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Require])={this.getRequires().clear
this.getRequires().addAll(arg)
}
}

