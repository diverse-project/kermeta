package fr.irisa.triskell.kermeta.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait ClassAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect.ParameterizedTypeAspect with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.language.structure.Class{
def ScalaownedOperation : java.util.List[fr.irisa.triskell.kermeta.language.structure.Operation]={this.getOwnedOperation()}
def ScalasuperClass : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Class]={this.getSuperClass()}
def ScalaisAbstract : java.lang.Object={this.getIsAbstract()}
def Scalaname : java.lang.Object={this.getName()}
var classDefinition : fr.irisa.triskell.kermeta.scala.framework.language.structure.ClassDefinition= _
def KergetClassDefinition() : fr.irisa.triskell.kermeta.scala.framework.language.structure.ClassDefinition={this.classDefinition}
def ScalaclassDefinition : fr.irisa.triskell.kermeta.scala.framework.language.structure.ClassDefinition={this.KergetClassDefinition()}
def ScalaownedAttribute : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Property]={this.getOwnedAttribute()}

    override def clone(objectToClone : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object):fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = {
var result : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = null.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.Object]; 
{
result = /*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */;}
 return result
}

    override def deepClone(objectToClone : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object):fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = {
var result : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = null.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.Object]; 
{
result = /*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */;}
 return result
}

    def new():fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = {
var result : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = null.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.Object]; 
{
result = /*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */;}
 return result
}

    override def equals(other : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object):java.lang.Object = {
var result : java.lang.Object = null.asInstanceOf[java.lang.Object]; 
{
try{
result = /*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */.asInstanceOf[Boolean];
}catch { case e:ClassCastException => {}}
}
 return result
}

    override def toString():java.lang.Object = {
var result : java.lang.Object = null.asInstanceOf[java.lang.Object]; 
{
result = this.ScalatypeDefinition.Scalaname;}
 return result
}
}

