package fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait FunctionTypeAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect.TypeContainerAspect with fr.irisa.triskell.kermeta.scala.framework.language.structure.Type with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.scala.framework.language.structure.FunctionType{
def Scalaleft : fr.irisa.triskell.kermeta.scala.framework.language.structure.Type={this.getLeft()}
def Scalaleft_=(arg : fr.irisa.triskell.kermeta.scala.framework.language.structure.Type)={this.setLeft(arg)}
def Scalaright : fr.irisa.triskell.kermeta.scala.framework.language.structure.Type={this.getRight()}
def Scalaright_=(arg : fr.irisa.triskell.kermeta.scala.framework.language.structure.Type)={this.setRight(arg)}
}

