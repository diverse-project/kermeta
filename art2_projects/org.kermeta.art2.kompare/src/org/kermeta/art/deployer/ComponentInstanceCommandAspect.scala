package org.kermeta.art.deployer
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ComponentInstanceCommandAspect  extends org.kermeta.art.deployer.CommandAspect with org.kermeta.art.deployer.ComponentInstanceCommand{
var contextComponentInstance : _root_.art2.ComponentInstance= _
def KergetContextComponentInstance() : _root_.art2.ComponentInstance={this.contextComponentInstance}
def KersetContextComponentInstance(arg:_root_.art2.ComponentInstance)={ this.contextComponentInstance = arg}
def ScalacontextComponentInstance : _root_.art2.ComponentInstance={this.KergetContextComponentInstance()}.asInstanceOf[_root_.art2.ComponentInstance]
def ScalacontextComponentInstance_=(value : _root_.art2.ComponentInstance)={this.KersetContextComponentInstance(value)}

    def setContext(ci : _root_.art2.ComponentInstance):Unit = {
var result : _root_.kermeta.standard.Void = null.asInstanceOf[_root_.kermeta.standard.Void]; 


{
ScalacontextComponentInstance = ci;}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("org.kermeta.art.deployer.ComponentInstanceCommand"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

