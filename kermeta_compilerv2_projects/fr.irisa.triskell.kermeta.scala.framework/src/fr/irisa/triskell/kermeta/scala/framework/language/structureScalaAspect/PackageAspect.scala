package fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait PackageAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect.NamedElementAspect with fr.irisa.triskell.kermeta.scala.framework.language.structure.TypeDefinitionContainer with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.scala.framework.language.structure.Package{
def ScalanestingPackage : fr.irisa.triskell.kermeta.scala.framework.language.structure.Package={this.getNestingPackage()}
def ScalanestingPackage_=(arg : fr.irisa.triskell.kermeta.scala.framework.language.structure.Package)={this.setNestingPackage(arg)}
def ScalanestedPackage : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Package]={this.getNestedPackage()}
def ScalanestedPackage_=(arg : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Package])={this.getNestedPackage().clear
this.getNestedPackage().addAll(arg)
}
def Scalauri : java.lang.Object={this.getUri()}
def Scalauri_=(arg : java.lang.Object)={this.setUri(arg)}
}

