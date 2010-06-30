package org.kermeta.art.generator
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ComponentInstanceGeneratorAspect  extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with org.kermeta.art.generator.ComponentInstanceGenerator{

    def generate(c : _root_.art2.ComponentInstance):_root_.java.lang.String = {
var result : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 


{
var `_res` : _root_.scala.StringBuilder = kermeta.utils.RichFactory.createStringBuffer;
(`_res`).append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<!-- Powered by KET: Kermeta Emitter Template. See http://www.kermeta.org -->\n<blueprint xmlns=\"http://www.osgi.org/xmlns/blueprint/v1.0.0\"\n\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n\txsi:schemaLocation=\"\n    http://www.osgi.org/xmlns/blueprint/v1.0.0 \n    http://www.osgi.org/xmlns/blueprint/v1.0.0/blueprint.xsd\">\n\n\t<!-- create and expose hosted ports on blueprint -->\n")
((c).Scalaprovided).each({(pp)=>

{
(`_res`).append("")
if ((pp).isBind())

{
(`_res`).append("\t\t<bean id=\"")
(`_res`).append(((pp).ScalaportTypeRef).Scalaname)
(`_res`).append("\" class=\"")
(`_res`).append(((c).ScalacomponentType).ScalafactoryBean)
(`_res`).append("\" factory-method=\"create")
(`_res`).append(((c).ScalacomponentType).Scalaname)
(`_res`).append("PORT")
(`_res`).append(((pp).ScalaportTypeRef).Scalaname)
(`_res`).append("\" />\n\t\n\t\t<service ref=\"")
(`_res`).append(((pp).ScalaportTypeRef).Scalaname)
(`_res`).append("\" interface=\"")
(`_res`).append((((pp).ScalaportTypeRef).Scalaref).Scalaname)
(`_res`).append("\">\n\t\t\t<service-properties>\n\t\t\t\t<entry key=\"artPortName\" value=\"")
(`_res`).append(((pp).ScalaportTypeRef).Scalaname)
(`_res`).append("\" />\n\t\t\t\t<entry key=\"artComponentName\" value=\"")
(`_res`).append((c).Scalaname)
(`_res`).append("\" />\n\t\t\t</service-properties>\n\t\t</service>\n\t\t\n\t\t\n\t\t<bean id=\"")
(`_res`).append(((pp).ScalaportTypeRef).Scalaname)
(`_res`).append("proxy\" class=\"")
(`_res`).append(((c).ScalacomponentType).ScalafactoryBean)
(`_res`).append("\" factory-method=\"create")
(`_res`).append(((c).ScalacomponentType).Scalaname)
(`_res`).append("PORTPROXY")
(`_res`).append(((pp).ScalaportTypeRef).Scalaname)
(`_res`).append("\">\n\t\t\t<property name=\"delegate\"><ref component-id=\"")
(`_res`).append(((pp).ScalaportTypeRef).Scalaname)
(`_res`).append("\" /></property>\n\t\t</bean>\n\n\t\t<bean id=\"")
(`_res`).append(((pp).ScalaportTypeRef).Scalaname)
(`_res`).append("proxyConsumer\" class=\"org.kermeta.art2.runtime.proxy.Factory\" factory-method=\"createConsumer\" init-method=\"init\" destroy-method=\"stop\">\n\t\t\t<property name=\"uri\" value=\"")
(`_res`).append((pp).getProxyURI())
(`_res`).append("\" />\n\t\t\t<property name=\"hubType\" value=\"")
(`_res`).append((pp).getProxyHubType())
(`_res`).append("\" />\n\t\t\t<property name=\"delegate\"><ref component-id=\"")
(`_res`).append(((pp).ScalaportTypeRef).Scalaname)
(`_res`).append("proxy\" /></property>\n\t\t</bean>\n\t\t\n")}

(`_res`).append("")}
})
(`_res`).append("\n\t<!-- create needed port blueprint binding -->\n")
((c).Scalarequired).each({(rp)=>

{
(`_res`).append("")
if ((rp).isBind())

{
(`_res`).append("\n")
if ((((rp).ScalaportTypeRef).Scalaref).isInstanceOf[_root_.art2.ServicePortType])

{
(`_res`).append("\t\t\n")
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
(`_res`).append("\t\t\t<reference id=\"")
(`_res`).append(((rp).ScalaportTypeRef).Scalaname)
(`_res`).append("\" interface=\"")
(`_res`).append((((rp).ScalaportTypeRef).Scalaref).Scalaname)
(`_res`).append("\" filter=\"&amp;(artComponentName=")
(`_res`).append((((remotePort).container()).asInstanceOf[_root_.art2.ComponentInstance]).Scalaname)
(`_res`).append(")(artPortName=")
(`_res`).append(((remotePort).ScalaportTypeRef).Scalaname)
(`_res`).append(")\" />\t\n")}

(`_res`).append("\t\n")
if ((((rp).ScalaportTypeRef).Scalaref).isInstanceOf[_root_.art2.MessagePortType])

{
(`_res`).append("\t\t\t<reference id=\"")
(`_res`).append(((rp).ScalaportTypeRef).Scalaname)
(`_res`).append("\" interface=\"org.kermeta.art2.framework.MessagePort\" filter=\"&amp;(artComponentName=")
(`_res`).append((c).Scalaname)
(`_res`).append(")(artPortName=")
(`_res`).append(((rp).ScalaportTypeRef).Scalaname)
(`_res`).append(")\" />\t\n")}

(`_res`).append("\t\n")}

(`_res`).append("")}
})
(`_res`).append("\t\n\t<!-- create the bean -->\n\t<bean id=\"")
(`_res`).append((c).Scalaname)
(`_res`).append("\" class=\"")
(`_res`).append(((c).ScalacomponentType).ScalafactoryBean)
(`_res`).append("\" factory-method=\"create")
(`_res`).append(((c).ScalacomponentType).Scalaname)
(`_res`).append("\"  init-method=\"")
(`_res`).append(((c).ScalacomponentType).ScalastartMethod)
(`_res`).append("\" destroy-method=\"")
(`_res`).append(((c).ScalacomponentType).ScalastopMethod)
(`_res`).append("\">\n\t\n\t\t<!-- property -->\n\t\t<property name=\"dictionary\">\n\t\t\t<props>\n\t\t\t\t<prop key=\"art.name\">")
(`_res`).append((c).Scalaname)
(`_res`).append("</prop>\n\t\t\t</props>\n\t\t</property>\n\t\t<!-- end property -->\n\t\n<!-- inject hosted ports -->\n<property name=\"hostedPorts\">\n<map>\t\n")
((c).Scalaprovided).each({(hp)=>

{
if ((hp).isBind())

{
(`_res`).append("\n\n<entry key=\"")
(`_res`).append(((hp).ScalaportTypeRef).Scalaname)
(`_res`).append("\">\n<ref component-id=\"")
(`_res`).append(((hp).ScalaportTypeRef).Scalaname)
(`_res`).append("\" />\n</entry>\n")}
}
})
(`_res`).append("</map>\n</property>\n\n<!-- inject hosted ports -->\n<property name=\"neededPorts\">\n<map>\t\n")
((c).Scalarequired).each({(np)=>

{
if ((np).isBind())

{
(`_res`).append("<entry key=\"")
(`_res`).append(((np).ScalaportTypeRef).Scalaname)
(`_res`).append("\">\n<ref component-id=\"")
(`_res`).append(((np).ScalaportTypeRef).Scalaname)
(`_res`).append("\" />\n</entry>\n")}
}
})
(`_res`).append("</map>\n</property>\n\t</bean>\n</blueprint>")
result = ((`_res`)+"");}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("org.kermeta.art.generator.ComponentInstanceGenerator"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

