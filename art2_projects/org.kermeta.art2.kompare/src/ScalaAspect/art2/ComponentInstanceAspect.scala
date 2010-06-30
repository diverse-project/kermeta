package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ComponentInstanceAspect extends ScalaAspect.art2.NamedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.ComponentInstance{
def Scalametrics : java.util.List[_root_.art2.Metric]={this.getMetrics()}.asInstanceOf[java.util.List[_root_.art2.Metric]]
def Scalametrics_=(value : java.util.List[_root_.art2.Metric])={this.getMetrics().clear
this.getMetrics().addAll(value)
}
def Scalaprovided : java.util.List[_root_.art2.Port]={this.getProvided()}.asInstanceOf[java.util.List[_root_.art2.Port]]
def Scalaprovided_=(value : java.util.List[_root_.art2.Port])={this.getProvided().clear
this.getProvided().addAll(value)
}
def Scaladictionary : _root_.art2.Dictionary={this.getDictionary()}.asInstanceOf[_root_.art2.Dictionary]
def Scaladictionary_=(value : _root_.art2.Dictionary)={this.setDictionary(value)}
def Scalarequired : java.util.List[_root_.art2.Port]={this.getRequired()}.asInstanceOf[java.util.List[_root_.art2.Port]]
def Scalarequired_=(value : java.util.List[_root_.art2.Port])={this.getRequired().clear
this.getRequired().addAll(value)
}
def ScalacomponentType : _root_.art2.ComponentType={this.getComponentType()}.asInstanceOf[_root_.art2.ComponentType]
def ScalacomponentType_=(value : _root_.art2.ComponentType)={this.setComponentType(value)}
def Scalanamespace : _root_.art2.Namespace={this.getNamespace()}.asInstanceOf[_root_.art2.Namespace]
def Scalanamespace_=(value : _root_.art2.Namespace)={this.setNamespace(value)}

    def isEquals(ct : _root_.art2.ComponentInstance):java.lang.Boolean = {
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

    def isUpdated(ct : _root_.art2.ComponentInstance):java.lang.Boolean = {
var result : java.lang.Boolean = null.asInstanceOf[java.lang.Boolean]; 


{
result = false;
if (((((ct).Scalarequired).size()) == (((this).Scalarequired).size())))

{
result = ((Scalarequired).forAll({(p)=>

{
((ct).Scalarequired).exists({(p2)=>

{
(p2).isEquals(p)}
})}
})).not();}
else 


{
result = true;}

if ((result).not())

{
if (((((ct).Scalaprovided).size()) == (((this).Scalaprovided).size())))

{
result = ((Scalaprovided).forAll({(p)=>

{
((ct).Scalaprovided).exists({(p2)=>

{
(p2).isEquals(p)}
})}
})).not();}
else 


{
result = true;}
}

if ((result).not())

{
var neededBindingRuntime : _root_.java.util.List[_root_.art2.Binding] = kermeta.standard.RichFactory.createOrderedSet[_root_.art2.Binding];
(((((this).container()).container()).asInstanceOf[_root_.art2.ContainerRoot]).Scalabindings).each({(b)=>

{
((b).Scalaports).each({(p)=>

{
((this).Scalarequired).each({(np)=>

{
if ((np).isEquals(p))

{
(neededBindingRuntime).addUnique(b)}
}
})}
})}
})
var neededBindingUpdate : _root_.java.util.List[_root_.art2.Binding] = kermeta.standard.RichFactory.createOrderedSet[_root_.art2.Binding];
(((((this).container()).container()).asInstanceOf[_root_.art2.ContainerRoot]).Scalabindings).each({(b)=>

{
((b).Scalaports).each({(p)=>

{
((this).Scalarequired).each({(np)=>

{
if ((np).isEquals(p))

{
(neededBindingUpdate).addUnique(b)}
}
})}
})}
})
if ((((neededBindingRuntime).size()) == ((neededBindingUpdate).size())))

{
(neededBindingRuntime).each({(b)=>

{
if (((neededBindingUpdate).exists({(b2)=>

{
(b).isEquals(b2)}
})).not())

{
result = true;}
}
})}
else 


{
result = true;}
}
}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.ComponentInstance"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

