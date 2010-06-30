package org.kermeta.art.deployer
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ComponentTypeCommandAspect  extends org.kermeta.art.deployer.CommandAspect with org.kermeta.art.deployer.ComponentTypeCommand{
var contextComponentType : _root_.art2.ComponentType= _
def KergetContextComponentType() : _root_.art2.ComponentType={this.contextComponentType}
def KersetContextComponentType(arg:_root_.art2.ComponentType)={ this.contextComponentType = arg}
def ScalacontextComponentType : _root_.art2.ComponentType={this.KergetContextComponentType()}.asInstanceOf[_root_.art2.ComponentType]
def ScalacontextComponentType_=(value : _root_.art2.ComponentType)={this.KersetContextComponentType(value)}

    def setContext(ct : _root_.art2.ComponentType):Unit = {
var result : _root_.kermeta.standard.Void = null.asInstanceOf[_root_.kermeta.standard.Void]; 


{
ScalacontextComponentType = ct;}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("org.kermeta.art.deployer.ComponentTypeCommand"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

