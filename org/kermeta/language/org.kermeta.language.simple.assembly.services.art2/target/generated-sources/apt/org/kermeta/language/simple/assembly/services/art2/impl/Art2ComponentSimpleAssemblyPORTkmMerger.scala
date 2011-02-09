package org.kermeta.language.simple.assembly.services.art2.impl
import org.kermeta.art2.framework.port._
import scala.{Unit=>void}
class Art2ComponentSimpleAssemblyPORTkmMerger() extends org.kermeta.language.api.port.PortKmMerger with Art2RequiredPort {
def getName : String = "kmMerger"
def getInOut = true
def merge(arg0:java.util.Collection[org.kermeta.language.structure.ModelingUnit]) : org.kermeta.language.api.result.ModelingUnitResult ={
var msgcall = new org.kermeta.art2.framework.MethodCallMessage
msgcall.setMethodName("merge");
msgcall.getParams.put("arg0",arg0);
(this !? msgcall).asInstanceOf[org.kermeta.language.api.result.ModelingUnitResult]}
}
