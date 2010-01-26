package fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait ModelTypeAspect extends fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect.TypeAspect with fr.irisa.triskell.kermeta.scala.framework.language.structure.TypeDefinition with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.scala.framework.language.structure.ModelType{
def ScalaincludedTypeDefinition : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.TypeDefinition]={this.getIncludedTypeDefinition()}
def ScalaincludedTypeDefinition_=(arg : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.TypeDefinition])={this.getIncludedTypeDefinition().clear
this.getIncludedTypeDefinition().addAll(arg)
}

    def new():fr.irisa.triskell.kermeta.scala.framework.language.structure.Model = {
var result : fr.irisa.triskell.kermeta.scala.framework.language.structure.Model = null.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.Model]; 
{
try{
result = /*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.Model];
}catch { case e:ClassCastException => {}}
}
 return result
}

    def isModelTypeOf(m : fr.irisa.triskell.kermeta.scala.framework.language.structure.Model):java.lang.Object = {
var result : java.lang.Object = null.asInstanceOf[java.lang.Object]; 
{
try{
result = /*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */.asInstanceOf[Boolean];
}catch { case e:ClassCastException => {}}
}
 return result
}
}

