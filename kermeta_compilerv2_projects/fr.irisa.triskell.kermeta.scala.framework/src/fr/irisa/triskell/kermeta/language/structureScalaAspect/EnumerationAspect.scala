package fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait EnumerationAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect.DataTypeAspect with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.scala.framework.language.structure.Enumeration{
def ScalaownedLiteral : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.EnumerationLiteral]={this.getOwnedLiteral()}
def ScalaownedLiteral_=(arg : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.EnumerationLiteral])={this.getOwnedLiteral().clear
this.getOwnedLiteral().addAll(arg)
}

    override def clone(objectToClone : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object):fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = {
var result : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = null.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.Object]; 
{
throw "NOT IMPLEMENTED"}
 return result
}
}

