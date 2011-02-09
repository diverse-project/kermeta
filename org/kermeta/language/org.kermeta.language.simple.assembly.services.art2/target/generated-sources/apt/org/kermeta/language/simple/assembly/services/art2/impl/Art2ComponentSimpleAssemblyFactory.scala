package org.kermeta.language.simple.assembly.services.art2.impl
import org.kermeta.art2.framework._
object Art2ComponentSimpleAssemblyFactory{
def createComponentActor() : Art2Component = {
new Art2Component(createArt2ComponentSimpleAssembly()){def startComponent(){getArt2ComponentType.asInstanceOf[org.kermeta.language.simple.assembly.services.art2.impl.Art2ComponentSimpleAssembly].start()}
def stopComponent(){getArt2ComponentType.asInstanceOf[org.kermeta.language.simple.assembly.services.art2.impl.Art2ComponentSimpleAssembly].stop()}
}}
def createArt2ComponentSimpleAssembly() : org.kermeta.language.simple.assembly.services.art2.impl.Art2ComponentSimpleAssembly ={
var newcomponent = new org.kermeta.language.simple.assembly.services.art2.impl.Art2ComponentSimpleAssembly();
newcomponent.getHostedPorts().put("km2scala",createArt2ComponentSimpleAssemblyPORTkm2scala(newcomponent))
newcomponent.getNeededPorts().put("log",createArt2ComponentSimpleAssemblyPORTlog())
newcomponent.getNeededPorts().put("kmtLoader",createArt2ComponentSimpleAssemblyPORTkmtLoader())
newcomponent.getNeededPorts().put("kmMerger",createArt2ComponentSimpleAssemblyPORTkmMerger())
newcomponent}
def createArt2ComponentSimpleAssemblyPORTkm2scala(component : Art2ComponentSimpleAssembly) : Art2ComponentSimpleAssemblyPORTkm2scala ={ new Art2ComponentSimpleAssemblyPORTkm2scala(component)}
def createArt2ComponentSimpleAssemblyPORTlog() : Art2ComponentSimpleAssemblyPORTlog ={ return new Art2ComponentSimpleAssemblyPORTlog();}
def createArt2ComponentSimpleAssemblyPORTkmtLoader() : Art2ComponentSimpleAssemblyPORTkmtLoader ={ return new Art2ComponentSimpleAssemblyPORTkmtLoader();}
def createArt2ComponentSimpleAssemblyPORTkmMerger() : Art2ComponentSimpleAssemblyPORTkmMerger ={ return new Art2ComponentSimpleAssemblyPORTkmMerger();}
}
