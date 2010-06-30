package org.kermeta.art.deployer
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait OSGiCommandFactoryAspect  extends org.kermeta.art.deployer.AbtractCommandFactoryAspect with org.kermeta.art.deployer.OSGiCommandFactory{

    override def createCommandRemoveComponentInstance(ci : _root_.art2.ComponentInstance):_root_.org.kermeta.art.deployer.Command = {
var result : _root_.org.kermeta.art.deployer.Command = null.asInstanceOf[_root_.org.kermeta.art.deployer.Command]; 


{
var cmd : _root_.org.kermeta.art.deployer.ComponentInstanceCommand = org.kermeta.art.deployer.RichFactory.createRemoveComponentInstance;
(cmd).setContext(ci)
result = cmd;}
 return result
}

    override def createCommandAddComponentType(ct : _root_.art2.ComponentType):_root_.org.kermeta.art.deployer.Command = {
var result : _root_.org.kermeta.art.deployer.Command = null.asInstanceOf[_root_.org.kermeta.art.deployer.Command]; 


{
var cmd : _root_.org.kermeta.art.deployer.ComponentTypeCommand = org.kermeta.art.deployer.RichFactory.createAddComponentType;
(cmd).setContext(ct)
result = cmd;}
 return result
}

    override def createCommandAddComponentInstance(ci : _root_.art2.ComponentInstance):_root_.org.kermeta.art.deployer.Command = {
var result : _root_.org.kermeta.art.deployer.Command = null.asInstanceOf[_root_.org.kermeta.art.deployer.Command]; 


{
var cmd : _root_.org.kermeta.art.deployer.ComponentInstanceCommand = org.kermeta.art.deployer.RichFactory.createAddComponentInstance;
(cmd).setContext(ci)
result = cmd;}
 return result
}

    override def createCommandRemoveComponentType(ct : _root_.art2.ComponentType):_root_.org.kermeta.art.deployer.Command = {
var result : _root_.org.kermeta.art.deployer.Command = null.asInstanceOf[_root_.org.kermeta.art.deployer.Command]; 


{
var cmd : _root_.org.kermeta.art.deployer.ComponentTypeCommand = org.kermeta.art.deployer.RichFactory.createRemoveComponentType;
(cmd).setContext(ct)
result = cmd;}
 return result
}

    override def createCommandUpdateComponentInstance(ci : _root_.art2.ComponentInstance):_root_.org.kermeta.art.deployer.Command = {
var result : _root_.org.kermeta.art.deployer.Command = null.asInstanceOf[_root_.org.kermeta.art.deployer.Command]; 


{
var cmd : _root_.org.kermeta.art.deployer.ComponentInstanceCommand = org.kermeta.art.deployer.RichFactory.createUpdateComponentInstance;
(cmd).setContext(ci)
result = cmd;}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("org.kermeta.art.deployer.OSGiCommandFactory"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

