/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.annotation.processor.visitor.sub

import com.sun.mirror.apt.AnnotationProcessorEnvironment
import com.sun.mirror.declaration.MethodDeclaration
import org.kermeta.art2.Art2Factory
import org.kermeta.art2.ComponentType
import org.kermeta.art2.MessagePortType
import org.kermeta.art2.ServicePortType
import scala.collection.JavaConversions._

trait PortMappingProcessor {

  def processPortMapping(componentType : ComponentType,methoddef : MethodDeclaration,env : AnnotationProcessorEnvironment)={
    /* PROCESS PORTS & PORT ANNOTATION */
    var portAnnotations : List[org.kermeta.art2.annotation.Port] = Nil

    var annotationPort = methoddef.getAnnotation(classOf[org.kermeta.art2.annotation.Port])
    if(annotationPort != null){ portAnnotations = portAnnotations ++ List(annotationPort) }

    var annotationPorts = methoddef.getAnnotation(classOf[org.kermeta.art2.annotation.Ports])
    if(annotationPorts != null){ portAnnotations = portAnnotations ++ annotationPorts.value.toList }

    portAnnotations.foreach{annot=>
      componentType.getProvided.find({provided=> provided.getName.equals(annot.name) }) match {
        case Some(ptref) => {
            var ptREFmapping = Art2Factory.eINSTANCE.createPortTypeMapping
            ptREFmapping.setBeanMethodName(methoddef.getSimpleName)

            ptref.getRef match {
              case mpt : MessagePortType => {
                  ptREFmapping.setServiceMethodName("process")
                }
              case spt : ServicePortType => {
                  ptREFmapping.setServiceMethodName(annot.method)
                }

            }
            ptref.getMappings.add(ptREFmapping)
          }
        case None => println("ProvidedPort not found "+annot.name);env.getMessager.printError("ProvidedPort not found "+annot.name);System.exit(1)
      }
    }

    /* STEP 1 : PROCESS START & STOP METHOD */
    /*
    var startAnnot = methoddef.getAnnotation(classOf[org.kermeta.art2.annotation.Start])
    var stopAnnot = methoddef.getAnnotation(classOf[org.kermeta.art2.annotation.Stop])
    if(startAnnot != null){ componentType.setStartMethod(methoddef.getSimpleName)}
    if(stopAnnot != null){ componentType.setStopMethod(methoddef.getSimpleName)}*/

  }

}
