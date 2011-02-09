package org.kermeta.language.simple.assembly.services.art2.impl
import org.kermeta.art2.framework.port._
import scala.{Unit=>void}
class Art2ComponentSimpleAssemblyPORTkmtLoader() extends org.kermeta.language.api.port.PortResourceLoader with Art2RequiredPort {
def getName : String = "kmtLoader"
def getInOut = true
def load(arg0:java.lang.String,arg1:org.kermeta.language.api.port.PortResourceLoader.URIType,arg2:java.lang.String) : org.kermeta.language.structure.ModelingUnit ={
var msgcall = new org.kermeta.art2.framework.MethodCallMessage
msgcall.setMethodName("load");
msgcall.getParams.put("arg0",arg0);
msgcall.getParams.put("arg1",arg1);
msgcall.getParams.put("arg2",arg2);
(this !? msgcall).asInstanceOf[org.kermeta.language.structure.ModelingUnit]}
}
