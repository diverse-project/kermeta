package fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait TypeAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.scala.framework.language.structure.Type{
def ScalatypeContainer : fr.irisa.triskell.kermeta.scala.framework.language.structure.TypeContainer={this.getTypeContainer()}
def ScalatypeContainer_=(arg : fr.irisa.triskell.kermeta.scala.framework.language.structure.TypeContainer)={this.setTypeContainer(arg)}

    def clone(objectToClone : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object):fr.irisa.triskell.kermeta.scala.framework.language.structure.Object
    def deepClone(objectToClone : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object):fr.irisa.triskell.kermeta.scala.framework.language.structure.Object
    def isInstance(element : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object):java.lang.Object = {
var result : java.lang.Object = null.asInstanceOf[java.lang.Object]; 
{
result = element.isInstanceOf[this];}
 return result
}

    def isSuperTypeOf(`object` : fr.irisa.triskell.kermeta.scala.framework.language.structure.Type):java.lang.Object = {
var result : java.lang.Object = null.asInstanceOf[java.lang.Object]; 
{
try{
result = /*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */.asInstanceOf[Boolean];
}catch { case e:ClassCastException => {}}
}
 return result
}

    def isSubTypeOf(`object` : fr.irisa.triskell.kermeta.scala.framework.language.structure.Type):java.lang.Object = {
var result : java.lang.Object = null.asInstanceOf[java.lang.Object]; 
{
result = `object`.isSuperTypeOf(this);}
 return result
}
}

