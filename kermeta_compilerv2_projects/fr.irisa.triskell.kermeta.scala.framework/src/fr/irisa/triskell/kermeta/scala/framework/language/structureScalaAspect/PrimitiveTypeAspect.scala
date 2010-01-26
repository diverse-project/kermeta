package fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait PrimitiveTypeAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect.DataTypeAspect with fr.irisa.triskell.kermeta.scala.framework.language.structure.TypeContainer with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.scala.framework.language.structure.PrimitiveType{
def ScalainstanceType : fr.irisa.triskell.kermeta.scala.framework.language.structure.Type={this.getInstanceType()}
def ScalainstanceType_=(arg : fr.irisa.triskell.kermeta.scala.framework.language.structure.Type)={this.setInstanceType(arg)}
}

