package org.kermeta.language.kwf.art2.impl;
import org.kermeta.art2.framework.AbstractPort;
import org.kermeta.language.api.port.PortKEvent;
class Art2ComponentKWFPORTPROXYkevent extends AbstractPort with org.kermeta.art2.framework.MessagePort {
var delegate : org.kermeta.language.api.port.PortKEvent = null
def getDelegate():org.kermeta.language.api.port.PortKEvent = {delegate}
def setDelegate(a : org.kermeta.language.api.port.PortKEvent)={delegate=a;}
def process(o : java.lang.Object): Unit =  { o match { 
case opcall : org.kermeta.art2.framework.MethodCallMessage => opcall.getMethodName match {
case "getKEvent"=> delegate.getKEvent(opcall.getParams.get("arg0").asInstanceOf[org.kermeta.language.api.kevent.KEvent])
case _ => println("uncatch message : "+o) 
}
}}
}
