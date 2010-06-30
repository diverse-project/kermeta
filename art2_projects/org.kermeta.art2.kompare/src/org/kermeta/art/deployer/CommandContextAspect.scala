package org.kermeta.art.deployer
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait CommandContextAspect  extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with org.kermeta.art.deployer.CommandContext{
var runtimePATH : java.lang.String= _
def KergetRuntimePATH() : java.lang.String={this.runtimePATH}
def KersetRuntimePATH(arg:java.lang.String)={ this.runtimePATH = arg}
def ScalaruntimePATH : java.lang.String={this.KergetRuntimePATH()}.asInstanceOf[java.lang.String]
def ScalaruntimePATH_=(value : java.lang.String)={this.KersetRuntimePATH(value)}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("org.kermeta.art.deployer.CommandContext"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

