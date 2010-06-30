package org.kermeta.komparator
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait KomparatorAspect  extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with org.kermeta.komparator.Komparator{

    def kompare(runtimeModel : _root_.art2.ContainerRoot, updateModel : _root_.art2.ContainerRoot, deployNodeName : _root_.java.lang.String, factory : _root_.org.kermeta.art.deployer.AbtractCommandFactory):_root_.java.util.List[_root_.org.kermeta.art.deployer.Command] = {
var result : _root_.java.util.List[_root_.org.kermeta.art.deployer.Command] = null.asInstanceOf[_root_.java.util.List[_root_.org.kermeta.art.deployer.Command]]; 


{
result = kermeta.standard.RichFactory.createOrderedSet[_root_.org.kermeta.art.deployer.Command];
if (kermeta.standard.RichFactory.isVoid((runtimeModel)))

{
if (kermeta.standard.RichFactory.isVoid((updateModel)))

{
(stdio).writeln("KOMPARATOR INFO : Both input model are void , nothing to do")}
else 


{
((updateModel).Scalanodes).each({(node)=>

{
if ((((node).Scalaname) == (deployNodeName)))

{
(result).addAllUnique(initNode(node, factory))}
}
})}
}
else 


{
var actualRuntimeLocalNode : _root_.art2.ContainerNode = ((runtimeModel).Scalanodes).detect({(c)=>

{
(((c).Scalaname) == (deployNodeName))}
});
var actualUpdateLocalNode : _root_.art2.ContainerNode = ((updateModel).Scalanodes).detect({(c)=>

{
(((c).Scalaname) == (deployNodeName))}
});
if (((((actualRuntimeLocalNode) == (null)))).and((actualUpdateLocalNode) != (null)))

{
(result).addAllUnique(initNode(actualUpdateLocalNode, factory))}

if ((((actualRuntimeLocalNode) != (null))).and((actualUpdateLocalNode) != (null)))

{
(result).addAllUnique(updateNode(actualRuntimeLocalNode, actualUpdateLocalNode, factory))}
}
}
 return result
}

    def updateNode(runtimeNode : _root_.art2.ContainerNode, updateNode : _root_.art2.ContainerNode, factory : _root_.org.kermeta.art.deployer.AbtractCommandFactory):_root_.java.util.List[_root_.org.kermeta.art.deployer.Command] = {
var result : _root_.java.util.List[_root_.org.kermeta.art.deployer.Command] = null.asInstanceOf[_root_.java.util.List[_root_.org.kermeta.art.deployer.Command]]; 


{
result = kermeta.standard.RichFactory.createOrderedSet[_root_.org.kermeta.art.deployer.Command];
(stdio).writeln(("DEBUG : UPDATE NODE : ").plus((updateNode).Scalaname))
var runtimeComponentType : _root_.java.util.List[_root_.art2.ComponentType] = kermeta.standard.RichFactory.createSet[_root_.art2.ComponentType];
var alreadyTestedUpdateComponentType : _root_.java.util.List[_root_.art2.ComponentType] = kermeta.standard.RichFactory.createSet[_root_.art2.ComponentType];
((runtimeNode).ScalacomponentTypes).each({(rct)=>

{
var similarComponentType : _root_.art2.ComponentType = ((updateNode).ScalacomponentTypes).detect({(uct)=>

{
(uct).isEquals(rct)}
});
if (((similarComponentType) == (null)))

{
(result).addUnique((factory).createCommandRemoveComponentType(rct))}
}
})
((updateNode).ScalacomponentTypes).each({(uct)=>

{
var similarComponentType : _root_.art2.ComponentType = ((runtimeNode).ScalacomponentTypes).detect({(rct)=>

{
(rct).isEquals(uct)}
});
if (((similarComponentType) == (null)))

{
(result).addUnique((factory).createCommandAddComponentType(uct))}
}
})
((runtimeNode).Scalacomponents).each({(rc)=>

{
var similarComponent : _root_.art2.ComponentInstance = ((updateNode).Scalacomponents).detect({(uc)=>

{
(uc).isEquals(rc)}
});
if (((similarComponent) == (null)))

{
(result).addUnique((factory).createCommandRemoveComponentInstance(rc))}
else 


{
if ((rc).isUpdated(similarComponent))

{
(result).addUnique((factory).createCommandUpdateComponentInstance(similarComponent))}
}
}
})
((updateNode).Scalacomponents).each({(uc)=>

{
var similarComponent : _root_.art2.ComponentInstance = ((runtimeNode).Scalacomponents).detect({(rc)=>

{
(rc).isEquals(uc)}
});
if (((similarComponent) == (null)))

{
(result).addUnique((factory).createCommandAddComponentInstance(uc))}
}
})}
 return result
}

    def initNode(node : _root_.art2.ContainerNode, factory : _root_.org.kermeta.art.deployer.AbtractCommandFactory):_root_.java.util.List[_root_.org.kermeta.art.deployer.Command] = {
var result : _root_.java.util.List[_root_.org.kermeta.art.deployer.Command] = null.asInstanceOf[_root_.java.util.List[_root_.org.kermeta.art.deployer.Command]]; 


{
result = kermeta.standard.RichFactory.createOrderedSet[_root_.org.kermeta.art.deployer.Command];
(stdio).writeln(("DEBUG : INIT NODE : ").plus((node).Scalaname))
var alreadyDeployComponentType : _root_.java.util.List[_root_.art2.ComponentType] = kermeta.standard.RichFactory.createSet[_root_.art2.ComponentType];
((node).Scalacomponents).each({(c)=>

{
var ct : _root_.art2.ComponentType = (c).ScalacomponentType;
if (((alreadyDeployComponentType).exists({(e)=>

{
(((ct).Scalaname) == ((e).Scalaname))}
})).not())

{
(stdio).writeln(("DEBUG : PROCESS ").plus((ct).Scalaname))
(alreadyDeployComponentType).addUnique(ct)
(result).addUnique((factory).createCommandAddComponentType(ct))}
}
})
((node).Scalacomponents).each({(c)=>

{
(result).addUnique((factory).createCommandAddComponentInstance(c))}
})}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("org.kermeta.komparator.Komparator"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

