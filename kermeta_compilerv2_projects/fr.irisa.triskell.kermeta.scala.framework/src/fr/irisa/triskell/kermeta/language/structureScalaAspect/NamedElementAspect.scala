package fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait NamedElementAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.scala.framework.language.structure.NamedElement{
def Scalaname : java.lang.Object={this.getName()}
def Scalaname_=(arg : java.lang.Object)={this.setName(arg)}

    def qualifiedName():java.lang.Object = {
var result : java.lang.Object = null.asInstanceOf[java.lang.Object]; 
{
var elem : fr.irisa.triskell.kermeta.scala.framework.language.structure.NamedElement = this;
result = this.Scalaname;
if (elem.container().isInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.NamedElement]){
try{
elem = elem.container().asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.NamedElement];
}catch { case e:ClassCastException => {}}

while (!(elem.equals(null)))
{
result = elem.Scalaname.plus("::").plus(result);
if (elem.container().isInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.NamedElement]){
try{
elem = elem.container().asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.NamedElement];
}catch { case e:ClassCastException => {}}
}
else 
{
elem = null.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.NamedElement];}
}
}
}
 return result
}
}

