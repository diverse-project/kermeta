package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
import org.eclipse.emf.ecore.EObject
trait PortAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.Port{
def Scalametrics : java.util.List[_root_.art2.Metric]={this.getMetrics()}.asInstanceOf[java.util.List[_root_.art2.Metric]]
def Scalametrics_=(value : java.util.List[_root_.art2.Metric])={this.getMetrics().clear
this.getMetrics().addAll(value)
}
def ScalaportTypeRef : _root_.art2.PortTypeRef={this.getPortTypeRef()}.asInstanceOf[_root_.art2.PortTypeRef]
def ScalaportTypeRef_=(value : _root_.art2.PortTypeRef)={this.setPortTypeRef(value)}

    def isEquals(ct : _root_.art2.Port):java.lang.Boolean = {
var result : java.lang.Boolean = null.asInstanceOf[java.lang.Boolean]; 


{
if (((((((ct).ScalaportTypeRef).Scalaname) == (((this).ScalaportTypeRef).Scalaname)))).and((((((ct).container()).asInstanceOf[_root_.art2.ComponentInstance]).Scalaname) == ((((this).container()).asInstanceOf[_root_.art2.ComponentInstance]).Scalaname))))

{
result = true;}
else 


{
result = false;}
}
 return result
}

    def getProxyHubType():_root_.java.lang.String = {
var result : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 


{
result = "";
var container : _root_.art2.ContainerRoot = (((this.asInstanceOf[EObject].container).container).container).asInstanceOf[_root_.art2.ContainerRoot];
if ((this).isBind())

{
if ((((this).ScalaportTypeRef).Scalaref).isInstanceOf[_root_.art2.ServicePortType])

{
result = "queue";}

if ((((this).ScalaportTypeRef).Scalaref).isInstanceOf[_root_.art2.MessagePortType])

{
((container).ScalamBindings).each({(mb)=>

{
if ((((mb).Scalaport) == (this)))

{
result = ((((mb).Scalahub).getType())+"");}
}
})}
}
}
 return result
}

    def isBind():java.lang.Boolean = {
var result : java.lang.Boolean = null.asInstanceOf[java.lang.Boolean]; 


{
result = false;
var container : _root_.art2.ContainerRoot = (((this.container()).container).container).asInstanceOf[_root_.art2.ContainerRoot];
if ((((this).ScalaportTypeRef).Scalaref).isInstanceOf[_root_.art2.MessagePortType])

{
((container).ScalamBindings).each({(mb)=>

{
if ((((mb).Scalaport) == (this)))

{
result = true;}
}
})}

if ((((this).ScalaportTypeRef).Scalaref).isInstanceOf[_root_.art2.ServicePortType])

{
((container).Scalabindings).each({(b)=>

{
if ((b).isUsingPort(this))

{
result = true;}
}
})}
}
 return result
}

    def getProxyURI():_root_.java.lang.String = {
var result : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 


{
result = "";
var container : _root_.art2.ContainerRoot = (((this.container()).container).container).asInstanceOf[_root_.art2.ContainerRoot];
if ((this).isBind())

{
if ((((this).ScalaportTypeRef).Scalaref).isInstanceOf[_root_.art2.ServicePortType])

{
result = (((((((this).container()).asInstanceOf[_root_.art2.ComponentInstance]).Scalaname)+"")).plus(".")).plus(((this).ScalaportTypeRef).Scalaname);}

if ((((this).ScalaportTypeRef).Scalaref).isInstanceOf[_root_.art2.MessagePortType])

{
((container).ScalamBindings).each({(mb)=>

{
if ((((mb).Scalaport) == (this)))

{
result = ((mb).Scalahub).Scalaname;}
}
})}
}
}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.Port"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

