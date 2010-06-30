package org.kermeta.art.deployer
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait AbtractCommandFactoryAspect  extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with org.kermeta.art.deployer.AbtractCommandFactory{

    def createCommandRemoveComponentInstance(c : _root_.art2.ComponentInstance):_root_.org.kermeta.art.deployer.Command

    def createCommandAddComponentType(ct : _root_.art2.ComponentType):_root_.org.kermeta.art.deployer.Command

    def createCommandAddComponentInstance(c : _root_.art2.ComponentInstance):_root_.org.kermeta.art.deployer.Command

    def createCommandRemoveComponentType(ct : _root_.art2.ComponentType):_root_.org.kermeta.art.deployer.Command

    def createCommandUpdateComponentInstance(c : _root_.art2.ComponentInstance):_root_.org.kermeta.art.deployer.Command
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("org.kermeta.art.deployer.AbtractCommandFactory"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

