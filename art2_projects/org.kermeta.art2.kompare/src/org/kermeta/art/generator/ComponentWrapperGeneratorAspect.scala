package org.kermeta.art.generator
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ComponentWrapperGeneratorAspect  extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with org.kermeta.art.generator.ComponentWrapperGenerator{

    def generate(c : _root_.art2.ComponentInstance):_root_.java.lang.String = {
var result : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 


{
var `_res` : _root_.scala.StringBuilder = kermeta.utils.RichFactory.createStringBuffer;
(`_res`).append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<!-- Powered by KET: Kermeta Emitter Template. See http://www.kermeta.org -->\n<blueprint xmlns=\"http://www.osgi.org/xmlns/blueprint/v1.0.0\"\n\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n\txsi:schemaLocation=\"\n    http://www.osgi.org/xmlns/blueprint/v1.0.0 \n    http://www.osgi.org/xmlns/blueprint/v1.0.0/blueprint.xsd\">\n\n\n\t<!-- create needed port binding -->\n")
((c).Scalarequired).each({(rp)=>

{
if ((rp).isBind())

{
(`_res`).append("")
if ((((rp).ScalaportTypeRef).Scalaref).isInstanceOf[_root_.art2.ServicePortType])

{
(`_res`).append("\t\n")
var portBinding : _root_.art2.Binding = null.asInstanceOf[_root_.art2.Binding];
(`_res`).append("")
var remoteNode : _root_.art2.ContainerNode = null.asInstanceOf[_root_.art2.ContainerNode];
(`_res`).append("")
var remotePort : _root_.art2.Port = null.asInstanceOf[_root_.art2.Port];
(`_res`).append("")
(((((c).container()).container()).asInstanceOf[_root_.art2.ContainerRoot]).Scalabindings).each({(b)=>

{
(`_res`).append("")
if ((b).isUsingPort(rp))

{
(`_res`).append("")
portBinding = b;
(`_res`).append("")
remoteNode = ((((b).opositePort(rp)).container()).container()).asInstanceOf[_root_.art2.ContainerNode];
(`_res`).append("")
remotePort = (b).opositePort(rp);
(`_res`).append("")}

(`_res`).append("")}
})
(`_res`).append("")
if ((((remoteNode).Scalaname) == ((((c).container()).asInstanceOf[_root_.art2.ContainerNode]).Scalaname)))

{
(`_res`).append("\t\t<!-- collocated binding no proxy injected -->\n\t\t\n")}
else 


{
(`_res`).append("\t\t<!-- not collocated binding proxy injected -->\n\t\t<bean id=\"")
(`_res`).append(((rp).ScalaportTypeRef).Scalaname)
(`_res`).append("proxyProducer\" class=\"org.kermeta.art2.runtime.proxy.Factory\" factory-method=\"createProducer\" init-method=\"init\" destroy-method=\"stop\">\n\t\t\t<property name=\"uri\" value=\"")
(`_res`).append((rp).getProxyURI())
(`_res`).append("\" />\n\t\t\t<property name=\"hubType\" value=\"")
(`_res`).append((rp).getProxyHubType())
(`_res`).append("\" />\n\t\t</bean>\n\t\t\n\t\t<bean id=\"")
(`_res`).append(((rp).ScalaportTypeRef).Scalaname)
(`_res`).append("proxy\" class=\"")
(`_res`).append(((c).ScalacomponentType).ScalafactoryBean)
(`_res`).append("\" factory-method=\"create")
(`_res`).append(((c).ScalacomponentType).Scalaname)
(`_res`).append("PORTPROXY")
(`_res`).append(((rp).ScalaportTypeRef).Scalaname)
(`_res`).append("\">\n\t\t\t<property name=\"delegate\"><ref component-id=\"")
(`_res`).append(((rp).ScalaportTypeRef).Scalaname)
(`_res`).append("proxyProducer\" /></property>\n\t\t</bean>\n\t\t\n\t\t<service ref=\"")
(`_res`).append(((rp).ScalaportTypeRef).Scalaname)
(`_res`).append("proxy\" interface=\"")
(`_res`).append(((c).ScalacomponentType).Scalaname)
(`_res`).append("\">\n\t\t\t<service-properties>\n\t\t\t\t<entry key=\"artPortName\" value=\"")
(`_res`).append(((rp).ScalaportTypeRef).Scalaname)
(`_res`).append("\" />\n\t\t\t\t<entry key=\"artComponentName\" value=\"")
(`_res`).append((remoteNode).Scalaname)
(`_res`).append("\" />\n\t\t\t</service-properties>\n\t\t</service>\n\t\t\n")}

(`_res`).append("\n")}

(`_res`).append("")
if ((((rp).ScalaportTypeRef).Scalaref).isInstanceOf[_root_.art2.MessagePortType])

{
(`_res`).append("")
var portBinding : _root_.art2.MBinding = null.asInstanceOf[_root_.art2.MBinding];
(`_res`).append("")
(((((c).container()).container()).asInstanceOf[_root_.art2.ContainerRoot]).ScalamBindings).each({(b)=>

{
(`_res`).append("")
if ((((b).Scalaport) == (rp)))

{
(`_res`).append("")
portBinding = b;
(`_res`).append("")}

(`_res`).append("")}
})
(`_res`).append("\t\t<bean id=\"")
(`_res`).append(((rp).ScalaportTypeRef).Scalaname)
(`_res`).append("proxyProducer\" class=\"org.kermeta.art2.runtime.proxy.Factory\" factory-method=\"createProducer\" init-method=\"init\" destroy-method=\"stop\">\n\t\t\t<property name=\"uri\" value=\"")
(`_res`).append((rp).getProxyURI())
(`_res`).append("\" />\n\t\t\t<property name=\"hubType\" value=\"")
(`_res`).append((rp).getProxyHubType())
(`_res`).append("\" />\n\t\t</bean>\n\t\t\n\t\t<bean id=\"")
(`_res`).append(((rp).ScalaportTypeRef).Scalaname)
(`_res`).append("proxy\" class=\"")
(`_res`).append(((c).ScalacomponentType).ScalafactoryBean)
(`_res`).append("\" factory-method=\"create")
(`_res`).append(((c).ScalacomponentType).Scalaname)
(`_res`).append("PORTPROXY")
(`_res`).append(((rp).ScalaportTypeRef).Scalaname)
(`_res`).append("\">\n\t\t\t<property name=\"delegate\"><ref component-id=\"")
(`_res`).append(((rp).ScalaportTypeRef).Scalaname)
(`_res`).append("proxyProducer\" /></property>\n\t\t</bean>\n\t\t\n\t\t<service ref=\"")
(`_res`).append(((rp).ScalaportTypeRef).Scalaname)
(`_res`).append("proxy\" interface=\"org.kermeta.art2.framework.MessagePort\">\n\t\t\t<service-properties>\n\t\t\t\t<entry key=\"artPortName\" value=\"")
(`_res`).append(((rp).ScalaportTypeRef).Scalaname)
(`_res`).append("\" />\n\t\t\t\t<entry key=\"artComponentName\" value=\"")
(`_res`).append((c).Scalaname)
(`_res`).append("\" />\n\t\t\t</service-properties>\n\t\t</service>\n")}

(`_res`).append("\t\n")}
}
})
(`_res`).append("\t\n</blueprint>")
result = ((`_res`)+"");}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("org.kermeta.art.generator.ComponentWrapperGenerator"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

