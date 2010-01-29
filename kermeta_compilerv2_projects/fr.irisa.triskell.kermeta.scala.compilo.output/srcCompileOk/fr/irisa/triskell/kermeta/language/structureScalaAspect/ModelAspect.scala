package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait ModelAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.Model{
def Scalacontents : java.util.List[fr.irisa.triskell.kermeta.language.structure.Object]={this.getContents()}

    def filter(typeName : fr.irisa.triskell.kermeta.language.structure.Type):java.util.List[fr.irisa.triskell.kermeta.language.structure.Object] = {
var result : java.util.List[fr.irisa.triskell.kermeta.language.structure.Object] = null.asInstanceOf[java.util.List[fr.irisa.triskell.kermeta.language.structure.Object]]; 


{
result = Scalacontents.select({(o)=>

{
	true
}
}).asSet();}
 return result
}
}

