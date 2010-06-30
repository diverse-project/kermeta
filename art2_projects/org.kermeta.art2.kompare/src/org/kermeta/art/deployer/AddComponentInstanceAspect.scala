package org.kermeta.art.deployer
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait AddComponentInstanceAspect  extends org.kermeta.art.deployer.ComponentInstanceCommandAspect with org.kermeta.art.deployer.AddComponentInstance{

    override def execute(ctx : _root_.org.kermeta.art.deployer.CommandContext):Unit = {
var result : _root_.kermeta.standard.Void = null.asInstanceOf[_root_.kermeta.standard.Void]; 


{
var generator : _root_.org.kermeta.art.generator.ComponentInstanceGenerator = org.kermeta.art.generator.RichFactory.createComponentInstanceGenerator;
var generatorWrapper : _root_.org.kermeta.art.generator.ComponentWrapperGenerator = org.kermeta.art.generator.RichFactory.createComponentWrapperGenerator;
(stdio).writeln(((("Generate ").plus(((this).ScalacontextComponentInstance).Scalaname)).plus(" BluePrintComponent to ")).plus((ctx).ScalaruntimePATH))
var fileIO : _root_.kermeta.io.FileIO = kermeta.io.RichFactory.createFileIO;
var xml : _root_.java.lang.String = (generator).generate(ScalacontextComponentInstance);
var url : _root_.java.lang.String = (((("file:").plus((ctx).ScalaruntimePATH)).plus("/component_")).plus((ScalacontextComponentInstance).Scalaname)).plus(".xml");
(fileIO).writeTextFile(url, xml)
(stdio).writeln(((("Generate ").plus(((this).ScalacontextComponentInstance).Scalaname)).plus(" BluePrintComponentWrapper to ")).plus((ctx).ScalaruntimePATH))
var fileIOwrapper : _root_.kermeta.io.FileIO = kermeta.io.RichFactory.createFileIO;
var xml2 : _root_.java.lang.String = (generatorWrapper).generate(ScalacontextComponentInstance);
var url2 : _root_.java.lang.String = (((("file:").plus((ctx).ScalaruntimePATH)).plus("/componentwrapper_")).plus((ScalacontextComponentInstance).Scalaname)).plus(".xml");
(fileIOwrapper).writeTextFile(url2, xml2)}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("org.kermeta.art.deployer.AddComponentInstance"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

