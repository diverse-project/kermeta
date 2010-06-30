package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ContainerRootAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.ContainerRoot{
def ScalamBindings : java.util.List[_root_.art2.MBinding]={this.getMBindings()}.asInstanceOf[java.util.List[_root_.art2.MBinding]]
def ScalamBindings_=(value : java.util.List[_root_.art2.MBinding])={this.getMBindings().clear
this.getMBindings().addAll(value)
}
def Scalalibrariy : java.util.List[_root_.art2.ComponentTypeLibrary]={this.getLibrariy()}.asInstanceOf[java.util.List[_root_.art2.ComponentTypeLibrary]]
def Scalalibrariy_=(value : java.util.List[_root_.art2.ComponentTypeLibrary])={this.getLibrariy().clear
this.getLibrariy().addAll(value)
}
def Scalarepositories : java.util.List[_root_.art2.Repository]={this.getRepositories()}.asInstanceOf[java.util.List[_root_.art2.Repository]]
def Scalarepositories_=(value : java.util.List[_root_.art2.Repository])={this.getRepositories().clear
this.getRepositories().addAll(value)
}
def Scalanodes : java.util.List[_root_.art2.ContainerNode]={this.getNodes()}.asInstanceOf[java.util.List[_root_.art2.ContainerNode]]
def Scalanodes_=(value : java.util.List[_root_.art2.ContainerNode])={this.getNodes().clear
this.getNodes().addAll(value)
}
def Scalabindings : java.util.List[_root_.art2.Binding]={this.getBindings()}.asInstanceOf[java.util.List[_root_.art2.Binding]]
def Scalabindings_=(value : java.util.List[_root_.art2.Binding])={this.getBindings().clear
this.getBindings().addAll(value)
}
def ScalaportTypes : java.util.List[_root_.art2.PortType]={this.getPortTypes()}.asInstanceOf[java.util.List[_root_.art2.PortType]]
def ScalaportTypes_=(value : java.util.List[_root_.art2.PortType])={this.getPortTypes().clear
this.getPortTypes().addAll(value)
}
def ScaladataTypes : java.util.List[_root_.art2.TypedElement]={this.getDataTypes()}.asInstanceOf[java.util.List[_root_.art2.TypedElement]]
def ScaladataTypes_=(value : java.util.List[_root_.art2.TypedElement])={this.getDataTypes().clear
this.getDataTypes().addAll(value)
}
def ScalacomponentTypes : java.util.List[_root_.art2.ComponentType]={this.getComponentTypes()}.asInstanceOf[java.util.List[_root_.art2.ComponentType]]
def ScalacomponentTypes_=(value : java.util.List[_root_.art2.ComponentType])={this.getComponentTypes().clear
this.getComponentTypes().addAll(value)
}
def ScalamessageHub : java.util.List[_root_.art2.MessageHub]={this.getMessageHub()}.asInstanceOf[java.util.List[_root_.art2.MessageHub]]
def ScalamessageHub_=(value : java.util.List[_root_.art2.MessageHub])={this.getMessageHub().clear
this.getMessageHub().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.ContainerRoot"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

