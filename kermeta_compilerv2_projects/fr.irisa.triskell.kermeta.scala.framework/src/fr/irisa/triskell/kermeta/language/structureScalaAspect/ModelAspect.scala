package fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait ModelAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.scala.framework.language.structure.Model{
def Scalacontents : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Object]={this.getContents()}

    def addCompatible(objectToAdd : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object):fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = {
var result : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = null.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.Object]; 
{
Scalacontents
result = /*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */;}
 return result
}

    def remove(obj : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
/*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */}
 return result
}

    def addAllCompatible(objectsToAdd : java.util.List):java.util.List = {
var result : java.util.List = null.asInstanceOf[java.util.List]; 
{
result = kermeta.standard.RichFactory.createSet[fr.irisa.triskell.kermeta.scala.framework.language.structure.Object];
objectsToAdd.each({(obj)=>{
var addedObject : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = addCompatible(obj);
if (addedObject.isVoid().not()){
result.add(obj)}
}
})}
 return result
}

    def add(obj : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
Scalacontents
/*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */}
 return result
}

    def filter(typeName : fr.irisa.triskell.kermeta.scala.framework.language.structure.Type):java.util.List = {
var result : java.util.List = null.asInstanceOf[java.util.List]; 
{
result = Scalacontents.select({(o)=>{
typeName.isInstance(o)}
}).asSet();}
 return result
}
}

