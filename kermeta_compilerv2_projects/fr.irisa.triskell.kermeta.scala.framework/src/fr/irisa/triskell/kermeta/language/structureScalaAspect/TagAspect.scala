package fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait TagAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.scala.framework.language.structure.Tag{
def Scalaname : java.lang.Object={this.getName()}
def Scalaname_=(arg : java.lang.Object)={this.setName(arg)}
def Scalavalue : java.lang.Object={this.getValue()}
def Scalavalue_=(arg : java.lang.Object)={this.setValue(arg)}
def Scalaobject : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Object]={this.getObject()}
def Scalaobject_=(arg : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Object])={this.getObject().clear
this.getObject().addAll(arg)
}
}

