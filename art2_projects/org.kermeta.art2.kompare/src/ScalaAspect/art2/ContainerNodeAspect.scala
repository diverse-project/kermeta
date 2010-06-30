package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ContainerNodeAspect extends ScalaAspect.art2.NamedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.ContainerNode{
def Scalacomponents : java.util.List[_root_.art2.ComponentInstance]={this.getComponents()}.asInstanceOf[java.util.List[_root_.art2.ComponentInstance]]
def Scalacomponents_=(value : java.util.List[_root_.art2.ComponentInstance])={this.getComponents().clear
this.getComponents().addAll(value)
}
var componentTypes : java.util.List[_root_.art2.ComponentType] = new java.util.ArrayList[_root_.art2.ComponentType]
def KergetComponentTypes() : java.util.List[_root_.art2.ComponentType]={this.componentTypes}
def KersetComponentTypes(arg:java.util.List[_root_.art2.ComponentType])={ this.componentTypes = arg}
def ScalacomponentTypes : java.util.List[_root_.art2.ComponentType]={var result : java.util.List[_root_.art2.ComponentType] = null.asInstanceOf[java.util.List[_root_.art2.ComponentType]]; 


{
var alreadyDeployComponentType : _root_.java.util.List[_root_.art2.ComponentType] = kermeta.standard.RichFactory.createOrderedSet[_root_.art2.ComponentType];
((this).Scalacomponents).each({(c)=>

{
if (((alreadyDeployComponentType).exists({(e)=>

{
((((c).ScalacomponentType).Scalaname) == ((e).Scalaname))}
})).not())

{
(alreadyDeployComponentType).addUnique((c).ScalacomponentType)}
}
})
result = alreadyDeployComponentType;}
() 
 return result
}.asInstanceOf[java.util.List[_root_.art2.ComponentType]]
def ScalacomponentTypes_=(value : java.util.List[_root_.art2.ComponentType])={}

    def isEquals(ct : _root_.art2.ContainerNode):java.lang.Boolean = {
var result : java.lang.Boolean = null.asInstanceOf[java.lang.Boolean]; 


{
if ((((ct).Scalaname) == ((this).Scalaname)))

{
result = true;}
else 


{
result = false;}
}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.ContainerNode"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

