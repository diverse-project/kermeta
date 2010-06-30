package org.kermeta.art.deployer
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait RemoveComponentInstanceAspect  extends org.kermeta.art.deployer.ComponentInstanceCommandAspect with org.kermeta.art.deployer.RemoveComponentInstance{

    override def execute(ctx : _root_.org.kermeta.art.deployer.CommandContext):Unit = {
var result : _root_.kermeta.standard.Void = null.asInstanceOf[_root_.kermeta.standard.Void]; 


{
var fileIO : _root_.kermeta.io.FileIO = kermeta.io.RichFactory.createFileIO;
(stdio).writeln(((("Undeploy ").plus((ScalacontextComponentInstance).Scalaname)).plus(" ComponentInstance to ")).plus((ctx).ScalaruntimePATH))
var url : _root_.java.lang.String = (((("file:").plus((ctx).ScalaruntimePATH)).plus("/component_")).plus((ScalacontextComponentInstance).Scalaname)).plus(".xml");
(fileIO).writeTextFile(url, "")}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("org.kermeta.art.deployer.RemoveComponentInstance"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

