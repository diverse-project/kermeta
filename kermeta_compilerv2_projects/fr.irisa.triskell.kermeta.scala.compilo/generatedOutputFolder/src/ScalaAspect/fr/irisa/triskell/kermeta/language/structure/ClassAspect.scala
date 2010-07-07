package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ClassAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ParameterizedTypeAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.Class{
def ScalaownedOperation : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Operation]={var result : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Operation] = null.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Operation]]; 


{
var cDef : _root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition = null.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition];
try{
cDef = ScalatypeDefinition.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition];
}catch { case e:ClassCastException => {}}

result = (cDef).ScalaownedOperation;}
() 
 return result
}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Operation]]
def ScalasuperClass : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Class]={var result : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Class] = null.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Class]]; 


{
var cDef : _root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition = null.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition];
try{
cDef = ScalatypeDefinition.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition];
}catch { case e:ClassCastException => {}}

var supertypes : _root_.java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Class] = kermeta.standard.RichFactory.createOrderedSet[_root_.fr.irisa.triskell.kermeta.language.structure.Class];
((cDef).ScalasuperType).each({(elem)=>

{
if (elem.isInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Class])

{
var c : _root_.fr.irisa.triskell.kermeta.language.structure.Class = null.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Class];
try{
c = elem.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.Class];
}catch { case e:ClassCastException => {}}

(supertypes).addUnique(c)}
}
})
result = supertypes;}
() 
 return result
}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Class]]
def ScalaisAbstract : java.lang.Boolean={var result : java.lang.Boolean = null.asInstanceOf[java.lang.Boolean]; 


{
var cDef : _root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition = null.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition];
try{
cDef = ScalatypeDefinition.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition];
}catch { case e:ClassCastException => {}}

result = (cDef).ScalaisAbstract;}
() 
 return result
}.asInstanceOf[java.lang.Boolean]
def Scalaname : java.lang.String={var result : java.lang.String = null.asInstanceOf[java.lang.String]; 


{
result = (ScalatypeDefinition).Scalaname;}
() 
 return result
}.asInstanceOf[java.lang.String]
var classDefinition : _root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition= _
def KergetClassDefinition() : _root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition={this.classDefinition}
def ScalaclassDefinition : _root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition={var result : _root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition = null.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition]; 


{
try{
result = ScalatypeDefinition.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition];
}catch { case e:ClassCastException => {}}
}
() 
 return result
}.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition]
def ScalaownedAttribute : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property]={var result : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property] = null.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property]]; 


{
var cDef : _root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition = null.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition];
try{
cDef = ScalatypeDefinition.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.ClassDefinition];
}catch { case e:ClassCastException => {}}

result = (cDef).ScalaownedAttribute;}
() 
 return result
}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Property]]

    override def toString():java.lang.String = {
var result : java.lang.String = null.asInstanceOf[java.lang.String]; 


{
result = ((this).ScalatypeDefinition).Scalaname;}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.Class"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

