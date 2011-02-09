package org.kermeta.language.simple.assembly.services.art2.impl
import org.kermeta.art2.framework.port._
import scala.{Unit=>void}
class Art2ComponentSimpleAssemblyPORTkm2scala(component : Art2ComponentSimpleAssembly) extends org.kermeta.language.api.port.PortKm2ScalaCompiler with Art2ProvidedPort {
def getName : String = "km2scala"
def compile(arg0:org.kermeta.language.structure.ModelingUnit,arg1:java.lang.String) : void ={
var msgcall = new org.kermeta.art2.framework.MethodCallMessage
msgcall.setMethodName("compile");
msgcall.getParams.put("arg0",arg0.asInstanceOf[AnyRef]);
msgcall.getParams.put("arg1",arg1.asInstanceOf[AnyRef]);
(this !? msgcall).asInstanceOf[void]}
override def internal_process(msg : Any)=msg match {
case opcall : org.kermeta.art2.framework.MethodCallMessage => reply(opcall.getMethodName match {
case "compile"=> component.km2scalaCompile(opcall.getParams.get("arg0").asInstanceOf[org.kermeta.language.structure.ModelingUnit],opcall.getParams.get("arg1").asInstanceOf[java.lang.String])
case _ @ o => println("uncatch message , method not found in service declaration : "+o);null 
})}
}
