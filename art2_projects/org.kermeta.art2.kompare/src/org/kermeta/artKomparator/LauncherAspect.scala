package org.kermeta.artKomparator
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait LauncherAspect  extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with org.kermeta.artKomparator.Launcher{
var hotdeployPATH : _root_.java.lang.String= _
def KergetHotdeployPATH() : _root_.java.lang.String={this.hotdeployPATH}
def KersetHotdeployPATH(arg:_root_.java.lang.String)={ this.hotdeployPATH = arg}
def ScalahotdeployPATH : _root_.java.lang.String={this.KergetHotdeployPATH()}.asInstanceOf[_root_.java.lang.String]
def ScalahotdeployPATH_=(value : _root_.java.lang.String)={this.KersetHotdeployPATH(value)}
var actualRuntimeModel : _root_.art2.ContainerRoot= _
def KergetActualRuntimeModel() : _root_.art2.ContainerRoot={this.actualRuntimeModel}
def KersetActualRuntimeModel(arg:_root_.art2.ContainerRoot)={ this.actualRuntimeModel = arg}
def ScalaactualRuntimeModel : _root_.art2.ContainerRoot={this.KergetActualRuntimeModel()}.asInstanceOf[_root_.art2.ContainerRoot]
def ScalaactualRuntimeModel_=(value : _root_.art2.ContainerRoot)={this.KersetActualRuntimeModel(value)}
var nodeName : _root_.java.lang.String= _
def KergetNodeName() : _root_.java.lang.String={this.nodeName}
def KersetNodeName(arg:_root_.java.lang.String)={ this.nodeName = arg}
def ScalanodeName : _root_.java.lang.String={this.KergetNodeName()}.asInstanceOf[_root_.java.lang.String]
def ScalanodeName_=(value : _root_.java.lang.String)={this.KersetNodeName(value)}

    def loadART2Model(model : _root_.java.lang.String):_root_.art2.ContainerRoot = {
var result : _root_.art2.ContainerRoot = null.asInstanceOf[_root_.art2.ContainerRoot]; 


{
var res : _root_.kermeta.persistence.Resource = (kermeta.persistence.RichFactory.createEMFRepository).createResource(model, "platform:/resource/org.kermeta.art2.model/metamodel/art.ecore");
(res).load()
result = ((res).one()).asInstanceOf[_root_.art2.ContainerRoot];}
 return result
}

    def launchFromURL(newModelUrl : _root_.java.lang.String):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
var model : _root_.art2.ContainerRoot = loadART2Model(newModelUrl);
launchFromModel(model)}
 return result
}

    def launchFromModel(newModel : _root_.art2.ContainerRoot):Unit = {
var result : Unit = null.asInstanceOf[Unit]; 


{
if ((((ScalanodeName) != (null))).and((ScalahotdeployPATH) != (null)))

{
var factory : _root_.org.kermeta.art.deployer.OSGiCommandFactory = org.kermeta.art.deployer.RichFactory.createOSGiCommandFactory;
var komparator : _root_.org.kermeta.komparator.Komparator = org.kermeta.komparator.RichFactory.createKomparator;
var contextCommand : _root_.org.kermeta.art.deployer.CommandContext = org.kermeta.art.deployer.RichFactory.createCommandContext;
(contextCommand).ScalaruntimePATH = ScalahotdeployPATH;
var commandSet : _root_.java.util.List[_root_.org.kermeta.art.deployer.Command] = (komparator).kompare(ScalaactualRuntimeModel, newModel, (this).ScalanodeName, factory);
(commandSet).each({(c)=>

{
(c).execute(contextCommand)}
})
ScalaactualRuntimeModel = newModel;}
}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("org.kermeta.artKomparator.Launcher"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

