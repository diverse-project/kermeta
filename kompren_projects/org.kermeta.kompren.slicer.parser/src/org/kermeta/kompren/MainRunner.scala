package org.kermeta.kompren

import org.kermeta.kompren.parser.KomprenParser
import org.kermeta.kompren.parser.ParserUtil
import org.kermeta.kompren.resolver.SlicerResolver
import org2.kermeta.kompren.slicer.Slicer
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import java.util.Collections


object MainRunner {
  def main(args: Array[String]): Unit = {
		 // convertAsXMI("/home/ablouin/workspaceScala/org.kermeta.slicer.kompren.parser/examples/class/class.slicertxt")
		  convertAsXMI(args(0))
  }
  
  
  
  def convertAsXMI(uri : String) = {
    val parser = new KomprenParser
    val slicer = parser.parseSlicer(ParserUtil.loadFile(uri))

    slicer match {
      case None => println("Error"+parser.lastNoSuccess)
      case Some(elt) =>
        SlicerResolver.resolve(elt, uri)
        println(elt)
        saveAsXMI(elt, uri.replace(".slicertxt", ".slicer"))
    }
  }
  
  
  private def saveAsXMI(slicer : Slicer, uri : String) = {
	  val map = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
	  val resSet = new ResourceSetImpl()
	  map.put("slicer", new XMIResourceFactoryImpl())
	  val resource = resSet.createResource(URI.createFileURI(uri))
	  resource.getContents.add(slicer)
	  resource.save(Collections.EMPTY_MAP)
  }
}
