package org.kermeta.language.simple.assembly.services.art2.impl
import org.kermeta.art2.framework.port._
import scala.{Unit=>void}
class Art2ComponentSimpleAssemblyPORTlog() extends org.kermeta.art2.framework.MessagePort with Art2RequiredPort {
def getName : String = "log"
def process(o : Object) = {this ! o}
def getInOut = false
}
