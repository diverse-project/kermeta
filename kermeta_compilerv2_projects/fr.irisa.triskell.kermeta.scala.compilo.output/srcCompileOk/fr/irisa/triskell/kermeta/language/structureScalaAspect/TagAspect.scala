package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait TagAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.Tag{
def Scalaname : java.lang.String={this.getName()}
def Scalaname_=(arg : java.lang.String)={this.setName(arg)}
def Scalavalue : java.lang.String={this.getValue()}
def Scalavalue_=(arg : java.lang.String)={this.setValue(arg)}
def Scalaobject : java.util.List[fr.irisa.triskell.kermeta.language.structure.Object]={this.getObject()}
def Scalaobject_=(arg : java.util.List[fr.irisa.triskell.kermeta.language.structure.Object])={this.getObject().clear
this.getObject().addAll(arg)
}
}

